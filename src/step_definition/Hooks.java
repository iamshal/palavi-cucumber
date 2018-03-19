package step_definition;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import com.automation.library.genericClass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
    
	@Before
    public void logInfo(Scenario scenario) throws Exception {
		System.out.println("ID: "+scenario.getId());
		System.out.println("Tag names: "+scenario.getSourceTagNames());
		System.out.println("Scenario Name: "+scenario.getName());
		//genericClass.getDriver();
    }
    
    @After
    /**
     * Embed a screenshot in test report if test is marked as passed or failed
     */
    
    public void embedScreenshotPass(Scenario scenario) throws Exception {
    	System.out.println("Status of Scenario:" +scenario.getStatus());
		
        if(!scenario.isFailed()) {
        try {
        	 scenario.write("Current Page URL is " + genericClass.driver.getCurrentUrl());
        	 byte[] screenshot = ((TakesScreenshot)genericClass.driver).getScreenshotAs(OutputType.BYTES);
        	 scenario.embed(screenshot, "image/png");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
      }else if(scenario.isFailed()) {
        try {
        	 scenario.write("Current Page URL is " + genericClass.driver.getCurrentUrl());
        	 byte[] screenshot = ((TakesScreenshot) genericClass.driver).getScreenshotAs(OutputType.BYTES);
        	 scenario.embed(screenshot, "image/png");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
       }
        //Close
        genericClass.CloseBrowser();
        
    }
    
}