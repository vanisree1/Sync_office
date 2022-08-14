package Client_Stepdef;

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

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Client_stepdef {
	static WebDriver driver;

	public Client_stepdef()
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
	@FindBy(xpath="//*[text()='Clients']")
	WebElement clients;
	@FindBy(xpath="(//*[text()='add'])[5]")
	WebElement add;
	@FindBy(xpath="//*[@name='name']")
	WebElement name;
	@FindBy(xpath="//*[text()='--Select--']")
	WebElement category;
	@FindBy(xpath="(//*[@type='text'])[6]")
	WebElement categName;
	@FindBy(xpath="(//*[@type='text'])[7]")
	WebElement incorDate;
	@FindBy(xpath="//*[text()='Location Details']")
	WebElement locatDetails;
	@FindBy(xpath="//*[@name='locName']")
	WebElement locName;
	@FindBy(xpath="//*[@name='location_type']")
	WebElement locType;
	@FindBy(xpath="//*[@name='address1']")
	WebElement address1;
	@FindBy(xpath="//*[@name='pincode']")
	WebElement pincode;
	@FindBy(xpath="//*[text()='Select...']")
	WebElement departSelect;
	@FindBy(xpath="(//*[@type='text'])[13]")
	WebElement departName;
	@FindBy(xpath="//*[text()='Admin']")
	WebElement admin;
	@FindBy(xpath="//*[@name='email']")
	WebElement email;
	@FindBy(xpath="//*[@name='firstname']")																	
	WebElement firstname;
	@FindBy(xpath="(//*[@type='text'])[7]")			
	WebElement lastName;
	@FindBy(xpath="//*[@type='tel']")
	WebElement mbl;
	@FindBy(xpath="(//*[text()='Save'])[1]")
	WebElement save;
	@FindBy(xpath="(//*[@type='text'])[3]")
	WebElement search;
	@FindBy(xpath="(//*[text()='person_add'])[1]")
	WebElement personIcon;
	@FindBy(xpath="//*[@name='client']")
	WebElement clientName;
	@FindBy(xpath="//*[@name='location']")
	WebElement locatName;
	@FindBy(xpath="(//*[@type='text'])[8]")
	WebElement send;
	@FindBy(xpath="//*[text()='Client Log']")
	WebElement clientlog;
	@FindBy(xpath="(//*[text()='edit'])[16]")
	WebElement edit;
	@FindBy(xpath="//*[text()='Modify']")
	WebElement modify;
	@FindBy(xpath="(//*[@type='text'])[10]")
	WebElement sendTo;
	

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

	@When("User click on clients")
	public void user_click_on_clients() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", clients);		
	}

	@When("User clik on Add")
	public void user_clik_on_Add() {
		add.click();
	}

	@When("User Enter valid basic info in mandatory fields")
	public void user_Enter_valid_basic_info_in_mandatory_fields() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		name.sendKeys("vani");
		Actions act = new Actions(driver);
		act.click(category).perform();
		Thread.sleep(2000);
		categName.sendKeys("banking"+Keys.ENTER);
		incorDate.sendKeys("07/07/2022");
	}
	@When("User Enetr vlaid location fields")
	public void user_Enetr_vlaid_location_fields() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		locatDetails.click();
		locName.sendKeys("Hyderabad");
		locType.sendKeys("Ameerpet");
		address1.sendKeys("123");
		pincode.sendKeys("500017");
		departSelect.click();
		departName.sendKeys("Schools123"+Keys.ENTER);
	}

	@When("User Enetr valid admin fields")
	public void user_Enetr_valid_admin_fields() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		admin.click();
		email.sendKeys("1993vanisr@gmail.com");
		Actions act = new Actions(driver);
		act.sendKeys(firstname, "vani").perform();	
		act.doubleClick(lastName).perform();
		Thread.sleep(2000);
		lastName.sendKeys("Reddy");		
		mbl.sendKeys("9000090000");
	}

	@When("User click on save")
	public void user_click_on_save() {
		save.click();
	}

	@When("User Enter exisiting user in search")
	public void user_Enter_exisiting_user_in_search() throws InterruptedException {
		Thread.sleep(2000);
		search.sendKeys("Vani"+Keys.TAB);
	}

	@When("User click on client request icon")
	public void user_click_on_client_request_icon() {
		personIcon.click();
	}

	@When("User Enter valid basic info in mandatory field")
	public void user_Enter_valid_basic_info_in_mandatory_field() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		clientName.sendKeys("Kavya");
		Actions act = new Actions(driver);
		act.click(category).perform();
		Thread.sleep(2000);
		categName.sendKeys("banking"+Keys.ENTER);
		incorDate.sendKeys("07/07/2022");
	}

	@When("User Enetr valid location fields")
	public void user_Enetr_valid_location_fields() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		locatDetails.click();
		locatName.sendKeys("banglore");
		locType.sendKeys("BTM");
		address1.sendKeys("BTM LAYOUT 2nd stage");
		pincode.sendKeys("560076");
		departSelect.click();
		departName.sendKeys("Schools123"+Keys.ENTER);
	}

	@When("User Enetr valid admin field")
	public void user_Enetr_valid_admin_field() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		admin.click();
		email.sendKeys("kavya123@gmail.com");
		firstname.sendKeys("kavya");
		lastName.sendKeys("kavya");
		mbl.sendKeys("9000091111");
		send.sendKeys("sari"+Keys.ENTER);
	}

	@When("User click on edit on client log")
	public void user_click_on_edit_on_client_log() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", clientlog);
		executor.executeScript("arguments[0].click();", edit);
		
	}

	@When("User modify any one the field")
	public void user_modify_any_one_the_field() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		act.doubleClick(clientName).build().perform();
		clientName.sendKeys("kavyaa");
		admin.click();
		sendTo.sendKeys("Sari"+Keys.ENTER);
		Thread.sleep(2000);
		modify.click();
	}

	@Then("User Quit from site")
	public void user_Quit_from_site() throws InterruptedException {
//		Thread.sleep(5000);
//		driver.quit();
	}
}
