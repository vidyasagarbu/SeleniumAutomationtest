package basicTest;

public class Assert {

	public static void assertEqual(String expectedValue, String actualValue) {

		if (expectedValue.equalsIgnoreCase(actualValue)) {

			System.out.println("comparision pass");
		}

		else {

			System.out.println("comparision failed");
		}

	}

	public static void assertEqual(String expectedValue, String actualValue, String errorMessage) {

		if (expectedValue.equalsIgnoreCase(actualValue)) {

			System.out.println("comparision pass");
		}

		else {

			System.out.println("comparision failed");
			System.out.println("Error message:" + errorMessage);
		}

	}
	
	
	
	public void assertTrue(String expected, String actual) {
		
		
		if(actual.contains(expected)) {
			
			
			System.out.println("match found: actual value are: " + actual);
		}
		
		
		else {
			
			System.out.println("match not found: actual value are: " + actual);
		}
	}
	
	
	

}
