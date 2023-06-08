package wdmExample;

import org.junit.Test;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMLoginExample {

	WebDriver driver;
	
	
	@Test
	public void verifyLoginFeature() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		
		
		driver.get("https://www.amazon.in/");
		
		
	}
	
	
	

}
