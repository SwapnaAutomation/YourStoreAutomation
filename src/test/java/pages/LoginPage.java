package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "input-email")
	public WebElement emailId;

	@FindBy(id = "input-password")
	public WebElement password;
//
	@FindBy(xpath = "//input[@value='Login']")
	public WebElement loginbtn;

	@FindBy(linkText = "Forgotten Password")
	public WebElement forgotPwdLink;

	@FindBy(className = "alert-dismissible")
	public WebElement alert;

// do login with valid Credentials
	public void doLogin(String un, String pwd) {
		emailId.sendKeys("un");
		password.sendKeys("pwd");
		loginbtn.click();
	}

	// do login with invalid Credentials
	public void doinvalidLogin(String un, String pwd) {
		emailId.sendKeys("un");
		password.sendKeys("pwd");
		loginbtn.click();

	}
	
	//check forgot password link
	public boolean isForgotPwdLinkExist() {
		return forgotPwdLink.isEnabled();
	}

	public String Alert() {
		return alert.getText();
	}
}
