package testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class TC003LoginNegativeTest extends BaseClass {

//	private static final String login = null;
//	@DataProvider
//	public Object[][] getRegisterData() {
//		return ExcelReader.getTestData(login);
//	}

	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] { { "test11@gmail.com", "test@1" }, { "s@gmail.com", "test@12" }, { " ", "test@123" },
				{ "@#@#@gmail.com", "test@123" }, { "", "" } };
	}

	@Test(dataProvider = "getLoginData")
	public void wrongLogin(String un, String pwd) {
		app_logs.info("Login test started");
		test.log(LogStatus.INFO, "Login test started");
		HomePage hp = new HomePage(driver);

		hp.doClickMyAccount();
		app_logs.info("My Account Button Clicked");
		test.log(LogStatus.INFO, "My Account Button Clicked");

		hp.doClickLogin();
		app_logs.info("Login Button Clicked");
		test.log(LogStatus.INFO, "Login Button Clicked");

		LoginPage lp = new LoginPage(driver);
		app_logs.info("Username and password Entered");
		test.log(LogStatus.INFO, "Username and password Entered");

		lp.doLogin(un, pwd);

		String actual = driver.getTitle();
		String expected = "My Account";

		Assert.assertEquals(actual, expected);
		app_logs.info("Login test completed");
		test.log(LogStatus.INFO, "Login Failure");

	}
}
