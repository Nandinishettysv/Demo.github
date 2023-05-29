package extent;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extrepot {
@Test
	public void data()
	{
	//step1
		ExtentReports ext=new ExtentReports("./report/r1.html");
		//step2
		ExtentTest test=ext.startTest("tc1");
		//step3
		test.log(LogStatus.PASS,"pass");
		test.log(LogStatus.FAIL,"fail");
		test.log(LogStatus.ERROR,"error");
		//step4
		ext.endTest(test);
		//step5
		ext.flush();	
	}

}
