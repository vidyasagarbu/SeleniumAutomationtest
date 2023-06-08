package locatorExample;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NOPCommApp {

	WebDriver driver;
	
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		
		
//		locators - 8
//		----------
//
//		id
//		name
//		class
//		tagName
//
//		LinkText
//		partialLinkText
//
//
//		css Selector
//		xpath
		Thread.sleep(2000);
		
		
		//xpath - email
		
		
		//WebElement txtUserName = driver.findElement(By.xpath("//input[@type='email']"));
		
		
		
		
		Thread.sleep(2000);
		Assert.assertEquals("Your store. Login", driver.getTitle());
		
		
		//CSS - email
		
		
		//WebElement txtUserName = driver.findElement(By.cssSelector("input[type='email']"));
		WebElement txtUserName = driver.findElement(By.cssSelector("[data-val-required='Please enter your email']"));
		
		
		
		txtUserName.clear();
		
		Thread.sleep(2000);
		
		txtUserName.sendKeys("admin@yourstore.com");
		
		
		//ID
		driver.findElement(By.id("RememberMe")).click();
		
		
		//tagname --- login button
		driver.findElement(By.tagName("button")).click();
	
		
		
		
		Thread.sleep(2000);
		Assert.assertEquals("Dashboard / nopCommerce administration", driver.getTitle());
		
		
		
		
		
		
		Thread.sleep(3000);
		
		//LinkText
		//click on Logout button
		driver.findElement(By.linkText("Logout")).click();
		
		
		
		//PartialLinkText
		//click on Logout button
		//driver.findElement(By.partialLinkText("ogou")).click();
		
		
		
		Thread.sleep(2000);
		Assert.assertEquals("Your store. Login", driver.getTitle());
		
		
		Thread.sleep(3000);
		
		//driver.close(); // close the current window instance
		driver.quit(); // close the all window instance
		
		
	}
	
	
	

}
