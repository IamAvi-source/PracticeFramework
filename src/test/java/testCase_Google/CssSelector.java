package testCase_Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browser_driver_factory.DriverFactory;
import browser_driver_factory.TestBase;

public class CssSelector extends TestBase {
	
	@Test
	public void sendKeysInPassword() throws InterruptedException
	{
		WebDriver driver=DriverFactory.getInstance().getDriver();
		//input[class*='9npi'] This is css selector can check the whether the particular attribute contains the specific value.
		
		driver.findElement(By.cssSelector("input[class*='9npi']")).sendKeys("Avinash@123");
		Thread.sleep(8000);
		
		
	}

}
