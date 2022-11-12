package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POMHomePage {

	WebDriver driver;
	
	
	
	@FindBy (xpath="//a[@id='nav-link-accountList']")
	WebElement accountandSignin;
	
	public void clickaccountandSignin() {
		Actions ac = new Actions(driver);
	ac.moveToElement(accountandSignin).perform();
	
	}
	@FindBy (xpath="(//span[text()='Sign in'])[1]")
	WebElement signintab;
	
	public void clickonsignintab() {
		signintab.click();
	}
	
	@FindBy (xpath="//select[@id='searchDropdownBox']")
	WebElement searchboxdropdown;
	
	public void selectsearchboxdropdown() {
		Select s = new Select(searchboxdropdown);
		
		s.selectByVisibleText("Clothing & Accessories");
		
	}
	@FindBy (xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchbox;
	
	public void entertextinsearcbox() {
		searchbox.sendKeys("Jacket for men");
	}
	
	@FindBy (xpath="//input[@id='nav-search-submit-button']")
	WebElement searchbutton;
	public void clicksearchbutton() {
		searchbutton.click();
	}
	
	
	public POMHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
}
