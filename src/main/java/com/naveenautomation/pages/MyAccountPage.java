package com.naveenautomation.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.utility.Utility;

public class MyAccountPage extends TestBase {

	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}

	// Flow 1 Elements
	@FindBy(css = "#account-account>div.row h2:first-of-type")
	WebElement myAccountText;

	@FindBy(css = "#column-right a")
	List<WebElement> sideNavWebelementList;

	@FindBy(css = "div.alert")
	WebElement NewsLetterSuccessBanner;

	// Flow 2 Elements
	@FindBy(css = "#content>ul:nth-of-type(1) li:nth-of-type(1) a")
	WebElement editYourAccountInfoBtn;

	@FindBy(css = "div.alert")
	WebElement successBanner;

	// Flow 3 Elements

	@FindBy(css = "ul>li:first-of-type a.dropdown-toggle")
	WebElement desktopBtn;

	@FindBy(xpath = "//a[@class='see-all'][@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20']")
	WebElement showAllDesktopBtn;

	// Flow 4 Elements

	@FindBy(xpath = "//a[text()='Contact Us']")
	WebElement contactUsBtn;

	// Flow 5 Elements
	@FindBy(xpath = "//a[text()='Gift Certificates']")
	WebElement giftCertificateBtn;

	// Flow 7 Elements
	@FindBy(css = "#content>ul:nth-of-type(1) li:nth-of-type(2) a")
	WebElement changePwdBtn;

	@FindBy(css = "div.alert")
	WebElement changePwdSuccessBanner;

	// Flow 6 Elements

	@FindBy(xpath = "//span[text()='Checkout']")
	WebElement headerCheckoutBtn;

	@FindBy(xpath = "//a[text()='Your Transactions']")
	WebElement transactionBtn;
	
	@FindBy(css = "div.alert")
	WebElement editAffiliateInfosuccessBanner;
	
	@FindBy(css = "#content>ul:nth-of-type(3) a")
	WebElement editAffiliateInfoBtn;


	// Flow 1 Methods
	public String getMyAccountText() {
		return myAccountText.getText();
	}

	public NewsLetterPage clickSideNavMenuItem(String item) {
		for (int i = 0; i < sideNavWebelementList.size(); i++) {
			if (sideNavWebelementList.get(i).getText().equalsIgnoreCase(item)) {
				sideNavWebelementList.get(i).click();
				break;
			}
		}
		return new NewsLetterPage();
	}

	public String getNewsLetterSuccessAlertText() {
		return NewsLetterSuccessBanner.getText();
	}

	// Flow 2 Methods
	public EditYourAccountInfoPage clickEditYourAccountInfoBtn() {
		editYourAccountInfoBtn.click();
		return new EditYourAccountInfoPage();
	}

	public String getEditInfoSuccessAlertText() {
		return successBanner.getText();
	}

	// Flow 3 methods

	private void clickDeskTopBtn() {
		desktopBtn.click();
	}

	private void clickShowAllDesktopBtn() {
		showAllDesktopBtn.click();
	}

	public ProductCategoryPage getCategoryPage() {
		clickDeskTopBtn();
		clickShowAllDesktopBtn();
		return new ProductCategoryPage();
	}

	// Flow 4 Methods

	public ContactUsPage clickContactUsBtn() {
		contactUsBtn.click();
		return new ContactUsPage();
	}

	// Flow 5 Methods

	public GiftCertificatePage clickGiftCertificatesBtn() {
		giftCertificateBtn.click();
		return new GiftCertificatePage();

	}

	// Flow 6 Methods

	public AddressBookPage clickSideNavMenuItem2(String item) {
		for (int i = 0; i < sideNavWebelementList.size(); i++) {
			if (sideNavWebelementList.get(i).getText().equalsIgnoreCase(item)) {
				sideNavWebelementList.get(i).click();
				break;
			}
		}
		return new AddressBookPage();
	}

	// Flow 7 Methods
	public ChangePwdPage clickChangePasswordBtn() {
		changePwdBtn.click();
		return new ChangePwdPage();
	}

	public String getPasswordUpdateAlertText() {
		return changePwdSuccessBanner.getText();
	}

	public WishListPage clickSideNavMenuItem3(String item) {
		for (int i = 0; i < sideNavWebelementList.size(); i++) {
			if (sideNavWebelementList.get(i).getText().equalsIgnoreCase(item)) {
				sideNavWebelementList.get(i).click();
				break;
			}
		}
		return new WishListPage();
	}

	public CartPage clickHeaderCheckoutBtn() {
		headerCheckoutBtn.click();
		return new CartPage();
	}

	public ReturnsPage clickSideNavMenuItem4(String item) {
		for (int i = 0; i < sideNavWebelementList.size(); i++) {
			if (sideNavWebelementList.get(i).getText().equalsIgnoreCase(item)) {
				sideNavWebelementList.get(i).click();
				break;
			}
		}
		return new ReturnsPage();
	}

	public DownloadPage clickSideNavMenuItem5(String item) {
		for (int i = 0; i < sideNavWebelementList.size(); i++) {
			if (sideNavWebelementList.get(i).getText().equalsIgnoreCase(item)) {
				sideNavWebelementList.get(i).click();
				break;
			}
		}
		return new DownloadPage();
	}

	public OrderPage clickSideNavMenuItem6(String item) {
		for (int i = 0; i < sideNavWebelementList.size(); i++) {
			if (sideNavWebelementList.get(i).getText().equalsIgnoreCase(item)) {
				sideNavWebelementList.get(i).click();
				break;
			}
		}
		return new OrderPage();
	}

	public RecurringPaymentsPage clickSideNavMenuItem7(String item) {
		for (int i = 0; i < sideNavWebelementList.size(); i++) {
			if (sideNavWebelementList.get(i).getText().equalsIgnoreCase(item)) {
				sideNavWebelementList.get(i).click();
				break;
			}
		}
		return new RecurringPaymentsPage();
	}

	public YourTransactionPage clickYourTransactionBtn() {
		transactionBtn.click();
		return new YourTransactionPage();
	}
	
	public String getEditAffiliateInfosuccessBanner() {
		return Utility.getTextFromWebelement(editAffiliateInfosuccessBanner);
	}

	public EditAffiliateInfoPage clickEditAffiliateInfoBtn() {
		Utility.clickOnElement(editAffiliateInfoBtn);
		return new EditAffiliateInfoPage();
	}
	
	public PasswordPage clickSideNavMenuItem11(String item) {
		for (int i = 0; i < sideNavWebelementList.size(); i++) {
			if (sideNavWebelementList.get(i).getText().equalsIgnoreCase(item)) {
				sideNavWebelementList.get(i).click();
				break;
			}
		}
		return new PasswordPage();
	}
	
	// Transactions
		public TransactionsPage clickSideNavMenuItem8(String item) {
			for (int i = 0; i < sideNavWebelementList.size(); i++) {
				if (sideNavWebelementList.get(i).getText().equalsIgnoreCase(item)) {
					sideNavWebelementList.get(i).click();
					break;
				}
			}
			return new TransactionsPage();
		}
		
		public RewardPointsPage clickSideNavMenuItem9(String item) {
			for (int i = 0; i < sideNavWebelementList.size(); i++) {
				if (sideNavWebelementList.get(i).getText().equalsIgnoreCase(item)) {
					sideNavWebelementList.get(i).click();
					break;
				}
			}
			return new RewardPointsPage();
		}
		
		public AccountLogoutPage clickSideNavMenuItem10(String item) {
			for (int i = 0; i < sideNavWebelementList.size(); i++) {
				if (sideNavWebelementList.get(i).getText().equalsIgnoreCase(item)) {
					sideNavWebelementList.get(i).click();
					break;
				}
			}
			return new AccountLogoutPage();
		}

	

}
