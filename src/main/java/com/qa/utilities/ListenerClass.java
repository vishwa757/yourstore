package com.qa.utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testbase.Testbase;

public class ListenerClass extends Testbase implements ITestListener

{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Test execution Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test execution Success");
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test execution Failed");
		try {
			UtilClass.takesSS(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Screenshot captured");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test execution Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		
	}

	
}
