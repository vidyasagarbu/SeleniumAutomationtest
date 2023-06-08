package controlExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleAlert extends BaseTest{


	
	//@Test
	public void handleAlertSimple() throws Exception {
		
		
		Thread.sleep(3000);
		//click on Show me alert ---- generate an alert
		driver.findElement(By.xpath("//input[contains(@value,'w Me')]")).click();
		
		
		
		Thread.sleep(3000);
		
		//generic 
		//Alert/frame/windows ------- driver.switch()
		
		
		
		//handle alert ----- OK button
		//verify text
		//actions------- accept/dismiss/sendKeys/getText
		
		
		//accept
		//dismiss
		//getText
		
		
		Alert simpleAlert = driver.switchTo().alert();
		
		
		System.out.println("===================: " +simpleAlert.getText());
		
		Assert.assertEquals(simpleAlert.getText(), "Hi.. This is alert message!");
		simpleAlert.dismiss();
		
		
		
	}
	
	
	//@Test
	public void handleAlertConfirm() throws Exception {
		
		
		Thread.sleep(3000);
		//click on Show me alert ---- generate an alert confirm alert
		driver.findElement(By.xpath("//button[contains(text(),'Confirmation')]")).click();
		
		
		
		Thread.sleep(3000);
		
		
		Alert confirmAlert = driver.switchTo().alert();
		
		
		System.out.println("=========confirmAlert==========: " +confirmAlert.getText());
		
		Assert.assertEquals(confirmAlert.getText(), "Press 'OK' or 'Cancel' button!");
		Assert.assertTrue(confirmAlert.getText().contains("'OK' or 'Cancel'"));
		
		
		//click on cancel button
		confirmAlert.dismiss();
		
		//cl
		
		String validationOKCancel = driver.findElement(By.id("demo")).getText();			//You pressed Cancel!
		System.out.println("=============" + validationOKCancel);
		
		Assert.assertTrue(validationOKCancel.contains("Cancel"));
		
		
	}
	
	
	
	@Test
	public void handleAlertPrompt() throws Exception {
		
		
		Thread.sleep(3000);
		//click on Show me alert ---- generate an alert prompt alert
		driver.findElement(By.xpath("//button[contains(text(),'Prom')]")).click();
		
		
		
		Thread.sleep(3000);
		
		
		Alert promptAlert = driver.switchTo().alert();
		
		
		System.out.println("=========promptAlert==========: " +promptAlert.getText());
		
		Assert.assertEquals(promptAlert.getText(), "Your Name Please");
		Assert.assertTrue(promptAlert.getText().contains("Your Name Please"));
		
		
		
		Thread.sleep(3000);
		//sendkeys
		promptAlert.sendKeys("Bhavani");    //entered the value ------unable to see value
		
		Thread.sleep(3000);
		
		
		//click on cancel button
		promptAlert.accept();
		
		
		
		
	}
	
	
}
