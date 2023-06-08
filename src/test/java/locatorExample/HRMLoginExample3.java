package locatorExample;

import java.util.List;

//import org.junit.Assert;
//import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMLoginExample3 {

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
		
		
		//ID - userName
		
		
		WebElement txtUserName = driver.findElement(By.name("username"));
		txtUserName.sendKeys("Admin");
		
		
		//tagname - password
		List<WebElement> allInputEle = driver.findElements(By.tagName("input"));
		allInputEle.get(2).sendKeys("admin123");
		
		
		//tagname --- login button
		driver.findElement(By.tagName("button")).click();
	
		
		Thread.sleep(2000);
		//click on user dropdown
		//className
		
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		
		
		Thread.sleep(3000);
		
		//LinkText
		//click on Logout button
		//driver.findElement(By.linkText("Logout")).click();
		
		
		
		//PartialLinkText
		//click on Logout button
		driver.findElement(By.partialLinkText("ogou")).click();
		
		
		
		
		Thread.sleep(3000);
		
		driver.close(); // close the current window instance
		//driver.quit(); // close the all window instance
		
		
	}
	
	
	

}
