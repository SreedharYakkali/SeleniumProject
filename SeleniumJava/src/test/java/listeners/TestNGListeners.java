package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener, ISuiteListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("***** Tests Completed"+arg0.getName());
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("***** Test Failure"+arg0.getName());
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("***** Test Skipped"+arg0.getName());	
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("***** Test Started"+arg0.getName());
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("***** Test Successfull"+arg0.getName());
	}

	public void onFinish(ISuite arg0) {
		// TODO Auto-generated method stub
	}

	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub	
	}
}
