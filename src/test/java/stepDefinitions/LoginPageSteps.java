package stepDefinitions;

import org.openqa.selenium.WebDriver;

import pageObjects.LoginPageObject;

import commons.AbstractTest;
import commons.PageFactoryManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumberOption.Hooks;

public class LoginPageSteps extends AbstractTest {
	public WebDriver driver;

	private LoginPageObject loginPage;

	public LoginPageSteps() {
		driver = Hooks.openBrowser();
		loginPage = PageFactoryManager.getLogInPage(driver);
	}

	// @Given("^I open to application$")
	// public void iOpenToApplication() {
	// // driver = new FirefoxDriver();
	// driver = new ChromeDriver();
	// driver.get("http://demo.guru99.com/v4/");
	// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	// driver.manage().window().maximize();
	// }

	@Given("^I get Login page URL$")
	public void iGetLoginPageURL() {
		ShareStateVariable.pageURL = loginPage.getLoginPageUrl();
	}

	@Given("^I click the here link$")
	public void iClickTheHereLink() {
		loginPage.clickToHereLink();
	}

	@Given("^I input to Username textbox$")
	public void iInputToUsernameTextbox() {
		loginPage.inputToUserIDTextbox(ShareStateVariable.userID);
	}

	@Given("^I input to Password textbox$")
	public void iInputToPasswordTextbox() {
		loginPage.inputToPasswordTextbox(ShareStateVariable.password);
	}

	@Given("^I click to Login button at Login page$")
	public void iClickToLoginButtonAtLoginPage() {
		loginPage.clickToLoginButton();
	}

	@Then("^Verify Home page display with message \"([^\"]*)\"$")
	public void verifyHomePageDisplayWithMessage(String homePageMessage) {
		verifyTrue(loginPage.isLoginPageDisplayed());
	}

	// @Given("^I input to Username textbox with data \"([^\"]*)\"$")
	// public void iInputToUsernameTextboxWithData(String username) {
	// driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(username);
	// }
	//
	// @Given("^I input to Password textbox with data \"([^\"]*)\"$")
	// public void iInputToPasswordTextboxWithData(String pass) {
	// driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
	// }
	//
	// @Given("^Input to New Customer form with data$")
	// public void inputToNewCustomerFormWithData(DataTable customerTable) {
	// List<Map<String, String>> customer = customerTable.asMap(String.class,
	// String.class);
	// driver.findElement(By.xpath("//input[@name='name']")).sendKeys(customer.get(0).get("Name"));
	// driver.findElement(By.xpath("//input[@name='dob']")).sendKeys(customer.get(0).get("DateOfBirth"));
	// driver.findElement(By.xpath("//input[@name='addr']")).sendKeys(customer.get(0).get("Address"));
	// driver.findElement(By.xpath("//input[@name='city']")).sendKeys(customer.get(0).get("City"));
	// driver.findElement(By.xpath("//input[@name='state']")).sendKeys(customer.get(0).get("State"));
	// driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys(customer.get(0).get("Pin"));
	// driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(customer.get(0).get("Name"));
	// }
	//
	// @Given("^I verify Customer created success$")
	// public void iVerifyCustomerCreatedSuccess(DataTable customerTable) {
	// for (Map<String, String> customer : customerTable.asMap(String.class,
	// String.class)) {
	// Assert.assertEquals(driver.findElement(By.xpath("//input[@name='name']")).getText(),
	// customer.get("Name"));
	// Assert.assertEquals(driver.findElement(By.xpath("//input[@name='dob']")).getText(),
	// customer.get("DateOfBirth"));
	// Assert.assertEquals(driver.findElement(By.xpath("//input[@name='addr']")).getText(),
	// customer.get("Address"));
	// Assert.assertEquals(driver.findElement(By.xpath("//input[@name='city']")).getText(),
	// customer.get("City"));
	// Assert.assertEquals(driver.findElement(By.xpath("//input[@name='state']")).getText(),
	// customer.get("State"));
	// Assert.assertEquals(driver.findElement(By.xpath("//input[@name='pinno']")).getText(),
	// customer.get("Pin"));
	// Assert.assertEquals(driver.findElement(By.xpath("//input[@name='telephoneno']")).getText(),
	// customer.get("Phone"));
	// Assert.assertEquals(driver.findElement(By.xpath("//input[@name='emailid']")).getText(),
	// customer.get("Email"));
	// Assert.assertEquals(driver.findElement(By.xpath("//input[@name='password']")).getText(),
	// customer.get("Password"));
	// }
	// }

}
