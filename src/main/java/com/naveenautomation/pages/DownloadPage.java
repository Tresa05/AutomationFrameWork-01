package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class DownloadPage extends TestBase {
	public DownloadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "h2")
	WebElement accountDownloadsText;
	
	public String getaccountDownloadsText() {
		return accountDownloadsText.getText();
	}
}
