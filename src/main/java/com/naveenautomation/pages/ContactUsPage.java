package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class ContactUsPage extends TestBase {
	public ContactUsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Contact Us'] ")
	WebElement contactUs;

	@FindBy(css = "input[name='name']")
	WebElement inputYourName;

	@FindBy(css = "input[name='email']")
	WebElement enterEmail;

	@FindBy(id = "input-enquiry")
	WebElement inputEnquiry;

	@FindBy(css = "input[value='Submit']")
	WebElement submitBtn;

	@FindBy(css = "h1")
	WebElement contactUsSuccessAlert;

	private void clickContactUs() {
		contactUs.click();
	}

	private void inputName(String name) {
		inputYourName.sendKeys(name);
	}

	private void enterEmail(String email) {
		enterEmail.clear();
		enterEmail.sendKeys(email);
	}

	private void enterEnquiry(String message) {
		inputEnquiry.sendKeys(message);
	}



	public String getContactUsSucessAlertText() {
		return contactUsSuccessAlert.getText();
	}

	public void submitContactUs(String name, String email, String message) {
		clickContactUs();
		inputName(name);
		enterEmail(email);
		enterEnquiry(message);

	}
	public void clicksubmit() {
		submitBtn.click();
	}

}
