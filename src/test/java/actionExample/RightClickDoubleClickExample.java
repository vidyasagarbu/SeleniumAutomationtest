package actionExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClickDoubleClickExample {


	WebDriver driver;

	@BeforeTest
	public void launchApp() {

		System.out.println("launching application");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

	}

	@AfterTest
	public void closeApp() {
		System.out.println("closing application");
		driver.close();

	}

	
	
	
	@Test
	public void rightClickTest() throws Exception {
		
		
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		
		
		
		WebElement btnRightClick = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		WebElement btnDelete = driver.findElement(By.xpath("//span[contains(text(),'Del')]"));
		
		//context Click - RightClick
		act.contextClick(btnRightClick).perform();
		
//		act.click(btnDelete).perform();
		
		btnDelete.click();
		
		
		//handle alert
		
		
		Alert deleteAlert = driver.switchTo().alert();
		
		System.out.println(deleteAlert.getText());
		
		Assert.assertTrue(deleteAlert.getText().contains("delete"));
		
		
		Thread.sleep(3000);
		deleteAlert.dismiss();
		Thread.sleep(3000);
		
		
	}
	
	
	
	@Test
	public void doubleClickTest() throws Exception {
		
		
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		
		
		
		WebElement btnDouble = driver.findElement(By.xpath("//*[contains(text(),'Dou')]"));
		
		
		act.doubleClick(btnDouble).perform();
		

		
		
		//handle alert
		
		
		Alert doubleALert = driver.switchTo().alert();
		
		System.out.println(" Double Alert Text: " +doubleALert.getText());
		
		
		Assert.assertTrue(doubleALert.getText().contains("double clicked me"));
		
		Thread.sleep(3000);
		doubleALert.dismiss();
		Thread.sleep(3000);
		
		
	}
	
	
}
