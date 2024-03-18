package com.naveenautomation.tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.GiftCertificatePage;
import com.naveenautomation.pages.MyAccountPage;

public class GiftcertificatePageTest extends TestBase {
	
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	GiftCertificatePage giftCertificatePage;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}

	@Test
	public void validateGiftCertificate() {
		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");
		giftCertificatePage = myAccountPage.clickGiftCertificatesBtn();
        giftCertificatePage.submitGiftcertificate("Jubin", "xyz@yahoo.com", "Tresa", "xyz@hotmail.com",RandomStringUtils.randomAlphabetic(15), "00");
        String giftCertificateSuccessAlertText = giftCertificatePage.getGiftCertificateAlertText();
		Assert.assertEquals("This gift certificate will be emailed to the recipient after your order has been paid for.", giftCertificateSuccessAlertText);
		
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}

