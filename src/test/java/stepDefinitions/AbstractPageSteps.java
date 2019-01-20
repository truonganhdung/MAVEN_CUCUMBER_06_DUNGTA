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
	public void iInputToTextboxWithData(String textboxID, String value) {
		abstractPage.inputToDynamicTextboxWithDynamicData(textboxID, value);
	}
	
	@Given("^I input to \"([^\"]*)\" textarera with data \"([^\"]*)\"$")
	public void iInputToTextareaWithData(String textareaID, String value) {
		abstractPage.inputToDynamicTextboxWithDynamicData(textareaID, value);
	}
	
	@Given("^I select item in \"([^\"]*)\" dropdown with data \"([^\"]*)\"$")
	public void iSelectToDropdownWithData(String dropdownID, String value) {
		abstractPage.selectToDynamicDropdownWithDynamicData(dropdownID, value);
	}
	
	@Given("^I open \"([^\"]*)\" page$")
	public void iOpenDynamicPage(String pageName) {
		abstractPage.openDynamicPage(pageName);
	}
}
