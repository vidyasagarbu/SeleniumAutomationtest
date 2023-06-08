package screenshotExample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {

	WebDriver driver;

	@BeforeTest
	public void launchApp() {

		System.out.println("launching application");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

	}

	@AfterTest
	public void closeApp() {
		System.out.println("closing application");
		driver.close();

	}
	
	
	@Test
	public void searchItem() throws Exception {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("iphone 14");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		
		
		
		Thread.sleep(3000);
		//take screenshot
		getScreenshot("AmazonSearchItem");
		
		
		
		Assert.assertTrue(driver.getTitle().contains("iphone 14"));
		
		
	}
	
	
	
	public void getScreenshot(String fileName) throws Exception {
		
		File sourceLocation = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);			//base64 format
		
		File targetLocation = new File (".\\screenshot\\"+fileName+".png");
		
		FileUtils.copyFile(sourceLocation, targetLocation);
		
	}
	
}
