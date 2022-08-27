package TestNG_POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite1Page {
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;
	@FindBy(xpath="//button[text()='Login ']") private WebElement LOGINBTN;
	
	public Kite1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUN(String usernm)
	{
		UN.sendKeys(usernm);
	}
	
	public void enterPWD(String pwdnm)
	{
		PWD.sendKeys(pwdnm);
	}
	public void clickLOGIN()
	{
		LOGINBTN.click();
	}
	
	
}