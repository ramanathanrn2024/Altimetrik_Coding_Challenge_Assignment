//package com.makemytrip.coustomLisnener;
//
//import java.io.IOException;
//
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import com.altimetrik.OneWay_Flight_Search_Analysis;
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.makemytripe.baseclass.BaseClass;
//import com.makemytripe.baseclass.ExtReporterClass;
//
//public class ListenTest implements ITestListener{
//
////	ExtentHtmlReporter htmlReporter;
//	ExtentReports extent = ExtReporterClass.extReportGenerator();
//	ExtentTest test;
//
//	public void onTestStart(ITestResult result) {
//		test = extent.createTest(result.getMethod().getMethodName());
//	}
//
//	public void onTestSuccess(ITestResult result) {
//		test.log(Status.PASS, "SUCCESSFULL: " +result.getMethod().getMethodName());
//		
//	}
//
//	 public void onTestFailure(ITestResult result) {
//
//	 	test.fail(result.getThrowable());
//
//	 	try {
//	 		test.addScreenCaptureFromPath(takeScreenshot(result.getMethod().getMethodName()), "FAILED");
//			
//	 	} catch (Exception e) {
//			
//	 		e.printStackTrace();
//	 	}
//
//	 }
//
//	private String takeScreenshot(String methodName) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void onFinish(ITestContext context) {
//		extent.flush();
//		
//	}
//}
