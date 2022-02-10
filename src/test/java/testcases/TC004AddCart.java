package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pages.AddToCartPage;

public class TC004AddCart extends BaseClass {

	@Test
	public void AddToCart() throws InterruptedException {
		test.log(LogStatus.INFO, "Add To Cart test started");
		app_logs.info("Add To Cart test started");
		AddToCartPage ac = new AddToCartPage(driver);
		test.log(LogStatus.INFO, "Add To Cart Button Clicked");
		app_logs.info("Add To Cart Button Clicked");
		ac.addCart();
		ac.scrollBtn(driver);
		test.log(LogStatus.INFO, "View Cart Button Clicked");
		app_logs.info("View Cart Button Clicked");
		ac.viewCart();
		ac.checkoutBtn(driver);

		String actual = driver.getTitle();
		String expected = "Shopping Cart";
		Assert.assertEquals(actual, expected);
		app_logs.info("Add To Cart test completed");
		test.log(LogStatus.INFO, "Add To Cart test completed");

	}

}
