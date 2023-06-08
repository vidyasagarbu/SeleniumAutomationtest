package crossBrowserTesting;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import readConfig.ConfigRead;

public class HRMLoginTest {

	private WebDriver driver;

	@Test
	public void verifyLogin() throws Exception {

		
		//cross browser testing 
			//edge/firefox/chrome
		
		ConfigRead conf = new ConfigRead();
		//conf.getBrowserDetails();
		
		String browser = conf.getBrowserDetails();
		
		
		System.out.println("Browser details: " + conf.getBrowserDetails());
		
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.out.println("execution on chrome browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
			
			System.out.println("execution on edge browser");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		
		
		else if(browser.equalsIgnoreCase("firefox")) {
			
			System.out.println("execution on edge browser");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		
		
		else {
			
			System.out.println("execution on default browser: chrome");
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		

		
		
		
		
		
		
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".orangehrm-login-forgot-header")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".oxd-button--ghost")).click();

		Thread.sleep(2000);

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin1234");
		driver.findElement(By.cssSelector(".oxd-button")).click();

		Thread.sleep(4000);
		
		driver.close();

	}

}
