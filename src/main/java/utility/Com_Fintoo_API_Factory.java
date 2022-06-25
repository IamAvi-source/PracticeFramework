package utility;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import browser_driver_factory.BrowserFactory;
import browser_driver_factory.DriverFactory;
import browser_driver_factory.TestBase;

public class Com_Fintoo_API_Factory  {
	
	
	public static Properties tData = new Properties();
	FileReader frdata;
	BrowserFactory bf = new BrowserFactory();
	
	
	
	protected void loadUrl() throws Exception
	{
		frdata= new FileReader("E:\\EclipseNewWorkspace\\PracticeFramework\\resource\\confir.properties");
		tData.load(frdata);
		DriverFactory.getInstance().setDriver(bf.createBrowserInstance("chrome"));
		WebDriver driver =DriverFactory.getInstance().getDriver();
		driver.navigate().to(tData.getProperty("UrlFintoo"));
		
	}
	
	
	protected void closeBrowser()
	{
		DriverFactory.getInstance().closeBrowser();
		
	}
	
	
	
	
	protected void deleteAllCookies()
	{
		WebDriver driver =DriverFactory.getInstance().getDriver();
		driver.manage().deleteAllCookies();
			
	}
	
	protected void implicitlyWait()
	{
		WebDriver driver =DriverFactory.getInstance().getDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}

}
