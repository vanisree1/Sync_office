package Cloud_Pages;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Add_more_options {
	public WebDriver driver;
	public String random_name = Utilities_class.randomalphabet(5);
	public String random_Second_name = Utilities_class.randomalphabet(5);
	public String middle_name = Utilities_class.randomalphabet(5);
	public String number = Utilities_class.randomnemeric(3);
	public String mobilenumber = Utilities_class.randomnemeric(10);

	public Add_more_options(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "    //*[text()=\"person\"]\n")
	WebElement emp_tab;
	//*[text()="developer_board"]
	//  (//*[text()="keyboard_arrow_right"])
	@FindBy(xpath = "//*[text()=\"more_vert\"]")
	WebElement more;
	@FindBy(xpath = "//*[text()=\"Roles and Permission\"]")
	WebElement roles_and_permission;
	@FindBy(xpath = "//*[text()=\"Employee to Company\"]")
	WebElement employee_to_company;
	@FindBy(xpath = "//*[text()=\"Add Employee\"]")
	WebElement add_emp;
	@FindBy(xpath = "(//*[@type=\"text\"])[4]")
	WebElement firstclass;
	@FindBy(xpath = "(//*[@type=\"text\"])[5]")
	WebElement middile;
	@FindBy(xpath = "(//*[@type=\"text\"])[6]")
	WebElement last_name;
	@FindBy(xpath = "(//*[@type=\"text\"])[3]")
	WebElement code;
	@FindBy(xpath = "(//*[@type=\"text\"])[11]")
	WebElement mail;
	@FindBy(xpath = "(//*[@type=\"tel\"])[1]")
	WebElement phone;
	@FindBy(xpath = "//select[@class=\"react-datepicker__year-select\"]")
	WebElement DOb;
	@FindBy(xpath = "(//*[@type=\"text\"])[8]")
	WebElement DOB;
	@FindBy(xpath = "(//*[text()=\"2\"])")
	WebElement date_2;
	@FindBy(xpath = "(//*[@type=\"text\"])[7]")
	WebElement dob_official;
	@FindBy(xpath = "(//*[text()=\"5\"])")
	WebElement date_3;
	@FindBy(xpath = "(//*[@type=\"text\"])[8]")
	WebElement dob_actual;
	@FindBy(xpath = "(//*[@type=\"text\"])[9]")
	WebElement dob_joining;
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[1]/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div[1]/div[2]/div/div[2]/div")
	WebElement select;
	@FindBy(xpath = "//*[@id=\"scrollable-force-tabpanel-1\"]/div/div/div/div[1]/div/div/div[1]/div[1]/div[2]/div/div[1]")
	WebElement selct_location;
	@FindBy(xpath = "//*[@id=\"scrollable-force-tabpanel-1\"]/div/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div[1]")
	WebElement select_dept;
	@FindBy(xpath = "//*[text()=\"2000\"]")
	WebElement selct_desi;
	@FindBy(xpath = "//*[text()=\"2000\"]")
	WebElement offial_2000;
	@FindBy(xpath = "//*[text()=\"Female\"]")
	WebElement female;
	@FindBy(xpath = "(//*[text()=\"N F S Most Wanted\"])[3]")
	WebElement grp_company;
	@FindBy(xpath="//*[text()=\"Company Related\"]")
	WebElement Company_Related;
	@FindBy(xpath="(//*[text()=\"Head Office\"])[3]")
	WebElement location;
	@FindBy(xpath="(//*[text()=\"Administration\"])[3]")
	WebElement department;
	@FindBy(xpath="(//*[text()=\"Managing Director\"])")
	WebElement designation;
	@FindBy(xpath="(//*[text()=\"Yes\"])")
	WebElement reporting;
	@FindBy(xpath="(//*[text()=\"Select All\"])")
	WebElement repoting_auth;
	@FindBy(xpath="(//Select[@class=\"mdc-select__native-control customFieldText py-0\"])[9]")
	WebElement shift;
	@FindBy(xpath="(//Select[@class=\"mdc-select__native-control customFieldText py-0\"])[10]")
	WebElement grade;
	//*[text()="person"]
	@FindBy(xpath = "(//*[@type=\"text\"])[2]")
	WebElement search;
	@FindBy(xpath = "(//*[text()=\"save\"])[2]")
	WebElement save;
	@FindBy(xpath = "(//*[@type=\"checkbox\"])[3]")
	WebElement all_employee;
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div/div/div[2]/div[1]/div/div/div[2]/div[1]/div/span/span/span[1]/input")
	WebElement all_company;
	@FindBy(xpath = "//body/div[9]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]/input[1]")
	WebElement all_company1;
	@FindBy(xpath = "(//*[text()=\"Download\"])[2]")
	WebElement download;
	@FindBy(xpath = "(//*[text()=\"Submit\"])")
	WebElement submit;
	@FindBy(xpath = "(//*[text()=\"save\"])[2]")
	WebElement saves;
	@FindBy(xpath = "    //*[text()=\"Roles and Permission\"]\n")
	WebElement roles;
	@FindBy(xpath = "//*[text()='Submit']")
	WebElement submit_button_emp;
	
	public void more(){
		more.click();
	}

	public void emp_to_cmp() throws InterruptedException {
		// more.click();
		Thread.sleep(4000);

		employee_to_company.click();
		Thread.sleep(4000);
		download.click();
		//  Thread.sleep(4000);


		//  Actions ac=new Actions(driver);
		// ac.doubleClick(all_employee).build().perform();
		// all_employee.click();
		Thread.sleep(4000);
		all_employee.click();
		Thread.sleep(4000);

		all_company.click();
		Thread.sleep(4000);

		//   all_company.click();Thread.sleep(4000);




		submit.click();
		Thread.sleep(4000);

	}

	public void setEmp_tab( ) throws InterruptedException {
		Thread.sleep(4000);
		//more.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		add_emp.click();
		Thread.sleep(4000);

		//select.click();
		Thread.sleep(4000);

		//grp_company.click();
		Thread.sleep(4000);

		code.sendKeys(number);
		Thread.sleep(4000);

		firstclass.sendKeys(random_name);
		Thread.sleep(4000);

		middile.sendKeys(random_Second_name);
		Thread.sleep(4000);

		last_name.sendKeys(middle_name);
		Thread.sleep(4000);

		mail.sendKeys(random_name+"@gmail.com");
		Thread.sleep(4000);
		//ISD.sendKeys("91");
		Thread.sleep(2000);
		phone.click();
		Thread.sleep(5000);

		phone.sendKeys(mobilenumber);

		select.click();
		Thread.sleep(2000);

		female.click();
		//    Select sc=new Select(DOB);
		//   sc.selectByVisibleText("2000");
		Thread.sleep(4000);

		DOB.sendKeys("01/01/1900");
		Thread.sleep(5000);
		//   Select sc=new Select(DOb);
		// sc.selectByVisibleText("2000");
		//  offical_2020.click();
		Thread.sleep(5000);
		// date_2.click();

		Thread.sleep(5000);
		dob_actual.sendKeys("01/01/1900");
		Thread.sleep(5000);
		dob_joining.sendKeys("01/01/2021");        
		Thread.sleep(3000);
		Company_Related.click();
		Thread.sleep(3000);

		select.click();
		Thread.sleep(3000);

		location.click();
		Thread.sleep(3000);

		select.click();
		department.click();
		Thread.sleep(3000);

		select.click();
		Thread.sleep(3000);


		designation.click();
		select.click();
		Thread.sleep(3000);

		reporting.click();
		select.click();
		Thread.sleep(3000);

		repoting_auth.click();

		save.click();
		Thread.sleep(5000);

		//  box.click();
		//*[@type="checkbox"]



	}


	public void setRole() {

		roles.click();
		System.out.println("Click on Roles and permission");

	}

	public void setGo() throws InterruptedException {
		Actions actions =new Actions(driver);
		// WebElement closeMenuOption = driver.findElement(By.xpath("//*[text()=\"Company\"]"));
		//actions.moveToElement(closeMenuOption).perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Go')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//*[@type=\"text\"])[5]")).sendKeys("sarika");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[ @type=\"checkbox\"])[2]")).click();
		Thread.sleep(2000);

		submit_button_emp.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Go')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//*[@type=\"text\"])[5]")).sendKeys("sarika");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//*[ @type=\"checkbox\"])[10]")).click();
		Thread.sleep(2000);
		submit_button_emp.click();
		String[] st={"#0000ff","#008000","#FF7043"};
		String[] st1={"Read","Write","Admin"};
		int[] count ={1,2,3};
		for(int i=0;i<3;i++) {
			Thread.sleep(5000);

		}

	}



}
