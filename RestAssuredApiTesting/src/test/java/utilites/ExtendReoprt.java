package utilites;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtendReoprt {
	
	
	public ExtentTest test;
	public ExtentReports extent;

	public void ExtendReport() {
		
		ExtentHtmlReporter htmlReport = new ExtentHtmlReporter("extendReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReport);
		test = extent.createTest("googleSearch", "Search the way to automation");
	}
	

}
