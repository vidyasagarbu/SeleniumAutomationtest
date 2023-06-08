package basicTest;

import org.junit.Assert;
import org.junit.Test;






public class AmazonTest {
	
	
	
	@Test
	public void verifyApplicationTitle() {
		
		
		//Assert assertTest = new Assert();
		
		
		String actualTitle = "Amazon iphone 14 pro";
		String expectedTitle = "iphone 14";
		
		//assertTest.assertEqual(expectedTitle, actualTitle, "validatio of applicatio title get failed.");
		
		//validation step
		
		//Assert.assertEquals(expectedTitle, actualTitle, "validatio of applicatio title get failed.");
		
		//assertTest.assertTrue("iphone", actualTitle);
		Assert.assertTrue("validation failed.", actualTitle.contains(expectedTitle));
		
	}
	
	
	
	
	

}
