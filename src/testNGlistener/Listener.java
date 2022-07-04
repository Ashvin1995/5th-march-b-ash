package testNGlistener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kiteAppBaseClass.BaseClassUsingProperty;

public class Listener implements ITestListener


{
	
	BaseClassUsingProperty b=new BaseClassUsingProperty();//obj of base class
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TC is success ",true);
		ITestListener.super.onTestSuccess(result);
		Reporter.log("success TC name is "+result.getName(),true);
		
		}
	
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		String TCname = result.getName();
	
		try {
			b.takescreenshot(TCname);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("TC is skipped ,please check dependent TC",true);
		Reporter.log("skipped TC is "+result.getName(),true);
		ITestListener.super.onTestSkipped(result);
	}
	 
}
