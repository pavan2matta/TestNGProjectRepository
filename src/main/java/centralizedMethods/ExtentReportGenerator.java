package centralizedMethods;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportGenerator extends AutomationMethods{
	
	static ExtentReports extent;
	
	public static ExtentReports extgen() {
		
		String pattern = "yyyy-MM-dd hh_mm_ss";
		
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		Date date=new Date();
		
		String actualdate=sdf.format(date);
		
		// Provide the reports path in the below line of code
		String path=System.getProperty("user.dir")+"/target/Execution_Report_"+actualdate+".html";
		
		// Pass the path of the reports as an argument in the ExtentSparkReporter class
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Orange HRM Application");
		
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Sarat_Buduta");
		extent.setSystemInfo("browser", "Chrome");
		
		return extent;
		
		
	}

}
