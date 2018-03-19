package step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import com.automation.library.genericClass;

public class changeProfile {
	
	WebDriver driver=genericClass.driver;

	
	@When("^I click on \"([^\"]*)\" link$")
	public void i_click_on_link(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.linkText(arg1)).click();
	}
	
	//Change the profile - Last name field

	@When("^I type in \"([^\"]*)\" in the lastname textbox$")
	public void i_type_in_in_the_lastname_textbox(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("lastname")).clear();
	    driver.findElement(By.name("lastname")).sendKeys(arg1);
	}
	
	//Change the profile - First name field
	@When("^I type in \"([^\"]*)\" in the firstname textbox$")
	public void i_type_in_in_the_firstname_textbox(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("firstname")).clear();
	    driver.findElement(By.name("firstname")).sendKeys(arg1);
	}

	@When("^I click on the Continue button$")
	public void i_click_on_the_Continue_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("tdb5")).click();
	    
	}

	@Then("^I should see \"([^\"]*)\" on the screen$")
	public void i_should_see_on_the_screen(String arg1) throws Throwable {
	   if(driver.findElement(By.className("messageStackSuccess")).getText().contains(arg1)){
		   assertTrue("Change profile using last name success", true);
	   }else{
		   fail("Change profile using last name failed");
	   }
	}

}
