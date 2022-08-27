package Assertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFalse {
	@Test
	public void TC1()
	{
		Reporter.log("TC1 running",true);
		boolean act=false;
		Assert.assertFalse(act);
	//	Reporter.log("TC pass",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("TC2 running",true);
		boolean act=false;
		Assert.assertFalse(act);
	//	Reporter.log("TC false",true);
	}
}
