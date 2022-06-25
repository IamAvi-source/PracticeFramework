package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listener implements ITestListener {


	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark= new ExtentSparkReporter("target/Spark.html");


	public void onTestStart(ITestResult result)

	{
		System.out.println("Test Execution started==>"+result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result)
	{

		ExtentTest test = extent.createTest("Test case passed");
		test.pass("Test case passed"+"==>"+result.getMethod().getMethodName(), 
				MediaEntityBuilder.createScreenCaptureFromBase64String(UtilityLogic.getScreenshotAsBase64()).build());
		
		


		System.out.println("Test case passed==>"+result.getMethod().getMethodName());

	}


	public void onTestFailure(ITestResult result)

	{
		ExtentTest test=extent.createTest("Test case failed").log(Status.FAIL, "This need to be reported, bug tracked while executing test case");
		test.fail("Test case passed"+"==>"+result.getMethod().getMethodName(), 
				MediaEntityBuilder.createScreenCaptureFromBase64String(UtilityLogic.getScreenshotAsBase64()).build());
		
		test.log(Status.FAIL, result.getThrowable());
		
		try {
			UtilityLogic.screenShot("failed test case");
		} catch (Throwable e) {

			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test case skipped==>"+result.getMethod());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{

		System.out.println("Test case failed and the success percentage is==>"+result.SUCCESS_PERCENTAGE_FAILURE);


	}

	public void onStart(ITestContext context)

	{
		extent.attachReporter(spark);
		System.out.println("Test execution started==>"+context.getName());

	}

	public void onFinish(ITestContext context)
	{
		extent.flush();
		System.out.println("Test execution finished");
	}

}


