package testCase_Google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import browser_driver_factory.DriverFactory;
import browser_driver_factory.TestBase;

public class DropDown extends TestBase {
	
	@SuppressWarnings("deprecation")
	@Test
	public void dropDownBox()
	{
		WebDriver driver=DriverFactory.getInstance().getDriver();
		
	    WebElement dDown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	 
	    Select s = new Select(dDown);
	    List<WebElement> options = s.getOptions();
	    int count = options.size();
	    System.out.println(count);
	  
	   
	   
	   
	  
	}

}
