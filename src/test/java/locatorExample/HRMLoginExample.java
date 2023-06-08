package locatorExample;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMLoginExample {

	WebDriver driver;
	
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
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
		
		WebElement txtUserName = driver.findElement(By.name("username"));
		
		//action
		txtUserName.sendKeys("Admin");
		txtUserName.click();
		
		Thread.sleep(2000);
		
		
		
		
		System.out.println("is userName displayed on login page: " + txtUserName.isDisplayed());
		
		String actualValue = txtUserName.getAttribute("placeholder");					//Username
		
		System.out.println("attribute placeholder value are: " + actualValue);
		
		Assert.assertEquals("Username", actualValue);
		
		//Assert.assertEquals("Username", txtUserName.getAttribute("placeholder"));
		
		
	}
	
	
	

}
