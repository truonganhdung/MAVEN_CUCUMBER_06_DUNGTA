package stepDefinitions;

import org.openqa.selenium.WebDriver;

import pageObjects.AbstractPageObject;
import commons.AbstractTest;
import commons.PageFactoryManager;
import cucumber.api.java.en.Given;
import cucumberOption.Hooks;

public class AbstractPageSteps extends AbstractTest {
	public WebDriver driver;
	private AbstractPageObject abstractPage;

	public AbstractPageSteps() {
		driver = Hooks.openBrowser();
		abstractPage = PageFactoryManager.getAbstractPage(driver);
	}

	@Given("^I input to \"([^\"]*)\" textbox with data \"([^\"]*)\"$")
	public void iInputToDynamicTextboxWithDynamicData(String textboxID, String value) {
		abstractPage.inputToDynamicTextboxWithDynamicData(textboxID, value);
	}

	@Given("^I input to \"([^\"]*)\" textbox with \"([^\"]*)\" data \"([^\"]*)\"$")
	public void iInputToDynamicTextboxWithRandomData(String textboxID, String randomValue, String value) {
		if (randomValue.equals("1"))
			value = value + " " + randomNumber();
		else if (randomValue.equals("2"))
			value = value + randomNumber() + "@gmail.com";
		abstractPage.inputToDynamicTextboxWithDynamicData(textboxID, value);
	}

	@Given("^I input to \"([^\"]*)\" textarera with data \"([^\"]*)\"$")
	public void iInputToDynamicTextareaWithDynamicData(String textareaID, String value) {
		abstractPage.inputToDynamicTextareaWithDynamicData(textareaID, value);
	}

	@Given("^I select item in \"([^\"]*)\" dropdown with data \"([^\"]*)\"$")
	public void iSelectToDropdownWithData(String dropdownID, String value) {
		abstractPage.selectToDynamicDropdownWithDynamicData(dropdownID, value);
	}

	@Given("^I open \"([^\"]*)\" page$")
	public void iOpenDynamicPage(String pageName) {
		abstractPage.openDynamicPage(pageName);
	}
	
	@Given("^I click to \"([^\"]*)\" button$")
	public void iClickToDynamicButton(String buttonID) {
		abstractPage.clickToDynamicButton(buttonID);
	}
	
	@Given("^I input (first|second) Account ID$")
	public void iInputToAccountIDTextbox(String accountID) {
		if(accountID.equals("first")){
			
		}
		if(accountID.equals("second")){
			
		}
	}
	
	@Given("^Verify message \"([^\"]*)\" displayed success$")
	public void verifyDynamicMessageDisplayed(String messageName) {
		verifyTrue(abstractPage.verifyDynamicMessageDisplayed(messageName));
	}
	
	@Given("^I verify expected data at \"([^\"]*)\" textbox with actual data \"([^\"]*)\"$")
	public void iVerifyDynamicDataDisplayedAtDynamicField(String fieldID, String expectedValue) {
		String actualvalue = abstractPage.getDynamicDataDisplayedAtDynamicField(fieldID);
		verifyEquals(actualvalue, expectedValue);
	}
}
