package basicTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMLoginTestEdge {

	private WebDriver driver;

	@Test
	public void verifyLogin() throws Exception {

		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		// resolve browser driver compatibility issue
		
		
		//external lib
		
		
		//execute test on chrome browser
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		
		
		
		//execute test on edge browser
//		WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver();
		
		
		
		//execute test on edge browser
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		

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
