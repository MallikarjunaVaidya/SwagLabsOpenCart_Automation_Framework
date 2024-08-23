package in.vtech.swagLabsFramework.utility;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import in.vtech.swagLabsFramework.base.TestBase;

public class ExtentReportsManager extends TestBase {

	public static String EXTENT_REPORTS_PATH = System.getProperty("user.dir") + File.separator + "reports"
			+ File.separator + "SwagLabs-Test-Automation-ExtentReports.html";


	public static ExtentReports getInstance() {
		if (extentReports == null) {
			createInstance();
		}
		return extentReports;
	}

	// Create an instance of ExtentReports
	private static ExtentReports createInstance() {
		sparkReporter = new ExtentSparkReporter(EXTENT_REPORTS_PATH);
		sparkReporter.config().setDocumentTitle("Swag Labs App Auytomation Test Report");
		sparkReporter.config().setReportName("Swag Labs App Automation Test Results By Likhitha");
		sparkReporter.config().setEncoding("utf-8");
		sparkReporter.config().setTheme(Theme.DARK);

		extentReports = new ExtentReports();
		extentReports.attachReporter(sparkReporter);

		extentReports.setSystemInfo("HostName", "RHEL8");
		extentReports.setSystemInfo("Mallikarjuna", "V");
		return extentReports;
	}

}
