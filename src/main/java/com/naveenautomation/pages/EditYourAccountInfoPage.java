package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class EditYourAccountInfoPage extends TestBase {
	public EditYourAccountInfoPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-firstname")
	WebElement editFirstName;

	@FindBy(id = "input-lastname")
	WebElement editLastName;

	@FindBy(id = "input-email")
	WebElement editEmail;

	@FindBy(id = "input-telephone")
	WebElement editTelephone;

	@FindBy(css = "input[type='submit']")
	WebElement continueBtn;

	private void inputName(String name) {
		editFirstName.clear();
		editFirstName.sendKeys(name);
	}

	private void inputlastName(String lastname) {
		editLastName.clear();
		editLastName.sendKeys(lastname);
	}

	private void inputEmail(String email) {
		editEmail.clear();
		editEmail.sendKeys(email);

	}

	private void inputPhoneNumber(String phoneNumber) {
		editTelephone.clear();
		editTelephone.sendKeys(phoneNumber);
	}

	private void clickContinue() {
		continueBtn.click();
	}

	public MyAccountPage submitEditInfo(String name, String lastname, String email, String phoneNumber) {

		inputName(name);
		inputlastName(lastname);
		inputEmail(email);
		inputPhoneNumber(phoneNumber);
		clickContinue();
		return new MyAccountPage();
	}
}
