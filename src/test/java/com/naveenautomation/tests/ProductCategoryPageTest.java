package com.naveenautomation.tests;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.ProductCategoryPage;

public class ProductCategoryPageTest extends TestBase {
	
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	ProductCategoryPage productCategoryPage;
	
	
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}

	@Test
	public void validateProductCategoryPage() {
		ProductCategoryPage productCategory = new ProductCategoryPage();
		productCategory.clickIpodClassicIcon();
	}
	
	@Test  // Assertion issue
	
	public void validateAddToWishListBtn() {
		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");
		productCategoryPage= myAccountPage.getCategoryPage();
		productCategoryPage.clickAddToWishList();
		String addToWishListAlertMessage = productCategoryPage.getAddtoWishListSuccessAlertText();
		Assert.assertEquals( "Success: You have added HP LP3065 to your wish list!\r\n"
				+ "×", addToWishListAlertMessage);
		
		
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
