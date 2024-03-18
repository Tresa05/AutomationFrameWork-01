package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class RecurringPaymentsPage extends TestBase {
	public RecurringPaymentsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "h1")
	WebElement recurringPaymentsText;
	
	public String getRecurringPaymentsText() {
		return recurringPaymentsText.getText();
	}
}
