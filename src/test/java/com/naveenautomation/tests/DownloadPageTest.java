package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.DownloadPage;
import com.naveenautomation.pages.MyAccountPage;


public class DownloadPageTest extends TestBase {
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	DownloadPage downloadPage;
	
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}
	
	@Test
	
	public void validateDownloadsPage() {
		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");
		downloadPage  = myAccountPage.clickSideNavMenuItem5("Downloads");
		String accountDownloadsText = downloadPage.getaccountDownloadsText();
		Assert.assertEquals("Account Downloads", accountDownloadsText);
		
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
