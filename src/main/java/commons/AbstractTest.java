package commons;

import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class AbstractTest extends AbstractPage {
	protected AbstractTest() {
		log = LogFactory.getLog(getClass());
	}

	public static int randomNumber() {
		Random rand = new Random();
		int random = rand.nextInt(99999) + 1;
		return random;
	}

	protected void closeBrowser(WebDriver driver) {
		try {
			staticSleep(1);

			// IE-11
			driver.manage().deleteAllCookies();

			String osName = System.getProperty("os.name").toLowerCase();
			String cmd = "";

			driver.quit();

			// Quit process
			if (driver.toString().toLowerCase().contains("chrome")) {
				if (osName.contains("mac")) {
					cmd = "pkill chromedriver";
				} else {
					cmd = "taskkill /F /FI \"IMAGENAME eq chromedriver*\"";
				}

				// Execute process
				Process process = Runtime.getRuntime().exec(cmd);
				process.waitFor();
			}

			if (driver.toString().toLowerCase().contains("internetexplorer")) {
				cmd = "taskkill /F /FI \"IMAGENAME eq IEDriverServer*\"";
				Process process = Runtime.getRuntime().exec(cmd);
				process.waitFor();
			}

			if (driver.toString().toLowerCase().contains("firefox")) {
				cmd = "taskkill /F /FI \"IMAGENAME eq geckodriver*\"";
				Process process = Runtime.getRuntime().exec(cmd);
				process.waitFor();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	protected boolean verifyTrue(boolean condition) {
		return checkPassed(condition);
	}

	protected boolean verifyFalse(boolean condition) {
		return checkFailed(condition);
	}

	protected boolean verifyEquals(Object actual, Object expected) {
		return checkEquals(actual, expected);
	}

	private boolean checkPassed(boolean condition) {
		boolean pass = true;

		try {
			if (condition == true)
				Assert.assertTrue(condition);
		} catch (Throwable e) {
			pass = false;
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	private boolean checkFailed(boolean condition) {
		boolean pass = true;

		try {
			if (condition == true)
				Assert.assertFalse(condition);
		} catch (Throwable e) {
			pass = false;
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	private boolean checkEquals(Object actual, Object expected) {
		boolean pass = true;

		try {
			Assert.assertEquals(actual, expected);
		} catch (Throwable e) {
			pass = false;
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	public void acceptAlert(WebDriver driver, String expected) {
		if (driver.toString().toLowerCase().contains("firefox")) {
			waitForAlertPresence(driver);
		}

		Alert alert = driver.switchTo().alert();

		String verifyAlert = getTextAlert(driver);

		verifyEquals(verifyAlert, expected);

		alert.accept();
		driver.switchTo().defaultContent();
	}

	WebDriver driver;
	protected final Log log;
}
