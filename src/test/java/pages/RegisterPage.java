package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver driver) {
		super(driver);
	
	}
	//first name locator
		@FindBy(id="input-firstname")
		public WebElement fname;
		
		//last name locator
		@FindBy(id="input-lastname")
		public WebElement lname;
		
		//E-mail locator
		@FindBy(id="input-email")
		public WebElement email;
		
		//Telephone locator
		@FindBy(id="input-telephone")
		public WebElement phone;
		
		//Password locator
		@FindBy(id="input-password")
		public WebElement password;
		
		//repassword locator
		@FindBy(id="input-confirm")
		public WebElement confirmpassword;
		
		//Subscribe Yes locator
		@FindBy(xpath = "(//label[@class='radio-inline'][position()=1]/input[@type='radio']")
		public WebElement subscribeYes;
		
		//Subscribe No locator
		@FindBy(xpath = "(//label[@class='radio-inline'][position()=2]/input[@type='radio']")
		public WebElement subscribeNo;
		
		//privacy policy locator
		@FindBy(name="agree")
		public WebElement agree;
		
		//continue locator
		@FindBy(xpath="//input[@value='Continue']")
		public WebElement continueButton;
		
	   //Alert message 
		@FindBy(className="alert-dismissible")
		public WebElement actualText;



	public void doRegister(String myfname, String mylname, String myemail, String mynum, String mypassword, String confirmpass) {
		fname.click();
		fname.sendKeys(myfname);
		lname.click();
		lname.sendKeys(mylname);
		email.click();
		email.sendKeys(myemail);
		phone.click();
		phone.sendKeys(mynum);
		password.click();
		password.sendKeys(mypassword);
		confirmpassword.click();
		confirmpassword.sendKeys(confirmpass);
//		if (subscribe.equals("yes")) {
//			subscribeYes.click();
//		} else {
//			subscribeNo.click();
//		}
				
	}

	public void Clear() {
		fname.clear();
		lname.clear();
		email.clear();
		phone.clear();
		password.clear();
		confirmpassword.clear();

	}

	public void doDisagree() {
		agree.click();
		continueButton.click();
	}

	public void doContinue() {
		agree.click();
		continueButton.click();
	}

	public String checkText() {
		return actualText.getText();
	}

}
