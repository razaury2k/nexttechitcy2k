package StepDefination;

import com.nexttechmetanew.PageAction.AccountPageAction;
import com.nexttechmetanew.PageAction.HomePageAction;
import com.nexttechmetanew.PageAction.LoginPageAction;

import Utility.Base_Parent;
import Utility.MetaUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login2 extends Base_Parent{
	
	
	
	HomePageAction homePageAction= new HomePageAction();
	LoginPageAction loginPageAction= new LoginPageAction();
	AccountPageAction accountPageAction= new AccountPageAction();
	
	
	
@Given("^launch \"([^\"]*)\"$")
public void launch(String URL) throws Throwable {
   
	metaLaunchURL(URL);
	
}
@Then("^Click Login Link$")
public void click_Login_Link() throws Throwable {
	
	homePageAction.ClickLoginLink();
}

@Then("^Enter Username and Enter Password and Click Login button$")
public void enter_Username_and_Enter_Password_and_Click_Login_button() throws Throwable {
	
	loginPageAction.metaLoginCard(metaprop.getProperty("UserName1"),metaprop.getProperty("password1"));
}

@Then("^Verify user can login with valid card$")
public void verify_user_can_login_with_valid_card() throws Throwable {
	accountPageAction.Verifyusercanloginwithvalidcard();
	
	MetaUtility.takeMyScreenshot(driver, "Account Profile Page");
}



}
