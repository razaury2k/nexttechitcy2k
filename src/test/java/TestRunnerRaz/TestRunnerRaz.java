package TestRunnerRaz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utility.Base_Parent;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//Cucumber Options
@CucumberOptions(features= {"src/test/resources/Feature_files2"},
plugin = {"json:target/cucumber.json"},
glue = "StepDefination", tags= {"@Cart"})


public class TestRunnerRaz extends AbstractTestNGCucumberTests {

	
	  @BeforeTest
	  public void metasetup() {
		  Base_Parent test = new  Base_Parent();
		  test.metaBrowserinit();
		  
   }
	@AfterTest
	public void metaCloseURL() {
		
		Base_Parent test = new  Base_Parent();
		test.driver.quit();
		
	}
	
}
