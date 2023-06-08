package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;
import utility.Constants;

public class BaseTest {
	
	public WebDriver driver;
	public LoginPage lp;
	
	@BeforeTest
	public void launchApp() {
		
		//create a log
		//read data from config
		
		driver = new ChromeDriver();
		driver.get(Constants.url);
		
		driver.manage().window().maximize();
		
		//implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
		
		//creating a object of Pages
		
		lp = new LoginPage(driver);
		
		
		
	}
	
	@AfterTest
	public void closeApp() {
		
		
		//driver.close();
		driver.quit();
		
	}
	
	
//	public void createRandomNumber() {
//		
//		
//	}
//	
	
	

}
