package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class GiftCertificatePage extends TestBase {

	public GiftCertificatePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#input-to-name")
	WebElement enterRecipientName;

	@FindBy(css = "#input-to-email")
	WebElement enterRecipientEmail;

	@FindBy(css = "#input-from-name")
	WebElement yourName;

	@FindBy(css = "#input-from-email")
	WebElement yourEmail;

	@FindBy(css = "input[name='voucher_theme_id'][value='8']")
	WebElement themeBtn;

	@FindBy(css = "#input-message")
	WebElement enterMessage;

	@FindBy(css = "#input-amount")
	WebElement enterAmount;

	@FindBy(css = "input[type='checkbox']")
	WebElement checkBtn;

	@FindBy(css = "input[type='submit']")
	WebElement submitBtn;
	
	@FindBy(css = "div#content>p")
	WebElement giftCertificateSuccessAlert;
	

	private void inputRecipientName(String recipientName) {
		enterRecipientName.sendKeys(recipientName);
	}

	private void inputReciepientEmail(String recipientEmail) {
		enterRecipientEmail.sendKeys(recipientEmail);
	}

	private void inputName(String name) {
		yourName.sendKeys(name);
	}

	private void inputEmail(String email) {
		yourEmail.sendKeys(email);
	}

	private void clickTheme() {
		themeBtn.click();
	}

	private void inputMessage(String message) {
		enterMessage.sendKeys(message);
	}

	private void inputAmount(String amount) {
		enterAmount.sendKeys(amount);
	}

	private void clickCheckBox() {
		checkBtn.click();
	}

	private void clickSubmit() {
		submitBtn.click();
	}
	
	public String getGiftCertificateAlertText() {
		return giftCertificateSuccessAlert.getText();
	}

	public void submitGiftcertificate(String recipientName, String recipientEmail, String name, String email,
			String message, String amount) {
		inputRecipientName(recipientName);
		inputReciepientEmail(recipientEmail);
		inputName(name);
		inputEmail(email);
		clickTheme();
		inputMessage(message);
		inputAmount(amount);
		clickCheckBox();
		clickSubmit();
	}

}
