package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.CartPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.ProductCategoryPage;
import com.naveenautomation.pages.ProductPage;

public class CartPageTest extends TestBase {

	AccountLoginPage page;
	MyAccountPage myAccountPage;
	ProductPage productPage;
	ProductCategoryPage productCategoryPage;
	CartPage cartPage;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}

	@Test
	public void validateInvalidCouponCode() {
		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");
		productCategoryPage = myAccountPage.getCategoryPage();
		productPage = productCategoryPage.clickIpodClassicIcon();
		productPage.clickAddToCartBtn();
		String addToCartSuccessAlert = productPage.getPurchaseSucessAlertText();
		Assert.assertEquals("Success: You have added iPod Classic to your shopping cart!\r\n" + "×",
				addToCartSuccessAlert);
		cartPage = productPage.clickShoppingCartLink();
		cartPage.addCouponCode("HI10");
		String InvalidCouponCodeAlertText = cartPage.getInvalidCouponCodeAlertText();
		Assert.assertEquals("Warning: Coupon is either invalid, expired or reached its usage limit!",
				InvalidCouponCodeAlertText);

	}
	
	@Test
	
	public void validateEstimateShippingAndTaxesInfo() {
		
		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");
		productCategoryPage = myAccountPage.getCategoryPage();
		productPage = productCategoryPage.clickIpodClassicIcon();
		productPage.clickAddToCartBtn();
		String addToCartSuccessAlert = productPage.getPurchaseSucessAlertText();
		Assert.assertEquals("Success: You have added iPod Classic to your shopping cart!\r\n" + "×",
				addToCartSuccessAlert);
		cartPage = productPage.clickShoppingCartLink();
		cartPage.addCouponCode("HI10");
		String InvalidCouponCodeAlertText = cartPage.getInvalidCouponCodeAlertText();
		Assert.assertEquals("Warning: Coupon is either invalid, expired or reached its usage limit!",
				InvalidCouponCodeAlertText);
		cartPage.submitEstimateShippingAndTaxesInfo("Canada","Ontario","M9B0C5");
		String invalidBannerAlert = cartPage.getNoShippingOptionsAlertText();
		Assert.assertEquals("Warning: No Shipping options are available. Please contact us for assistance!", invalidBannerAlert);
		
		
	}
	
	@Test
	
	public void validateHeaderCheckOutBtn() {
		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");
		cartPage = myAccountPage.clickHeaderCheckoutBtn();
		String shoppingCartText = cartPage.getShoppingCartText();
		Assert.assertEquals("Shopping Cart  (10.53kg)", shoppingCartText);
		
		
		
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
