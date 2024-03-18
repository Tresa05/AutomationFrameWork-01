package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class AccountLoginPage extends TestBase {
	public AccountLoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "a[href='https://naveenautomationlabs.com/opencart/index.php?route=account/account'][class='dropdown-toggle']")
	WebElement myAccBtn;

	@FindBy(css = "a[href='https://naveenautomationlabs.com/opencart/index.php?route=account/login']")
	WebElement login;

	@FindBy(id = "input-email")
	WebElement loginInput;

	@FindBy(id = "input-password")
	WebElement pwdInput;

	@FindBy(css = "#content div>div form>input")
	WebElement loginBtn;
	private void clickMyAccBtn() {
		myAccBtn.click();
	}
	private void clickLoginOption() {
		login.click();
	}

	private void enterEmail(String email) {
		loginInput.sendKeys(email);
	}

	private void enterPwd(String pwd) {
		pwdInput.sendKeys(pwd);
	}

	private void clickLogin() {
		loginBtn.click();
	}

	public MyAccountPage submitLogin(String email, String pwd) {
		clickMyAccBtn();
		clickLoginOption();
		enterEmail(email);
		enterPwd(pwd);
		clickLogin();
		return new MyAccountPage();
	}

}
