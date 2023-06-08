package ddtExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NOPCommDDT extends BaseTest {

	//WebDriver driver;

	
	
	@Test(dataProvider = "regressionData")
	public void verifyLoginWithInValidCredentials(String email, String pwd) throws Exception {
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#Email")).clear();
		driver.findElement(By.cssSelector("input#Email")).sendKeys(email);
		
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#Password")).clear();
		driver.findElement(By.cssSelector("input#Password")).sendKeys(pwd);
		
		
		driver.findElement(By.xpath("//input[@name='RememberMe']")).click();
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		Thread.sleep(2000);
		
		//validation step
		
		
		Assert.assertTrue(driver.getPageSource().contains("Login was unsuccessful"), "error Message: validation is failed !!");
		
		
	}
	
	@DataProvider
	public Object[][] smokeData() {
		
		Object [][] data = { {"gayatri@gmail.com", "welcome"}, {"Harish@google.com", "demo"}, {"Bhavani@google.com", "demo"}};
		
		return data;
		
	}
	
	@DataProvider
	public Object[][] regressionData() {
		
		Object [][] data = { {"gayatri_reg@gmail.com", "welcome"}, {"Harish_reg@google.com", "demo"}, {"Bhavani_reg@google.com", "demo"},  {"Nithia_reg@google.com", "demo"}};
		
		return data;
		
	}
	

}
