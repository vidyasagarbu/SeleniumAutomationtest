package unitTestExample;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import retryExample.RetryLogic;

public class AmazonTestExample {
	
	
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("==========launching app===========");
	}

	
	@AfterTest
	public void closeApp() {
		
		System.out.println("==========closing app===========");
	}
	
	
	@Test(description = "adding an item to cart.")
	public void addItem() {
		
		System.out.println("addItem test case");
	}
	
	
	@Test(priority = -100, description = "login with valid user credentials.")
	public void login() {
		
		System.out.println("login test case");
	}
	
	@Test(priority = 2)
	public void logout() {
		
		System.out.println("logout test case");
		Assert.assertTrue(false);
	}
	
	//@Test(retryAnalyzer = retryExample.RetryLogic.class)
	//listners
	
	
	
	@Test
	public void payment() {
		
		System.out.println("payment test case");
		
		Assert.assertTrue(false);
		
		
	}
	
	
}
