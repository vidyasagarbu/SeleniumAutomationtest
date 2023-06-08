package iframeExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IFramePayTM {


	WebDriver driver;

	@BeforeTest
	public void launchApp() {

		System.out.println("launching application");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");

	}

	@AfterTest
	public void closeApp() {
		System.out.println("closing application");
		driver.close();

	}

	
	
	
	@Test
	public void handlePayTM_Frame() throws Exception {
		
		
		Thread.sleep(3000);
		
		//click on SignIn button
		driver.findElement(By.xpath("//img[contains(  @alt, 'user' )  ]")).click();
		
		
		
		//Frame generated
		//Switch to Frame
		
		//index  ---- start from 0
		//id or name
		//webelement
		
		
		//app1
		
		//driver.switchTo().frame(0);
		
		
		
		
		//app2
		
		//driver.switchTo().frame("name or ID");
		
		
		//app3
		WebElement payTM_frame = driver.findElement(By.cssSelector("iframe[src*='paytm']"));
		
		driver.switchTo().frame(payTM_frame);
		
		
		
		
		Thread.sleep(3000);
		
		String heading = driver.findElement(By.cssSelector(".heading")).getText();
		
		
		Assert.assertTrue(heading.contains("Paytm Web account"));
		System.out.println(heading);
		
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Watch Video')]")).click();
		
		
		Thread.sleep(5000);
	}
	
	
}
