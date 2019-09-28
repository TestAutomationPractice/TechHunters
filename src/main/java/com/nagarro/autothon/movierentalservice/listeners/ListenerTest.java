package com.nagarro.autothon.movierentalservice.listeners;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.nagarro.autothon.movierentalservice.extentreporthelper.ExtentManager;
import com.nagarro.autothon.movierentalservice.extentreporthelper.ExtentTestManager;

public class ListenerTest  implements  ITestListener{
	
	public static final Logger log = Logger.getLogger(ListenerTest.class.getName());

	public void onTestStart(ITestResult result) {
		log.info(result.getName()+"Test Case Started");
		ExtentTestManager.startTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		log.info("The name of the testcase passed is :"+result.getName());
		ExtentTestManager.getTest().log(Status.PASS, "Test Passed");
		
	}

	public void onTestFailure(ITestResult result) {
		log.info(("The name of the testcase Failed is :"+result.getName()));
		ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
	}

	public void onTestSkipped(ITestResult result) {
		log.info("The name of the testcase Skipped is :"+result.getName());
		ExtentTestManager.getTest().log(Status.SKIP, "Test Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		ExtentTestManager.endTest();
		ExtentManager.getInstance().flush();
		
	}
	
	

}
