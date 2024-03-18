package com.naveenautomation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;

public class AccountLoginPageTest extends TestBase {

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
	}

	@Test
	public void validateLogin() {
		AccountLoginPage page = new AccountLoginPage();
		page.submitLogin("tresamariya25@gmail.com", "REENA25");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}