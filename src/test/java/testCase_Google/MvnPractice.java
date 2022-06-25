package testCase_Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MvnPractice {
	
	WebDriver driver;
	@BeforeMethod
	public void launch()
	
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void send()
	{
		driver.findElement(By.xpath(null));
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
