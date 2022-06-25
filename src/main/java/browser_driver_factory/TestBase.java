package browser_driver_factory;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.beust.jcommander.Parameters;

import utility.ConfigReader;

public class TestBase {
	
	public static Properties loc = new Properties();
	public static Properties tData = new Properties();
	
	FileReader fr;
	FileReader frdata;
	
	BrowserFactory bf = new BrowserFactory();
	
	
	@BeforeMethod
	public void launchApplication() throws IOException
	{
		
		frdata= new FileReader("E:\\EclipseNewWorkspace\\PracticeFramework\\resource\\confir.properties");
		tData.load(frdata);
		
		
		/*FileInputStream fi = new FileInputStream("E:\\EclipseNewWorkspace\\PracticeFramework\\resource\\confir.properties");
		Properties prop = new Properties();
		prop.load(fi);
		String WebsiteUrl=prop.getProperty("Url");*/
		
		
		DriverFactory.getInstance().setDriver(bf.createBrowserInstance("chrome"));
		WebDriver driver =DriverFactory.getInstance().getDriver();
		//driver.navigate().to(ConfigReader.getUrl());
		driver.navigate().to(tData.getProperty("Url"));
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		
		
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		DriverFactory.getInstance().closeBrowser();
		
	}
	

}
