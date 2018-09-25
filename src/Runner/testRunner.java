package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.it.Date;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
         features="C:\\Users\\user\\eclipse-workspace\\WebService_REST\\src\\Features\\Success.feature",
         glue= {"StepDefination"} )
public class testRunner extends AbstractTestNGCucumberTests {

}
