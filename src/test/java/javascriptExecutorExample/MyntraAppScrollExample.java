package javascriptExecutorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyntraAppScrollExample {

	WebDriver driver;

	@BeforeTest
	public void launchApp() {

		System.out.println("launching application");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");

	}

	@AfterTest
	public void closeApp() {
		System.out.println("closing application");
		driver.close();

	}

	
	
	@Test
	public void verifyModelExample() throws Exception {
		
		//element ----
		Thread.sleep(4000);
		WebElement retrunrPolicy = driver.findElement(By.xpath("//strong[contains(text(),'Return')]"));
		
		//javascript
		
		Thread.sleep(5000);
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		//JS.executeScript("alert('Hello everyone, welcome you all in javascript !!')");
		
		
		JS.executeScript("arguments[0].scrollIntoView()", retrunrPolicy);
		
		Thread.sleep(5000);
		
		
		
		
		
		
	}
}
