package log4jExample;

import org.apache.log4j.Logger;
//import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
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
	Logger log;

	@BeforeTest
	public void launchApp() {

		
		
		log = Logger.getLogger("PayTM login module");
		PropertyConfigurator.configure(".\\data\\ibm_log4j.properties");
		
		
		
		
		log.info("-----info: launching application");
		log.warn("-----warn: launching application");
		log.error("----error: launching application");
		//System.out.println("launching application");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		log.info("Application url: https://paytm.com/" );
		driver.get("https://paytm.com/");

	}

	@AfterTest
	public void closeApp() throws Exception {
		log.info("closing application");
		
		Thread.sleep(4000);
		driver.close();

	}

	
	
	
	@Test
	public void handlePayTM_Frame() throws Exception {
		
		
		Thread.sleep(3000);
		
		//click on SignIn button
		log.info("click on Sign button");
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
		
		log.info("Switching to payTM frame.");
		WebElement payTM_frame = driver.findElement(By.cssSelector("iframe[src*='paytm']"));
		
		driver.switchTo().frame(payTM_frame);
		
		
		
		
		Thread.sleep(3000);
		
		String heading = driver.findElement(By.cssSelector(".heading")).getText();
		
		log.info("payTM frame heading:"+ heading);
		
		Assert.assertTrue(heading.contains("Paytm Web account"));
		
		log.info("payTM frame heading validation pass, actual heading are: "+ heading);
		//System.out.println(heading);
		
		
		log.info("click on Watch video on payTM frame ");
		driver.findElement(By.xpath("//span[contains(text(),'Watch Video')]")).click();
		
		
		Thread.sleep(5000);
	}
	
	
}
