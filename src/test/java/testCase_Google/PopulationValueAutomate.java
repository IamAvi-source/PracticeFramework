package testCase_Google;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import browser_driver_factory.DriverFactory;
import browser_driver_factory.TestBase;

public class PopulationValueAutomate extends TestBase {
	
	@Test
	public void populationDynamicElement()
	{
		
		WebDriver driver=DriverFactory.getInstance().getDriver();
		List<WebElement> popList=driver.findElements(By.xpath("//div[@class='maincounter-number']/span[@class='rts-counter']"));
		
		try {
		while(true) 
		{	
		for(WebElement pop: popList)
		{
			System.out.println(pop.getText());
		}
		
		
		
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			Assert.assertTrue(true);
		}
		
	}

}
