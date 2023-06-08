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

public class HRMLoginExample2 {

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
		
		
		
		List<WebElement> allInputEle = driver.findElements(By.tagName("input"));
		
		System.out.println("how many element on page: " + allInputEle.size());    //3
		
		allInputEle.get(2).sendKeys("admin123");
		
		
		
		
//		for (int i = 0; i < allInputEle.size(); i++) {
//			
//			
//			String typeOfAllInputTag = allInputEle.get(i).getAttribute("type");
//			
//			System.out.println("Type name: " + (i+1) + typeOfAllInputTag );
//			
//			
//			if(typeOfAllInputTag.equals("password")) {
//				
//				allInputEle.get(i).sendKeys("admin123");
//			}
//			
//		}
		
		
		
		
		
		
		
	}
	
	
	

}
