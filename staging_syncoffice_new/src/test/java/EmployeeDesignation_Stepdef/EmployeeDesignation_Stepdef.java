package EmployeeDesignation_Stepdef;

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

public class EmployeeDesignation_Stepdef extends Utilities_class
{
	static WebDriver driver;

	public EmployeeDesignation_Stepdef()
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
	@FindBy(xpath="//*[text()='Designation']")
	WebElement designation;
	@FindBy(xpath="(//*[text()='add'])/parent::span")
	WebElement addButton;
	@FindBy(xpath="(//*[text()='add']/parent::span)[2]")
	WebElement existAdd;
	@FindBy(xpath="(//*[@type='text'])[6]")
	WebElement design;
	@FindBy(xpath="(//*[@name='description'])[3]")
	WebElement descript;
	@FindBy(xpath="//*[text()='Save']")
	WebElement savebutton;
	@FindBy(xpath="//*[text()='Enter Valid Designation']")
	WebElement errormsg;
	@FindBy(xpath="(//*[text()='Cancel'])[3]")
	WebElement cancelButton;
	@FindBy(xpath="(//*[@type='text'])[4]")
	WebElement coloumn;
	@FindBy(xpath="(//*[@type='text'])[5]")
	WebElement searchBox;
	@FindBy(xpath="//*[text()='No Records Found']")
	WebElement errormsg2;
	@FindBy(xpath="(//*[text()='edit'])[18]")
	WebElement edit;
	

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

	@Then("User click on designation")
	public void user_click_on_designation() {
		designation.click();	    
	}

	@Then("User clike on Add and existing Add")
	public void user_clike_on_Add_and_existing_Add() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		addButton.click();
		existAdd.click();
	}

	@Then("user Enter fields with valid data")
	public void user_Enter_fields_with_valid_data() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		design.sendKeys("Accounts");
		descript.sendKeys("Related to accounts");
	}

	@Then("user click on save button")
	public void user_click_on_save_button() throws IOException, InterruptedException {
		savebutton.click();	 
		takeScreenShot(driver);
	}

	@Then("user Enter fields with Invalid data")
	public void user_Enter_fields_with_Invalid_data() throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		design.sendKeys("Accounts123");
		descript.sendKeys("Related to accounts");
		String msg = errormsg.getText();
		System.out.println(msg);
		takeScreenShot(driver);
	}
	@Then("user add only one field")
	public void user_add_only_one_field() {
		design.sendKeys("Accounts123");
	}

	@Then("User click on cancle")
	public void user_click_on_cancle() throws IOException, InterruptedException {
		cancelButton.click();
		takeScreenShot(driver);
	}

	@Then("User clike on Add")
	public void user_clike_on_Add() throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", addButton);
	}

	@Then("user Click on fliter column select name  from dropdown")
	public void user_Click_on_fliter_column_select_name_from_dropdown() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		act.click(coloumn).build().perform();
		coloumn.sendKeys("nam"+Keys.ENTER);
	}

	@Then("User Enter exisiting designation in search box")
	public void user_Enter_exisiting_designation_in_search_box() throws IOException, InterruptedException {
		searchBox.sendKeys("Accounts");
		takeScreenShot(driver);
	}

	@Then("User Enter designation in search box")
	public void user_Enter_designation_in_search_box() throws IOException, InterruptedException {
		searchBox.sendKeys("xyz");
		String msg = errormsg2.getText();
		System.out.println(msg);
		takeScreenShot(driver);
	}
	
	@Then("User Click on edit")
	public void user_Click_on_edit() throws IOException, InterruptedException {
		edit.click();
		takeScreenShot(driver);
	}
	
	@Then("User Click on fliter column select ALL  from dropdown")
	public void user_Click_on_fliter_column_select_ALL_from_dropdown() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		act.click(coloumn).build().perform();
		coloumn.sendKeys("Al"+Keys.ENTER);
	}

	@Then("user Enter exisiting Type in search box")
	public void user_Enter_exisiting_Type_in_search_box() throws IOException, InterruptedException {
	   searchBox.sendKeys("Accounts");
	   takeScreenShot(driver);
	}

	@Then("User Quit from site")
	public void user_Quit_from_site() throws InterruptedException, IOException {
		Thread.sleep(5000);
		driver.quit();
	}

}
