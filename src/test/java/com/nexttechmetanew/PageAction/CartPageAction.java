package com.nexttechmetanew.PageAction;

import org.testng.Assert;

import com.nexttechmetanew.PageLocator.CartPageLocator;

import Utility.Base_Parent;

public class CartPageAction extends Base_Parent {

	
	CartPageLocator cartPageLocator = new CartPageLocator();
			
	public void Verifyitemaddedincart() throws Exception {
		Thread.sleep(5000);
		
	boolean Verifycart=	cartPageLocator.VerifyCart.isDisplayed();
		Assert.assertTrue(Verifycart);
	}
	
	
	}

