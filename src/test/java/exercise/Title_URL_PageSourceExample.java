package exercise;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_URL_PageSourceExample {
	
	WebDriver driver;
	
	@Test
	public void verifyVehicleTest() throws Exception {
		
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		
		
		
		
		//get the application title
		String actualApplicationTitle = driver.getTitle();
		System.out.println("Application title before login: " + actualApplicationTitle);
		
		Assert.assertEquals("Your store. Login", actualApplicationTitle);							//Junit
		
		
		//get the application title
		String actualApplicationURL = driver.getCurrentUrl();					//https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
		System.out.println("Application title before login: " + actualApplicationURL);
		
		System.out.println("is login text present into current URL: " + actualApplicationURL.contains("login"));
		
		Assert.assertTrue(actualApplicationURL.contains("login"));
		
		//negative test case
		Assert.assertTrue(actualApplicationURL.contains("login"));
		
		
		
		
	}
	

}
