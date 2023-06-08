package controlExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	WebDriver driver;

	@BeforeTest
	public void launchApp() {

		System.out.println("launching application");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");

	}

	@AfterTest
	public void closeApp() {
		System.out.println("closing application");
		driver.close();

	}

}
