package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ConfigReader {
	
	
		
	

	
	public static Properties propertiesObject() throws IOException
	{
		FileInputStream fi = new FileInputStream("E:\\EclipseNewWorkspace\\PracticeFramework\\resource\\confir.properties");
		Properties prop = new Properties();
		prop.load(fi);
		return prop;

	}

	public static String getUrl() throws IOException
	{
		return ConfigReader.propertiesObject().getProperty("UrlAmazon");
	}
	
	

}
