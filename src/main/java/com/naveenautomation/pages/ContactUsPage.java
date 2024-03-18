package com.naveenautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	@FindBy(css = "div#content>p")
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

	public void waitForSubmitBtntobeVisible(WebDriver driver, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(submitBtn));
	}

	public void clicksubmit() {
		submitBtn.click();
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

}
