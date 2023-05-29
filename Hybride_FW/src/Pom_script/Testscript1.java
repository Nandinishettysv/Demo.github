package Pom_script;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic.Base_test;

public class Testscript1 extends Base_test {
	@Test
	public void loginappln(String d1,String d2) throws InterruptedException
	{
		//String val = Generic_script_excel.fetch_data("sheet1", 2, 4);
		Pom1 p=new Pom1(driver);
		p.user(d1);
		Thread.sleep(2000);
		p.pass("d2");
		Thread.sleep(2000);
		p.login();
		Assert.fail();
	}
	@DataProvider(name="testdata")
public Object[][] createData(){
		return new Object[][] {
			{"Nandini","1234"},
			{"Nags","2345"},
		};
	}

}
