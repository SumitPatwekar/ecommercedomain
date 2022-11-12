package testClasses;

import org.testng.annotations.AfterMethod;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pomClasses.POMHomePage;
import pomClasses.POMLogOut;
import pomClasses.POMLoginPage;
import pomClasses.POMselectAnyProduct;

public class AmazonTestBaseClass {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\WebDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		System.out.println("Browser is opened");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		driver.get("https://www.amazon.in/");
		System.out.println("URL is opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		System.out.println("waits are applied");

		POMHomePage hm = new POMHomePage(driver);
		hm.clickaccountandSignin();
		System.out.println("Clicked accounts and sign in button");
		hm.clickonsignintab();
		System.out.println("clicked sign in tab");
		POMLoginPage lp = new POMLoginPage(driver);
		lp.enterEmailidOrMobileNumber();
		System.out.println("Email ID or Mobile Number Entered");
		lp.clickcontinuebutton();
		System.out.println("continue button is clicked");
		lp.enterpassword();
		System.out.println("Password is entered");
		lp.clicksigninbutton();
		System.out.println("Sign In button is clicked");
		System.out.println("Successfully redirected to HomePage");
		
		hm.selectsearchboxdropdown();
		System.out.println("search box all product dropdown selected and picked clothing ");
		hm.entertextinsearcbox();
		System.out.println("jackets for men is entered in serach box for search");
		hm.clicksearchbutton();
		System.out.println("search button is clicked");
		
		POMselectAnyProduct sp = new POMselectAnyProduct(driver);
		sp.clickanyproduct();
		System.out.println("Any particular jacket is selected");
		List<String>allpageaddres = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpageaddres.get(1));
		System.out.println("driver focus switched to child page");
		
		String childpageurl=driver.getCurrentUrl();
		System.out.println("childURL-->"+childpageurl);
		sp.selectsize();
		
		System.out.println("size of product is selected");
		sp.clickquantity();
		
		System.out.println("quantity of that product is selected");
		sp.clickaddtocart();
		System.out.println("add to cart is clicked and product added to cart");
		
		
	}
	
	@AfterMethod
	
	public void tearDown() {
		
//		POMLogOut log = new POMLogOut(driver);
//		log.clickaccountandSignin();
//		System.out.println("mouse moved on accounts and signin tab");
//		log.clickSignOutbutton();
//		System.out.println("Sign out button clicked");
//		
//		driver.close();
		System.out.println("Browser is closed");
	}
}
