package pomClasses;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POMselectAnyProduct {

	WebDriver driver;
	
	@FindBy (xpath="//img[@data-image-index='3']")
	WebElement selectanyproduct;
	
	public void clickanyproduct() {
		selectanyproduct.click();
	}
	
	@FindBy (xpath="//select[@id='native_dropdown_selected_size_name']")
	WebElement selectsizedropdown;
	
	public void selectsize() {
		Select s = new Select(selectsizedropdown);
		s.selectByVisibleText(" XL ");
	}
	
	@FindBy (xpath="//select[@id='quantity']")
	WebElement selectquantity;
	
	public void clickquantity() {
		Select s = new Select(selectquantity);
		s.selectByValue("4");
	}
	
	@FindBy (xpath="//input[@name='submit.add-to-cart']")
	WebElement addtocart;
	
	public void clickaddtocart() {
		Actions act = new Actions(driver);
		act.click(addtocart).perform();
	}
	
	public POMselectAnyProduct(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
}
