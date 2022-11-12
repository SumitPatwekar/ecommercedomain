package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLoginPage {

	WebDriver driver;
	
	@FindBy (xpath="//input[@id='ap_email']")
	WebElement EmailidorMobileNumber;
	
	public void enterEmailidOrMobileNumber() {
		EmailidorMobileNumber.sendKeys("8793450955");
	}
	
	@FindBy (xpath="//input[@id='continue']")
	WebElement continuebutton;
	public void clickcontinuebutton() {
		continuebutton.click();
	}
	
	@FindBy (xpath="//input[@id='ap_password']")
	WebElement password;
	
	public void enterpassword() {
		password.sendKeys("Bunny@1994");
	}
	
	@FindBy (xpath="//input[@id='signInSubmit']")
	WebElement signinbutton;
	
	public void clicksigninbutton() {
		signinbutton.click();
	}
	
	public POMLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
}
