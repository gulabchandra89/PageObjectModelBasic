package listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import com.relevantcodes.extentreports.LogStatus;

import MySuvidha.in.utilities.TestUtil;
import base.Page;
import utilities.Utility;

public class CustomListeners extends Page implements ITestListener{

	public void onTestStart(ITestResult result) {
		test= rep.startTest(result.getName().toUpperCase());
		
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(LogStatus.PASS, result.getName().toUpperCase()+"PASSED");
		rep.endTest(test);
		rep.flush();
		
	}

	public void onTestFailure(ITestResult result) {
		  
		 System.setProperty("org.uncommons.reportng.escape-output", "false");// required to set flag 
		 try {
			Utility.captureScreenshot();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 //extent report 
		 test.log(LogStatus.FAIL, result.getName().toUpperCase()+"Failed with exception");
		 test.log(LogStatus.FAIL, test.addScreenCapture(System.getProperty("user.dir")+"\\target\\"+Utility.screenshotName));
		
		 // test ng report	 
		 Reporter.log("Login Test executed with failure");
		 Reporter.log("<a target=\"_blank\"  href= "+System.getProperty("user.dir")+"\\target\\"+Utility.screenshotName+"> screenshot </a>");
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(LogStatus.SKIP, result.getName().toUpperCase()+"SKIPPED");
		rep.endTest(test);
		rep.flush();
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
