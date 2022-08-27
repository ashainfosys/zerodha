package TestNG_POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite2Page {
@FindBy(xpath="//input[@id='pin']") private WebElement PIN;
@FindBy(xpath="//button[text()='Continue ']") private WebElement CONTI;

public Kite2Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void enterPIN(String pin_name) {
PIN.sendKeys(pin_name);
}

public void clickConti()
{
	CONTI.click();
}

}
