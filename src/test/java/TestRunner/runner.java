package TestRunner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="./Features/APITestingWithXL.feature",
glue= {"StepDefinition"},
format= {"pretty","html:test-outout", "json:json_output/cucumber.json"}, 
monochrome = true)
public class runner extends AbstractTestNGCucumberTests {
	
	/*@AfterTest
    public void teardown() {
       // log.info("Closing browser");
        //driver.close();
		System.out.println("AfterTest");
    }*/
	
}
