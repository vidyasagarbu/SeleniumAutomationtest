package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utility.Constants;

public class LoginTest extends BaseTest{
	
	
	@Test
	public void verifyLoginWithValidUserDetails() throws Exception {
		
		//validation Step
		
		lp.verifyApplicationTitle("Your store. Login");
		
		lp.enterEmail(Constants.email);
		lp.enterPass(Constants.pass);
		lp.clickCheckboxRem();
		lp.clickLoginButton();
		
		//validation Step
		lp.verifyApplicationTitle("Dashboard / nopCommerce administration");
		
		
		lp.clickLogoutButtton();
		
		//validation Step
		lp.verifyApplicationTitle("Your store. Login");
		
		
		
		
		
	}

}
