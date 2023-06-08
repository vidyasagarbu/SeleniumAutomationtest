package unitTestExample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTestExample {
	
	
	//pre-condition
	//test case
	//post-condition
	
	@Before
	public void launchApp() {
		
		System.out.println("launching application");
	}
	
	
	@After
	public void closeApp() {
		System.out.println("closing application");
		
	}
	
	
	@Test
	public void verifyLogin() {
		
		System.out.println("login test case");
	}
	
	
	

}
