package CheapFlightsAutomation;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by SOHAM on 01/06/2017.
 */
public class MyStepDefinitions {
    HomePage homePage=new HomePage();

    @Given("^use is on Home Page user can see tag line message \"([^\"]*)\"$")
    public void useIsOnHomePageUserCanSeeTagLineMessage(String message) throws Throwable {
        Assert.assertTrue(homePage.isMessageDisplayed(message));
    }

    @Given("^user click sign up button$")
    public void userClickSignUpButton() throws Throwable {
        System.out.println("===User click sing Up Button===");
        homePage.click_signUpButton();
    }

    @When("^user enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void userEnter(String name, String email, String password) throws Throwable {
        homePage.enterSignInDetails(name, email, password);
    }

    @Then("^user see accoutn created$")
    public void userSeeAccoutnCreated() throws Throwable {
        System.out.println("hi");
    }


}
