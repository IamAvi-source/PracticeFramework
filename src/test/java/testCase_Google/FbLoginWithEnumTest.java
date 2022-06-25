package testCase_Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import browser_driver_factory.DriverFactory;
import browser_driver_factory.TestBase;
import comEnumFactory.FacebookLoginVariableEnum;
import comEnumFactory.comAmazonEnumFactory;
import utility.UtilityLogic;

public class FbLoginWithEnumTest extends TestBase {
	
	@Test
	public void loginFunctionality() throws InterruptedException
	
	{
		String fbUsername = FacebookLoginVariableEnum.XPATH_USERNAME_FIELD.getValue();
		
		
		WebDriver driver=DriverFactory.getInstance().getDriver();
		driver.findElement(By.xpath(fbUsername)).sendKeys(tData.getProperty("username"));
		Thread.sleep(5000);
		
		UtilityLogic.sendKeys(fbUsername, tData.getProperty("username"));
		
	}

}
