package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.RewardPointsPage;

public class RewardPointsPageTest extends TestBase {

	AccountLoginPage page;
	MyAccountPage myAccountPage;
	RewardPointsPage rewardPointsPage;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}

	@Test
	public void validateRecurringPaymentsPageNavigation() {

		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");

		rewardPointsPage = myAccountPage.clickSideNavMenuItem9("Reward Points");

		String headerText = rewardPointsPage.getRewardPointsHeading();
		Assert.assertEquals(headerText, "Your Reward Points", "Actual and Expected header text don't match");

	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}