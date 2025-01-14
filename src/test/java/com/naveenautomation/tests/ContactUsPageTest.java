package com.naveenautomation.tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.ContactUsPage;
import com.naveenautomation.pages.MyAccountPage;

public class ContactUsPageTest extends TestBase {
	
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	ContactUsPage contactUsPage;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
 	page = new AccountLoginPage();
	}

		@Test // not working
		public void validateContactUs() {
			myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");
			contactUsPage = myAccountPage.clickContactUsBtn();
			contactUsPage.submitContactUs("Tresa","tresamariya25@gmail.com",RandomStringUtils.randomAlphabetic(60));
		
			String contactUsSuccessAlertText = contactUsPage.getContactUsSucessAlertText();
			Assert.assertEquals("Contact Us", contactUsSuccessAlertText);
		
		}
//
//		private void waitForElementVisibility(WebDriver driver, int i) {
//			// TODO Auto-generated method stub
//			
		

		@AfterMethod
		public void closeBrowser() {
			tearDown();
		}

	}


