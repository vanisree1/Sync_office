package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenShots  {
	static WebDriver driver;
	public  static void takeScreenShot(WebDriver driver) throws IOException, InterruptedException
	{	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Date d1 = new Date();
		SimpleDateFormat s1 = new SimpleDateFormat("ss mm");
		String Date = s1.format(d1);
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir");
		File DestFile = new File(path+"\\ScreenShots\\screenshot.jpg"+Date+"");
		FileUtils.copyFile(srcFile, DestFile);
		
	}
}