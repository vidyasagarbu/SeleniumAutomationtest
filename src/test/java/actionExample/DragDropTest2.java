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

public class DragDropTest2 {


	WebDriver driver;

	@BeforeTest
	public void launchApp() {

		System.out.println("launching application");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");

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
		
		
		
		//handle frame
		WebElement dropableFrame = driver.findElement(By.cssSelector("iframe[src*='drop']"));
		driver.switchTo().frame(dropableFrame);
		
		
		
		WebElement img3 = driver.findElement(By.cssSelector("div#draggable"));
		
		WebElement trash = driver.findElement(By.cssSelector("div#droppable"));
		
		
		//drag and drop
		//app1
		act.dragAndDrop(img3, trash).perform();
		
		
		
	
		
		Thread.sleep(5000);
	}
	
	
}
