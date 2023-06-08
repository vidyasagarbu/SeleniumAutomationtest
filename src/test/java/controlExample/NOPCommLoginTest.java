package controlExample;

import org.junit.Test;

import readConfig.ConfigRead;

public class NOPCommLoginTest {
	
	
	
	@Test
	public void launchApp() throws Exception {
		
		
		ConfigRead conf = new ConfigRead();
		
		System.out.println("launch application url in env: " + conf.getAppURL_Prod());
		
		System.out.println("enter email: " + conf.getEmail());
		
		System.out.println("enter email: " + conf.getPassword());
	}
	
	
	

}
