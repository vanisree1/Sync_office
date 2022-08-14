package JobDepartment_stepdef;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.Column;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import Utilities.Utilities_class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JobDepartment_stepdef extends Utilities_class
{
	static WebDriver driver;

	public JobDepartment_stepdef()
	{
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@type='text']")
	WebElement user;
	@FindBy(xpath="//*[@type='password']")
	WebElement pass;
	@FindBy(xpath="//*[@class='MuiBox-root-17 jss174']")
	WebElement login_Button;
	@FindBy(xpath="(//*[@class='MuiListItemText-root'])[3]")
	WebElement master;
	@FindBy(xpath="//*[@class='MuiBox-root jss943']")
	WebElement rightslider;
	@FindBy(xpath="//*[text()='Client']")
	WebElement clientlabel;
	@FindBy(xpath="//*[text()='Job Department']")
	WebElement jobdepart;
	@FindBy(xpath="(//*[text()='add'])/parent::span")
	WebElement add;
	@FindBy(xpath="//*[@name='name']")
	WebElement name;
	@FindBy(xpath="//*[@name='job_code_department']")
	WebElement codedepart;
	@FindBy(xpath="(//*[@type='text'])[6]")
	WebElement actCode;
	@FindBy(xpath="(//*[text()='Save'])[1]")
	WebElement save;
	

	/**
 	-----------------------------------------------------------------------------------------------------------------------------
	 *****************************************************************************************************************************
	--------------------------------------------------------------------------------------------------------------------------- */

	@Given("Openbrowser and enterURL {string}")
	public void openbrowser_and_enterURL(String string) {

		driver.get(string);
		driver.manage().window().maximize();
	}

	@When("enter userName {string} and passWord {string}")
	public void enter_userName_and_passWord(String string, String string2) {

		user.sendKeys(string);
		pass.sendKeys(string2);
	}

	@When("User click on login Button")
	public void User_click_on_login_Button() throws IOException, InterruptedException {

		login_Button.click();
		takeScreenShot(driver); 
	}

	@Then("User Click on master")
	public void User_Click_on_master() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(master));
		master.click();
	}

	@Then("User mousehover on rightside bar")
	public void User_mousehover_on_rightside_bar() {
		Actions act = new Actions(driver);
		act.moveToElement(rightslider).perform();;
	}
	
	@Then("User click on client")
	public void user_click_on_client() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", clientlabel);	    
	}

	@Then("User click on Job department")
	public void user_click_on_Job_department() throws InterruptedException {
		Thread.sleep(2000);
		jobdepart.click();
	}
	
	@Then("User clike on Add")
	public void user_clike_on_Add() throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", add);
	}

	@Then("user Enter valid data job department fields")
	public void user_Enter_valid_data_job_department_fields() {
	    name.sendKeys("VANI");
	    codedepart.sendKeys("ONC");
	    actCode.sendKeys("manager"+Keys.ENTER);	    
	}

	@Then("user click on save button")
	public void user_click_on_save_button() {
	    save.click();	    
	}
	
	@Then("user Enter valid data job department fields by skip mandatory field")
	public void user_Enter_valid_data_job_department_fields_by_skip_mandatory_field() throws IOException, InterruptedException {
	    name.sendKeys("VANI");
	    actCode.sendKeys("manager"+Keys.ENTER);	
	    takeScreenShot(driver);
	}

	@Then("User Quit from site")
	public void user_Quit_from_site() throws InterruptedException, IOException {
//		Thread.sleep(5000);
//		driver.quit();
	}

}
