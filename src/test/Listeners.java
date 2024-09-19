package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

// ITestListener interface have all methods of TestNG Listeners

public class Listeners implements ITestListener {

	public void onTestSuccess(ITestResult result) {

		// System.out.println("I successfully executed Listeners Pass code");
	}
	
	public void onTestFailure(ITestResult result) {
		
		System.out.println("I successfully executed Listeners Failure code" +result.getName());

	}
}