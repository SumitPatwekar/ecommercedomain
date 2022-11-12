package testClasses;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlltestCasesCombo extends AmazonTestBaseClass{

//	@Test
//	public void TC01_VerifyLoginFunctionality() {
//		String expectedtitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
//		String actualtitle= driver.getTitle();
//		AssertJUnit.assertEquals(actualtitle, expectedtitle);
//		System.out.println("Validation applied for Signin");
//	}
//	
//	@Test
//	public void TC02_VerifyLogoutFunctionality() {
//		String expectedtitle ="Amazon Sign In";
//		String actualtitle =driver.getTitle();
//		AssertJUnit.assertEquals(actualtitle, expectedtitle);
//		System.out.println("Validation applied for Signout");
//	}
	
	@Test
	public void TC03_VerifyAddtoCart_Product() {
		
		String expectedtitle="Amazon.in Shopping Cart";
		String actualtitle= driver.getTitle();
		System.out.println("titile is-->"+actualtitle);
		Assert.assertEquals(actualtitle, expectedtitle);
		System.out.println("Validation applied for ProductAddedToCart");
	}
}
