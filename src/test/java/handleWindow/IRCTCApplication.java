package handleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IRCTCApplication {


	WebDriver driver;

	@BeforeTest
	public void launchApp() {

		System.out.println("launching application");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");

	}

	@AfterTest
	public void closeApp() {
		System.out.println("closing application");
		//driver.close();   //------
		driver.quit();    //close all instance opened by driver

	}

	
	
	
	@Test
	public void handlePayTM_Frame() throws Exception {
		
		System.out.println("Parent Window "+ driver.getWindowHandle());			//current window, unique id
		
		
		Set<String> allWindows = driver.getWindowHandles(); 			//return all window opened by driver instance
//		System.out.println("how many windows opened by driver instance: " + allWindows.size());
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("HOTELS")).click();
		
		
		
		Set<String> allWindowsAfterHotel = driver.getWindowHandles(); 			//return all window opened by driver instance
		System.out.println("how many windows opened by driver instance, after clicking on hotel link: " + allWindowsAfterHotel.size());
		
		String mainWindow = (String)allWindowsAfterHotel.toArray()[0];
		String hotelWindow = (String)allWindowsAfterHotel.toArray()[1];
		
		System.out.println("Main Window: " + mainWindow);
		System.out.println("Hotel Window: " + hotelWindow);
		
		
		
		
		Thread.sleep(5000);
		
		
				
		driver.switchTo().window(hotelWindow);
		
		System.out.println("application Title: " +driver.getTitle());
		
		
		
		driver.findElement(By.partialLinkText("Login")).click();
		
		Thread.sleep(5000);
		
		
		//back to main Window
		driver.switchTo().window(mainWindow);
		
		// CONTACT US 
		driver.findElement(By.partialLinkText("CONTACT US")).click();
		
		Thread.sleep(5000);
		
		
		String emailID = driver.findElement(By.xpath("//span[contains(text(),'I-tickets/e-tickets :')]/a")).getText();
		
		
		//switch to hotel window
		driver.switchTo().window(hotelWindow);
		
		
		driver.findElement(By.name("username")).sendKeys(emailID);
		
		Thread.sleep(5000);
		
		
	}
	
	
}
