package CheapFlightsAutomation;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by SOHAM on 01/06/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "json:target/"},
        features = {"C:\\Selenium Automation\\CheapFlightsAutomation\\src\\test\\resources"},
        glue = {"C:\\Selenium Automation\\CheapFlightsAutomation\\src\\test\\java\\CheapFlightsAutomation\\MyStepDefinitions.java"}
       )
public class CucumberRunner {

}
