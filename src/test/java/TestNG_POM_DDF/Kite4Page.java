package TestNG_POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite4Page {
@FindBy(xpath="//span[@class='user-id']") private WebElement LIST;

public Kite4Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
