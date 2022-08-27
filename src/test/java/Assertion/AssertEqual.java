package Assertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqual {

	@Test
	public void TC1()
	{
		Reporter.log("TC1 running",true);
		String act="Asha";
		String exp="Asha";
		Assert.assertEquals(act, exp);
		Reporter.log("TC pass",true);
	}
}
