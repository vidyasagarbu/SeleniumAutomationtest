package xpathExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonSeeMore {

	WebDriver driver;

	@BeforeTest
	public void launchApp() {

		System.out.println("launching application");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

	}

	@AfterTest
	public void closeApp() throws Exception {
				
		Thread.sleep(4000);
		System.out.println("closing application");
		driver.close();

	}

	
	@Test
	public void verifyAutomotiveEssentialsTest() throws Exception {
		
		Thread.sleep(3000);
		
		
		
//		WebElement seeMore = driver.findElement(By.xpath("//h2[contains(text(),'Up to 70% off | Clearance store')]//parent::div//following-sibling::div[contains(@class,'foo')]//child::a[text()='See more']"));
//		seeMore.click();
		
		
		WebElement seeMore = driver.findElement(By.xpath("//h2[contains(text(),'Appliances for your home')]//parent::div//following-sibling::div[contains(@class,'foo')]//child::a[text()='See more']"));
		seeMore.click();
		
		Thread.sleep(5000);
		
		Assert.assertTrue(driver.getTitle().contains("Large Appliances Online"));
	}
}
