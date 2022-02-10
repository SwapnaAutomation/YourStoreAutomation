package testcases;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pages.HomePage;
import pages.RegisterPage;

public class TC001Register extends BaseClass {

	@Test
	public void registerUser() {

		app_logs.info("User Registration test started");
		test.log(LogStatus.INFO, "User Registration test started");

		HomePage hp = new HomePage(driver);
		app_logs.info("My Account Button Clicked");
		test.log(LogStatus.INFO, "My Account Button Clicked");

		hp.doClickMyAccount();

		app_logs.info("Register Button Clicked");
		test.log(LogStatus.INFO, "Register Button Clicked");
		hp.doClickRegister();

		RegisterPage rp = new RegisterPage(driver);

		app_logs.info("User Details Entered");
		test.log(LogStatus.INFO, "User Details Entered");
		rp.doRegister("xyz", "yyz", "xxxx@gmail.com", "123456789", "xyz@12", "xyz@12");

		String actual = driver.getTitle();
		String expected = "Register Account";

		Assert.assertEquals(actual, expected);
		app_logs.info("User Registration test completed");
		test.log(LogStatus.INFO, "User Registration test completed");

	}

}
