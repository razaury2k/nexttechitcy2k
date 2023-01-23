package com.nexttechmetanew.PageAction;

import org.testng.Assert;

import com.nexttechmetanew.PageLocator.AccountPageLocator;

import Utility.Base_Parent;

public class AccountPageAction extends Base_Parent{

	AccountPageLocator accountPageLocator = new AccountPageLocator();
	
	
	public void Verifyusercanloginwithvalidcard() throws Exception {
		Thread.sleep(10000);
		
	boolean verifyAccountProfile = accountPageLocator.AccountProfile.isDisplayed();
		Assert.assertTrue(verifyAccountProfile);
	
	}
	
	
}
	
	

