package com.nexttechmetanew.PageAction;

import com.nexttechmetanew.PageLocator.HomePageLocator;

import Utility.Base_Parent;

public class HomePageAction extends Base_Parent {
	
	HomePageLocator  homePageLocator = new HomePageLocator();
	
	
	public void ClickLoginLink () throws Exception {
		
		homePageLocator.LoginLink.click();
		Thread.sleep(10000);
	}
public void ClickNokialumia() {
	
	homePageLocator.Nokiaphone.click();
	
}

public void Clickaddtocart() throws Exception {
	homePageLocator.AddTocart.click();
	
	Thread.sleep(5000);
	
	driver.switchTo().alert().accept();
}
public void Clickclickcart() {
	homePageLocator.CartLink.click();
	
}


}



