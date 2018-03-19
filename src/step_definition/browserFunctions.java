package step_definition;

import com.automation.library.genericClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class browserFunctions {
	
	@Given("^I am on the osCommerce homepage$")
	public void i_am_on_the_osCommerce_homepage() throws Throwable {
		genericClass.setDriver();
	}
	
	@Then("^I should close the browser$")
	public void i_should_close_the_browser() throws Throwable {
			genericClass.CloseBrowser();
	}
}