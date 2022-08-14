package ClientLocation_Stepdef;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
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

public class ClientLocation_stepdef extends Utilities_class
{
	static WebDriver driver;

	public ClientLocation_stepdef()
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
	@FindBy(xpath="//*[text()='Client']")
	WebElement clientlabel;
	@FindBy(xpath="(//*[text()='Location'])[1]")
	WebElement location;
	@FindBy(xpath="(//*[text()='add'])[5]")
	WebElement addbutton;
	@FindBy(xpath="(//*[@type='text'])[4]")
	WebElement client;
	@FindBy(xpath="(//*[@type='text'])[5]")
	WebElement locatName;
	@FindBy(xpath="(//*[@type='text'])[6]")
	WebElement locatType;
	@FindBy(xpath="(//*[@type='text'])[7]")
	WebElement conPerson;
	@FindBy(xpath="(//*[@type='text'])[8]")
	WebElement depart;
	@FindBy(xpath="(//*[@type='text'])[9]")
	WebElement address1;
	@FindBy(xpath="(//*[@type='text'])[10]")
	WebElement address2;
	@FindBy(xpath="(//*[@type='text'])[11]")
	WebElement pincode;
	@FindBy(xpath="//*[text()='Save']")
	WebElement save;
	@FindBy(xpath="(//*[text()='edit'])[1]")
	WebElement edit;
	@FindBy(xpath="(//*[text()='delete'])[2]")
	WebElement delete;
	@FindBy(xpath="(//*[text()='Delete'])[3]")
	WebElement confDelete;
	@FindBy(xpath="(//*[@type='checkbox'])[7]")
	WebElement checkbox;
	@FindBy(xpath="(//*[text()='delete'])[1]")
	WebElement delete1;
	@FindBy(xpath="(//*[text()='Delete'])[2]")
	WebElement confDelete1;

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


	@When("User click on client")
	public void user_click_on_client() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", clientlabel);		 
	}

	@When("User click on Location")
	public void user_click_on_Location() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", location);		 
	}

	@When("User clcik on Add")
	public void user_clcik_on_Add() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", addbutton);		 
	}

	@When("User Enter valid location fields")
	public void user_Enter_valid_location_fields() {
		Actions act = new Actions(driver);
		act.click(client).build().perform();
		client.sendKeys("van"+Keys.ENTER);
		locatName.sendKeys("Mumbai");
		locatType.sendKeys("Mumbai1");
		conPerson.sendKeys("va"+Keys.ENTER);
		depart.sendKeys("Oncology"+Keys.ENTER);
		address1.sendKeys("Mumbai2");
		pincode.sendKeys("400001"+Keys.TAB);
	}

	@When("User click on save")
	public void user_click_on_save() throws InterruptedException {
		Thread.sleep(3000);
		save.click();
	}

	@When("User Enter valid location fields by skip any one mandatory fields")
	public void user_Enter_valid_location_fields_by_skip_any_one_mandatory_fields() {
		Actions act = new Actions(driver);
		act.click(client).build().perform();
		client.sendKeys("van"+Keys.ENTER);
		locatName.sendKeys("Mumbai");
		conPerson.sendKeys("va"+Keys.ENTER);
		depart.sendKeys("Oncology"+Keys.ENTER);
		address1.sendKeys("Mumbai2");
		pincode.sendKeys("400001"+Keys.TAB);
		boolean actu = save.isEnabled();
		Assert.assertTrue("save button is not enabled", actu);			
	}

	@When("User clcik on edit button")
	public void user_clcik_on_edit_button() {
		edit.click();
	}

	@When("User click on the delete button and conformation button")
	public void user_click_on_the_delete_button_and_conformation_button() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", delete);
		Thread.sleep(2000);
		executor.executeAsyncScript("arguments[0].click();", confDelete);
	}

	@When("User click on selectBox")
	public void user_click_on_selectBox() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", checkbox);
	}

	@When("User click on select delete button and conformation button")
	public void user_click_on_select_delete_button_and_conformation_button() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", delete1);
		executor.executeScript("arguments[0].click();", confDelete1);
	}

	@Then("User Quit from site")
	public void user_Quit_from_site() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
