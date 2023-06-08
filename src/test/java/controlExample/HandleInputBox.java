package controlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleInputBox extends BaseTest{

//	WebDriver driver;
//	
//	@BeforeTest
//	public void launchApp() {
//		
//		System.out.println("launching application");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
//		
//	}
//	
//	
//	@AfterTest
//	public void closeApp() {
//		System.out.println("closing application");
//		driver.close();
//	}
	
	
	@Test
	public void verifyInputBox() throws Exception {
		
		
		Thread.sleep(3000);
		System.out.println("verifyInputBox test case");
		
		driver.findElement(By.xpath("//input[@name=\"fname\"]")).sendKeys("enter your name");
		
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("enter your name");
		
		Thread.sleep(3000);
		
	}
	
	
	
	
}
