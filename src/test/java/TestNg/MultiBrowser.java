package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class MultiBrowser {
	@Parameters("browsername")
	@Test
	
	public void openBrowser(String browsername)
	{
		WebDriver driver=null;
		if(browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/Users/DELL/Downloads/chromedriver_win32/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:/Users/DELL/Downloads/edgedriver_win32/msedgedriver.exe");
			driver=new EdgeDriver();
		}
		driver.get("https://kite.zerodha.com");
	}

}
