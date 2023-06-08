package unitTestExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon_PriorityExample {
	
	//TestNG ---execution workflow
	
	
	//priority
	
	//by default priority ---- 0
	//if priority is same -----default execution as per naming con (ascii value)
	//highest negative number having highest priority
	
	
	
	//login ----addItem----payment----logout
	
	
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
	}
	
	@Test
	public void payment() {
		
		System.out.println("payment test case");
	}
	
	@Test
	public void cancelOrder() {
		
		System.out.println("cancelOrder test case");
		
		int x = 10/0;
	}
}
