package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.WishListPage;

public class WishListPageTest extends TestBase {
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	WishListPage wishListPage;
	
	
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}
	
	@Test  // element not found
	
	public void validateWishListPage() {
		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");
		wishListPage =  myAccountPage.clickSideNavMenuItem3("WishList");
		wishListPage.clickAddtoCart();
		String addToCartFromWishListSuccessAlert = wishListPage.getaddToShoppingCartAlertText();
		Assert.assertEquals("Success: You have added Palm Treo Pro to your shopping cart!", addToCartFromWishListSuccessAlert);
	}
	
	
	
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
