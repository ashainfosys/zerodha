package SoftAssertion_Verify;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
@Test
public void TC1()
{
	System.out.println("TC1 running");
	String act="Hiii";
	String exp="HEllo";
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(act, exp);
	System.out.println("I am After Fail");
	soft.assertAll();
	
}
@Test
public void TC2()
{
	System.out.println("I am from TC2");
	
	
}


}
