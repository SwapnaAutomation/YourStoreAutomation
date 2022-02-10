package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	// myaccount locator
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	public WebElement myAccount;

	// register locator

	@FindBy(xpath = "//a[contains(text(),'Register')]")
	public WebElement register;

	@FindBy(xpath = "//a[contains(text(),'Login')]")
	public WebElement login;
	
	@FindBy(xpath="//a[text()='Desktops']")
	WebElement desktops;
	
	@FindBy(xpath="//a[text()='Show All Desktops']")
	WebElement showalldesktop;
	
	@FindBy(partialLinkText = "Apple Cinema 30")
	WebElement partialLinkText;

	// myaccount click method
	public void doClickMyAccount() {
		myAccount.click();
	}

	// register click method
	public void doClickRegister() {
		register.click();
	}

	// login button click
	public void doClickLogin() {
			login.click();

	}	
	
	public void clickDesktop() {
		desktops.click();
		}
	
	public void clickShowAllDesktops() {
		showalldesktop.click();
	}
	
	public void selectProduct() {
		partialLinkText.click();
	}
}
