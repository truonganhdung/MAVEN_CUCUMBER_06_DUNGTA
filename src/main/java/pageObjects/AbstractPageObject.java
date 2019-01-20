package pageObjects;

import interfaces.AbstractPageUI;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class AbstractPageObject extends AbstractPage {
	WebDriver driver;

	public AbstractPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputToDynamicTextboxWithDynamicData(String textboxID, String value) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_TEXTBOX_CUCUMBER, textboxID);
		sendkeyToElement(driver, value, AbstractPageUI.DYNAMIC_TEXTBOX_CUCUMBER, textboxID);
	}

	public void inputToDynamicTextareaWithDynamicData(String textareaID, String value) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_TEXTAREA_CUCUMBER, textareaID);
		sendkeyToElement(driver, value, AbstractPageUI.DYNAMIC_TEXTAREA_CUCUMBER, textareaID);
	}

	public void selectToDynamicDropdownWithDynamicData(String dropdownID, String value) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_DROPDOWN_CUCUMBER, dropdownID);
		selectItemByVisibleText(driver, AbstractPageUI.DYNAMIC_DROPDOWN_CUCUMBER, value);
	}

	public void openDynamicPage(String pageName) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGE_LINK, pageName);
		clickToElement(driver, AbstractPageUI.DYNAMIC_PAGE_LINK, pageName);
	}
}
