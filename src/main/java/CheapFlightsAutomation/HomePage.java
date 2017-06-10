package CheapFlightsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.BaseMain;

public class HomePage extends BaseMain {

    @FindBy(xpath = "//span[@class=\"tag-line\"]")
    private WebElement tagLineMessageText;

    @FindBy(xpath = "//section[@class=\"right\" ]/a[1]")
    private WebElement signUpButton;

//    @FindBy(xpath = "//div[@id=\"modal\"]")
//    private WebElement iframeElement;
    @FindBy(xpath = "html/body/div[1]")
    private WebElement iframeElement;

    @FindBy(xpath = "//input[@id=\"name\"][@name=\"name\"]")
    private WebElement enterName;

    @FindBy(xpath = "//input[@id=\"email\"][@name=\"email\"]")
    private WebElement enterEmail;

    @FindBy(xpath = "////input[@id=\"password\"][@name=\"password\"]")
    private WebElement enterPassword;

    public void click_signUpButton() throws InterruptedException {
        signUpButton.click();
        Thread.sleep(2000);
    }

    public boolean isMessageDisplayed(String message){
        System.out.println("======HOME PAGE======");
        boolean isDisplayed=false;
        if(tagLineMessageText.getText().equalsIgnoreCase(message)){
            isDisplayed=true;
            System.out.println("====Message Displayed= "+message+ "====");
        }
return isDisplayed;
    }


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
