package com.naveenautomation.tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.NewsLetterPage;

public class NewsLetterPageTest extends TestBase{
	
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
	}

	@Test
	public void validateNewsLetterPage() {
		NewsLetterPage newsLetter = new NewsLetterPage();
		newsLetter.newsLetterSubscribed();
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
