package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class ReturnsPage  extends TestBase {
	public ReturnsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "h1")
	WebElement productReturnText;
	
	public String getReturnHeadingText() {
		return productReturnText.getText();
	}

}
