package actionExample;

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
		driver.get("https://www.amazon.in/");

	}

	@AfterTest
	public void closeApp() {
		System.out.println("closing application");
		driver.close();

	}

	
	
	
	@Test
	public void handlePayTM_Frame() throws Exception {
		
		
		Thread.sleep(3000);
		
		
		Actions act = new Actions(driver);
		
		
		//click on SignIn button
		WebElement signIn = driver.findElement(By.xpath("//span[contains(text(),'sign in')]"));
		WebElement createWishList = driver.findElement(By.xpath("//span[contains(text(),'Create a Wish ')]"));
		
		
		//app1
//		//mouse-ver operation
//		act.moveToElement(signIn).perform();
//		act.moveToElement(createWishList).perform();
//		act.click().perform();
		
		
		
		//app2
		//mouse-ver operation
		//act.moveToElement(signIn).moveToElement(createWishList).click().perform();
		
		
		//app3
		//mouse-ver operation
		act.moveToElement(signIn).click(createWishList).perform();
		
		
		
		
		Assert.assertTrue(driver.getTitle().contains("Wish"));
		
		Thread.sleep(5000);
	}
	
	
}
