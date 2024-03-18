package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class OrderPage extends TestBase {
	public OrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "h1")
	WebElement orderHistoryText;
	
	public String getOrderHistoryText() {
		return orderHistoryText.getText();
	}
}
