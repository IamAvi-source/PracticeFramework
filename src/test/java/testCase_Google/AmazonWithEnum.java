package testCase_Google;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import browser_driver_factory.DriverFactory;
import browser_driver_factory.TestBase;
import comEnumFactory.comAmazonEnumFactory;
import utility.UtilityLogic;

@Listeners(utility.Listener.class)
public class AmazonWithEnum extends TestBase {


	@Test
	public void clickBestseller() throws InterruptedException
	{
		//click the BestSeller button
		//UtilityLogic.click(comAmazonEnumFactory.CLICK_BESTSELLER_BUTTON.getValue());
		WebDriver driver=DriverFactory.getInstance().getDriver();
		driver.findElement(By.xpath(comAmazonEnumFactory.CLICK_BESTSELLER_BUTTON.getValue())).click();
		

		UtilityLogic.wait(10);
	}

	@Test
	public void clickMobileButton()
	{
		// click the mobile button
		//UtilityLogic.click(comAmazonEnumFactory.CLICK_MOBILE_CATEGORY_OPTION.getValue());
		WebDriver driver=DriverFactory.getInstance().getDriver();
		driver.findElement(By.xpath(comAmazonEnumFactory.CLICK_MOBILE_CATEGORY_OPTION.getValue())).click();
		
	}
	

	@Test
	public void clickHelpButtonAtTheBottom() throws InterruptedException
	{
		//click the bottom button 
		WebDriver driver=DriverFactory.getInstance().getDriver();
		WebElement helpButton = driver.findElement(By.xpath(comAmazonEnumFactory.CLICK_HELP_BUTTON_AT_BOTTOM.getValue()));
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		scroll.executeScript("arguments[0].scrollIntoView(true)", helpButton);
		helpButton.click();
		
		//UtilityLogic.scrollToSpecoficelement(helpButton);
		//UtilityLogic.click(comAmazonEnumFactory.CLICK_HELP_BUTTON_AT_BOTTOM.getValue());
		Thread.sleep(3000);

	}
	
	@Test
	public void verifySearchBox1()
	{
		WebDriver driver = DriverFactory.getInstance().getDriver();
		driver.findElement(By.xpath(comAmazonEnumFactory.VERIFY_SEARCHBOX_BOX.getValue())).sendKeys("mobile");
		
	}


}
