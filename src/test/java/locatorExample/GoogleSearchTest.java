package locatorExample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {
	
	WebDriver driver;
	
	@Test
	public void verifySearch() throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		
		
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("iphone 14");
		
	}
	

}
