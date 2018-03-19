package step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import com.automation.library.genericClass;

public class searchProduct {
	WebDriver driver=genericClass.driver;

	@When("^I type \"([^\"]*)\" in the search text box$")
	public void i_type_in_the_search_text_box(String arg1) throws Throwable {
	   driver.findElement(By.name("keywords")).sendKeys(arg1);
	}

	@When("^I click on the search icon$")
	public void i_click_on_the_search_icon() throws Throwable {
	    driver.findElement(By.xpath("//input[@type='image']")).click();
	    
	}

	@Then("^I should see \"([^\"]*)\" link on the page$")
	public void i_should_see_link_on_the_page(String arg1) throws Throwable {
		if(genericClass.isElementPresent(By.className("productListingData"))){ //Check if Element is Present 
			if(driver.findElement(By.className("productListingData")).getText().contains(arg1)){
				assertTrue("Search product is a success",true);
				}else{
					fail("Search product is failed"); 
				}
			}else{
				fail("Search product is failed"); //If not Scenario is Fail
		}
	}

	@Then("^I should see \"([^\"]*)\" text on the page$")
	public void i_should_see_text_on_the_page(String arg1) throws Throwable {
		if(driver.findElement(By.className("contentText")).getText().contains(arg1)){
	    	assertTrue("Search product is not available scenario is success",true);
	    }else{
	    	fail("Search product is not available scenario is fail");
	    }
	  
	}

	
}
