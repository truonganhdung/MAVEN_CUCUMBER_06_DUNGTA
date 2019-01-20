package stepDefinitions;

import org.openqa.selenium.WebDriver;

import pageObjects.RegisterPageObject;

import commons.AbstractTest;
import commons.PageFactoryManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOption.Hooks;

public class RegisterPageSteps extends AbstractTest {
	public WebDriver driver;
	private RegisterPageObject registerPage;

	public RegisterPageSteps() {
		driver = Hooks.openBrowser();
		registerPage = PageFactoryManager.getResgisterPage(driver);
	}

	@Given("^I put to Email textbox with data \"([^\"]*)\"$")
	public void iPutToEmailTextboxWithData(String email) {
		registerPage.inputToEmailTextBox(email + randomNumber() + "@gmail.com");
	}

	@Given("^I click to Submit button at Register page$")
	public void iClickToSubmitButtonAtRegisterPage() {
		registerPage.clickToSubmitButton();
	}

	@Then("^I get UserID info$")
	public void iGetUserIDInfo() {
		ShareStateVariable.userID = registerPage.getUserIDText();
	}

	@Then("^I get Passowrd info$")
	public void iGetPassowrdInfo() {
		ShareStateVariable.password = registerPage.getPasswordText();
	}

	@When("^I open Login page again$")
	public void iOpenLoginPageAgain() {
		registerPage.openLoginPageByUrl(ShareStateVariable.pageURL);
	}
}
