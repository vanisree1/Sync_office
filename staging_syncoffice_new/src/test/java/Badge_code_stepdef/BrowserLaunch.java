package Badge_code_stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch 
{
	WebDriver driver;
	public BrowserLaunch()
	{
	String path = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", path+"\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	}
	
}
