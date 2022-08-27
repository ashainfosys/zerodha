package Assertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotEqual {
	@Test
	public void TC1()
	{
		Reporter.log("TC1 running",true);
		String act="Asha";
		String exp="AshaRani";
		Assert.assertNotEquals(act, exp);
		Reporter.log("TC pass",true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("TC2 running",true);
		String act="Asha";
		String exp="Asha";
		Assert.assertNotEquals(act, exp);
		Reporter.log("TC Fail",true);
	}
}
