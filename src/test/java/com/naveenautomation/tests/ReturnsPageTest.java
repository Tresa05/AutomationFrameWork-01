package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.ReturnsPage;

public class ReturnsPageTest extends TestBase {
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	ReturnsPage returnsPage;
	
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}
	
	@Test
	
	public void validateReturnsPage() {
		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");
		returnsPage  = myAccountPage.clickSideNavMenuItem4("Returns");
		String productReturnsHeadingText = returnsPage.getReturnHeadingText();
		Assert.assertEquals("Product Returns", productReturnsHeadingText);
		
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
