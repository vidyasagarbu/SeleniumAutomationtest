package unitTestExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;

public class TestNGExample {
	
	
	//pre-condition  ----- @BeforeSuite ----BeforeTest -----BeforeClass ----BeforeMethod
	//test case
	//post-condition
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("launching application");
	}
	
	
	@AfterTest
	public void closeApp() {
		System.out.println("closing application");
		
	}
	
	
	@Test
	public void verifyLogin() {
		
		System.out.println("login test case");
	}
	
	
	

}
