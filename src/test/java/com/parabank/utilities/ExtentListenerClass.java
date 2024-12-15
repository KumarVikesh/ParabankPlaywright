package com.parabank.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentListenerClass implements ITestListener{

	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	public void configureReport()
	{
		htmlReporter = new ExtentSparkReporter("ExtentListenerReportDemo.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		htmlReporter.config().setDocumentTitle("ParaBank Report Demo");
		htmlReporter.config().setReportName("ParaBank Extent Report");
		htmlReporter.config().setTheme(Theme.DARK);
	}
	
	public void onStart(ITestContext Result)
	{
		configureReport();
		System.out.println("On Start Method Invoked");
	}
	
	public void onFinish(ITestContext Result)
	{
		System.out.println("On Finish Method Invoked");
		reports.flush();
	}
	
	public void onTestSuccess(ITestContext Result)
	{
		test = reports.createTest(Result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Passed Test Case is: "+Result.getName(),ExtentColor.GREEN));
	}
	
	public void onTestFailure(ITestContext Result)
	{
		System.out.println("Failed Test Case is : "+Result.getName());
		test = reports.createTest(Result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("Failed Test Case is: "+Result.getName(), ExtentColor.RED));
	}
	
	public void onTestSkipped(ITestContext Result)
	{
		System.out.println("Skipped Test Case is : "+Result.getName());
		test = reports.createTest(Result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Skipped Test Case is: "+Result.getName(), ExtentColor.YELLOW)); 
	}
	
	public void onTestStart(ITestContext Result)
	{
		System.out.println("Started Test Case is : "+Result.getName());
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestContext Result)
	{
		
	}
}
