package controlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleListboxExample extends BaseTest{

	@Test
	public void verifyListBox() throws Exception {
		
		
		Thread.sleep(3000);
		WebElement countryList = driver.findElement(By.xpath("//*[@name='FromLB']"));
		
		
		Select list = new Select(countryList);
		
		
		
		//access method from Select class
		
		System.out.println("is dropdown select multiple option or not: " + list.isMultiple());			//true
		
		
		
		//Select value from listbox 
		
		//Index ---- start from 0
		//Value
		//Text
		
		list.selectByIndex(0);
		list.selectByIndex(1);
		
		
		//Select value using SelectValue method
		list.selectByValue("India");
		
		
		//Select value using Text
		list.selectByVisibleText("Spain");
		
		
		
		
		Thread.sleep(3000);
		list.deselectByValue("Russia");
		list.deselectByIndex(0);
		
		Thread.sleep(3000);
		list.deselectAll();
		
		Thread.sleep(3000);
		list.selectByValue("India");
		
		
	}
	
	
	@Test
	public void verifyListBox2() throws Exception {
		
		
		Thread.sleep(3000);
		WebElement carList = driver.findElement(By.xpath("//Select"));				//multiple match --- 
		
		
		Select list = new Select(carList);
		
		
		
		//access method from Select class
		
		System.out.println("is car dropdown select multiple option or not: " + list.isMultiple());			//false
		
		
		Thread.sleep(2000);
		list.selectByIndex(1);						//Saab
		
		
		Thread.sleep(2000);
		list.selectByValue("Singapore");			//Opel
		
		
		
		Thread.sleep(3000);
		list.selectByVisibleText("Toyota");			//Toyota	
		
		Thread.sleep(3000);
		
		
		
	}
	
	
}
