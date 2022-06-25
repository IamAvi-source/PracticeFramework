package enumFactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchGoogle {
	
	WebDriver driver;
	
	public void launchApp(BrowserEnumFactory browser)
	{
		
		switch(browser)
		{
		case CHROME:
		{
			WebDriverManager.chromedriver().create();
			break;
		}
		
		case EDGE:
		{
			WebDriverManager.edgedriver().create();
			break;
		}
		
		
		}
		
	}
	
	public static void main(String[] args) {
		new LaunchGoogle().launchApp(BrowserEnumFactory.CHROME);
	}
	
	

}
