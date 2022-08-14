package Employee_Type_Stepdef;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Utilities_class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Employee_Type_Stepdef extends Utilities_class
{	
	static WebDriver driver;
	
	public Employee_Type_Stepdef()
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
	@FindBy(xpath="//*[text()='Employee']")
	WebElement employee;
	@FindBy(xpath="//*[text()='Type']")
	WebElement employeetype;
	@FindBy(xpath="(//*[text()='add'])[5]")
	WebElement employeeAdd;
	@FindBy(xpath="(//*[text()='add'])[7]")
	WebElement employeeExistingAdd;
	@FindBy(xpath="(//*[@type='text'])[6]")
	WebElement employeeName;
	@FindBy(xpath="(//*[@name='description'])[3]")
	WebElement employeeDescript;
	@FindBy(xpath="//*[text()='Save']")
	WebElement saveButton;
	@FindBy(xpath="//*[text()='Enter valid employment type']")
	WebElement errorMsg;
	@FindBy(xpath="//*[text()='Employement Type already Exists']")
	WebElement alert;
	@FindBy(xpath="(//*[text()='Cancel'])[3]")
	WebElement cancelButton;
	@FindBy(xpath="(//*[@type='text'])[4]")
	WebElement selectName;
	@FindBy(xpath="(//*[@type='text'])[5]")
	WebElement searchBox;
	@FindBy(xpath="//*[text()='No Records Found']")
	WebElement errormsg2;


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

	@When("user click on login Button")
	public void user_click_on_login_Button() throws IOException, InterruptedException {

		login_Button.click();
		Thread.sleep(3000);
		takeScreenShot(driver); 
	}

	@Then("User Click on master")
	public void user_Click_on_master() throws InterruptedException {
		Thread.sleep(3000);
		master.click();
	}

	@Then("user mousehover on rightside bar")
	public void user_mousehover_on_rightside_bar() {
		Actions act = new Actions(driver);
		act.moveToElement(rightslider).perform();;

	}

	@Then("User click on Employee")
	public void user_click_on_Employee() throws InterruptedException {
		Thread.sleep(3000);
		employee.click();

	}

	@Then("User click on Type")
	public void user_click_on_Type() {
		employeetype.click();

	}

	@Then("User clike on Add and existing Add")
	public void user_clike_on_Add_and_existing_Add() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		employeeAdd.click();
		employeeExistingAdd.click();

	}

	@Then("user Enter fields with valid data")
	public void user_Enter_fields_with_valid_data() {
		employeeName.sendKeys("Information Technology");
		employeeDescript.sendKeys("Information Technology");

	}

	@Then("user click on save button")
	public void user_click_on_save_button() throws IOException, InterruptedException {
		saveButton.click();
		Thread.sleep(2000);
		takeScreenShot(driver);
	}

	@Then("user Enter fields with Invalid data")
	public void user_Enter_fields_with_Invalid_data() {
		employeeName.sendKeys("IT1");
		employeeDescript.sendKeys("Information Technology");
		String msg = errorMsg.getText();
		System.out.println(msg);
	}

	@Then("user Enter fields with Already existing type")
	public void user_Enter_fields_with_Already_existing_type() {
		employeeName.sendKeys("Information Technology");
		employeeDescript.sendKeys("Information Technology");
	}

	@Then("user click on save Button")
	public void user_click_on_save_Button() throws IOException, InterruptedException {
		saveButton.click();
		String msg = alert.getText();
		System.out.println(msg);
		takeScreenShot(driver);
	}

	@Then("user add only filed")
	public void user_add_only_filed() {
		employeeName.sendKeys("IT");
	}

	@Then("user click on cancle Button")
	public void user_click_on_cancle_Button() {
		cancelButton.click();
	}

	@Then("User clike on Add")
	public void user_clike_on_Add() throws IOException, InterruptedException {
		employeeAdd.click();
		Thread.sleep(3000);
		takeScreenShot(driver);
	}

	@Then("User Click on fliter column select name from dropdown")
	public void user_Click_on_fliter_column_select_name_from_dropdown() throws InterruptedException {
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.click(selectName).build().perform();
		selectName.sendKeys("name"+Keys.ENTER);
	}

	@Then("user Enter exisiting Type in search box")
	public void user_Enter_exisiting_Type_in_search_box() throws InterruptedException, IOException {
		searchBox.sendKeys("Animals");
		String msg = errormsg2.getText();
		System.out.println(msg);
		Thread.sleep(3000);
		takeScreenShot(driver);
	}

	@Then("User Click on fliter column select ALL from dropdown")
	public void user_Click_on_fliter_column_select_ALL_from_dropdown() throws InterruptedException {
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.click(selectName).build().perform();
		selectName.sendKeys("Al"+Keys.ENTER);
	}

	@Then("user Enter exisiting Type in search box {string}")
	public void user_Enter_exisiting_Type_in_search_box(String string) throws IOException, InterruptedException {
		searchBox.sendKeys(string);
		takeScreenShot(driver);
	}
	@Then("User Quit from site")
	public void user_Quit_from_site() throws InterruptedException, IOException {
		Thread.sleep(8000);
		driver.quit();


	}

}
