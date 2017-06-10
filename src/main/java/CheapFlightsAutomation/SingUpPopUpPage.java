package CheapFlightsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.BaseMain;

/**
 * Created by SOHAM on 10/06/2017.
 */
public class SingUpPopUpPage extends BaseMain {

    @FindBy(xpath = "html/body/div[1]")
    private WebElement iframeElement;

    @FindBy(xpath = "//input[@id=\"name\"][@name=\"name\"]")
    private WebElement enterName;

    @FindBy(xpath = "//input[@id=\"email\"][@name=\"email\"]")
    private WebElement enterEmail;

    @FindBy(xpath = "////input[@id=\"password\"][@name=\"password\"]")
    private WebElement enterPassword;

    public void enterSignInDetails(String name,String email,String password){
        System.out.println("==Enter sign up details=====");
        driver.switchTo().frame(iframeElement);
        String txt= driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[1]/form[2]/div[1]")).getText();
        System.out.println(txt);
//        enterName.sendKeys(name);
//        enterEmail.sendKeys(email);
//        enterPassword.sendKeys(password);
    }
}
