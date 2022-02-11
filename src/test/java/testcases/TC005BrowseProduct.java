package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pages.HomePage;

public class TC005BrowseProduct extends BaseClass {

	@Test
	public void browseProduct() {
		app_logs.info("BrowseProduct test started");
		test.log(LogStatus.INFO, "BrowseProduct test started");
		HomePage hp = new HomePage(driver);

		app_logs.info("Selects Desktop");
		test.log(LogStatus.INFO, "Selects Desktop");
		hp.clickDesktop();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		app_logs.info("Selects Show all Desktop");
		test.log(LogStatus.INFO, "Selects Show all Desktop");
		hp.clickShowAllDesktops();

		
		app_logs.info("Product Selected");
		test.log(LogStatus.INFO, "Product Selected");
		hp.selectProduct();

		app_logs.info("BrowseProduct test completed");
		test.log(LogStatus.INFO, "BrowseProduct test completed");
	}

}
