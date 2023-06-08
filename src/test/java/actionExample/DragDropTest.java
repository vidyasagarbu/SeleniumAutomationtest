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

public class DragDropTest {


	WebDriver driver;

	@BeforeTest
	public void launchApp() {

		System.out.println("launching application");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

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
		WebElement dropableFrame = driver.findElement(By.cssSelector("iframe[data-src*='photo-manager']"));
		driver.switchTo().frame(dropableFrame);
		
		
		
		WebElement img3 = driver.findElement(By.cssSelector("img[src*='tatras3']"));
		WebElement img4 = driver.findElement(By.cssSelector("img[src*='tatras4']"));
		WebElement img2 = driver.findElement(By.cssSelector("img[src*='tatras2']"));
		WebElement trash = driver.findElement(By.cssSelector("div#trash"));
		
		
		//drag and drop
		//app1
		act.dragAndDrop(img3, trash).perform();
		
		
		
		//app2
		//A convenience method that performs click-and-hold at the location of the source element, 
		//moves to the location of the target element, then releases the mouse.
		
		Thread.sleep(2000);
		act.clickAndHold(img2).moveToElement(trash).release().build().perform();
		Thread.sleep(2000);
		act.clickAndHold(img4).moveToElement(trash).release().perform();
		
		
		Thread.sleep(5000);
	}
	
	
}
