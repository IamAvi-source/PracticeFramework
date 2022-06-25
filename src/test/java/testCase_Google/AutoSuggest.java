package testCase_Google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browser_driver_factory.DriverFactory;
import browser_driver_factory.TestBase;

public class AutoSuggest extends TestBase {
	
	@Test
	public void autoSuggestOption()
	{
		WebDriver driver=DriverFactory.getInstance().getDriver();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Flipkart");    
		List<WebElement> autoSuggest=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
	     //List<WebElement> list = driver.findElements(By.xpath("//ul[@role=\'listbox\']//li/descendant::div[@class='wM6W7d']"));
		for(int i=0; i<autoSuggest.size(); i++)
		{
			System.out.println(autoSuggest.get(i).getText());
			if(autoSuggest.get(i).getText().contains("flipkart seller"))
			{
				autoSuggest.get(i).click();
			}
		}
		
	}

}
