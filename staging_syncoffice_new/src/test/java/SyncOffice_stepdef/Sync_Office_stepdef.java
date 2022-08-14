package SyncOffice_stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Admin_Panel_stepdef.RandomAlphaNumeric;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sync_Office_stepdef extends RandomAlphaNumeric
{	
	WebDriver driver;
	String randoms  = RandomAlphaNumeric.generateRandam(8);
	String values = RandomAlphaNumeric.numeric(6);
	String alphabets = RandomAlphaNumeric.alpha(5); 

	public Sync_Office_stepdef()
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
	@FindBy(xpath="(//*[@class='MuiIconButton-label-242'])[2]")
	WebElement add_Group;
	@FindBy(xpath="(//*[@type='text'])[4]")
	WebElement incorp_Date;
	@FindBy(xpath="//*[@name='overhead']")
	WebElement over_Head;
	@FindBy(xpath="//*[@name='name']")
	WebElement name;
	@FindBy(xpath="//*[@class='jss13219 MuiOutlinedInput-notchedOutline-13198']")
	WebElement company_Code;
	@FindBy(xpath="//*[@name='cmpLocName']")
	WebElement comp_Location;
	@FindBy(xpath="//*[@name='address1']")
	WebElement building;
	@FindBy(xpath="//*[@name='address2']")
	WebElement area;
	@FindBy(xpath="//*[@name='pincode']")
	WebElement pincode;
	@FindBy(xpath="(//*[text()='City'])[1]")
	WebElement city;
	@FindBy(xpath="//*[@name='state']")
	WebElement state;
	@FindBy(xpath="//*[@name='country']")
	WebElement country;
	@FindBy(xpath="(//*[@class=' css-2b097c-container'])[2]")
	WebElement currency;
	@FindBy(xpath="//*[@id='react-select-8-input']")
	WebElement con_person;
	@FindBy (xpath="(//*[@class=' css-1uccc91-singleValue'])[3]")
	WebElement manisha;
	@FindBy(xpath="//*[text()='Save']")
	WebElement  saveButton;
	@FindBy(xpath="(//*[@title='View Group Company'])[1]")
	WebElement view_group;
	@FindBy(xpath="(//*[@class='MuiIconButton-label-6648'])[4]")
	WebElement group_edit_icon;
	@FindBy(xpath="(//*[@role='button'])[27]")
	WebElement group_Modify;
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/div/div[2]/div/div[3]/div/div/div[1]/div[4]/div/span/div/div[3]/div/span/button/span[1]/span")
	WebElement delete_Button;
	@FindBy(xpath="(//*[text()='Delete'])[5]")
	WebElement accept_Delete;

	@FindBy(xpath="(//*[@type='button'])[8]")
	WebElement add_Location;
	@FindBy(xpath="(//*[@type='text'])[4]")
	WebElement select_Group_Comp;
	@FindBy(xpath="(//*[@type='text'])[6]")
	WebElement add_comp_locat;
	@FindBy(xpath="(//*[@type='text'])[7]")
	WebElement add_building;
	@FindBy(xpath="(//*[@type='text'])[8]")
	WebElement add_Area;
	@FindBy(xpath="(//*[@type='text'])[9]")
	WebElement Add_pincode;
	@FindBy(xpath="(//*[@type='text'])[15]")
	WebElement add_con_person;
	@FindBy(xpath="(//*[@role='button'])[21]")
	WebElement locat_save_Button;
	@FindBy(xpath="(//*[text()='edit'])[1]")
	WebElement locat_Edit;
	@FindBy(xpath="(//*[text()='delete'])[2]")
	WebElement locat_Delete;
	@FindBy(xpath="(//*[@role='button'])[21]")
	WebElement locat_modify;
	@FindBy(xpath="(//*[text()='Delete'])[3]")
	WebElement accept_locat_delete;

	@Given("Openbrowser and enterURL {string}")
	public void openbrowser_and_enterURL(String URL) {
		driver.manage().window().maximize();
		driver.get(URL);

	}

	@When("enter userName {string} and passWord {string}")
	public void enter_userName_and_passWord(String string, String string1) {
		user.sendKeys(string);
		pass.sendKeys(string1);

	}

	@Then("user click on login Button")
	public void user_click_on_login_Button() {
		login_Button.click();   
	}
	@Then("user click on master module")
	public void user_click_on_master_module() throws InterruptedException {
		Thread.sleep(2000);
		master.click();	    
	}
	@Then("User click on add group company")
	public void user_click_on_add_group_company() throws InterruptedException {
		Thread.sleep(2000);
		add_Group.click();
	}

	@Then("User enter All the data")
	public void user_enter_All_the_data() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		incorp_Date.sendKeys("10-02-2000");
		over_Head.sendKeys("20%");
		name.sendKeys(alphabets);
		comp_Location.sendKeys(alphabets);
		building.sendKeys(alphabets);
		area.sendKeys(alphabets);
		pincode.sendKeys("500032");
		pincode.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		act.moveToElement(con_person).build().perform();
		act.doubleClick().build().perform();
		con_person.sendKeys(Keys.SHIFT.ARROW_DOWN);
		con_person.sendKeys(Keys.SHIFT.ARROW_DOWN);
		//	    con_person.sendKeys(Keys.SHIFT.ARROW_DOWN);
		con_person.sendKeys(Keys.ENTER);


	}

	@Then("Click on save")
	public void click_on_save() throws InterruptedException {
		Thread.sleep(3000);
		saveButton.click();  

	}

	@Then("user click on the Edit option")
	public void user_click_on_the_Edit_option() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		view_group.click();
		group_edit_icon.click();
		Thread.sleep(3000);
		area.sendKeys("d");
		group_Modify.click();
	}

	@Then("user click on the Delete option")
	public void user_click_on_the_Delete_option() throws InterruptedException {
		Thread.sleep(5000);
		delete_Button.click();
		Thread.sleep(2000);
		accept_Delete.click();
	}

	@Then("user Add location")
	public void user_Add_location() throws InterruptedException {
		Thread.sleep(3000);
		add_Location.click();
	}

	@Then("user enter location Data")
	public void user_enter_location_Data() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		act.moveToElement(select_Group_Comp).build().perform();
		act.click().build().perform();
		Thread.sleep(5000);
		select_Group_Comp.sendKeys(Keys.SHIFT.ARROW_DOWN);
		select_Group_Comp.sendKeys(Keys.SHIFT.ARROW_DOWN);
		select_Group_Comp.sendKeys(Keys.ALT.ENTER);
		add_comp_locat.sendKeys(alphabets);
		add_building.sendKeys(alphabets);
		add_Area.sendKeys(alphabets);
		Add_pincode.sendKeys("500032");
		Add_pincode.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		act.moveToElement(add_con_person).build().perform();
		act.doubleClick().build().perform();
		add_con_person.sendKeys(Keys.SHIFT.ARROW_DOWN);
		add_con_person.sendKeys(Keys.SHIFT.ARROW_DOWN);
		add_con_person.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

	}
	@Then("user click on Save")
	public void user_click_on_Save() {
		locat_save_Button.click();
	}
	@Then("user edit_location")
	public void user_edit_location() throws InterruptedException {
	    Thread.sleep(2000);
	    locat_Edit.click();
	    Thread.sleep(3000);
	    area.sendKeys("G");
	    Thread.sleep(3000);
	    locat_modify.click();
	}

	@Then("user delete Location")
	public void user_delete_Location() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", locat_Delete);
		locat_Delete.click();
	    Thread.sleep(2000);
	    accept_locat_delete.click();
	    
	}

	@Then("user Quit from the site")
	public void user_Quit_from_the_site() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
