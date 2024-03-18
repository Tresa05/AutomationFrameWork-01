package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.ChangePwdPage;
import com.naveenautomation.pages.EditYourAccountInfoPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.NewsLetterPage;
import com.naveenautomation.utility.Utililty;

public class MyAccountPageTest extends TestBase {

	AccountLoginPage page;
	MyAccountPage myAccountPage;
	EditYourAccountInfoPage editYourAccountInfoPage;
	NewsLetterPage newsLetterPage;
	ChangePwdPage changePwdPage;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}

	@Test
	public void validateLogin() {
		AccountLoginPage page = new AccountLoginPage();
		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");
		String myAccountText = myAccountPage.getMyAccountText();
		Assert.assertEquals(myAccountText, "My Account");
	}

	@Test
	public void validateEditAccountInfo() {
		// Logging in
		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");
		// Click editInfo
		editYourAccountInfoPage = myAccountPage.clickEditYourAccountInfoBtn();
		// Updating Info
		myAccountPage = editYourAccountInfoPage.submitEditInfo(Utililty.generateRandomString(8),
				Utililty.generateRandomString(8), Utililty.generateRandomEmail(), "6588789020");

		String editInfoAlertMessage = myAccountPage.getEditInfoSuccessAlertText();

		Assert.assertEquals("Success: Your account has been successfully updated.", editInfoAlertMessage);
	}

	@Test
	public void validateNewsLetterPage() {
		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");
		newsLetterPage = myAccountPage.clickSideNavMenuItem("NewsLetter");
		newsLetterPage.newsLetterSubscribed();
		String newsLetterAlert = myAccountPage.getNewsLetterSuccessAlertText();
		Assert.assertEquals(" Success: Your newsletter subscription has been successfully updated!", newsLetterAlert);// need
																														// to
																														// work
	}

	@Test
	public void validatePasswordUpdate() {
		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");
		changePwdPage = myAccountPage.clickChangePasswordBtn();
		myAccountPage = changePwdPage.updatePassword("Password2", "Password2");
		String pwdAlertMessage = myAccountPage.getPasswordUpdateAlertText();
		Assert.assertEquals("Success: Your password has been successfully updated.", pwdAlertMessage);

	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}