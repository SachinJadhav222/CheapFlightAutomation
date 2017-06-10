package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by SOHAM on 01/06/2017.
 */
public class BaseMain {

    public BaseMain(){
        PageFactory.initElements(driver,this);
    }
    public static WebDriver driver;

    public void openBrowser() throws IOException {
        Properties properties=new Properties();
        FileInputStream fileInputStream=new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");
        properties.load(fileInputStream);
        System.setProperty("webdriver.chromedriver.driver", "C:\\Selenium Automation\\CheapFlightsAutomation\\chromedriver.exe");
        System.setProperty("webdriver.ghekodriver.driver", "C:\\Selenium Automation\\CheapFlightsAutomation\\ghekodriver.exe");

        String url=properties.getProperty("url");
        String browser=properties.getProperty("browser");

        System.out.println(url);
        System.out.println("========= " + browser + " Browser Initialising ========== ");

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {

            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("IE")) {
            driver = new InternetExplorerDriver();

        }
       else
           System.out.println("===============+FAILED to invoke Browser+===============");

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void closeBrowser(){
       // driver.quit();
    }
}
