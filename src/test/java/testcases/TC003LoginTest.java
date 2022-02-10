package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class TC003LoginTest extends BaseClass {

	@Test(priority = 1)
	public void verifyLogin() {

		HomePage hp = new HomePage(driver);

		hp.doClickMyAccount();

		hp.doClickLogin();

		LoginPage lp = new LoginPage(driver);

		lp.doLogin("swda@gmail.com", "sw@12");

		String actual = driver.getTitle();
		System.out.println(actual);
		String expected = "Account Login";

		Assert.assertEquals(actual, expected);

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
