package Admin_Panel_stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utilities.Utilities_class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Admin_Stepdef extends Utilities_class
	{	
		WebDriver driver;
		String randoms  = RandomAlphaNumeric.generateRandam(8);
		String values = RandomAlphaNumeric.numeric(6);
		String alphabets = RandomAlphaNumeric.alpha(5); 

		public Admin_Stepdef()
		{
			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//input[@id='username']")
		WebElement userName;
		@FindBy(xpath = "//input[@id='password']")
		WebElement pass;
		@FindBy(xpath = "//div[@type='button']")
		WebElement login;
		@FindBy(xpath="//a[@href='customer.php']")
		WebElement licence;
		@FindBy(xpath="//*[text()='Admin Panel ']")
		WebElement admin_Panel;
		@FindBy(xpath="//a[@href='addcustomer.php']")
		WebElement add_licence;
		@FindBy(xpath="//select[@id='licence_type']")
		WebElement licenceType;
		@FindBy(xpath="//input[@id='licencee_name']")
		WebElement licencee_Name;
		@FindBy(xpath="//input[@id='contact_person']")
		WebElement firstname;
		@FindBy(xpath="//input[@id='lastname']")
		WebElement lastname;
		@FindBy(xpath="//input[@value='Male']")
		WebElement gender;
		@FindBy(xpath="//input[@id='dob']")
		WebElement dob;
		@FindBy(xpath="//input[@id='incorporation_date']")
		WebElement incorp_Date;
		@FindBy(xpath="//input[@id='email']")
		WebElement email;
		@FindBy(xpath="//*[@id='address']")
		WebElement address;
		@FindBy(xpath="//*[@id='pincode']")
		WebElement pincode;
		@FindBy(xpath="//*[@id='city']")
		WebElement city;
		@FindBy(xpath="//*[@id='state']")
		WebElement state;
		@FindBy(xpath="//*[@id='country']")
		WebElement country;
		@FindBy(xpath="//*[@id='mobile_num']")
		WebElement mobile_Number;
		@FindBy(xpath="//*[@id='landline_no']")
		WebElement landline_No;
		@FindBy(xpath="//*[@id='pan']")
		WebElement pan;
		@FindBy(xpath="//*[@id='tin']")
		WebElement tan;
		@FindBy(xpath="//*[@id='recruitment']") 
		WebElement candy_recruitment;
		@FindBy(xpath="//*[@id='job']")
		WebElement candy_job;
		@FindBy(xpath="//*[@id='payment_type']")
		WebElement Payment_Type;
		@FindBy(xpath="(//*[@href='javascript:void(0)'])[4]") 
		WebElement submit;
		@FindBy(xpath="//select[@id='package_recruitment']")
		WebElement candy_package;
		@FindBy(xpath="//select[@id='package_job']")
		WebElement candy_Job_Package;
		@FindBy(xpath="//input[@id='no_users_recruitment']")
		WebElement candy_no_of_users;
		@FindBy(xpath="//select[@id='duration_recruitment']")
		WebElement candy_duration;
		@FindBy(xpath="//input[@id='from_date_recruitment']")
		WebElement candy_from_date;
		@FindBy(xpath="//input[@id='per_order_date']")
		WebElement po_Date;
		@FindBy(xpath="//input[@id='per_order_number']")
		WebElement po_No;
		@FindBy(xpath="//input[@id='paid_amount']")
		WebElement Paid_amount;
		@FindBy(xpath="//input[@id='payment_ref']")
		WebElement Payment_Ref;
		@FindBy(xpath="//textarea[@id='remarks']")
		WebElement Remarks;
		@FindBy(xpath="//input[@id='timesheet_lock']")
		WebElement timesheet_lock;
		@FindBy(xpath="//*[text()='View Active Records']")
		WebElement View_Active_Records;
		@FindBy(xpath="(//*[@class='btn btn-success btn-xs'])[1]")
		WebElement activate;
		@FindBy(xpath="(//*[@type='button'])[1]")
		WebElement ok_Button;
		@FindBy(xpath="(//*[@type='button'])[8]")
		WebElement remainder_Button;


		/*
		-----------------------------------------------------------------------------------------------------------------------------------------
		 ******************************************************************************************************************************************
		------------------------------------------------------------------------------------------------------------------------------------------
		 */

		@Given("open the browser and enter the url {string}")
		public void open_the_browser_and_enter_the_url(String string) {
			driver.manage().window().maximize();
			driver.get(string);    
		}

		@Given("Enter valid ursername {string} and Enter the valid pwd {string}")
		public void enter_valid_ursername_and_Enter_the_valid_pwd(String string, String string2) {
			userName.sendKeys(string);
			pass.sendKeys(string2);	    
		}

		@Then("click on login")
		public void click_on_login() throws InterruptedException {
			login.click();
			Thread.sleep(3000);
			//		driver.quit();
		}

		/*
		-----------------------------------------------------------------------------------------------------------------------------------------
		 ******************************************************************************************************************************************
		------------------------------------------------------------------------------------------------------------------------------------------
		 */

		@Then("user_Click licencee")
		public void user_click_licencee() throws InterruptedException {
			Thread.sleep(3000);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", licence);

		}

		@Then("click on Add licencee option")
		public void click_on_Add_licencee_option() throws InterruptedException {
			Thread.sleep(3000);
			add_licence.click();
			//	    System.out.println(Add_licence);

		}

		@Then("user_Select licence type")
		public void user_select_licence_type() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Select s = new Select(licenceType);
			s.selectByValue("2");
			licencee_Name.sendKeys(randoms);
			firstname.sendKeys(randoms);

			lastname.sendKeys(randoms);

			gender.click();

			dob.sendKeys("10-12-2000");

			incorp_Date.sendKeys("09-12-2022");

			incorp_Date.sendKeys(Keys.ESCAPE);

			email.sendKeys(randoms+"@gmail.com");

			address.sendKeys(randoms);

			pincode.sendKeys(values);

			city.sendKeys(alphabets);

			state.sendKeys(alphabets);

			country.sendKeys("india");

			mobile_Number.sendKeys(values+"8862");

			landline_No.sendKeys(values);

			pan.sendKeys(randoms);

			tan.sendKeys(randoms);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", candy_recruitment);
			
			Select s2 = new Select(candy_package);

			s2.selectByIndex(1);

			candy_no_of_users.sendKeys("5");

			Select s3 = new Select(candy_duration);
			s3.selectByIndex(2);
			candy_from_date.sendKeys(Keys.PAGE_DOWN);
			candy_from_date.sendKeys("01-01-2023");
			candy_from_date.sendKeys(Keys.ESCAPE);

			//				po_Date.sendKeys("10-10-2000");
			//				po_Date.sendKeys(Keys.ESCAPE);
			//				po_No.sendKeys("456");
			//				Paid_amount.sendKeys("10000");
			candy_from_date.sendKeys(Keys.PAGE_DOWN);
			Select s1 = new Select(Payment_Type);
			s1.selectByIndex(1);
			Thread.sleep(2000);


		}

		@Then("user_Click_Submit")
		public void user_click_submit() throws InterruptedException {

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", submit);
			email.sendKeys(Keys.PAGE_UP);
			Thread.sleep(8000);


		}
		@Then("user_click_view in active recoreds")
		public void user_click_view_in_active_recoreds() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			licence.click();
			Thread.sleep(2000);
			View_Active_Records.click();

		}

		@Then("user Click on the active button")
		public void user_Click_on_the_active_button() throws InterruptedException {
			try
			{
				Thread.sleep(3000);
				activate.click();
			}
			catch (Exception e) {

				System.out.println("No data found");
				driver.quit();
			}


		}

		@Then("click on ok")
		public void click_on_ok() throws InterruptedException {
			ok_Button.click();
			remainder_Button.click();
			Thread.sleep(8000);
//			driver.quit();
		}

		/*
		-----------------------------------------------------------------------------------------------------------------------------------------
		 ******************************************************************************************************************************************
		------------------------------------------------------------------------------------------------------------------------------------------
		 */
		@Then("user_Select licence type\\(Trail)")
		public void user_select_licence_type_Trail() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Select s = new Select(licenceType);
			s.selectByValue("1");	
			Thread.sleep(3000);
		}

		@Then("enter Basic data")
		public void enter_Basic_data() throws InterruptedException {
			licencee_Name.sendKeys(alphabets);
			firstname.sendKeys(alphabets);
			lastname.sendKeys(alphabets);
			gender.click();
			dob.sendKeys("01-10-1995");
			incorp_Date.sendKeys("01-12-2000");
			incorp_Date.sendKeys(Keys.ESCAPE);
			email.sendKeys(randoms+"@gmail.com");
			address.sendKeys(randoms);
			pincode.sendKeys(values);
			city.sendKeys(alphabets);
			state.sendKeys(alphabets);
			country.sendKeys("INDIA");
			mobile_Number.sendKeys(values+"4567");
			landline_No.sendKeys(values);
			submit.click();
			Thread.sleep(5000);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", licence);
			Thread.sleep(2000);
			View_Active_Records.click();
			try
			                                                                                                                                                                                                           
			{
				Thread.sleep(3000);
				activate.click();
			}
			catch (Exception e) {

				System.out.println("No data found");
				driver.quit();
			}

			ok_Button.click();
			remainder_Button.click();
			Thread.sleep(8000);
			System.out.println("Successfully excute");
			
		}
	}


