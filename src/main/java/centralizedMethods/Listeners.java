package centralizedMethods;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners implements ITestListener{
	
	ExtentReports extent=ExtentReportGenerator.extgen(); 
	
	ExtentTest test;
	
	private static ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();
	

	public void onTestStart(ITestResult result) {
		System.out.println(result.getMethod().getMethodName());
		test = extent.createTest(result.getMethod().getMethodName());
		extenttest.set(test);
		extenttest.get().log(Status.INFO, "Test Case"+result.getMethod().getMethodName()+"Started Successfully");
	}

	public void onTestSuccess(ITestResult result) {
		extenttest.get().log(Status.PASS, "successful");
	}

	public void onTestFailure(ITestResult result) {
		extenttest.get().fail(result.getThrowable());
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
	public ExtentTest getExtent() {
		return extenttest.get();
	}

}
