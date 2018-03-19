
package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

 //Entry point for Cucumber - 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,format = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber/cucumber-report.json"}
		//,format = {"pretty","json:src/results/cucumber-report.json"}
		,glue={"step_definition"}
		,tags={"@login"}
	)
 
public class TestRunner {
 
}