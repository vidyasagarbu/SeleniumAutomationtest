package controlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleCheckboxRadioButton extends BaseTest{

//	WebDriver driver;
//	
//	@BeforeTest
//	public void launchApp() {
//		
//		System.out.println("launching application");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
//		
//	}
//	
//	
//	@AfterTest
//	public void closeApp() {
//		System.out.println("closing application");
//		driver.close();
//		
//		
//	}
	
	
	
	
	//ASCII values
	//naming conv
	
	
	
	@Test
	public void verifyRadioButton() throws Exception {
		
		
		Thread.sleep(3000);
		System.out.println("verifyRadioButton test case");
		
		driver.findElement(By.xpath("//*[@value='female']")).click();
		
		
		
		Thread.sleep(3000);
		
	}
	
	
	
	@Test
	public void verifyCheckboxBox() throws Exception {
		
		
		Thread.sleep(3000);
		System.out.println("verifyCheckboxBox test case");
		
		driver.findElement(By.xpath("//input[@value='Car']")).click();
		
		
		
		Thread.sleep(3000);
		
	}
	
	
	
	
}
