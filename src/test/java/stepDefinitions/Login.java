package stepDefinitions;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOption.Hooks;

public class Login {
	public WebDriver driver;
	public static String pageURL, userID, password;

	public Login() {
		driver = Hooks.openBrowser();
	}

	@Given("^I open to application$")
	public void iOpenToApplication() {
		driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/v4/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("^I get Login page URL$")
	public void iGetLoginPageURL() {
		pageURL = driver.getCurrentUrl();
	}

	@Given("^I click the here link$")
	public void iClickTheHereLink() {
		driver.findElement(By.xpath("//a[text()='here']")).click();
	}

	@Given("^I put to Email textbox with data \"([^\"]*)\"$")
	public void iPutToEmailTextboxWithData(String email) {
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(email + randomNumber() + "gmail.com");
	}

	@Given("^I click to Submit button at Register page$")
	public void iClickToSubmitButtonAtRegisterPage() {
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	}

	@Then("^I get UserID info$")
	public void iGetUserIDInfo() {
		userID = driver.findElement(By.xpath("//td[text()='User ID :']/following-sibling::td")).getText();
	}

	@Then("^I get Passowrd info$")
	public void iGetPassowrdInfo() {
		password = driver.findElement(By.xpath("//td[text()='Password :']/following-sibling::td")).getText();

	}

	@When("^I open Login page again$")
	public void iOpenLoginPageAgain() {
		driver.get(pageURL);
	}

	@Given("^I input to Username textbox$")
	public void iInputToUsernameTextbox() {
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(userID);

	}

	@Given("^I input to Password textbox$")
	public void iInputToPasswordTextbox() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

	@Given("^I click to Login button at Login page$")
	public void iClickToLoginButtonAtLoginPage() {
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	}

	@Then("^Verify Home page display with message \"([^\"]*)\"$")
	public void verifyHomePageDisplayWithMessage(String homePageMessage) {
		Assert.assertTrue(driver.findElement(By.xpath("//marquee[text()=\"" + homePageMessage + "\"]")).isDisplayed());
	}

	public int randomNumber() {
		Random rand = new Random();
		int email = rand.nextInt(5000) + 1;
		return email;
	}
}
