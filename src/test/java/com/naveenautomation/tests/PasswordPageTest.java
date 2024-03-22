package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.PasswordPage;

public class PasswordPageTest extends TestBase {
	
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	PasswordPage passwordPage;
	
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}
	
	@Test
	public void validateAccountLogout() {

		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");

		passwordPage = myAccountPage.clickSideNavMenuItem11("Password");

		String PasswordText = passwordPage.getPasswordPageSuccessText();
		Assert.assertEquals("Change Password", PasswordText);
	}
	
	
	
	
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}


}


