package CheapFlightsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.BaseMain;

public class HomePage extends BaseMain {

    @FindBy(xpath = "//span[@class=\"tag-line\"]")
    private WebElement tagLineMessageText;

    @FindBy(css = "a[data-reactid=\".0.0.1.0:$signup\"]")
    private WebElement signUpButton;

    @FindBy(css = "")
    private WebElement logInButton;

    @FindBy(css = "")
    private WebElement flightTab;
    @FindBy(css = "")
    private WebElement hotelTab;
    @FindBy(css = "")
    private WebElement carsTab;
    @FindBy(css = "")
    private WebElement holidayDealsTab;

    public void click_signUpButton() throws InterruptedException {
        signUpButton.click();

    }

    public void click_logInButton() {
        logInButton.click();
    }

    public void click_FlightTab() {
        System.out.println("===Clicking Flight Tab====");
        flightTab.click();
        System.out.println("===Flight Tab Clicked====");
    }

    public void click_HotelTab() {
        System.out.println("===Clicking Hotels Tab====");
        hotelTab.click();
        System.out.println("===Hotels Tab Clicked====");
    }

    public void click_CarsTab() {
        System.out.println("===Clicking Car Tab====");
        carsTab.click();
        System.out.println("===Car Tab Clicked====");
    }

    public void click_HolidayDealsTab() {
        System.out.println("===Clicking Holiday Deals Tab====");
        holidayDealsTab.click();
        System.out.println("===Holiday Deals Tab Clicked====");
    }

    public boolean isMessageDisplayed(String message) {
        System.out.println("======HOME PAGE======");
        boolean isDisplayed = false;
        if (tagLineMessageText.getText().equalsIgnoreCase(message)) {
            isDisplayed = true;
            System.out.println("====Message Displayed= " + message + "====");
        }
        return isDisplayed;
    }


}
