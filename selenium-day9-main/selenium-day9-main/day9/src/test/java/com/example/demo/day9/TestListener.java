package com.example.demo.day9;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestStart(result);
		System.out.println(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestSuccess(result);
		System.out.println(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailure(result);
		System.out.println(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestSkipped(result);
		System.out.println(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
		System.out.println(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedWithTimeout(result);
		System.out.println(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
//		ITestListener.super.onStart(context);
		System.out.println(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
//		ITestListener.super.onFinish(context);
		System.out.println(context);
	}
	

}