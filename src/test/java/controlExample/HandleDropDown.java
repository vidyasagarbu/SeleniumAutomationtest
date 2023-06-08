package controlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleDropDown extends BaseTest{


	
	@Test
	public void verifyCountryList() throws Exception {
		
		
		Thread.sleep(3000);
		
		
		WebElement listCountry = driver.findElement(By.xpath("//*[@name=\"FromLB\"]"));
		
		
		Select list = new Select(listCountry);
		
		
		
		System.out.println("is listbox accept multiple selection or not: "+ list.isMultiple());
		
		
		
		Thread.sleep(3000);
		
	}
	
	
	
	
}
