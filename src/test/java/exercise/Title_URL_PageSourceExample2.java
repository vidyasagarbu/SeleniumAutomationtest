package exercise;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_URL_PageSourceExample2 {
	
	WebDriver driver;
	
	@Test
	public void verifyVehicleTest() throws Exception {
		
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		
		
		
		//get the application title
		String actualApplicationTitle = driver.getTitle();
		System.out.println("Application title before login: " + actualApplicationTitle);
		
		Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", actualApplicationTitle);							//Junit
		Assert.assertTrue(actualApplicationTitle.contains("Shop Online for Mobiles"));							//Junit
		
		
		//get the application title
		String actualApplicationURL = driver.getCurrentUrl();					//https://www.amazon.in/
		System.out.println("Application title before search: " + actualApplicationURL);
		
		System.out.println("is login text present into current URL: " + actualApplicationURL.contains("amazon"));
		
		Assert.assertTrue(actualApplicationURL.contains("amazon"));
		
		//negative test case
		Assert.assertFalse(actualApplicationURL.contains("iphone"));
		
		
		//get Page Source
		//driver.getPageSource();
		
		Assert.assertTrue(driver.getPageSource().contains("Bluetooth Calling Smartwatch "));
		
		
		
		
		System.out.println("==========================after search===============================");
		
		
		
		//locator
		
		String searchItem = "iphone 14";
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchItem);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		
		Thread.sleep(3000);
		
		//get the application title
		String actualApplicationTitleAfterSearch = driver.getTitle();
		System.out.println("Application title before login: " + actualApplicationTitleAfterSearch);
				
		Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", actualApplicationTitle);							//Junit
		Assert.assertTrue(actualApplicationTitleAfterSearch.contains(searchItem));							//Junit
				
		
		
		
		//get the application title
		String actualApplicationURLAfterSearch = driver.getCurrentUrl();					//https://www.amazon.in/
		System.out.println("Application title before search: " + actualApplicationURLAfterSearch);
				
		System.out.println("is login text present into current URL: " + actualApplicationURLAfterSearch.contains("iphone"));
				
		Assert.assertTrue(actualApplicationURLAfterSearch.contains("iphone"));
		
		
		
		//close the application 
		driver.close();
		//driver.quit();
		
		
	}
	

}
