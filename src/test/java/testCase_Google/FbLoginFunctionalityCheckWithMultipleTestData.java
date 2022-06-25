package testCase_Google;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import browser_driver_factory.DriverFactory;
import browser_driver_factory.TestBase;

public class FbLoginFunctionalityCheckWithMultipleTestData extends TestBase {
	
	
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	int rowCount;
	int cellCount;
	
	@Test(dataProvider="dataset")
	public void loginFunctionalityCheckWithMultipleData(String username, String password)
	{
		WebDriver driver=DriverFactory.getInstance().getDriver();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();		
		
	}
	
	
	@DataProvider(name="dataset")
	public Object[][] set() throws IOException
	{
		workbook = new XSSFWorkbook("\\E:\\New folder\\datasheet.xlsx");
		sheet = workbook.getSheet("Sheet1");
		rowCount = sheet.getPhysicalNumberOfRows();

		cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Number of rowCount are==>"+rowCount+"  "+"Number of cell counts are==>"+cellCount);

		Object dataset[][] = new Object[rowCount-1][cellCount];
		for(int i=1; i<rowCount; i++)
		{
			for(int j=0; j<cellCount; j++)
			{
				String cellData = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println("Cell data is  "+cellData);

				dataset[i-1][j]=cellData;


			}

			System.out.println();

		}
		return dataset;

	}
	

}
