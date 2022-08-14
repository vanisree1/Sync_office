package EmployeeDepartment_Stepdef;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Utilities_class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmployeeDepartment_stepdef extends Utilities_class
{
	static WebDriver driver;

	public EmployeeDepartment_stepdef()
	{
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\WebDrivers\\chromedriver.exe");
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
	@FindBy(xpath="//*[text()='Department']")
	WebElement depart;
	@FindBy(xpath="(//*[text()='add'])[5]")
	WebElement addButton;
	@FindBy(xpath="(//*[text()='add'])[7]")
	WebElement existAddButton;
	@FindBy(xpath="//*[@name='name']")
	WebElement name;
	@FindBy(xpath="(//*[@name='description'])[3]")
	WebElement descript;
	@FindBy(xpath="//*[text()='Save']")
	WebElement saveButton;
	@FindBy(xpath="//*[text()='Enter Valid Department Name']")
	WebElement error;
	@FindBy(xpath="(//*[text()='Cancel'])[3]")
	WebElement cancel;
	@FindBy(xpath="(//*[@type='text'])[4]")
	WebElement coloumn;
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
		takeScreenShot(driver); 
	}

	@Then("User Click on master")
	public void user_Click_on_master() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(master));
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

	@Then("User click on department")
	public void user_click_on_department() {
		depart.click();	    
	}

	@Then("User clike on Add and existing Add")
	public void user_clike_on_Add_and_existing_Add() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", addButton);
		executor.executeScript("arguments[0].click();", existAddButton);
	}

	@Then("user Enter fields with valid data")
	public void user_Enter_fields_with_valid_data() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		name.sendKeys("Schools123");
		descript.sendKeys("Related to Schools");
	}

	@Then("user click on save button")
	public void user_click_on_save_button() throws IOException, InterruptedException {
		saveButton.click();
		takeScreenShot(driver);
	}

	@Then("user add the mandatory filed")
	public void user_add_the_mandatory_filed() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		name.sendKeys("$School123");
		descript.sendKeys("Related to Schools");
		String msg = error.getText();
		System.out.println(msg);
	}

	@Then("user add only field")
	public void user_add_only_field() {
		descript.sendKeys("Related to Schools");
	}

	@Then("user click on cancle")
	public void user_click_on_cancle() {
		cancel.click();
	}

	@Then("User clike on Add")
	public void user_clike_on_Add() throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", addButton);
	}

	@Then("user Click on fliter column select name from dropdown")
	public void user_Click_on_fliter_column_select_name_from_dropdown() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		act.click(coloumn).build().perform();
		coloumn.sendKeys("nam"+Keys.ENTER);
	}

	@Then("User Enter exisiting department in search box")
	public void user_Enter_exisiting_department_in_search_box() throws IOException, InterruptedException {
		searchBox.sendKeys("Schools");
		takeScreenShot(driver);
	}

	@Then("user Click on fliter column select name from dropdown not in records")
	public void user_Click_on_fliter_column_select_name_from_dropdown_not_in_records() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		act.click(coloumn).build().perform();
		coloumn.sendKeys("nam"+Keys.ENTER);
	}

	@Then("User Enter department in search box")
	public void user_Enter_department_in_search_box() throws IOException, InterruptedException {
		searchBox.sendKeys("xyz");
		takeScreenShot(driver);
	}

	@Then("user Click on fliter column select ALL  from dropdown")
	public void user_Click_on_fliter_column_select_ALL_from_dropdown() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		act.click(coloumn).build().perform();
		coloumn.sendKeys("Al"+Keys.ENTER);
	}

	@Then("User Enter exisiting Type in search box")
	public void user_Enter_exisiting_Type_in_search_box() throws IOException, InterruptedException {
		searchBox.sendKeys("Schools");
		takeScreenShot(driver);
	}

	@Then("User Quit from site")
	public void user_Quit_from_site() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
