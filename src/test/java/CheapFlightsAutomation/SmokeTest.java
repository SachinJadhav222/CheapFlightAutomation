package CheapFlightsAutomation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utility.BaseMain;

import java.io.IOException;

/**
 * Created by SOHAM on 01/06/2017.
 */
public class SmokeTest {
    BaseMain baseMain = new BaseMain();
    HomePage homePage;

    @Before
    public void openBrowser() throws IOException {
        baseMain.openBrowser();
    }

    @After
    public void closeBrowser() {
        baseMain.closeBrowser();
    }

    @Test
    public void homePage() {
        homePage = new HomePage();
       // homePage.isMessageDisplayed();

    }

    @Test
    public void enter_AirPort(){
        FlightTabPage flightTabPage=new FlightTabPage();
        flightTabPage.enter_Airport();
    }
}
