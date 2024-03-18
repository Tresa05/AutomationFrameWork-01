package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.OrderPage;

public class OrderPageTest extends TestBase {
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	OrderPage orderPage;
	
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}
	
	@Test
	
	public void validateOrderHistoryPage() {
		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");
		orderPage  = myAccountPage.clickSideNavMenuItem6("Order History");
		String orderHistoryText = orderPage.getOrderHistoryText();
		Assert.assertEquals("Order History", orderHistoryText);
		
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
