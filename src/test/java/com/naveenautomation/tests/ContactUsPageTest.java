package com.naveenautomation.tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.ContactUsPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.utility.Utililty;

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
		Utililty. waitForElementVisibility(driver, null, 10);
			String contactUsSuccessAlertText = contactUsPage.getContactUsSucessAlertText();
			Assert.assertEquals("Your enquiry has been successfully sent to the store owner!", contactUsSuccessAlertText);
		
		}

		private void waitForElementVisibility(WebDriver driver, int i) {
			// TODO Auto-generated method stub
			
		}

		@AfterMethod
		public void closeBrowser() {
			tearDown();
		}

	}


