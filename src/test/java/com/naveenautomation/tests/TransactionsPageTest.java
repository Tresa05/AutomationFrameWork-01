package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.TransactionsPage;

public class TransactionsPageTest extends TestBase {

	AccountLoginPage page;
	MyAccountPage myAccountPage;
	TransactionsPage transactionsPage;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
 	page = new AccountLoginPage();
	}

	@Test
	public void validateTransactionsPageNavigation() {

		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");

		transactionsPage = myAccountPage.clickSideNavMenuItem8("Transactions");

		String headerText = transactionsPage.getTransactionsPageHeading();
		Assert.assertEquals(headerText, "Your Transactions", "Actual and Expected header text don't match");

	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
