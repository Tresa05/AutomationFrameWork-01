package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.ChangePwdPage;
import com.naveenautomation.pages.MyAccountPage;

public class ChangePwdPageTest extends TestBase {
	
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	ChangePwdPage changePwdPage;

	
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}
	
	@Test
	public void validateInvalidPasswordUpdate() {
		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");
		changePwdPage = myAccountPage.clickChangePasswordBtn();
		changePwdPage.updatePassword("Password2", "PasswordX");
		String invalidPwdAlertMessage = changePwdPage.getPwdChangeNotSucessText();
		Assert.assertEquals("Password confirmation does not match password!", invalidPwdAlertMessage);
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
		
	}

}
