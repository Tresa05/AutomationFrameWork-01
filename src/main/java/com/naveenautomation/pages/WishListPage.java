package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class WishListPage extends TestBase{
	
	public WishListPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "button[onclick=\"cart.add('29');\"]")
	WebElement addToCartFirstProduct;
	
	@FindBy(css = "div.alert")
	WebElement addToShoppingCartSuccessBanner;
	
	public void clickAddtoCart() {
		addToCartFirstProduct.click();
	}
	
	public String getaddToShoppingCartAlertText() {
		return addToShoppingCartSuccessBanner.getText();
	}
	


}
