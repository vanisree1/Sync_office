package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utilities_class extends screenShots{
	protected static String profile;
	public static WebDriver driver;

	public static String randomalphabet(int count) {

		return RandomStringUtils.randomAlphabetic(count);
	}
	public static String randomnemeric(int count) {

		return RandomStringUtils.randomNumeric(count);
	}

	public static String randomalphanemeric(int count) {

		return RandomStringUtils.randomAlphanumeric(count);

	}

	public static String current_date() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = formatter.format(date);
		System.out.println("Todays date : " + strDate);
		return strDate;
	}


	public static String writeExcel(String sheet,int row ,int coloum) throws IOException {

		File file = new File("");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook wb= WorkbookFactory.create(file);
		String exceldata=wb.getSheet(sheet).getRow(row).getCell(coloum).toString();
		return exceldata;



	}

	public static String before_date() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//Getting current date
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, -7);
		//Date after adding the days to the current date
		String before_date = sdf.format(cal.getTime());
		System.out.println("Date after Addition: " + before_date);
		return before_date;
	}


	public static String Add_date() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		//Getting current date
		Calendar cal = Calendar.getInstance();
		//Displaying current date in the desired format
		//Number of Days to add
		cal.add(Calendar.DAY_OF_MONTH, 7);
		//Date after adding the days to the current date
		String Add_date = sdf.format(cal.getTime());
		//Displaying the new Date after addition of Days to current date
		System.out.println("Date after Addition: "+Add_date);
		return Add_date;
	}

	
	public static void launch()
	{
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}


}




