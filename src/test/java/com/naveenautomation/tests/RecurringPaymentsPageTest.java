package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;

import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.RecurringPaymentsPage;

public class RecurringPaymentsPageTest extends TestBase {
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	RecurringPaymentsPage recurringPaymentsPage;
	
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}
	
	@Test
	
	public void validateDRecurringPaymentsPage() {
		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");
		recurringPaymentsPage  = myAccountPage.clickSideNavMenuItem7("Recurring Payments");
		String recurringPaymentsText = recurringPaymentsPage.getRecurringPaymentsText();
		Assert.assertEquals("Recurring Payments", recurringPaymentsText);
		
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
