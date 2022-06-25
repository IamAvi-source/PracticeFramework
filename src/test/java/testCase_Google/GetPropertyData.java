package testCase_Google;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetPropertyData {
	public void getPro() throws IOException {
	try {
	FileInputStream fis = new FileInputStream("E:\\EclipseNewWorkspace\\PracticeFramework\\resource\\confir.properties");
	Properties prop = new Properties();
	prop.load(fis);
	
	String uvalue = prop.getProperty("Url");
	
	System.out.println(uvalue);
	
	
	}
	catch(FileNotFoundException e )
	{
		e.printStackTrace();
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		GetPropertyData get = new GetPropertyData();
		get.getPro();
				
				
	}	

}


