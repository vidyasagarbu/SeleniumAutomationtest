package readConfig;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigExample {

	public static void main(String[] args) throws Exception {
		
		
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		
		Properties prop = new Properties();
		
		
		prop.load(fis);    //entire data of config.properties file
		
		
		System.out.println("Prod URL: " + prop.getProperty("appURL_prod"));
		System.out.println(prop.getProperty("email"));
		
		
	}

}
