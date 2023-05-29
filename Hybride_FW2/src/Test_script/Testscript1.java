package Test_script;

import org.testng.annotations.Test;

import Generic.Base_test;
import Pom_script.Pom2;

public class Testscript1 extends Base_test {
	@Test
	public void Checkfield() throws InterruptedException
	{
		Pom2 p=new Pom2(driver);
		p.checkbox1();
		Thread.sleep(2000);
		
	}

}
