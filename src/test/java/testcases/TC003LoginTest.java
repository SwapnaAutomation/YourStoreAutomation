package testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelReader;

public class TC003LoginTest extends BaseClass {

	@DataProvider(name="logindata")
	public Object[][] getLoginData() {
		return ExcelReader.getTestData("login");
	}
	@Test(dataProvider = "logindata")
	public void verifyLogin(String un,String pwd) {

		HomePage hp = new HomePage(driver);

		hp.doClickMyAccount();

		hp.doClickLogin();

		LoginPage lp = new LoginPage(driver);

		lp.doLogin(un,pwd);

		String actual = driver.getTitle();
		System.out.println(actual);
		String expected = "Account Login";

		Assert.assertEquals(actual, expected);

	}

	@Test
	public void verifyInvalidLogin() throws InterruptedException {

		HomePage hp = new HomePage(driver);

		hp.doClickMyAccount();

		hp.doClickLogin();

		LoginPage lp = new LoginPage(driver);

		lp.doinvalidLogin("xxxx@gmail.com", "xyz@123");

	}
}
