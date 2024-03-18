package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.naveenautomation.TestBase.TestBase;

public class CartPage extends TestBase {
	public CartPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div>h4:nth-of-type(1) a[href ='#collapse-coupon']")
	WebElement useCouponCodeTab;

	@FindBy(css = "#input-coupon")
	WebElement enterCouponCode;

	@FindBy(css = "input[type='button']")
	WebElement applyCouponBtn;
	
	@FindBy(css = "div.alert")
	WebElement couponCodeInvalidAlert;
	
	@FindBy(css = "div>h4:nth-of-type(1) a[href ='#collapse-shipping']")
	WebElement estimateShippingAndTaxes;
	
	@FindBy(id = "input-country")
	WebElement country;
	
	@FindBy(id = "input-zone")
	WebElement zone;
	
	@FindBy(id = "input-postcode")
	WebElement postCode;
	
	@FindBy(css = "div.alert")
	WebElement invalidBannerAlert;
	
	@FindBy(css = "div.pull-right>a")
	WebElement checkOutBtn;
	
	@FindBy(css = "h1")
	WebElement shoppingCartText;
	
	

	public void clickCouponCodeTab() {
		useCouponCodeTab.click();
	}

	public void inputCouponCodeTab(String code) {
		enterCouponCode.sendKeys(code);
	}

	public void clickApplyCouponBtn() {
		applyCouponBtn.click();
	}
	public String getInvalidCouponCodeAlertText() {
		return couponCodeInvalidAlert.getText();
	}
	
	public void addCouponCode(String code) {
		clickApplyCouponBtn();
		inputCouponCodeTab(code);
		clickApplyCouponBtn();
	}
	
	public void clickEstimateShippingAndTaxesTab() {
		estimateShippingAndTaxes.click();
	}
	private void enterCountry(String name) {
		selectElement(country, name);
	}

	private void enterZone(String name) {
		selectElement(zone, name);
	}
	
	private void enterPostCode(String name) {
		postCode.sendKeys(name);
	}
	
	public String getNoShippingOptionsAlertText() {
		return invalidBannerAlert.getText();
	}
	
	public void submitEstimateShippingAndTaxesInfo(String country, String zone, String postalCode) {
		clickEstimateShippingAndTaxesTab();
		enterCountry(country);
		enterZone(zone);
		enterPostCode(postalCode);
		
	}
	
	private void selectElement(WebElement element, String text) {
		Select sc = new Select(element);

		try {
			sc.selectByVisibleText(text);
		} catch (Exception e) {
			sc.selectByValue(text);
		}
	}
	public CheckOutPage clickCheckOut() {
		checkOutBtn.click();
		return  new CheckOutPage();
	}
	
	public String getShoppingCartText() {
		return shoppingCartText.getText();
	}
	
	
}
