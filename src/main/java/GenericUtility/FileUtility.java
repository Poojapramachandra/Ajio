package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility {
	
	
	/**
	 * this method will read the data from the common utility of properties file
	 * @param key
	 * @return
	 * @throws Throwable
	 */

	
	public static String readDataFromPropertiesFile(String key) throws Throwable{
		
		FileInputStream fs= new FileInputStream("./src/main/resources/CommonData.Properties");
		Properties pro= new Properties();
		pro.load(fs);
		String data = pro.getProperty(key);
		return data;
		
	}
}
