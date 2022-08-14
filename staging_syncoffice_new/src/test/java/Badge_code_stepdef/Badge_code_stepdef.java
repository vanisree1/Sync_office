package Badge_code_stepdef;

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
import Utilities.Utilities_class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Badge_code_stepdef extends Utilities_class

{	
	WebDriver driver;
	String randoms  = RandomAlphaNumeric.generateRandam(8);
	String values = RandomAlphaNumeric.numeric(6);
	String alphabets = RandomAlphaNumeric.alpha(5); 

	public Badge_code_stepdef()
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
	@FindBy(xpath="//*[text()='General']")
	WebElement general;
	@FindBy(xpath="//*[text()='Badge Code']")
	WebElement badgeCode;
	@FindBy(xpath="(//*[@type='radio'])[2]")
	WebElement radio;
	@FindBy(xpath="//*[text()='Individual Reminder']")
	WebElement individual;
	@FindBy(xpath="//*[@title='Add']")
	WebElement addButton;
	@FindBy(xpath="(//*[@type='text'])[3]")
	WebElement date;
	@FindBy(xpath="//*[text()='HH:MM']")
	WebElement time;
	@FindBy(xpath="(//*[text()='12'])[1]")
	WebElement hours;
	@FindBy(xpath="(//*[text()='00'])[1]")
	WebElement min;
	@FindBy(xpath="//*[text()='Done']")
	WebElement done;
	@FindBy(xpath="(//*[@type='text'])[4]")
	WebElement client;
	@FindBy(xpath="(//*[@type='text'])[5]")
	WebElement reminderTask;
	@FindBy(xpath="(//*[@type='text'])[6]")
	WebElement description;
	@FindBy(xpath="(//*[@type='text'])[7]")
	WebElement selectRepeat;
	@FindBy(xpath="(//*[@type='text'])[8]")
	WebElement notify;
	@FindBy(xpath="//*[text()='Save']")
	WebElement saveButton;
	@FindBy(xpath="//*[text()='Registration Details']")
	WebElement registration;
	@FindBy(xpath="(//*[@name='group_company'])[1]")
	WebElement groupComp;
	@FindBy(xpath="//*[text()='TYAQH']")
	WebElement selectComp;
	@FindBy(xpath="(//*[text()='add'])[5]")
	WebElement GSTaddButton;
	@FindBy(xpath="(//*[@type='text'])[3]")
	WebElement gst;
	@FindBy(xpath="(//*[text()='save'])[1]")
	WebElement gstSaveButton;
	@FindBy(xpath="//*[text()='Bank Details']")
	WebElement bank;
	@FindBy(xpath="(//*[text()='add'])[6]")
	WebElement addBank;
	@FindBy(xpath="(//*[@type='text'])[4]")
	WebElement bankName;
	@FindBy(xpath="(//*[@type='text'])[5]")
	WebElement bankBranch;
	@FindBy(xpath="(//*[@type='text'])[6]")
	WebElement bankIFSC;
	@FindBy(xpath="(//*[@type='text'])[7]")
	WebElement acNumber;
	@FindBy(xpath="//*[text()='save']")
	WebElement bankSaveButton;
	@FindBy(xpath="//*[text()='Invalid format.']")
	WebElement ifsc;
	@FindBy(xpath="//*[text()='Employee']")
	WebElement employee;
	@FindBy(xpath="//*[text()='Grade']")
	WebElement grade;
	@FindBy(xpath="(//*[text()='add'])[5]")
	WebElement addGrade;
	@FindBy(xpath="(//*[text()='add'])[7]")
	WebElement exstingGrade;
	@FindBy(xpath="(//*[@type='text'])[6]")
	WebElement gradeName;
	@FindBy(xpath="(//*[@name='description'])[3]")
	WebElement descrip;
	@FindBy(xpath="//*[text()='Save']")
	WebElement gradeSave;
	@FindBy(xpath="(//*[text()='Cancel'])[3]")
	WebElement gradeCancel;
	@FindBy(xpath="(//*[@type='text'])[4]")
	WebElement gradeColoumn;
	@FindBy(xpath="(//*[@type='text'])[5]")
	WebElement gradeSearch;
	@FindBy(xpath="//*[text()='No Records Found']")
	WebElement message1;
	@FindBy(xpath="//*[text()='Enter valid grade name']")
	WebElement message2;
	@FindBy(xpath="(//*[text()='edit'])[16]")
	WebElement editFirst;
	@FindBy(xpath="//*[text()='Employee Lists']")
	WebElement employeelist;
	@FindBy(xpath="(//*[text()='add'])[5]")
	WebElement employeAddButton;
	@FindBy(xpath="(//*[@type='text'])[4]")
	WebElement employee_selectComp;
	@FindBy(xpath="(//*[@type='text'])[5]")
	WebElement employee_badgeCode;
	@FindBy(xpath="(//*[@type='text'])[6]")
	WebElement employee_firstName;
	@FindBy(xpath="(//*[@type='text'])[7]")
	WebElement employee_middleName;
	@FindBy(xpath="(//*[@type='text'])[8]")
	WebElement employee_lastName;
	@FindBy(xpath="(//*[@type='text'])[9]")
	WebElement employee_gender;
	@FindBy(xpath="(//*[@type='text'])[10]")
	WebElement employee_dob_off;
	@FindBy(xpath="(//*[@type='text'])[11]")
	WebElement employee_dob_act;
	@FindBy(xpath="(//*[@type='text'])[12]")
	WebElement employee_doj;
	@FindBy(xpath="(//*[@type='text'])[13]")
	WebElement employee_email;
	@FindBy(xpath="//*[@class='form-control ']")
	WebElement employee_mbl;
	@FindBy(xpath="//*[text()='Company Related']")
	WebElement comprelated;
	@FindBy(xpath="(//*[@type='text'])[6]")
	WebElement employee_location;
	@FindBy(xpath="(//*[@type='text'])[7]")
	WebElement employee_depart;
	@FindBy(xpath="(//*[@type='text'])[8]")
	WebElement employee_design;
	@FindBy(xpath="(//*[@type='text'])[9]")
	WebElement emply_report;
	@FindBy(xpath="(//*[@type='text'])[10]")
	WebElement employ_reportAuthor;
	@FindBy(xpath="(//*[@type='text'])[11]")
	WebElement employe_ctc;
	@FindBy(xpath="(//*[@type='text'])[12]")
	WebElement employe_week;
	@FindBy(xpath="(//*[@type='text'])[13]")
	WebElement employe_shift;
	@FindBy(xpath="(//*[@type='text'])[14]")
	WebElement employe_grade;
	@FindBy(xpath="(//*[text()='vani'])[1]")
	WebElement selectPerson;
	@FindBy(xpath="//*[text()='InActive']")
	WebElement inactive;
	@FindBy(xpath="(//*[@title='Set default password'])[1]")
	WebElement setpass;
	@FindBy(xpath="//*[text()='save']")
	WebElement set;
	@FindBy(xpath="(//*[@type='checkbox'])[3]")
	WebElement checkbox;
	@FindBy(xpath="(//*[text()='delete'])[1]")
	WebElement delete;
	@FindBy(xpath="//*[text()='Do you want to delete the selected record(s) from the list?']")
	WebElement confNote;
	@FindBy(xpath="(//*[text()='Delete'])[2]")
	WebElement acceptDelete;
	@FindBy(xpath="(//*[@type='text'])[3]")
	WebElement searchEmply;



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

	@Then("user Hover the right slidebar")
	public void user_Hover_the_right_slidebar() throws InterruptedException {
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(rightslider).perform();

	}

	@Then("user Click on General")
	public void user_Click_on_General() throws InterruptedException {
		Thread.sleep(3000);
		general.click();
	}

	@Then("user click on Badge code")
	public void user_click_on_Badge_code() {

		badgeCode.click();
	}

	@Then("user click on second  radio button")
	public void user_click_on_second_radio_button() throws InterruptedException {
		Thread.sleep(3000);
		radio.click();

	}

	@Then("user click on Individual reminder")
	public void user_click_on_Individual_reminder() {

		individual.click();
	}

	@Then("user click on Add and enter valide data")
	public void user_click_on_Add_and_enter_valide_data() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().refresh();
		addButton.click();
		date.sendKeys("20/07/2022");
		time.click();
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		//	    Thread.sleep(3000);
		//	    act.moveToElement(hours).build().perform();
		//	    act.click().build().perform();
		//	    hours.sendKeys(Keys.SHIFT.ARROW_UP.ENTER);
		//	    act.moveToElement(min).build().perform();
		//	    act.click().build().perform();
		//	    min.sendKeys(Keys.ARROW_DOWN.ARROW_DOWN.ENTER);
		done.click();

		client.sendKeys("IBM");
		Thread.sleep(3000);
		client.sendKeys(Keys.ENTER);
		reminderTask.sendKeys("its a reminder call");
		description.sendKeys("Its a call regards to your cmpy membership");
		act.click(selectRepeat).perform();
		selectRepeat.sendKeys(Keys.ARROW_DOWN.ARROW_DOWN.ENTER);
		act.click(notify).perform();
		notify.sendKeys(Keys.ARROW_DOWN.ARROW_DOWN.ENTER);

	}

	@Then("user click on save")
	public void user_click_on_save() throws InterruptedException {
		Thread.sleep(5000);
		saveButton.click();

	}

	@Then("user click on Registration Details")
	public void user_click_on_Registration_Details() {

		registration.click();
		//		driver.navigate().refresh();
	}

	@Then("user click on groupCompany and select unregistered company")
	public void user_click_on_groupCompany_and_select_unregistered_company() throws InterruptedException {
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.click(groupComp).perform();
		selectComp.click();

	}
	@Then("user click on Add")
	public void user_click_on_Add() {
		GSTaddButton.click();

	}

	@Then("user enter GSTIN")
	public void user_enter_GSTIN() throws InterruptedException {
		Thread.sleep(3000);
		gst.sendKeys("29AADCK8392KKKK");

	}

	@Then("user click on Save Button")
	public void user_click_on_Save_Button()  {
		gstSaveButton.click();	 
	}

	@Then("user click on groupCompany and select Registered company")
	public void user_click_on_groupCompany_and_select_Registered_company() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().refresh();
		Actions act = new Actions(driver);
		act.click(groupComp).perform();
		selectComp.click();
	}

	@Then("user click on Bank Details")
	public void user_click_on_Bank_Details() throws InterruptedException {
		Thread.sleep(2000);
		bank.click();
	}

	@Then("user click on addButton and Enter all the madantory flieds")
	public void user_click_on_addButton_and_Enter_all_the_madantory_flieds() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().refresh();
		addBank.click();
		bankName.sendKeys("HDFC");
		bankBranch.sendKeys("HYD");
		bankIFSC.sendKeys("HDFC0004277");
		acNumber.sendKeys("123456789123");		
	}

	@Then("user click on save Bank Details")
	public void user_click_on_save_Bank_Details() {

		bankSaveButton.click();
	}

	@Then("user click on addButton")
	public void user_click_on_addButton() {
		driver.navigate().refresh();
		addBank.click();

	}

	@Then("Enter madantory flieds by skipping any one")
	public void enter_madantory_flieds_by_skipping_any_one() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		bankName.sendKeys("HDFC");
		bankBranch.sendKeys("HYD");
		bankIFSC.sendKeys("HDFC0004277");

	}

	@Then("user click on save Bank Details by skipping one mandatory field")
	public void user_click_on_save_Bank_Details_by_skipping_one_mandatory_field() throws InterruptedException {

		System.out.println("user not able to Save");
	}

	@Then("Enter madantory flieds with IFSC code lessthan {int}")
	public void enter_madantory_flieds_with_IFSC_code_lessthan(Integer int1) {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		addBank.click();
		bankName.sendKeys("HDFC");
		bankBranch.sendKeys("HYD");
		bankIFSC.sendKeys("HDFC000427");
		acNumber.sendKeys("123456789123");		
	}

	@Then("user click on save Bank Details with IFSC code lessthan {int}")
	public void user_click_on_save_Bank_Details_with_IFSC_code_lessthan(Integer int1) throws InterruptedException {

		String act = ifsc.getText();
		System.out.println(act);
	}

	@Then("user Click on employee from Slider")
	public void user_Click_on_employee_from_Slider() throws InterruptedException {

		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(rightslider).perform();	
		employee.click();
	}


	@Then("user click on grade")
	public void user_click_on_grade() {
		grade.click();
	}

	@Then("user click on add Button and again click on existing add button")
	public void user_click_on_add_Button_and_again_click_on_existing_add_button() throws InterruptedException {

		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", addGrade);
		Thread.sleep(3000);
		exstingGrade.click();

	}

	@Then("user enter mandatory fields")
	public void user_enter_mandatory_fields() throws InterruptedException {
		Thread.sleep(3000);
		gradeName.sendKeys("Fisrt");
		descrip.sendKeys("kavya123");

	}

	@Then("user click on Grade Save Button")
	public void user_click_on_Grade_Save_Button() {
		gradeSave.click();
	}
	@Then("user enter mandatory fields with invalid")
	public void user_enter_mandatory_fields_with_invalid() throws InterruptedException {
		Thread.sleep(3000);
		gradeName.sendKeys("Fisrt123");
		descrip.sendKeys("kavya123");
		String msg = message2.getText();
		System.out.println(msg);
	}
	@Then("user click on Cancel button")
	public void user_click_on_Cancel_button() throws InterruptedException {
		Thread.sleep(3000);
		gradeCancel.click();
	}

	@Then("user click on add Button")
	public void user_click_on_add_Button() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", addGrade);
	}

	@Then("user click on filter")
	public void user_click_on_filter() throws InterruptedException {
		Thread.sleep(3000);
		gradeColoumn.sendKeys("Nam"+Keys.ENTER);
		System.out.println("record found");
	}

	@Then("user enter existing grade")
	public void user_enter_existing_grade() {
		gradeSearch.sendKeys("FIRST");
	}

	@Then("user enter without existing grade")
	public void user_enter_without_existing_grade() {
		gradeSearch.sendKeys("KAVYA");
		String msg = message1.getText();
		System.out.println(msg);
	}

	@Then("user click on edit button")
	public void user_click_on_edit_button() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", editFirst);
		System.out.println("edit page will be disply");
	}

	@Then("user Click on fliter column select ALL  from dropdown")
	public void user_Click_on_fliter_column_select_ALL_from_dropdown() throws InterruptedException {

		Thread.sleep(3000);
		gradeColoumn.sendKeys("Al"+Keys.ENTER);
	}

	@Then("Enter exisiting Type in search box")
	public void enter_exisiting_Type_in_search_box() {
		gradeSearch.sendKeys("FIRST");
		String msg = message1.getText();
		System.out.println(msg);
	}

	@Then("user click on employee list")
	public void user_click_on_employee_list() throws InterruptedException {

		employeelist.click();
	}

	@Then("user Select company from dropdown")
	public void user_Select_company_from_dropdown() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", employeAddButton);
		executor.executeScript("arguments[0].click();", employee_selectComp);
		employee_selectComp.sendKeys("van"+Keys.ENTER);
		employee_badgeCode.sendKeys("vani1");

	}

	@Then("user add the mandatory filed")
	public void user_add_the_mandatory_filed() throws InterruptedException {
		employee_firstName.sendKeys("Kavya");
		employee_middleName.sendKeys("B");
		employee_lastName.sendKeys("Kavya");
		employee_gender.sendKeys("fema"+Keys.ENTER);
		employee_dob_act.sendKeys("19/08/1995");
		employee_dob_off.sendKeys("19/08/1995");
		employee_doj.sendKeys("01/07/2022");
		employee_email.sendKeys("kavya12345@gmail.com");
		Thread.sleep(2000);
		employee_mbl.click();
		employee_mbl.sendKeys("9000090000");

	}

	@Then("user switch to company related")
	public void user_switch_to_company_related() throws InterruptedException {
		Thread.sleep(3000);
		comprelated.click();
	}

	@Then("user add all the company related mandatory fields")
	public void user_add_all_the_company_related_mandatory_fields() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		employee_location.sendKeys("Hyderab"+Keys.ENTER);
		employee_depart.sendKeys("HR"+Keys.ENTER);
		employee_design.sendKeys("AGM"+Keys.ENTER);
		emply_report.sendKeys("Yes"+Keys.ENTER);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", employ_reportAuthor);
		Thread.sleep(2000);
		employ_reportAuthor.sendKeys("van"+Keys.ENTER);
		employe_ctc.sendKeys("800000");
		executor.executeScript("arguments[0].click();", employe_week);
		employe_week.sendKeys("Partial"+Keys.ENTER);
		employe_shift.sendKeys("A"+Keys.ENTER);
		employe_grade.sendKeys("Vani"+Keys.ENTER);	    
	}

	@Then("user click on Inactive icon")
	public void user_click_on_Inactive_icon() throws InterruptedException {
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.click(groupComp).perform();
		selectComp.click();
		selectPerson.sendKeys("van"+Keys.ENTER);
		Thread.sleep(3000);
		inactive.click();
	}

	@Then("user click on Green color icon")
	public void user_click_on_Green_color_icon() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", setpass);
	}

	@Then("user click on set")
	public void user_click_on_set() throws InterruptedException {
		Thread.sleep(3000);
		set.click();

	}

	@Then("user click on check box from the list")
	public void user_click_on_check_box_from_the_list() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		act.click(groupComp).perform();
		selectComp.click();
		selectPerson.sendKeys("van"+Keys.ENTER);
		Thread.sleep(3000);		
		checkbox.click();
	}

	@Then("user click on delete from the list")
	public void user_click_on_delete_from_the_list() throws InterruptedException {
		Thread.sleep(2000);
		delete.click();
	}

	@Then("user click on delete option for confirmation")
	public void user_click_on_delete_option_for_confirmation() throws InterruptedException {
		String msg = confNote.getText();
		System.out.println(msg);
		Thread.sleep(2000);
		acceptDelete.click();
	}
	
	@Then("user Search an exisiting employee")
	public void user_Search_an_exisiting_employee() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		act.click(groupComp).perform();
		selectComp.click();
		selectPerson.sendKeys("van"+Keys.ENTER);
		Thread.sleep(5000);
		searchEmply.sendKeys("vanisreereddy44@gmail.com");

	}

	@Then("user Quit from the site")
	public void user_Quit_from_the_site() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
