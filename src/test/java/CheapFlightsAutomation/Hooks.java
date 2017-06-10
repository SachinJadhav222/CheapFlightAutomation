package CheapFlightsAutomation;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.BaseMain;

import java.io.IOException;

/**
 * Created by SOHAM on 01/06/2017.
 */
public class Hooks {
    BaseMain baseMain=new BaseMain();

    @Before
    public void setUp() throws IOException {
        System.out.println("======Hooks Opening Browser======");
        baseMain.openBrowser();
    }
    @After
    public void tearDown(){
        System.out.println("======Hooks Closing Browser======");
        baseMain.closeBrowser();
    }
}
