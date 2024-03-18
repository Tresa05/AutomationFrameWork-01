package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.ProductCategoryPage;
import com.naveenautomation.pages.ProductPage;

public class ProductPageTest extends TestBase {

	AccountLoginPage page;
	MyAccountPage myAccountPage;
	ProductPage productPage;
	ProductCategoryPage productCategoryPage;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}

	@Test
	public void validateAddToCart() {
		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");
		productCategoryPage = myAccountPage.getCategoryPage();
		productPage = productCategoryPage.clickIpodClassicIcon();
		productPage.clickAddToCartBtn();
		String addToCartSuccessAlert = productPage.getPurchaseSucessAlertText();
		Assert.assertEquals("Success: You have added iPod Classic to your shopping cart!\r\n" + "×",
				addToCartSuccessAlert); // Assertion failing
	}
	
	
	@Test
	
	public void validateHeaderCurrencyBtn () {
		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");
		productCategoryPage = myAccountPage.getCategoryPage();
		productPage = productCategoryPage.clickIpodClassicIcon();
		productPage.changeCurrency();
		String euroCurrencyText = productPage.getchangedCurrencyText();
		Assert.assertEquals("", euroCurrencyText);
		
		
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
