package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class YourTransactionPage  extends TestBase {
	public YourTransactionPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "h1")
	WebElement yourTransactionText;
	
	public String getYourTransactionText() {
		return yourTransactionText.getText();
	}
}

