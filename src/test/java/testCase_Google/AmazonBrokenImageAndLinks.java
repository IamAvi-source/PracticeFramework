package testCase_Google;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browser_driver_factory.DriverFactory;
import browser_driver_factory.TestBase;
import utility.UtilityLogic;

public class AmazonBrokenImageAndLinks extends TestBase {
	
	@Test
	public void verifyBrokenImage() throws MalformedURLException, IOException
	{
		//Step 1-find all the links including inactive links as well
		WebDriver driver=DriverFactory.getInstance().getDriver();
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		linkList.addAll(driver.findElements(By.tagName("img")));
		
		// full sizeof links and images
		System.out.println("All link presents are==>"+linkList.size());
		
		//step2- find olny active links
		
		List<WebElement> activeLinks=new ArrayList<WebElement>();
		
		//step3-Iterate Linklist varibale, exclude links which dont have any href
		
		for(int i=0; i<linkList.size(); i++)
			
		{
			System.out.println(linkList.get(i).getAttribute("href"));
			if(linkList.get(i).getAttribute("href")!=null && (! linkList.get(i).getAttribute("href").contains("javascript")))
			{
			activeLinks.add(linkList.get(i));	
			}
		}
		
		// now check the sizeof active links and images
		System.out.println("List of only active links are==>"+activeLinks.size());
		
		//4th step-check the href url with HTTPConnection api
		
		for(int j=0; j<activeLinks.size(); j++)
			
		{
			UtilityLogic.wait(20);
			HttpURLConnection connection = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+"==>"+response);
		}
		
		
		
	}

}
