package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.YourTransactionPage;

public class YourTransactionPageTest extends TestBase {
	
	
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	YourTransactionPage yourTransactionPage;
	
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}
	
	@Test
	
	public void validateYourTransactionsPage() {
		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");
		yourTransactionPage  = myAccountPage.clickYourTransactionBtn();;
		String yourTransactionText = yourTransactionPage.getYourTransactionText();
		Assert.assertEquals("Your Transactions", yourTransactionText);
		
		
	}
	
	
	
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}


}
