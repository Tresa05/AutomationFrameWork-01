package com.naveenautomation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.EditYourAccountInfoPage;
import com.naveenautomation.utility.Utililty;

public class EditYourAccountInfoPageTest extends TestBase {

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
	}

	@Test
	public void validateEditInfo() {
		EditYourAccountInfoPage editInfo = new EditYourAccountInfoPage();
		editInfo.submitEditInfo(Utililty.generateRandomString(8), Utililty.generateRandomString(8),
				Utililty.generateRandomEmail(), "6588789020");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
