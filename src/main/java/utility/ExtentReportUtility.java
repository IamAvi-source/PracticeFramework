package utility;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtility {
	
	private static ExtentReportUtility report = new ExtentReportUtility();
	private static ExtentSparkReporter spark = new ExtentSparkReporter("target/ThreadSafeReport.html");

}
