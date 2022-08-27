package Assertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFail {
	@Test
	public void TC1()
	{
		Reporter.log("TC1 running",true);
		Assert.fail();//verfication no.1
		System.out.println("Running TC1");
	}
	@Test
	public void TC2()
	{
		Reporter.log("TC2 running",true);
		boolean act=true;
		Assert.assertTrue(act);
		Reporter.log("TC2 pass",true);
	}
}
