package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
         features="Features",
         glue= {"StepDefination"} )
public class testRunner extends AbstractTestNGCucumberTests {

}
