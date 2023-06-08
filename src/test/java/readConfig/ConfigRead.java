package readConfig;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigRead {

	Properties prop;

	// ctrl+shift+O ----- add/remove unused import

	public ConfigRead() throws Exception {

		FileInputStream fis = new FileInputStream("./data/config.properties");

		prop = new Properties();

		prop.load(fis);

	}

	public String getAppURL_QA() {

		return prop.getProperty("appURL_qa");

	}

	public String getAppURL_Prod() {

		return prop.getProperty("appURL_prod");

	}
	
	public String getEmail() {

		return prop.getProperty("email");

	}

	public String getPassword() {

		return prop.getProperty("password");

	}
	
	public String getBrowserDetails() {

		return prop.getProperty("browser");

	}

}
