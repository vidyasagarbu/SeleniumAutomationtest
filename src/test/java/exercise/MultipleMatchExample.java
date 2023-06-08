package exercise;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleMatchExample {
	
	WebDriver driver;
	
	@Test
	public void verifyVehicleTest() throws Exception {
		
		
		//shortcut ---- autoimport/remove unused imports ------ ctrl+shift+O
		
		//WebDriverManager.chromedriver().create();   external lib
		//Browser - Driver Compatibility issues
		
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		
		
		Thread.sleep(3000);
		
		//by default it will perform action on first element
		//driver.findElement(By.name("vehicle")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> allEle = driver.findElements(By.name("vehicle"));
		
		int noOfEle = allEle.size();
		
		
		for (int i = 0; i < noOfEle; i++) {
			
			allEle.get(i).click();
		}
		
		
	}
	

}
