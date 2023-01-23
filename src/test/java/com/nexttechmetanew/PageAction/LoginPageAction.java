package com.nexttechmetanew.PageAction;

import com.nexttechmetanew.PageLocator.LoginPageLocator;

import Utility.Base_Parent;

public class LoginPageAction extends Base_Parent {
	
	LoginPageLocator loginPageLocator = new LoginPageLocator();
	
	
	
	public void metaLoginCard(String u, String p ) {
		loginPageLocator.UserName.sendKeys(u);
		loginPageLocator.Password.sendKeys(p);
		loginPageLocator.LoginButton.click();
	}
	
	
	
	}


