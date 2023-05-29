package Pom_script;

import org.testng.annotations.Test;

import Generic.Base_test;
import Generic.Generic_script_excel;

public class Testscript1 extends Base_test {
	@Test
	public void loginappln1() throws InterruptedException
	{
		
		Pom1 p=new Pom1(driver);
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
		p.user(Generic_script_excel.fetch_data("Sheet1", i, 0));
		Thread.sleep(2000);
		  p.pass(Generic_script_excel.fetch_data("Sheet1", j, 1));
		Thread.sleep(2000);
		p.login();
		//Assert.fail();
	}
	@DataProvider(name="testdata")
//public Object[][] createData(){
//		return new Object[][] {
	//		{"Nandini","1234"},
		//	{"Nags","2345"},
	//	};
	//}

}
}
}
	

