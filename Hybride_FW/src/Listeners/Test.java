package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

public class Test implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("tc is passes");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("tc is failes capture ss");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("tc skipped");
	}
	

}
