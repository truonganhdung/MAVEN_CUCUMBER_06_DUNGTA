package pageObjects;

import org.openqa.selenium.WebDriver;
import commons.AbstractPage;

public class DeleteAccountPageObject extends AbstractPage {
	WebDriver driver;

	public DeleteAccountPageObject(WebDriver driver) {
		this.driver = driver;
	}

	// public void inputToAccountNoTextBox(String accountNo) {
	// waitForControlVisible(driver, AbstractPageUI.DYNAMIC_TEXTBOX,
	// DynamicLocator.ACCOUNT_NUMBER);
	//
	// if (driver.toString().toLowerCase().contains("internetexplorer")) {
	// sendkeyToElementByJS(driver, accountNo, AbstractPageUI.DYNAMIC_TEXTBOX,
	// DynamicLocator.ACCOUNT_NUMBER);
	// } else {
	// sendkeyToElement(driver, accountNo, AbstractPageUI.DYNAMIC_TEXTBOX,
	// DynamicLocator.ACCOUNT_NUMBER);
	// }
	// }

}
