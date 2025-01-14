package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.AccountLogoutPage;
import com.naveenautomation.pages.MyAccountPage;

public class AccountLogoutPageTest extends TestBase {
	
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	AccountLogoutPage accountLogoutPage;
	
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}
	
	@Test
	public void validateAccountLogout() {

		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");

		accountLogoutPage = myAccountPage.clickSideNavMenuItem10("Logout");

		String logoutText = accountLogoutPage.getAccountLogoutSuccessText();
		Assert.assertEquals(logoutText, "You have been logged off your account. It is now safe to leave the computer.",
				"Actual and Expected header text don't match");

	}
	
	
	
	
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}


}
