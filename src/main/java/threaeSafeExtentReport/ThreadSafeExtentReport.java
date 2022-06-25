package threaeSafeExtentReport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import utility.UtilityLogic;



public class ThreadSafeExtentReport implements ITestListener{
	
	static ExtentReports report;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		
		test=report.createTest("regression");
		ThreadSafeExtentReportInstance.getExtentInstance().setExtent(test);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		
		ThreadSafeExtentReportInstance.getExtentInstance().getExtent().pass("Test case passed"+"==>"+result.getMethod().getMethodName(), 
				MediaEntityBuilder.createScreenCaptureFromBase64String(UtilityLogic.getScreenshotAsBase64()).build());
		ThreadSafeExtentReportInstance.getExtentInstance().removeExtent();
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ThreadSafeExtentReportInstance.getExtentInstance().getExtent().fail("Test case failed"+"==>"+result.getMethod().getMethodName(), 
				MediaEntityBuilder.createScreenCaptureFromBase64String(UtilityLogic.getScreenshotAsBase64()).build());
		ThreadSafeExtentReportInstance.getExtentInstance().removeExtent();
		
		ThreadSafeExtentReportInstance.getExtentInstance().getExtent().log(Status.FAIL, result.getThrowable());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ThreadSafeExtentReportInstance.getExtentInstance().getExtent().skip("Test case skipped"+"==>"+result.getMethod().getMethodName(), 
				MediaEntityBuilder.createScreenCaptureFromBase64String(UtilityLogic.getScreenshotAsBase64()).build());
		ThreadSafeExtentReportInstance.getExtentInstance().removeExtent();
		
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
		report = ExtentReportNG.setUpExtentReport();
		
		}

	@Override
	public void onFinish(ITestContext context) {
		
		report.flush();
	}
	
	

}
