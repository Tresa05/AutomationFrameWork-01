package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class ProductPage extends TestBase{
	
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="button#button-cart")
     WebElement addToCartBtn;
	
	@FindBy(css = "div.alert")
	WebElement addToCartSuccessAlert;
	
	@FindBy(css = "div>a:nth-of-type(2)")
	WebElement shoppingcartLink;
	
	@FindBy(xpath ="//span[text()='Currency']")
    WebElement headerCurrencyBtn;
	
	@FindBy(css ="button[name='EUR']")
    WebElement euroCurrencyBtn;
	
	@FindBy(css ="button[name='EUR']")
    WebElement changedCurrencyText;
	
	
	public void clickAddToCartBtn() {
		addToCartBtn.click();
	}
	public String getPurchaseSucessAlertText() {
		return addToCartSuccessAlert.getText();
	}
	public CartPage clickShoppingCartLink() {
		shoppingcartLink.click();
		return new CartPage();
	}
	
	private void clickCurrencyBtn() {
		headerCurrencyBtn.click();
	}
	
	private void clickEuroCurrencyBtn() {
		euroCurrencyBtn.click();
	}
	
	public void changeCurrency() {
		clickCurrencyBtn();
		clickEuroCurrencyBtn();
	}
	
	public String getchangedCurrencyText() {
		  return changedCurrencyText.getText();
	}
	


}
