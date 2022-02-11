package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelReader;

public class TC002Login extends BaseClass {
	
	@DataProvider(name="logindata")
	public Object[][] getLoginData() {
		return ExcelReader.getTestData("login");
	}
	@Test(dataProvider = "logindata")
	public void verifyLogin(String un,String pwd) {

		app_logs.info("Login test started");
		test.log(LogStatus.INFO, "Login test started");

		HomePage hp = new HomePage(driver);

		hp.doClickMyAccount();
		app_logs.info("My Account Button Clicked");
		test.log(LogStatus.INFO, "My Account Button Clicked");

		hp.doClickLogin();
		app_logs.info("Login Button Clicked");
		test.log(LogStatus.INFO, "Login Button Clicked");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		LoginPage lp = new LoginPage(driver);

		app_logs.info("Username and password Entered");
		test.log(LogStatus.INFO, "Username and password Entered");
		lp.doLogin(un,pwd);

		String actual = driver.getTitle();
		System.out.println(actual);
		String expected = "Account Login";

		Assert.assertEquals(actual, expected);

		app_logs.info("Login test completed");
		test.log(LogStatus.INFO, "Login test completed");
	}

	@Test(priority = 2)
	public void verifyInvalidLogin() throws InterruptedException {

		HomePage hp = new HomePage(driver);

		hp.doClickMyAccount();

		hp.doClickLogin();

		LoginPage lp = new LoginPage(driver);

		lp.doinvalidLogin("xxxx@gmail.com", "xyz@123");

	}

}
