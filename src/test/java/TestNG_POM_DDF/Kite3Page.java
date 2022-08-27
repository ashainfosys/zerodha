package TestNG_POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite3Page {
@FindBy(xpath="//span[@class='user-id']") private WebElement USERID;

public Kite3Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void verifyID(String expID)
{
	String userID=USERID.getText();
	if(userID.equals(expID))
	{
		System.out.println("TC Pass");
	}
	else
	{
		System.out.println("Test case fail");
	}
}


}
