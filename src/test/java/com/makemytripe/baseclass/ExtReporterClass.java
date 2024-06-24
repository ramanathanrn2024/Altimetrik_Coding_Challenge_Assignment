package com.makemytripe.baseclass;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
//public class ExtReporterClass {
//public static  ExtentReports extent;
////	
////
////	public static ExtentReports extReportGenerator() {
////		String reportspath = System.getProperty("user.dir")+"\\src\\test\\resources\\ExtentReports\\AutomationTestReport.html";
////		ExtentSparkReporter reporter = new ExtentSparkReporter(reportspath);
////		reporter.config().setReportName("NonKeyword_FutureReadyFramework automation Results");
////		reporter.config().setDocumentTitle("MMT Flight Search Report");
////		reporter.config().setTheme(Theme.DARK);
////		extent = new ExtentReports();
////		extent.attachReporter(reporter);
////		return extent;
////		
////	}
//}

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtReporterClass {
	private static  ExtentReports extent ;
	private static ExtentSparkReporter sparkReporter;
	private static ExtentTest test;
	
	public static ExtentReports getInstance() {
		if(extent == null) {
			String reportspath = System.getProperty("user.dir")+"\\src\\test\\resources\\ExtentReports\\AutomationTestReport.html";
			sparkReporter = new ExtentSparkReporter(reportspath);
			sparkReporter.config().setReportName("NonKeyword_FutureReadyFramework automation Results");
			sparkReporter.config().setDocumentTitle("MMT Flight Search Report");
			sparkReporter.config().setTheme(Theme.DARK);
			extent = new ExtentReports();
			extent.attachReporter(sparkReporter);
		}
		return extent;
	}
	
	public static ExtentTest createExtentTest(String testName) {
		test = extent.createTest(testName);
		return test;
	}
	
	public static void flushReport() {
		extent.flush();
	}
	
}