package xpathExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class xpath_preceding {

	WebDriver driver;

	@BeforeTest
	public void launchApp() {

		System.out.println("launching application");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

	}

	@AfterTest
	public void closeApp() throws Exception {
				
		Thread.sleep(4000);
		System.out.println("closing application");
		//driver.close();

	}

	
	//@Test
	public void verifyAutomotiveEssentialsTest() throws Exception {
		
		Thread.sleep(3000);
		
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		

		WebElement chkbox1 = driver.findElement(By.xpath("//td[text()='Maria Anders']//preceding-sibling::td/input"));
		WebElement chkbox2 = driver.findElement(By.xpath("//td[text()='Helen Bennett']//preceding-sibling::td/input"));
		//chkbox.click();
		
		
		JS.executeScript("arguments[0].click()", chkbox1);
		Thread.sleep(1000);
		JS.executeScript("arguments[0].click()", chkbox2);
		
		Thread.sleep(5000);
		
		
	}
	
	
	
	@Test
	public void verifyWebTableTest() throws Exception {
		
		Thread.sleep(3000);
		
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		

		WebElement chkbox1 = driver.findElement(By.xpath("//tbody//descendant::td[text()='Helen Bennett']//parent::tr/td/input"));
		//WebElement chkbox2 = driver.findElement(By.xpath(""));
		//chkbox.click();
		
		
		JS.executeScript("arguments[0].click()", chkbox1);
		Thread.sleep(1000);
		//JS.executeScript("arguments[0].click()", chkbox2);
		
		Thread.sleep(5000);
		
		
	}
}
