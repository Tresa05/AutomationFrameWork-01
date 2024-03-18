package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class CheckOutPage extends TestBase {
	public CheckOutPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "button-payment-address")
	WebElement continueBtn;

	@FindBy(id = "button-shipping-address")
	WebElement continueBtn2;

	@FindBy(id = "button-shipping-address")
	WebElement continueBtn3;

	@FindBy(css = "input[type='checkbox']")
	WebElement agreementCheckbox;

	@FindBy(css = "#button-payment-method")
	WebElement continueBtn4;

	@FindBy(css = "input[id='button-confirm']")
	WebElement confirmOrderBtn;

	@FindBy(css = "h1")
	WebElement confirmOrderAlertText;

	public void clickContinueBtn() {
		continueBtn.click();
	}

	public void clickContinueBtn2() {
		continueBtn2.click();
	}

	public void clickContinueBtn3() {
		continueBtn3.click();
	}

	public void clickAgreementCheckBox() {
		agreementCheckbox.click();
	}

	public void clickContinueBtn4() {
		continueBtn4.click();
	}

	public void clickConfirmOrderBtn() {
		confirmOrderBtn.click();
	}

	public String getOrderConfirmAlertText() {
		return confirmOrderAlertText.getText();
	}
	
	public void confirmedCheckout() {
		clickContinueBtn();
		clickContinueBtn2();
		clickContinueBtn3();
		clickAgreementCheckBox();
		clickContinueBtn4();
		clickConfirmOrderBtn();
		
	}
}
