package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class ProductCategoryPage extends TestBase {
	
	 public ProductCategoryPage() {
	        PageFactory.initElements(driver, this);
	    }
	
	
	@FindBy(css ="img[title='iPod Classic'][class='img-responsive']")
    WebElement ipodClassicIcon;
	
	@FindBy(css ="button[onclick=\"wishlist.add('47');\"]")
    WebElement addToWishList;
	
	@FindBy(css = "div.alert")
	WebElement addToWishListSuccessBanner;
	
	public  ProductPage clickIpodClassicIcon() {
		ipodClassicIcon.click();
		return new ProductPage();
	}
	
	public void clickAddToWishList() {
		addToWishList.click();
	}
	
	public String getAddtoWishListSuccessAlertText() {
		return addToWishListSuccessBanner.getText();	
}
}
