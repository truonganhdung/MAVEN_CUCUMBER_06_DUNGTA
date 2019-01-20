package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.AbstractPageObject;
import pageObjects.BalanceEnquiryPageObject;
import pageObjects.DeleteAccountPageObject;
import pageObjects.DeleteCustomerPageObject;
import pageObjects.DepositPageObject;
import pageObjects.EditCustomerPageObject;
import pageObjects.FundTransferPageObject;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.NewAccountPageObject;
import pageObjects.NewCustomerPageObject;
import pageObjects.RegisterPageObject;
import pageObjects.WithdrawalPageObject;

public class PageFactoryManager {

	public static LoginPageObject getLogInPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}

	public static RegisterPageObject getResgisterPage(WebDriver driver) {
		return new RegisterPageObject(driver);
	}

	public static NewCustomerPageObject getNewCustomerPage(WebDriver driver) {
		return new NewCustomerPageObject(driver);
	}

	public static EditCustomerPageObject getEditCustomerPage(WebDriver driver) {
		return new EditCustomerPageObject(driver);
	}

	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}

	public static DepositPageObject getDepositPage(WebDriver driver) {
		return new DepositPageObject(driver);
	}

	public static FundTransferPageObject getFundTransferPage(WebDriver driver) {
		return new FundTransferPageObject(driver);
	}

	public static NewAccountPageObject getNewAccountPage(WebDriver driver) {
		return new NewAccountPageObject(driver);
	}

	public static WithdrawalPageObject getWithdrawalPage(WebDriver driver) {
		return new WithdrawalPageObject(driver);
	}

	public static BalanceEnquiryPageObject getBalanceEnquiryPage(WebDriver driver) {
		return new BalanceEnquiryPageObject(driver);
	}

	public static DeleteAccountPageObject getDeleteAccountPage(WebDriver driver) {
		return new DeleteAccountPageObject(driver);
	}

	public static DeleteCustomerPageObject getDeleteCustomerPage(WebDriver driver) {
		return new DeleteCustomerPageObject(driver);
	}

	public static AbstractPageObject getAbstractPage(WebDriver driver) {
		return new AbstractPageObject(driver);
	}
}
