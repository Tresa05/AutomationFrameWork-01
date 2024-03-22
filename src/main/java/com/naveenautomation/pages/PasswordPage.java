package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.utility.Utility;

public class PasswordPage extends TestBase{
	
	public PasswordPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "h1")
	WebElement PasswordPageSuccessText;

	public String getPasswordPageSuccessText() {
		return Utility.getTextFromWebelement(PasswordPageSuccessText);
	}

	

}
