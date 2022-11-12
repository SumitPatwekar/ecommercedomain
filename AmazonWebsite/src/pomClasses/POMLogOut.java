package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLogOut {

	WebDriver driver;
	
	@FindBy (xpath="//a[@id='nav-link-accountList']")
	WebElement accountandSignin;
	
	public void clickaccountandSignin() {
		Actions ac = new Actions(driver);
	ac.moveToElement(accountandSignin).perform();
	
	}
	
	@FindBy (xpath="//a[@id='nav-item-signout']")
	WebElement signoutbutton;
	public void clickSignOutbutton() {
		
		signoutbutton.click();
	}
	
	public POMLogOut(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
}
