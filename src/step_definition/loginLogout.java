package step_definition;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import com.automation.library.genericClass;

public class loginLogout {
	 WebDriver driver=genericClass.driver;
	
	
	@When("^I click on the \"([^\"]*)\" link$")
	public void i_click_on_the_link(String myAcclink) throws Throwable {
		driver.findElement(By.linkText(myAcclink)).click();
	    
	}
	@When("^I am logged in using username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_am_logged_in_using_username_and_password(String uname, String pwd) throws Throwable {
	    driver.findElement(By.name("email_address")).sendKeys(uname);
	    driver.findElement(By.name("password")).sendKeys(pwd);
	    driver.findElement(By.name("password")).sendKeys(Keys.ESCAPE);
	    
	   
	}
	
	@When("^I click on the Sign in button$")
	public void i_click_on_the_Sign_in_button() throws Throwable {
	    driver.findElement(By.id("tdb5")).click();
	}
	
	@Then("^I should see \"([^\"]*)\" link on page$")
	public void i_should_see_link_on_page(String logOfflink) throws Throwable {
	    if(driver.findElement(By.linkText(logOfflink)).isDisplayed()){
	    	assertTrue("Login Pass",true);
	    }else{
	    	fail("Login Fail");
	    }
	}
	
	@When("^I will click on the \"([^\"]*)\" link$")
	public void i_will_click_on_the_link(String logoffLink) throws Throwable {
	   driver.findElement(By.linkText(logoffLink)).click();
	}
	
	@When("^I will click on the \"([^\"]*)\" button$")
	public void i_will_click_on_the_button(String contBtn) throws Throwable {
		 driver.findElement(By.linkText(contBtn)).click();
	}
	
	@Then("^I should see \"([^\"]*)\" text on page\\.$")
	public void i_should_see_text_on_page(String arg1) throws Throwable {
	    if(driver.getPageSource().contains(arg1)){
	    	assertTrue("Logout Successful", true);
	    }else{
	    	fail("Logout unsuccessful");
	    }
	    
	}
	
	@Then("^I should not see \"([^\"]*)\" on page$")
	public void i_should_not_see_on_page(String arg1) throws Throwable {
		if(driver.getPageSource().contains(arg1)){
			fail("Scenario for bad login failed");
	    }else{
	    	assertTrue("Scenario for bad login is pass", true);
	    }
	    
	}


}
