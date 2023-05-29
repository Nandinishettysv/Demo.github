package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
	@Test
	public void data1()
	{
		System.out.println("india");
	}
	@Test
	public void data2()
	{
		System.out.println("karnataka");
		Assert.fail();
	}
	@Test(dependsOnMethods = "data2")
	public void data3()
	{
		System.out.println("kolar");
	}
}
