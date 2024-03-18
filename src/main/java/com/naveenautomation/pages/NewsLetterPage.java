package com.naveenautomation.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class NewsLetterPage extends TestBase{
	
	public NewsLetterPage() {
        PageFactory.initElements(driver, this);
    }

	@FindBy(css = "input[type='radio'][value='1']")
	WebElement subscribeRadioBtn;

	@FindBy(css = "input[type='submit']")
	WebElement continueBtn;

	private void clickSubscribeRadioBtn() {
		subscribeRadioBtn.click();
	}

	private void clickContinueBtn() {
		continueBtn.click();
	}

	public MyAccountPage newsLetterSubscribed() {
		clickSubscribeRadioBtn();
		clickContinueBtn();
		return new MyAccountPage();
		
		

	}
}

