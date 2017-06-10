package CheapFlightsAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.BaseMain;

/**
 * Created by SOHAM on 10/06/2017.
 */
public class FlightTabPage extends BaseMain {

    @FindBy(css = ".cfui-input.cfui-watermark")
    private WebElement enterAirPort;

    public void enter_Airport(){
        System.out.println("==========Entering Airport============");
        System.out.println(enterAirPort.getText());
        System.out.println(enterAirPort.getCssValue("data-bind"));
        System.out.println("==========Airport Entered============");
    }
}
