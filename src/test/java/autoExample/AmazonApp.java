package autoExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonApp {


	WebDriver driver;

	@BeforeTest
	public void launchApp() {

		System.out.println("launching application");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

	}

	@AfterTest
	public void closeApp() {
		System.out.println("closing application");
		driver.close();

	}

	
	
	
	@Test
	public void handlePayTM_Frame() throws Exception {
		
		
		Thread.sleep(3000);
		
		
		//input#twotabsearchtextbox
		
		//driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("iphone 14");
		driver.findElement(By.name("Email")).sendKeys("values to send");
		
		driver.findElement(By.name("Password")).sendKeys("values to send");
		
		driver.findElement(By.xpath("//input[@name='RememberMe']")).click();
		
		driver.findElement(By.tagName("button")).click();
		
		
		Thread.sleep(5000);
		
	}
	
	
}
