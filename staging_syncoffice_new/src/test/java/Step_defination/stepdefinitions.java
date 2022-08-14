 package Step_defination;

import ADMIN_PANEL_page.Add_Trial_Licencee;
import ADMIN_PANEL_page.To_Create_Package;
import Account_Reconciliation_page.*;
import Clock_module_page.Add_Timesheet.Add_Client_in_clockList;
import Clock_module_page.Add_Timesheet.Add_TimeSheet_Entry_Work_Day;
import Clock_module_page.Add_Timesheet.Add_Timesheet_on_clock_module;
import Clock_module_page.Add_Timesheet.Manage_lock_and_unlock;
import Cloud_Pages.*;

import Master_GuestUser_page.*;
import Master_Roles_and_Permission_Page.*;
import Password_manager.*;
import Report_modules_page.Bank_Details_on_Report;
import Report_modules_page.Company_location_on_Report;
import Utilities.Utilities_class;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

 public class stepdefinitions extends Utilities_class {
//String pc=Utilities_class.current_date();
     String doc1 = Utilities_class.randomalphabet(4);

     public WebDriver driver;
     public Upload_file up_file;
     public Account_Recs_page recsPage;
     public Add_Emplyee_list_page emp_list;
     public Bank_Details bank_detals;
     public To_Email_Selected_file email_file;
     public To_preview preview;
     public To_move_folder_single single_folder;
     public Guest_user_page Guest;
     public Add_more_options more;
     public test1_page page;
     public Move_Multiple_folder multiple_folder;
     public To_Request_and_Assignment_to_the_Company assign_company;
     public To_see_Request_made_bt_logged_emp dlt_request;
     public Advance_Search ad_search;
     public Employee_to_company_page emp;
     public Register_variable_data_page lp;
     public Reco_status_page Reco;
     public Global_Gl_upload_file_page global_file;
     public Cost_Center_upload_file bulkcost;
     public Management_entity_page entity;
     public Cloud_folder Cloud;
     public Right_folder_function right_folder;
     public Folder_Rename_Delete f_r_d;
     public To_paste_any_copy_data_page paste;
     public Request_log_of_folder_and_to_Approve_page log;
     public To_Set_the_Limit_to_the_employee_to_Download_and_Upload limit;
     public To_Download_the_file_page dwn_file;
     public Gl_category gl;
     public Cloud_move_file_location move;
     public Download_Reco_Status reco_bulk;
     public Gl_account_Upload_file bulk;
     public Employee_permission Roles;
     public Guest_permission_page pages;
     public Assign_Guest_user_page Assign_Guest;
     public Client_to_staff staff;
     public Staff_permission permission;
     public Gl_account_page Gl_page;
     public sub_GL_account sub_Gl;
     public EMP_Account_Reconcilation emp_role;
     public Cost_center_page cost;
     public Score_page score;
public example_page sarika;
     public Add_password_on_myPassword add_password;
     public Trial_balance_impoter trial;
     public Gl_Category_upload_file bulk_category;
     public Download_Score scoredata;
     public Auto_delete_file auto_dlt;
     public Upload_file_Sub_glaccount upload_subgl;
     //public static Logger log;
     public Cloud_copy_file copy_file;
     public Add_location_for_client add_location;
     public Add_designation add_dec;
     public Bank_Details_on_Report clock_report;
     public My_password myPassword ;
     private static final String CHROMEDRIVER_EXE = "chromedriver.exe";
public Global_GL_page Global;
public Import_File_page Import_file;
public Company_location_on_Report report_company_location;
     public Cloud_move_file_location move_file;
     public Add_Timesheet_on_clock_module time_sheet_clock;
     public Employee_upload_file_RC emp_upload;
public Company_location_page cmp_loc;

public Add_Company_Group password_company;
public Individual_Reminder_page individual_re;
public Group_Reminder_page grb_reminder;
public Add_Department dept_master;
public Import_file_company importfile_com;
public Add_location_for_company add_company_loaction;
public Add_location_for_client add_client_loc_pm;
public Add_Employees_in_password_manager add_emp_passwordManager;
public Password_Share_and_download pawssword_share;
public Password_share_and_download_in_company share_password_company;
public Add_client_in_password_manager add_clint_pm;
public import_file_Client file_client;
public Add_client_in_master_module add_client_master;
public Import_file_in_emp_module export_file_emp;
public Manage_lock_and_unlock manage_lock;
public Add_Client_in_clockList add_client_clock;
public Add_TimeSheet_Entry_Work_Day workDay;
public Add_Trial_Licencee add_trial_licencee;
public To_Create_Package package_create;

public Download_EXCEL_AND_PDF_FILE_For_all_master_features excel_pdf;
public Employee_Transfer_page Employee_Transfer;
     private static WebDriver REAL_DRIVER = null;

     // static Logger log = Logger.getLogger(Master_stepdefinition.class.getName());


     
     //...........................................................................................................
//............................Register Varible data..(Client)......................................................
//............................................................................................................
     @Before
     public void start() throws InterruptedException {

         System.out.println("start the browser");
         Thread.sleep(3000);

     }
@After
public void close()
{  //driver.close();
   //driver.quit();
}


     @Given("I launch chrome browser")
     public void i_launch_chrome_browser() throws InterruptedException {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanis\\Projects\\candyautomationscripts\\staging_syncoffice_new\\webdrivers\\chromedriver.exe");
     //   driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
         options.addArguments("start-maximized"); // open Browser in maximized mode
         options.addArguments("disable-infobars"); // disabling infobars
         options.addArguments("--disable-extensions"); // disabling extensions
         options.addArguments("--disable-gpu"); // applicable to windows os only
         options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
         options.addArguments("--no-sandbox"); // Bypass OS security model
       // options.addArguments("--headless");

         driver = new ChromeDriver(options);
recsPage=new Account_Recs_page(driver);
         add_trial_licencee=new Add_Trial_Licencee(driver);
         Employee_Transfer=new Employee_Transfer_page(driver);
         add_clint_pm=new Add_client_in_password_manager(driver);
         add_dec=new Add_designation(driver);
         Import_file= new Import_File_page(driver);
         excel_pdf=new Download_EXCEL_AND_PDF_FILE_For_all_master_features(driver);
         export_file_emp=new Import_file_in_emp_module(driver);
         add_emp_passwordManager =new Add_Employees_in_password_manager(driver);
         password_company=new Add_Company_Group(driver);
         grb_reminder=new Group_Reminder_page(driver);
         emp_list= new Add_Emplyee_list_page(driver);
         dept_master=new Add_Department(driver);
         package_create=new To_Create_Package(driver);
         workDay=new Add_TimeSheet_Entry_Work_Day(driver);
manage_lock=new Manage_lock_and_unlock(driver);
clock_report=new Bank_Details_on_Report(driver);
multiple_folder =new Move_Multiple_folder(driver);
         add_client_clock=new Add_Client_in_clockList(driver);
         add_client_master=new Add_client_in_master_module(driver);
         individual_re=new Individual_Reminder_page(driver);
        bank_detals=new Bank_Details(driver);
        sarika=new example_page(driver);
        importfile_com=new Import_file_company(driver);
        upload_subgl=new Upload_file_Sub_glaccount(driver);
         cmp_loc=new Company_location_page(driver);
         Global=new Global_GL_page(driver);
         add_company_loaction=new Add_location_for_company(driver);
         Reco = new Reco_status_page(driver);
         report_company_location=new Company_location_on_Report(driver);
         file_client=new import_file_Client(driver);
add_client_loc_pm=new Add_location_for_client(driver);
         add_location=new Add_location_for_client(driver);
pawssword_share=new Password_Share_and_download(driver);
         email_file=new To_Email_Selected_file(driver);
         dwn_file = new To_Download_the_file_page(driver);
         copy_file = new Cloud_copy_file(driver);
         ad_search = new Advance_Search(driver);
         preview=new To_preview(driver);
         right_folder=new Right_folder_function(driver);
         move = new Cloud_move_file_location(driver);
         up_file = new Upload_file(driver);
         myPassword=new My_password(driver);
         time_sheet_clock=new Add_Timesheet_on_clock_module(driver);
         global_file=new Global_Gl_upload_file_page(driver);
         paste = new To_paste_any_copy_data_page(driver);
         log = new Request_log_of_folder_and_to_Approve_page(driver);
         emp_upload = new Employee_upload_file_RC(driver);
         bulkcost = new Cost_Center_upload_file(driver);
         gl = new Gl_category(driver);
share_password_company=new Password_share_and_download_in_company(driver);
         emp_role = new EMP_Account_Reconcilation(driver);
         scoredata = new Download_Score(driver);
         Guest = new Guest_user_page(driver);
         single_folder=new To_move_folder_single(driver);
         assign_company=new To_Request_and_Assignment_to_the_Company(driver);
         auto_dlt = new Auto_delete_file(driver);
         pages = new Guest_permission_page(driver);
         reco_bulk = new Download_Reco_Status(driver);
         emp = new Employee_to_company_page(driver);
         Roles = new Employee_permission(driver);
         staff = new Client_to_staff(driver);
         Gl_page = new Gl_account_page(driver);
         score = new Score_page(driver);
         move_file = new Cloud_move_file_location(driver);
         bulk_category = new Gl_Category_upload_file(driver);
         trial = new Trial_balance_impoter(driver);
         permission = new Staff_permission(driver);
         lp = new Register_variable_data_page(driver);
         Assign_Guest = new Assign_Guest_user_page(driver);
         Cloud = new Cloud_folder(driver);
         dlt_request=new To_see_Request_made_bt_logged_emp(driver);
         sub_Gl = new sub_GL_account(driver);
         cost = new Cost_center_page(driver);
      add_password  = new Add_password_on_myPassword(driver);
         bulk = new Gl_account_Upload_file(driver);
         limit = new To_Set_the_Limit_to_the_employee_to_Download_and_Upload(driver);
         entity = new Management_entity_page(driver);
         f_r_d = new Folder_Rename_Delete(driver);
         more=new Add_more_options(driver);
         page=new test1_page(driver);
         System.out.println("launch google page");
         driver.manage().window().maximize();
     }





     @When("I open Url {string}")
     public void i_open_Url(String string) throws InterruptedException, IOException {
         //         lp = new Register_variable_data_page(driver);
         driver.get(string);
         System.out.println("launch the url");
         // junitWriter.write("sarika mishra");

     }

     @Then("I Click on login button")
     public void i_Click_on_login_button() throws InterruptedException {
          Thread.sleep(3000);
         lp.set();
         Assert.assertEquals("SyncOffice", driver.getTitle());
         System.out.println("Successfully Syncoffice URL launched");
         // log.info("Successfully Syncoffice URL launched");
         Thread.sleep(2000);
     }

     @Then("I enter UserName {string} And Password {string}")
     public void i_enter_UserName_And_Password(String email, String password) throws InterruptedException {
         //Thread.sleep(8000);

         lp.setusername(email);
         Thread.sleep(2000);
         lp.Setpassword(password);
         Thread.sleep(5000);

     }

     @Then("I Click on Login")
     public void i_Click_on_Login() throws InterruptedException {
         lp.setLogin_button();
        // Assert.assertEquals("SyncOffice", driver.getTitle());
         System.out.println("");
         Thread.sleep(6000);

      //   driver.findElement(By.xpath("(//*[@type=\"radio\"])[1]")).click();
         Thread.sleep(4000);

       //  driver.findElement(By.xpath("//*[text()=\"save\"]")).click();
       //  Thread.sleep(8000);

     }

     @Then("Click on masters")
     public void click_on_masters() throws InterruptedException {
         Thread.sleep(3000);

         lp.setMaster();
         //log.info("Click on masters");
         Thread.sleep(2000);
     }

     @Then("click on client should open list")
     public void click_on_client_should_open_list() throws InterruptedException {
         Thread.sleep(3000);
        lp.setMouse_over_clint();
         System.out.println("click on client should open list");
         Thread.sleep(2000);
     }

     @Then("click  on Register Varible data")
     public void click_on_Register_Varible_data() throws InterruptedException {
         Thread.sleep(4000);
         //lp.setClint();
         Thread.sleep(2000);
         lp.setRegister();
         System.out.println("click  on Register Varible data");
         Thread.sleep(2000);

     }

     @Then("page {string} should display")
     public void page_should_display(String string) throws InterruptedException {
         Thread.sleep(3000);
         Actions actions = new Actions(driver);
       //  WebElement closeMenuOption = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div/div/div[1]/div[2]"));
        // actions.moveToElement(closeMenuOption).perform();
         System.out.println("page_should_display");
         Thread.sleep(2000);
     }

     @Then("Click on Add button on Register Varible data")
     public void click_on_Add_button_on_Register_Varible_data() throws InterruptedException {
         Thread.sleep(2000);
         lp.setAdd_register();
         System.out.println("Click on Add button on Register Varible data");

     }

     @Then("Registraion value data")
     public void registraion_value_data() throws InterruptedException {
         lp.setRegisteration_value(doc1);
         System.out.println("Registraion value data");
         Thread.sleep(2000);
     }

     @Then("Enter the Doucument name")
     public void enter_the_Doucument_name() throws InterruptedException {
         lp.setDoucument_name(doc1);
         System.out.println("Enter the Doucument name");
         Thread.sleep(2000);

     }

     @Then("Click on save button")
     public void click_on_save_button() throws InterruptedException {

         System.out.println("Click on save button");

         // driver.close();
      //   Thread.sleep(4000);

     }










     //...........................................................................................................................
//............................Employee_To_Client..(Roles_permission)......................................................
//............................................................................................................
     @Then("Click on Add Employee_To_Client")
     public void click_on_Add_Employee_To_company() throws InterruptedException {
         Thread.sleep(2000);
         driver.findElement(By.xpath("//span[contains(text(),'Employee to Client')]")).click();
         System.out.println("Click on Add Employee_To_Client");

     }

     @Then("Select the Client")
     public void select_the_Client() throws InterruptedException {
         Actions actions = new Actions(driver);
         WebElement closeMenuOption = driver.findElement(By.xpath("//*[@type='checkbox']"));
         actions.moveToElement(closeMenuOption).perform();
         System.out.println("Mouse hover on Element");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[text()=\"Download\"]")).click();
         closeMenuOption.click();

         Thread.sleep(4000);

         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/span/span/span[1]/input")).click();
         driver.findElement(By.xpath("//*[text()=\"Submit\"]")).click();
         Thread.sleep(8000);
        // Thread.sleep(8000);

        // driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[1]/div/div/div[2]/div/span[2]/div")).click();
        // Thread.sleep(8000);


        /* driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/div[6]/div/span/span/span[1]/input")).click();
         Thread.sleep(8000);

         driver.findElement(By.xpath("(//*[text()=\"delete\"])[2]")).click();
         Thread.sleep(8000);

         driver.findElement(By.xpath("(//*[text()=\"delete\"])[4]")).click();
         Thread.sleep(8000);
         Thread.sleep(8000);

         driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div/div[1]/div[3]/button/span[1]/span")).click();
*/
     }


     @Then("Select the Location")
     public void select_the_Location() throws InterruptedException {
         Thread.sleep(9000);
driver.findElement(By.xpath("(//*[@type='checkbox'])[2]")).click();


         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div/div[1]/span/span/span[1]/input")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]/span[1]/i")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]/span[1]/div/div/div/div[2]/span/span/span[1]/input")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[2]/span[1]/i")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[2]/span[1]/div/div/div/div[1]/span/span/span[1]/input")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[text()=\"Submit\"]")).click();








         System.out.println("Select the Location");
     }

     @Then("Select the Department")
     public void select_the_Department() throws InterruptedException {
         Thread.sleep(5000);

     /*    driver.findElement(By.xpath("//*[text()=\"Submit\"]")).click();
         Thread.sleep(9000);
         System.out.println("Select the Department");

         driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/input[1]")).click();
         Thread.sleep(5000);

         driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/input[1]")).click();
         Thread.sleep(5000);

         driver.findElement(By.xpath("//*[text()=\"Submit\"]")).click();
         Thread.sleep(5000);
*/
     }

     @Then("click on Staff_to_client")
     public void click_on_Staff_to_client() throws InterruptedException{
         Thread.sleep(5000);

         System.out.println("Select the Location");

     }

     @Then("Select the client in dropdownlist")
     public void select_the_client_in_dropdownlist() throws InterruptedException {
         Thread.sleep(8000);

     }





     //...........................................................................................................
//............................ Guest_user..(Guest_user)......................................................
//............................................................................................................
     @Then("click on Guest_user Module")
     public void click_on_Guest_user_Module() throws InterruptedException {
         Guest = new Guest_user_page(driver);

         Guest.setClick_on_Guesruser();
         System.out.println("click on Guest_user Module");

     }

     @Then("click on Guest_user sub module")
     public void click_on_Guest_user_sub_module() {
         Guest.setClick_on_Sub_Guesruser();
         System.out.println("click on Guest_user sub module");

     }

     @Then("Guest user page should display")
     public void guest_user_page_should_display() throws InterruptedException {
         Guest.setGuset_user_page();
         System.out.println("Guest user page should display");
     }

     @Then("click on add button")
     public void click_on_add_button() throws InterruptedException {
         Guest.setClick_on_add_button();
         System.out.println("click on add button");

     }

     @Then("Enter All mendetry fields")
     public void enter_All_mendetry_fields() throws InterruptedException {
         Guest.set_Mandatory_field();
         System.out.println("Enter All mendetry fields");

     }

     @Then("click on save Button and should display successful pop up")
     public void click_on_save_Button_and_should_display_successful_pop_up() {
         System.out.println("click on save Button and should display successful pop up");

     }

     @Then("close the browser")
     public void close_the_browser() throws InterruptedException {
         System.out.println("close the browser");
         Thread.sleep(4000);
       //  driver.close();
         Thread.sleep(4000);
     }








     //...........................................................................................................
//............................Employee Permissions..(Roles and permission)......................................................
//............................................................................................................
     @Then("Mouse over on module list")
     public void mouse_over_on_module_list() throws InterruptedException {
         Roles = new Employee_permission(driver);

         Actions actions = new Actions(driver);
         Thread.sleep(8000);
         WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div/div/div/nav/div[3]/div[1]/div[1]/span"));
         actions.moveToElement(menuOption).perform();
         System.out.println("Mouse over on module list");

     }

     @Then("Click on Roles and Permissions tab")
     public void click_on_Roles_and_Permissions_tab() throws InterruptedException {
         Roles.setRole_permission();
         System.out.println("Click on Roles and Permissions tab");

     }

     @Then("Click on the Employee Permissions SubTab")
     public void click_on_the_Employee_Permissions_SubTab() throws InterruptedException {
         Thread.sleep(2000);
         Roles.setEmployee_Permission();
         System.out.println("Click on the Employee Permissions SubTab");

     }






     @When("Search Employee")
     public void search_Employee() throws InterruptedException {
         Roles.setGo();
         System.out.println("Search Employee");


     }

     @Then("select the  Permission options for Modules")
     public void select_the_Read_Permission_options_for_Modules() throws InterruptedException {
         System.out.println("select the  Permission options for Modules");

     }

     @Then("Select Modules to apply to the specific Employee")
     public void select_Modules_to_apply_to_the_specific_Employee() throws InterruptedException {
         System.out.println("Select Modules to apply to the specific Employee");
     }
















     //........................................................................................
//.........Employee to Company...(ROLES AND PERMISSION)............................................................
// ..........................................................................................
     @Then("Click on Employee to Company")
     public void click_on_Employee_to_Company() throws InterruptedException {
         emp = new Employee_to_company_page(driver);

         emp.setEmployee_to_Company();
         System.out.println("Click on Employee to Company");


     }

     @When("Select Employee Company,Departments")
     public void select_Employee_Company_Departments() throws InterruptedException {
         emp.setAll_emp();
         System.out.println("Select all Employee");
         Thread.sleep(3000);
         //emp.setAll_company();
         System.out.println("Select all Company");
     }

     @Then("Click On Submit To Assign the Selected Company")
     public void click_On_Submit_To_Assign_the_Selected_Company() throws InterruptedException {
         System.out.println("Click on submit");
       //  emp.setSubmit();
         System.out.println("Click On Submit To Assign the Selected Company");
         Thread.sleep(4000);
     }












     //..................................................................................................
//.........Guest User Permission..(Guest User)............................................................
// .................................................................................................
     @Then("Click on  Guest User Permission")
     public void click_on_Guest_User_Permission() throws InterruptedException {
         Thread.sleep(2000);
         pages = new Guest_permission_page(driver);

         pages.setGuest_User_Permission();
         System.out.println("Click on  Guest User Permission");

     }

     @Then("Select the Guest User")
     public void select_the_Guest_User() throws InterruptedException {
         Thread.sleep(2000);
         Actions actions = new Actions(driver);
         Thread.sleep(2000);
         WebElement menuOption = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
         actions.moveToElement(menuOption).perform();
         pages.setSearch_Guest();
         System.out.println("Select the Guest User");

     }

     @Then("Select the Permission options")
     public void select_the_Permission_options() throws InterruptedException {
         Thread.sleep(2000);
         pages.setGuest();
         System.out.println("Select the Permission options");

     }

     @Then("Click on Submit")
     public void click_on_Submit() throws InterruptedException {
         System.out.println("Select the Permission options");
         Thread.sleep(4000);

     }


















     //..................................................................................................
//......... Assign Guest User..(Guest User)............................................................
// .................................................................................................
     @Then("Click on Assign Guest User submodule")
     public void click_on_Assign_Guest_User_submodule() throws InterruptedException {
         Assign_Guest = new Assign_Guest_user_page(driver);

         Thread.sleep(3000);
         Assign_Guest.setAssign_user();
         System.out.println("Click on Assign Guest User submodule");
     }

     @Then("Select the Guest User field")
     public void select_the_Guest_User_field() {
         System.out.println("guest user");
     }

     @Then("Client, Location\\(s), Department\\(s)")
     public void client_Location_s_Department_s() throws InterruptedException {
         Thread.sleep(8000);
         Assign_Guest.setAll_guest();
         System.out.println("Select the All Guest ");
         Thread.sleep(3000);
         Assign_Guest.setAll_client();
         System.out.println("Select the All Client ");
         Thread.sleep(3000);
       Assign_Guest.setSubmit();
       //  Thread.sleep(8000);

         //Assign_Guest.setSearch_Guest();
       //  Thread.sleep(8000);

         //System.out.println("Click on search button");
         //Assign_Guest.setSingle_guest();
         Thread.sleep(6000);

         System.out.println("Select the  Guest ");
        // Assign_Guest.setSingle_client();
         //Thread.sleep(6000);

         System.out.println("Select the Client ");
         //Assign_Guest.setSubmit();
         //Thread.sleep(6000);

         System.out.println("Client on submit button ");
         Thread.sleep(3000);


     }

     @Then("click on Submit_button to Assign the CGuest Users to Client")
     public void click_on_Submit_button_to_Assign_the_CGuest_Users_to_Client() throws InterruptedException {
        // Assign_Guest.setSubmit();
         System.out.println("Click on submit button ");
         Thread.sleep(4000);
     }

















     //..................................................................................................
//......... Staff to Client..(Roles and permission)............................................................
// ................................................................................................
     @Then("Click on Staff to Client")
     public void click_on_Staff_to_Client() throws InterruptedException {
         staff = new Client_to_staff(driver);

         Thread.sleep(5000);
         staff.setStaff_to_client();
         System.out.println("Click on Staff to Client");
    //     Thread.sleep(5000);
      //   driver.findElement(By.xpath("//*[text()=\"IBM\"]\n")).click();
         System.out.println("Click on Staff to Client");

     }

     @When("Select Client from the list")
     public void select_Client_from_the_list() throws InterruptedException {
         Thread.sleep(4000);
         staff.setDrop_down();
         System.out.println("Select the Client ");
         Thread.sleep(2000);
     }

     @Then("Select Staff to Assign")
     public void select_Staff_to_Assign() throws InterruptedException {
         staff.setAll_client();
         Thread.sleep(2000);
     }

     @Then("Select Locations of Selected Client")
     public void select_Locations_of_Selected_Client() throws InterruptedException {
         Thread.sleep(3000);
         staff.setAll_staff();
         System.out.println("Select Locations of Selected Client ");
         Thread.sleep(4000);
     }















     //..................................................................................................
//.........Assign the Staff permission..(Roles and permission)............................................................
// ................................................................................................

     @Then("Click on Client Name to give Permissions")
     public void click_on_Client_Name_to_give_Permissions() throws InterruptedException {
         permission = new Staff_permission(driver);

         Thread.sleep(2000);
         permission.setPermission();
         System.out.println("Click on Client Name to give Permissions");
     }

     @Then("Select the type of permissions")
     public void select_the_type_of_permissions() throws InterruptedException {
         Thread.sleep(8000);
         permission.setText();
         Thread.sleep(2000);
         permission.setBox();
         System.out.println("Select the type of permissions");

     }

     @Then("Click on Submit Button")
     public void click_on_Submit_Button() throws InterruptedException {
         System.out.println("Click on Submit Button");
         Thread.sleep(4000);
       //  driver.close();
         Thread.sleep(4000);

     }












     //..................................................................................................
//.........Cloud..(Click on Cloud)............................................................
// ................................................................................................

     @Then("Click on Cloud")
     public void click_on_Cloud() throws InterruptedException {
         Cloud = new Cloud_folder(driver);
         Thread.sleep(8000);

         Cloud.setClick_on_cloud();
         Thread.sleep(3000);

     }

     @Then("Click on My Cloud")
     public void click_on_My_Cloud() throws InterruptedException {
         Cloud.setMycloud();
         Thread.sleep(3000);

     }

     @Then("Click on Create Folder Icon")
     public void click_on_Create_Folder_Icon() throws InterruptedException {
         Cloud.setAdd();
         Thread.sleep(3000);
     }

     @When("Create folder pop up opens Name a new Folder")
     public void create_folder_pop_up_opens_Name_a_new_Folder() throws InterruptedException {
         Thread.sleep(3000);
         Cloud.setText_box();
     }

     @Then("Click On Create Button")
     public void click_On_Create_Button() throws InterruptedException {
         System.out.println("Click On Create Button");
         Thread.sleep(3000);

     }

     @Then("Click on upload option")
     public void clickOnUploadOption() {
     }

     @Then("Select the file and Click on upload button")
     public void selectTheFileAndClickOnUploadButton() {
     }

     @Then("Click on mail option on header")
     public void clickOnMailOptionOnHeader() {
     }

     @Then("Enter mail id To Address")
     public void enterMailIdToAddress() {
     }

     @Then("Click on CC and bcc option")
     public void clickOnCCAndBccOption() {
     }

     @Then("Enter address on CC and bcc option")
     public void enterAddressOnCCAndBccOption() {
     }

     @Then("Enter subject for mail")
     public void enterSubjectForMail() {
     }

     @Then("Select the zip option")
     public void selectTheZipOption() {
     }

     @Then("Click on add button to attach the file")
     public void clickOnAddButtonToAttachTheFile() {
     }

     @Then("Select the file from department")
     public void selectTheFileFromDepartment() {
     }

     @Then("click on attach button")
     public void clickOnAttachButton() {
     }

     @Then("Select the checkbox which file we need to send")
     public void selectTheCheckboxWhichFileWeNeedToSend() {
     }

     @Then("click on send button")
     public void clickOnSendButton() {
     }

     @Then("Successfully sent popup should display")
     public void SuccessfullySentPopupShouldDisplay() {
     }

     @Then("Go to Folder which is currently added")
     public void goToFolderWhichIsCurrentlyAdded() {
     }

     @Then("Right cLick on folder and select the Delete option")
     public void rightCLickOnFolderAndSelectTheDeleteOption() {
     }

     @Then("Enter password")
     public void enterPassword() {
     }

     @Then("Click on delete button and popup should display Suessfully deleted")
     public void clickOnDeleteButtonAndPopupShouldDisplaySuessfullyDeleted() {
     }
     @Then("Verify")
     public void verify() throws InterruptedException {
         System.out.println("verify");
         Thread.sleep(4000);

     }















     //..................................................................................................
//...........(Account Reconciliation=Gl account)............................................................
// ..........................................................................................
     @And("Click on Account Reconciliation tab")
     public void clickOnAccountReconciliationTab() throws InterruptedException {
         //  Gl_page.setAc_button();
         Gl_page = new Gl_account_page(driver);
         Thread.sleep(6000);

         WebElement  sc= driver.findElement(By.xpath("//*[text()=\"Account Reconciliation\"]"));
         JavascriptExecutor executor = (JavascriptExecutor) driver;
         executor.executeScript("arguments[0].click();", sc);
         System.out.println("Click on Account Reconciliation");
         Thread.sleep(3000);

     }

     @Then("Click on Account Reconciliation")

     public void click_on_Account_Reconciliation() throws InterruptedException {
         Gl_page.setAc_button();
         Thread.sleep(3000);
         System.out.println("Click on Account Reconciliation");

     }

     @Then("Hover on Right Side panel")
     public void hover_on_Right_Side_panel() throws InterruptedException {
         Gl_page.setMouse();
         Thread.sleep(3000);
         System.out.println("Hover on Right Side panel");


     }

     @Then("Click on GL Account")
     public void click_on_GL_Account() throws InterruptedException {
         System.out.println("Click on GL Account");
     }


     @Then("Click on Add Button on View GL Account")
     public void click_on_Add_Button_on_View_GL_Account() throws InterruptedException {
         Thread.sleep(3000);
         Gl_page.setAdd();
         System.out.println("Click on Add Button on View GL Account");

     }


     @When("Enter GL Account Code")
     public void enter_GL_Account_Code() throws InterruptedException {
         Thread.sleep(3000);
         Gl_page.setGl_ode();
         Thread.sleep(3000);
         System.out.println("Enter GL Account Code");

     }


     @When("Enter GL Description")
     public void enter_GL_Description() throws InterruptedException {
         Thread.sleep(3000);
         System.out.println("Enter GL Description");
         Thread.sleep(3000);
     }

     @When("Enter All Mandatory fields on Gl Category")
     public void enter_All_mendetry_fields_on_Gl_Category() throws InterruptedException {
         Gl_page.setCircle();
         System.out.println("Enter All mendetry fields on Gl Category");
         Thread.sleep(3000);
     }

     @When("Click on Add button on Legal Entity")
     public void click_on_Add_button_on_Legal_Entity() {
         System.out.println("Click on Add button on Legal Entity");

     }

     @When("Enter All Mandatory fields on Legal Entity")
     public void enter_All_mendetry_fields_on_Legal_Entity() throws InterruptedException {
         Gl_page.setCircle1();
         Thread.sleep(3000);
         System.out.println("Enter All mendetry fields on Legal Entity");

     }

     @And("Click on Gl Save Button")
     public void clickOnGlSaveButton() {
         System.out.println("Click on Gl Save Button");

     }


     @When("Click on Add button on Management Entity")
     public void click_on_Add_button_on_Managment_Entity() {
         System.out.println("Click on Add button on Managment Entity");

     }

     @When("Enter All Mandatory fields on Management Entity")
     public void enter_All_mendetry_fields_on_Managment_Entity() throws InterruptedException {
         Gl_page.setCircle2();
         System.out.println("Enter All mendetry fields on Managment Entity");

     }

     @And("Enter Gl Category, Legal Entity,Management Entity")
     public void enterGlCategoryLegalEntityManagmentEntity() {
         System.out.println("Enter Gl Category, Legal Entity,Managment Entity");

     }

     @When("Search GL Account which is currently added")
     public void search_GL_Account_which_is_currently_added() {
         System.out.println("Search GL Account which is currently added");

     }

     @When("Delete GL Account")
     public void delete_GL_Account() {
         System.out.println("Delete GL Account");

     }


     @When("save and verify")
     public void save_and_verify() {
         System.out.println("save and verify");
     }


















     //..................................................................................................
//...........(Account Reconciliation)............................................................
// ..........................................................................................
     @Then("Hover on Right Side panel GL Category")
     public void hover_on_Right_Side_panel_GL_Category() throws InterruptedException {
         gl = new Gl_category(driver);

         gl.setMouse_over();
         System.out.println("Hover on Right Side panel GL Category");
         Thread.sleep(3000);

     }

     @Then("Click on GL Category")
     public void click_on_GL_Category() throws InterruptedException {
         gl.setGl_page();
         Thread.sleep(3000);
         System.out.println("Click on GL Category");

     }

     @Then("Click on Add Button on GL Category")
     public void click_on_Add_Button_on_GL_Category() {
        // gl.add();
         System.out.println("Click on Add Button on GL Category");
     }

     @Then("Enter Name on Add Account Category Drawer")
     public void enter_Name_on_Add_Account_Category_Drawer() throws InterruptedException {
         gl.setName();
         System.out.println("Enter Description on Account Category Drawer");

     }

     @Then("Enter Description on Account Category Drawer")
     public void enter_Description_on_Account_Category_Drawer() throws InterruptedException {
         System.out.println("Enter Description on Account Category Drawer");
     }

     @Then("save Gl category")
     public void save_Gl_category() {
         System.out.println("save Gl category");

     }

     @Then("Search Gl category which is currently added")
     public void search_Gl_category_which_is_currently_added() {
         System.out.println("Search Gl category which is currently added");

     }

     @Then("Delete Gl category")
     public void delete_Gl_category() throws InterruptedException {
         System.out.println("Delete Gl category");
         Thread.sleep(4000);

     }

















     //..................................................................................................
//...........(Account Reconciliation)............................................................
// ..........................................................................................

     @When("Click on Management Entity’s Add button")
     public void click_on_Management_Entity_s_Add_button() throws InterruptedException {
                       entity=new Management_entity_page(driver);
         Thread.sleep(2000);
         entity.setAdd_mangement();
         Thread.sleep(2000);
         System.out.println("Click on Management Entity’s Add button");

     }

     @When("Select Legal Entity to assign a Management entity with")
     public void select_Legal_Entity_to_assign_a_Management_entity_with() throws InterruptedException {
         entity.setSelect();
         Thread.sleep(2000);
         entity.setMicrosoft();
         System.out.println("Select Legal Entity to assign a Management entity with");

     }

     @When("Enter Name which should be associated with")
     public void enter_Name_which_should_be_associated_with() {
         entity.setName();
         System.out.println("Enter Name which should be associated with");

     }

     @When("Enter Code")
     public void enter_Code() {
         entity.setCode();
         System.out.println("Enter Code");

     }

     @Then("Enter the Description")
     public void enter_the_Description() throws InterruptedException {
         entity.setDescription();
         entity.setSave();
         System.out.println("Enter the Description");

     }

     @Then("varify the page")
     public void varify_the_page() {
         System.out.println("varify");
     }

     @Then("Click on GL_Entity_page")
     public void click_on_GL_Entity_page() {

         System.out.println("Click on GL_Entity_page");
     }

     @Then("Fill all the mandatory field And should enable save  button")
     public void fill_all_the_mandatory_field_And_should_enable_save_button() throws InterruptedException {
         entity.mendtory_fields();
         Thread.sleep(4000);
         System.out.println("Fill all the mandatory field And should enable save  button");
     }







     //..................................................................................................
//...........(Account Sub Reconciliation)............................................................
// ..........................................................................................

     @Then("Hover on Sub GL Account")
     public void hover_on_Sub_GL_Account() throws InterruptedException {
         Thread.sleep(6000);
         sub_Gl = new sub_GL_account(driver);

       sub_Gl.setAccount_balance();
         Thread.sleep(3000);
     }

     @Then("Click on Sub GL Account")
     public void click_on_Sub_GL_Account() throws InterruptedException {
         System.out.println("Enter GL_Description Sub GL Account");

     }

     @Then("Click on Add Button on View sub GL Account")
     public void click_on_Add_Button_on_View_sub_GL_Account() throws InterruptedException {
         System.out.println("Enter GL_Description Sub GL Account");
     }

     @Then("Select the  Gl Account")
     public void select_the_Gl_Account() throws InterruptedException {
         System.out.println("Enter GL_Description Sub GL Account");

     }

     @Then("Enter Name which should be associated_with Sub GL Account")
     public void enter_Name_which_should_be_associated_with_Sub_GL_Account() {
         System.out.println("Enter GL_Description Sub GL Account");

     }

     @Then("Enter GL_Description Sub GL Account")
     public void enter_GL_Description_Sub_GL_Account() throws InterruptedException {
        sub_Gl.setPurpose();
         System.out.println("Enter GL_Description Sub GL Account");
     }

     @Then("Select on cost center Sub GL Account")
     public void select_on_cost_center_Sub_GL_Account() {
         System.out.println("Enter GL_Description Sub GL Account");

     }

     @Then("Select Legal Entity to assign a Management entity with_sub Gl account")
     public void select_Legal_Entity_to_assign_a_Management_entity_with_sub_Gl_account() {
         System.out.println("Select Legal Entity to assign a Management entity with_sub Gl account");

     }

     @Then("Select on Management Entity’s Sub GL Account")
     public void select_on_Management_Entity_s_Sub_GL_Account() {
         System.out.println("Select on Management Entity’s Sub GL Account");

     }

     @Then("Enter Base currency nd Risk category")
     public void enter_Base_currency_nd_Risk_category() {
         System.out.println("Enter Base currency nd Risk category");

     }

     @Then("Enter Amount range")
     public void enter_Amount_range() {
         System.out.println("Enter Amount range");

     }

     @Then("Enter the Account Purpose")
     public void enter_the_Account_Purpose() {
         System.out.println("Enter the Account Purpose");

     }

     @Then("Enter the JVM FLOW")
     public void enter_the_JVM_FLOW() {
         System.out.println("Enter the JVM FLOW");

     }

     @Then("Save the sub Gl account")
     public void save_the_sub_Gl_account() {
         System.out.println("Save the sub Gl account");

     }

     @Then("Search sub Gl account which is currently added")
     public void search_sub_Gl_account_which_is_currently_added() {
         System.out.println("Search sub Gl account which is currently added");

     }

     @Then("Delete sub Gl account")
     public void delete_sub_Gl_account() {
         System.out.println("Delete sub Gl account");

     }





















     //..................................................................................................
//...........(Account Employee)............................................................
// ..........................................................................................

     @Then("Hover on Right Side panel Employee")
     public void hover_on_Right_Side_panel_Employee() {
         emp_role = new EMP_Account_Reconcilation(driver);
         emp_role.setMouse();
         System.out.println("Enter the JVM FLOW");

     }

     @Then("Click on Employee")
     public void click_on_Employee() throws InterruptedException {
        emp_role.setEmp();
        emp_role.setAdd();
         System.out.println("Enter the JVM FLOW");


     }

     @Then("Click on Add Icon on Add Employee Drawer")
     public void click_on_Add_Icon_on_Add_Employee_Drawer() throws InterruptedException {
         System.out.println("Select Legal Entity to add the Employee in");

     }

     @Then("Enter First Middle and Last Name")
     public void enter_First_Middle_and_Last_Name() throws InterruptedException {
        emp_role.setFirstclass();
         System.out.println("Enter the JVM FLOW");

     }

     @Then("Select Legal Entity to add the Employee in")
     public void select_Legal_Entity_to_add_the_Employee_in() {
         System.out.println("Select Legal Entity to add the Employee in");

     }

     @Then("Enter the Badge Code")
     public void enter_the_Badge_Code() {
         System.out.println("Enter the Badge Code");


     }

     @Then("Click and Select the Date of Joining")
     public void click_and_Select_the_Date_of_Joining() throws InterruptedException {
         emp_role.setDOB();
         System.out.println("Click and Select the Date of Joining");

     }

     @And("Click and Select the Date of Birth Official and Actual")
     public void clickAndSelectTheDateOfBirthOfficialAndActual() {
         System.out.println("Click and Select the Date of Birth \\( Official and Actual )");

     }

     @Then("Select the Gender")
     public void select_the_Gender() throws InterruptedException {
        emp_role.setFemale();
         System.out.println("Select the Gender");

     }

     @Then("Select the Department to Assign with Employee")
     public void select_the_Department_to_Assign_with_Employee() {
         System.out.println("Enter the Badge Code");

     }

     @Then("Select the Designation to Assign with Employee")
     public void select_the_Designation_to_Assign_with_Employee() {
         System.out.println("Select the Designation to Assign with Employee");

     }

     @Then("Select the Location to Assign with Employee")
     public void select_the_Location_to_Assign_with_Employee() {
         System.out.println("Select the Location to Assign with Employee");

     }

     @Then("Enter the Mobile Number")
     public void enter_the_Mobile_Number() {
         System.out.println("Enter the Mobile Number");

     }

     @Then("Enter the Official Email")
     public void enter_the_Official_Email() {
         System.out.println("Enter the Official Email");

     }

     @Then("Click on Save")
     public void click_on_Save() throws InterruptedException {
         System.out.println("Click on Save");

     }

     @And("Click on Export Button on  Employee")
     public void clickOnExportButtonOnEmployee() throws InterruptedException {
        // reco_bulk.EMPsetPdf();
         reco_bulk.EMPsetEXcel();
         reco_bulk.EMPsettimesheet();
     }

//   export

     @And("Click on Employee tab")
     public void clickOnEmployeeTab() throws InterruptedException {

     }

     @And("Click on Export icon")
     public void clickOnExportIcon()throws InterruptedException {

     }

     @And("Select the file from the Employee list")
     public void selectTheFileFromTheEmployeeList() {
     }

     @And("click on Arrow button")
     public void clickOnArrowButton() throws InterruptedException {

     }


     @Then("Download Excel file")
     public void downloadExcelFile() {
     }

     @Then("select download and save template tab")
     public void selectDownloadAndSaveTemplateTab() {
     }












     //..................................................................................................
//...........(Trial balance)............................................................
// ..........................................................................................
     @Then("Hover on Right Side panel Trial Balance")
     public void hover_on_Right_Side_panel_Trial_Balance() throws InterruptedException {
         trial = new Trial_balance_impoter(driver);

         trial.setArrow();
     }

     @Then("Click on Trial Balance Importer")
     public void click_on_Trial_Balance_Importer() {
         System.out.println("Click on Trial Balance Importer");

     }

     @Then("Click on Download sample file")
     public void click_on_Download_sample_file() {
         System.out.println("Click on Download sample file");

     }

     @Then("Select Legal Entity for Trial Balance")
     public void select_Legal_Entity_for_Trial_Balance() {
         System.out.println("Click on Download sample file");
     }


     @Then("Select Management Entity \\(Which will shows you assigned to Legal Entity)")
     public void select_Management_Entity_Which_will_shows_you_assigned_to_Legal_Entity() {
         System.out.println("Select Management Entity \\(Which will shows you assigned to Legal Entity)");
     }

     @Then("Select the Range of Period")
     public void select_the_Range_of_Period() throws InterruptedException {
         trial.setDate();
         System.out.println("Select the Range of Period");
     }

     @Then("Click on upload \\(After adding the records into it)")
     public void click_on_upload_After_adding_the_records_into_it() throws InterruptedException {
         trial.setFile();
         System.out.println("Enter the Badge Code");

     }

     @Then("Click on Save and verify Trial Balance")
     public void click_on_Save_and_verify_Trial_Balance() throws InterruptedException {
         trial.setSave();
     }

     @Then("Search Trial Balance which is currently added")
     public void search_Trial_Balance_which_is_currently_added() {
         System.out.println("Search Trial Balance which is currently added");

     }

     @Then("Delete Trial Balance")
     public void delete_Trial_Balance() {
         System.out.println("Enter the Badge Code");

     }







     @Then("Click on sub GL Account")
     public void click_on_sub_GL_Account() throws InterruptedException {
         System.out.println("Click on sub GL Account");
         upload_subgl.setCloud();
     }

     @Then("Click on Import Icon on View sub GL Account")
     public void click_on_Import_Icon_on_View_sub_GL_Account() {
         System.out.println("Click on Import Icon on View sub GL Account");
     }

     @Then("Verify  sub GL Account file")
     public void verify_sub_GL_Account_file() {
         System.out.println("Verify  sub GL Account file");

     }













     //..................................................................................................
//...........(GL Account upload data)............................................................
// ..........................................................................................
     @Then("Click on Import Icon on View GL Account")
     public void click_on_Import_Icon_on_View_GL_Account() throws InterruptedException {
         bulk = new Gl_account_Upload_file(driver);

         bulk.setCloud();
         System.out.println("Click on Import Icon on View GL Account");

     }

     @Then("Select the file from the list")
     public void select_the_file_from_the_list() {
         System.out.println("Select the file from the list");

     }

     @Then("Click on Save Button")
     public void click_on_Save_Button() {
         System.out.println("Select the file from the list");

     }

     @Then("Save file data")
     public void save_file_data() {
         System.out.println("Select the file from the list");
     }

     @Then("Verify  GLaccount file")
     public void verify_GLaccount_file() {
         System.out.println("Select the file from the list");
     }


















     //..................................................................................................
//...........(GL Category bulk data)............................................................
// ..........................................................................................
     @Then("Click on GL Category bulk data")
     public void click_on_GL_Category_bulk_data() throws InterruptedException {
         bulk_category = new Gl_Category_upload_file(driver);
         bulk_category.setMouse_over(); // Write code here that turns the phrase above into concrete actions
     }

     @Then("Click on Import Icon on View GL Category")
     public void click_on_Import_Icon_on_View_GL_Category() throws InterruptedException {
         //  bulk_category.setCloud();// Write code here that turns the phrase above into concrete actions
     }

     @Then("Select the file from the GL Category list")
     public void select_the_file_from_the_GL_Category_list() {
         System.out.println("Select the file from the list");
     }

     @Then("Click on Save Button on GL Category")
     public void click_on_Save_Button_on_GL_Category() {
         System.out.println("Click on Save Button on GL Category");

     }

     @Then("Save  data on GL Category")
     public void save_data_on_GL_Category() {
         System.out.println("Save  data on GL Category");
     }

     @Then("Search Gl category file which is currently added")
     public void search_Gl_category_file_which_is_currently_added() {
         System.out.println("Search Gl category file which is currently add");

     }

     @Then("Delete Gl category file")
     public void delete_Gl_category_file() {
         System.out.println("Delete Gl category file");

     }

     @Then("Verify upload file")
     public void verify_upload_file() {
         System.out.println("Verify upload file");
     }






     //..................................................................................................
//...........(Cost Center)............................................................
// ..........................................................................................
     @Then("Hover on Right Side panel Cost Center")
     public void hover_on_Right_Side_panel_Cost_Center() throws InterruptedException {
         cost = new Cost_center_page(driver);
         //  cost.setMouse();
         System.out.println("Hover on Right Side panel Cost Center");


     }

     @Then("Click on Cost Center")
     public void click_on_Cost_Center() throws InterruptedException {
         cost.setCost();
         Thread.sleep(3000);
         System.out.println("Click on Cost Centre");
     }

     @Then("Click on Add Button on View Cost Center")
     public void click_on_Add_Button_on_View_Cost_Center() throws InterruptedException {
         System.out.println("Click on Add Button on View Cost Center");

     }

     @Then("Enter Code on Cost Center")
     public void enter_Code_on_Cost_Center() throws InterruptedException {
         cost.setAdd(); // cost.setCode();
         System.out.println("Enter Code on Cost Center");


     }

     @Then("Enter Enter Description on Cost Center")
     public void enter_Enter_Description_on_Cost_Center() throws InterruptedException {
         cost.setDecription();
         System.out.println("Enter Enter Description on Cost Center");

     }

     @Then("Enter Remarks on Cost Center")
     public void enter_Remarks_on_Cost_Center() throws InterruptedException {
         cost.setRemark();
         System.out.println("Enter Remarks on Cost Center");

     }

     @Then("Click on Save on Cost Center")
     public void click_on_Save_on_Cost_Center() throws InterruptedException {
         cost.setSave();
         System.out.println("Click on Save on Cost Center");
     }

     @Then("Search Cost Centre  which is currently added")
     public void search_Cost_Centre_which_is_currently_added() throws InterruptedException {
         cost.setSearch();
         System.out.println("Search Cost Centre  which is currently added");

     }

     @Then("Delete Cost Centre")
     public void delete_Cost_Centre() throws InterruptedException {
         System.out.println("Delete Cost Centre");

     }





     //..................................................................................................
//...........(Reco  reco status)............................................................
// ..........................................................................................

     @Then("Click on Settings")
     public void click_on_Settings() throws InterruptedException {
         Reco = new Reco_status_page(driver);

         Reco.setSetting();

     }

     @Then("Click on Reco Status Pane")
     public void click_on_Reco_Status_Pane() throws InterruptedException {
         Reco.setreconame();

     }

     @Then("Click on Add button on View Reco Status")
     public void click_on_Add_button_on_View_Reco_Status() throws InterruptedException {
        // Reco.setSearch();

     }

     @Then("Enter the Name on Reco Status")
     public void enter_the_Name_on_Reco_Status() {
         System.out.println("Enter the Name on Reco Status");


     }

     @Then("Enter the Description on Reco Status")
     public void enter_the_Description_on_Reco_Status() {
         System.out.println("Enter the Description on Reco Status");

     }

     @Then("Click on Save Button on Reco Status")
     public void click_on_Save_Button_on_Reco_Status() {
         System.out.println("Click on Save Button on Reco Status");

     }







     //..................................................................................................
//...........(score pane)............................................................
// ..........................................................................................
     @Then("Click on Settings Score")
     public void click_on_Settings_Score() throws InterruptedException {
        // score = new Score_page(driver);

        score.setSetting();
         System.out.println("Click on Settings Score");


     }

     @Then("Click on Score Pane")
     public void click_on_Score_Pane() throws InterruptedException {
         System.out.println("Click on Score Pane");

     }

     @Then("Click on Add button on View Score")
     public void click_on_Add_button_on_View_Score() {
         System.out.println("Click on Add button on View Score");

     }

     @Then("Enter the Name")
     public void enter_the_Name() {
         System.out.println("Enter the Name");

     }

     @Then("Enter the Description Score")
     public void enter_the_Description_Score() {
         System.out.println("Enter the Description Score");

     }

     @Then("Click on Score Save Button")
     public void clickOnScoreSaveButton() {
         System.out.println("Click on Score Save Button");

     }

     @And("Search Score  which is currently added")
     public void searchScoreWhichIsCurrentlyAdded() {
         System.out.println("Search Score  which is currently added");

     }

     @And("Delete Score")
     public void deleteScore() {
         System.out.println("Delete Score");

     }


     //..................................................................................................
//...........(cost center upload data)............................................................
// ..........................................................................................
     @Then("Hover on Right Side panel Setting \\(Cost Centre)")
     public void hover_on_Right_Side_panel_Setting_Cost_Centre() throws InterruptedException {
        // bulkcost = new Cost_Center_upload_file(driver);

         bulkcost.setMouse();
     }

     @Then("Click on Import Icon on View Cost Centre")
     public void click_on_Import_Icon_on_View_Cost_Centre() throws InterruptedException {
         System.out.println("Click on Import Icon on View Cost Centre");
     }

     @Then("Select the file from the list for Cost Centre")
     public void select_the_file_from_the_list_for_Cost_Centre() {
         System.out.println("Select the file from the list for Cost Centre");
     }

     @Then("Click on Save Button on Cost Centre")
     public void click_on_Save_Button_on_Cost_Centre() {
         System.out.println("Click on Save Button on Cost Centre");

     }

     @Then("Search Cost Centre file which is currently added")
     public void search_Cost_Centre_file_which_is_currently_added() {
         System.out.println("Search Cost Centre file which is currently added");

     }

     @Then("Delete Cost Centre file")
     public void delete_Cost_Centre_file() {

         System.out.println("Delete Cost Centre file");

     }


     //..................................................................................................
//...........(Reco and download reco status  data)............................................................
// ..........................................................................................
     @Then("Click on Reco Status")
     public void click_on_Reco_Status() throws InterruptedException {
         reco_bulk = new Download_Reco_Status(driver);

         reco_bulk.setSetting();
     }

     @Then("Click on Import Icon on View Reco Status")
     public void click_on_Import_Icon_on_View_Reco_Status() throws InterruptedException {
         Thread.sleep(3000);
         reco_bulk.setPdf();
         reco_bulk.setSave_template();
         System.out.println("Click on Import Icon on View Reco Status");
     }

     @Then("Select the file from the Reco Status list")
     public void select_the_file_from_the_Reco_Status_list() throws InterruptedException {
         System.out.println("Select the file from the Reco Status list");

     }

     @Then("Click on Download button")
     public void click_on_Download_button() {
         System.out.println("Click on Download button");
     }


     //..................................................................................................
//...........(score download)............................................................
// ..........................................................................................

     @Then("Click on Settings Score download data")
     public void click_on_Settings_Score_download_data() throws InterruptedException {
        /// scoredata = new Download_Score(driver);

        scoredata.setSetting();
         scoredata.setPdf();
         scoredata.setSave_template();
         System.out.println("Click on Settings Score download data");
     }

     @Then("Click on Import Icon on View Score")
     public void click_on_Import_Icon_on_View_Score() {
         System.out.println("Click on Import Icon on View Score");
     }

     @Then("Select the file from the list download")
     public void select_the_file_from_the_list_download() {
         System.out.println("Select the file from the list download");
     }


     //..................................................................................................
//...........(Employee tab)............................................................
// ..........................................................................................

     @Then("Click on  Employee tab")
     public void click_on_Employee_tab() throws InterruptedException {
         emp_upload = new Employee_upload_file_RC(driver);
         emp_upload.setFile();
         System.out.println("Click on  Employee tab");

     }

     @Then("Click on Import Icon on View  Employee tab")
     public void click_on_Import_Icon_on_View_Employee_tab() {
         System.out.println("Click on Import Icon on View  Employee tab");

     }

     @Then("Verify  Employee file")
     public void verify_Employee_file() {
         System.out.println("Verify  Employee file");

     }


     @And("Search Reco Status which is currently added")
     public void searchRecoStatusWhichIsCurrentlyAdded() {
         System.out.println("Search Reco Status which is currently added");

     }

     @And("Delete Reco Status")
     public void deleteRecoStatus() {
         System.out.println("Delete Reco Status");

     }













     //..................................................................................................
//...........( Global Gl(account reconciliation)............................................................
// ..........................................................................................



     @Then("Hover on Right Side panel Global Gl")
     public void hoverOnRightSidePanelGlobalGl() throws InterruptedException {
         System.out.println("Hover on Right Side panel Global Gl");
         Global.setCost();


     }

     @And("Click on Global Gl")
     public void clickOnGlobalGl() throws InterruptedException {

         System.out.println("Click on Global Gl");

     }

     @And("Click on Add Button on View Global Gl")
     public void clickOnAddButtonOnViewGlobalGl() throws InterruptedException {
         System.out.println("Click on Add Button on View Global Gl");

         Global.setAdd();
     }

     @And("Enter Code on Global Gl")
     public void enterCodeOnGlobalGl() throws InterruptedException {
         System.out.println("Enter Code on Global Gl");

         Global.setDecription();
     }

     @And("Enter Enter Description on Global Gl")
     public void enterEnterDescriptionOnGlobalGl() throws InterruptedException {
         System.out.println("Enter Enter Description on Global Gl");

         Global.setSave();
     }

     @And("Click on Save on Global Gl")
     public void clickOnSaveOnGlobalGl() throws InterruptedException {
         System.out.println("test");

     }

     @And("Search Global Gl  which is currently added")
     public void searchGlobalGlWhichIsCurrentlyAdded() throws InterruptedException {
         Global.setSearch();

         System.out.println("Search Global Gl  which is currently added");
     }

     @And("Delete Global Gl")
     public void deleteGlobalGl() {
         System.out.println("\"Delete Global Gl");

     }














     //..................................................................................................
//...........( Global Gl(upload file)............................................................
// ..........................................................................................



     @And("Click on Import Icon on View Global Gl")
     public void clickOnImportIconOnViewGlobalGl() throws InterruptedException {
        global_file.setMouse();
     }

     @And("Select the file from the list for Global Gl")
     public void selectTheFileFromTheListForGlobalGl() {
         System.out.println("Select the file from the list for Global Gl");
     }

     @And("Click on Save Button on Global Gl")
     public void clickOnSaveButtonOnGlobalGl() {
         System.out.println("Click on Save Button on Global Gl");

     }

     @And("Search Global Gl file which is currently added")
     public void searchGlobalGlFileWhichIsCurrentlyAdded() {
         System.out.println("Search Global Gl file which is currently added");

     }





     //..................................................................................................
//...........(Cloud files to  move )............................................................
// ..........................................................................................

     @And("Select files to Move")
     public void selectFilesToMove() throws InterruptedException {
         System.out.println("Select files to Move");
         move = new Cloud_move_file_location(driver);

         move.setMs();
     }

     @And("Click on Move Icon")
     public void clickOnMoveIcon() throws InterruptedException {
         System.out.println("Click on Move Icon");
     }

     @When("Move Files drawer opens up Select the Location")
     public void moveFilesDrawerOpensUpSelectTheLocation() throws InterruptedException {
         System.out.println("Move Files drawer opens up Select the Location");

     }

     @And("Click On Move button")
     public void clickOnMoveButton() {
         System.out.println("Click On Move button");
     }


     //..................................................................................................
//...........(Cloud files to  copy )............................................................
// ..........................................................................................
     @Then("Select files to Copy")
     public void select_files_to_Copy() throws InterruptedException {
         copy_file = new Cloud_copy_file(driver);

         copy_file.setMs();
         System.out.println("Select files to Copy");

     }

     @Then("Click on Copy Icon")
     public void click_on_Copy_Icon() throws InterruptedException {
         copy_file.setSearch();
         System.out.println("Click on Copy Icon");

     }

     @When("Copy Files drawer opens up Select the Location")
     public void copy_Files_drawer_opens_up_Select_the_Location() throws InterruptedException {
         copy_file.setButton();
         System.out.println("Copy Files drawer opens up Select the Location");

     }

     @When("Click On Copy button")
     public void click_On_Copy_button() throws InterruptedException {
         Thread.sleep(3000);
         copy_file.setCopy();
         Thread.sleep(3000);
         copy_file.setDrop_down();
         Thread.sleep(3000);
         copy_file.setSave();
         System.out.println("Click On Copy button");
     }

     @And("Click On save")
     public void clickOnSave() {
         System.out.println("Click On save");
     }

     @And("Search copy file which is currently added")
     public void searchCopyFileWhichIsCurrentlyAdded() {
         System.out.println("Search copy file which is currently added");

     }

     @And("Delete file")
     public void deleteFile() {
         System.out.println("Delete file");

     }




     //..................................................................................................
//...........(Cloud files to  restore )............................................................
// ..........................................................................................

     @And("Click on Restore Icon")
     public void clickOnRestoreIcon() throws InterruptedException {
         auto_dlt = new Auto_delete_file(driver);
         auto_dlt.setMs();
     }
     @When("Restore Drawer opens up then Enter the Days Cycle to Delete the Files")
     public void restoreDrawerOpensUpThenEnterTheDaysCycleToDeleteTheFiles() {
         System.out.println("Delete file");

     }





     //..................................................................................................
//...........(Cloud files to  restore )............................................................
// ..........................................................................................
     @And("Select files to Download")
     public void selectFilesToDownload() throws InterruptedException {
         dwn_file = new To_Download_the_file_page(driver);

         dwn_file.setAdmistration();
         Thread.sleep(3000);
         dwn_file.setSerach();
     }

     @And("Click on Download Icon")
     public void clickOnDownloadIcon() throws InterruptedException {
         Thread.sleep(5000);
         dwn_file.setCheck_box();
     }

     @Then("Verify the cloud Download")
     public void verifyTheCloudDownload() throws InterruptedException {
         Thread.sleep(5000);
         dwn_file.setDownload();
     }


     //..................................................................................................
//...........(Cloud Limit Icon )............................................................
// ..........................................................................................

     @And("Click on Limit Icon")
     public void clickOnLimitIcon() throws InterruptedException {
         limit = new To_Set_the_Limit_to_the_employee_to_Download_and_Upload(driver);

         limit.setAdmistration();
         Thread.sleep(4000);
         limit.setLimit();
         Thread.sleep(9000);
     }

     @When("Select the data Range to upload and Download in Upload Limit and Download Limit")
     public void selectTheDataRangeToUploadAndDownloadInUploadLimitAndDownloadLimit() throws InterruptedException {
         limit.setSearch();
         Thread.sleep(4000);
     }

     @Then("Select the Data Unit")
     public void selectTheDataUnit() throws InterruptedException {
         limit.setBox();
         Thread.sleep(4000);
     }

     @And("Seact the File Type")
     public void seactTheFileType() throws InterruptedException {
         limit.setGB();
         Thread.sleep(4000);
     }

     @Then("Select the Select the employees to Apply the Data count")
     public void selectTheSelectTheEmployeesToApplyTheDataCount() throws InterruptedException {
         limit.setDownload();
         Thread.sleep(4000);
     }


     @Then("Click on Limit Button to Use common Selection for Multiple and Select Employee")
     public void clickOnLimitButtonToUseCommonSelectionForMultipleAndSelectEmployee() throws InterruptedException {
         limit.setGB1();
         Thread.sleep(4000);
     }

     @Then("Click on Save button")
     public void clickOnSaveButton() throws InterruptedException {
         limit.setLimit2();
         Thread.sleep(8000);
     }

     @Then("Verify Limit option")
     public void verifyLimitOption() throws InterruptedException {
         limit.setUpload_limit();
         Thread.sleep(6000);
         limit.setDownload_limit();
         Thread.sleep(4000);
     }


     //..................................................................................................
//...........(Cloud mail Icon )............................................................
// ..........................................................................................


     @Then("Select files to send")
     public void select_files_to_send() throws InterruptedException {
         email_file=new To_Email_Selected_file(driver);

         email_file.setFunctional();
         System.out.println("Select files to send");
     }

     @Then("Click on Email Icon")
     public void click_on_Email_Icon() {
         System.out.println("Click on Email Icon");

     }

     @When("Email Files drawer opens up and Add To email")
     public void email_Files_drawer_opens_up_and_Add_To_email() {
         System.out.println("Click on Email Icon");

     }

     @Then("Click on CC and BCC to add the other Email Recipients")
     public void click_on_CC_and_BCC_to_add_the_other_Email_Recipients() {
         System.out.println("Click on Email Icon");

     }

     @Then("Enter Matter to send with file")
     public void enter_Matter_to_send_with_file() {
         System.out.println("Click on Email Icon");

     }

     @Then("Click on Zip to ZIp Or Unzip files")
     public void click_on_Zip_to_ZIp_Or_Unzip_files() {
         System.out.println("Click on Email Icon");

     }

     @Then("Click On Add button on drawer to add files")
     public void click_On_Add_button_on_drawer_to_add_files() {
         System.out.println("Click on Email Icon");

     }

     @Then("Click On Remove button on drawer to Remove files")
     public void click_On_Remove_button_on_drawer_to_Remove_files() {
         System.out.println("Click on Email Icon");

     }

     @Then("Click on Send")
     public void click_on_Send() {
         System.out.println("Click on Email Icon");

     }









     //..................................................................................................
//...........(Cloud Upload Icon )............................................................
// ..........................................................................................
     @Then("Click on Upload")
     public void click_on_Upload() {
         up_file = new Upload_file(driver);

         up_file.setAdmistration();
     }

     @Then("Click on Upload Folder")
     public void click_on_Upload_Folder() throws InterruptedException {
         up_file.setClick_on_upload();
     }

     @Then("Select the file")
     public void selectTheFile() throws InterruptedException {
         up_file.setFile();

     }


     @Then("Click on Upload button")
     public void click_on_Upload_button() throws InterruptedException {
         up_file.setUpload();
         Thread.sleep(5000);

     }

     @Then("Search Upload file which is currently added\\(Cloud)")
     public void search_Upload_file_which_is_currently_added_Cloud() throws InterruptedException {
       //  up_file.setFince();
         Thread.sleep(5000);
     }

     @Then("Click On Delete button")
     public void click_On_Delete_button() throws InterruptedException {
         up_file.setSearch();
         Thread.sleep(5000);
     }

     @Then("Delete Pop up opens up Enter the Password")
     public void delete_Pop_up_opens_up_Enter_the_Password() throws InterruptedException {
         up_file.setButton();
         Thread.sleep(5000);
     }

     @Then("Click on the DeleteButton")
     public void click_on_the_DeleteButton() throws InterruptedException {
         up_file.setDelete();

     }







     //..................................................................................................
//...........(Cloud Advance_Search Icon )............................................................
// ..........................................................................................


     @Then("Select the Files")
     public void selectTheFiles() throws InterruptedException {
         ad_search = new Advance_Search(driver);
         ad_search.setMs();
     }
     @And("Click on Advance Search Icon")
     public void clickOnAdvanceSearchIcon() throws InterruptedException {
         ad_search.setBox();
     }

     @When("Advance Search Page opens up then Select then Search File Name")
     public void advanceSearchPageOpensUpThenSelectThenSearchFileName() throws InterruptedException {
         ad_search.setSearch();

     }

     @Then("Select the Date Range")
     public void selectTheDateRange() throws InterruptedException {
         ad_search.setFile_name();
         Thread.sleep(6000);

         //ad_search.setSep();
     }

     @And("Seact the File Type for Advance Search")
     public void seactTheFileTypeForAdvanceSearch() throws InterruptedException {
         ad_search.setDate();
         Thread.sleep(6000);
     }

     @Then("Select the File Size")
     public void selectTheFileSize() throws InterruptedException {
        ad_search.setUploaded_by();

     }

     @Then("Select the Specific Location to Search")
     public void selectTheSpecificLocationToSearch() throws InterruptedException {
         //ad_search.setLocation();
         System.out.println("Select the Specific Location to Search");
     }

     @Then("Click on Search")
     public void clickOnSearch() {
         System.out.println("Click on Search");

     }

     @Then("To go to the File Location Click on the File Searched")
     public void toGoToTheFileLocationClickOnTheFileSearched() {
         System.out.println("To go to the File Location Click on the File Searched");

     }










     @And("Click on Delete Request Icon and Select Request Log")
     public void clickOnDeleteRequestIconAndSelectRequestLog() throws InterruptedException {
         log.setDlt_Request();
         Thread.sleep(4000);
         System.out.println("Click on Delete Request Icon and Select Request Log");
log.setRemark();

        // log.setRequest_Log();
         Thread.sleep(4000);
         System.out.println("Click on  Request Log");



     }

     @Then("Click on My Team and Select the files to approve or Reject")
     public void clickOnMyTeamAndSelectTheFilesToApproveOrReject() throws InterruptedException {
         log.setMy_team();
         Thread.sleep(4000);

         log.setText_box();

       //  Thread.sleep(4000);
      //   log.setText_box();
         Thread.sleep(4000);
     }

     @Then("Enter Remarks")
     public void enterRemarks() throws InterruptedException {
         log.setRemark();
         Thread.sleep(4000);
     }

     @Then("Click on Approve")
     public void clickOnApproveOrReject() throws InterruptedException {

         log.setAprrove();
         Thread.sleep(4000);

     }


     @Then("Click on Reject")
     public void clickOnReject() throws InterruptedException {
         log.setReject();
     }










     @Then("Right Click on folder \\(Level {int})")
     public void right_Click_on_folder_Level(Integer int1) throws InterruptedException {
         f_r_d.setFunction();
     }

     @Then("Click on New Folder")
     public void click_on_New_Folder() throws InterruptedException {
         f_r_d.setText_box();
     }

     @Then("on New folder Pop up Enter Name of New Folder")
     public void on_New_folder_Pop_up_Enter_Name_of_New_Folder() throws InterruptedException {
         f_r_d.setAuto();
     }

     @Then("Click on Create Folder")
     public void click_on_Create_Folder() throws InterruptedException {
         f_r_d.setRename();
     }

     @Then("Right Click on folder")
     public void right_Click_on_folder() throws InterruptedException {
         f_r_d.setFolder_rename();

     }

     @Then("Click on Rename option")
     public void click_on_Rename_option() throws InterruptedException {
         f_r_d.setSyn();
     }

     @Then("Rename folder popup should display")
     public void rename_folder_popup_should_display() throws InterruptedException {
         f_r_d.setDelete();
     }

     @Then("Enter the new name")
     public void enter_the_new_name() {
         System.out.println("Enter the new name");
     }

     @Then("Click on Rename button")
     public void click_on_Rename_button() {
         System.out.println("Enter the new name");

     }

     @Then("Right Click on folder and click on Download button")
     public void rightClickOnFolderAndClickOnDownloadButton() {
         System.out.println("Enter the new name");

     }

     @Then("Again Right Click on folder")
     public void again_Right_Click_on_folder() {
         System.out.println("Enter the new name");

     }

     @Then("Click on Delete option")
     public void click_on_Delete_option() {
         System.out.println("Enter the new name");

     }

     @Then("Delete Pop up should display")
     public void delete_Pop_up_should_display() {
         System.out.println("Enter the new name");

     }

     @Then("Enter the password")
     public void enter_the_password() {
         System.out.println("Enter the new name");

     }

     @Then("Click On Delete")
     public void click_On_Delete() {
         System.out.println("Enter the new name");

     }















     @And("Click on More")
     public void clickOnMore() throws InterruptedException {
         // paste.setFunction();
         Thread.sleep(6000);
         paste.setMore();
         Thread.sleep(6000);

         paste.setCopy();
         Thread.sleep(6000);

     }

     @Then("Click on Paste")
     public void clickOnPaste() throws InterruptedException {
         paste.setFunction1();
         Thread.sleep(6000);
         paste.setMore();
         Thread.sleep(6000);

         paste.setPaste();
     }










     @Then("Right Click on folder to see the Details")
     public void rightClickOnFolderToSeeTheDetails() throws InterruptedException {
         right_folder.setDetails();
         System.out.println("Right Click on folder to see the Details");

     }





     @Then("Click on Delete Request and Select the files to Remove Requests from the list")
     public void clickOnDeleteRequestAndSelectTheFilesToRemoveRequestsFromTheList()throws InterruptedException {
         dlt_request.setDlt_Request();
         dlt_request.setremove();

     }

     @Then("Click on Remove")
     public void clickOnRemove()throws InterruptedException {
         //dlt_request.setRemove();
     }








     @And("Click on Assign Icon")
     public void clickOnAssignIcon() throws InterruptedException {
         assign_company.setAssign();
     }

     @Then("Select either All Company or Select Company - Location - Department to request")
     public void selectEitherAllCompanyOrSelectCompanyLocationDepartmentToRequest() {
         System.out.println("Select either All Company or Select Company - Location");
     }

     @Then("Select the Select the Reporting Authority to to send request to")
     public void selectTheSelectTheReportingAuthorityToToSendRequestTo() {
         System.out.println("Select the Select the Reporting Authority to to send request to");

     }

     @And("Click on Assign Icon\\(client)")
     public void clickOnAssignIconClient() throws InterruptedException {
         assign_company.setUpload_client();
     }









     @Then("Click on Client Cloud")
     public void clickOnClientCloud() throws InterruptedException {
         Thread.sleep(8000);
         driver.findElement(By.xpath("//*[text()=\"Client Cloud\"]")).click();
     }

     @And("Click on Create Folder Icon\\(Client Cloud)")
     public void clickOnCreateFolderIconClientCloud() throws InterruptedException{
         Thread.sleep(9000);
         Cloud.setAdd();
         Thread.sleep(8000);

        // Cloud.setAdd();


     }

     @And("Hover on file")
     public void hoverOnFile() throws InterruptedException {
         preview.setFolder();
         Thread.sleep(8000);

       //  preview.setPriview();
         //Thread.sleep(8000);

         preview.setElement();
         Thread.sleep(8000);

       /*  preview.setDownload();
         Thread.sleep(8000);

         preview.setRename();
         Thread.sleep(8000);

         preview.setUpload_file();
         Thread.sleep(8000);

         preview.setFinance();
         Thread.sleep(8000);

         preview.setLink();
         Thread.sleep(8000);*/

         preview.setEmail();
         Thread.sleep(8000);

         preview.setExport();
         Thread.sleep(8000);

         preview.setDlt();
         Thread.sleep(8000);

     }

     @Then("Click Preview Icon")
     public void clickPreviewIcon() {
    System.out.println("click preview ");
     }





























     @Given("Go to on My Passwords tab")
     public void goToOnMyPasswordsTab() {
         System.out.println("click preview ");

     }



     @When("click on add category button")
     public void clickOnAddCategoryButton() {
         System.out.println("click preview ");

     }

     @And("Enter all the fields Add Category")
     public void enterAllTheFieldsAddCategory() {
         System.out.println("click preview ");

     }

     @And("Click on add button on Add Category which is currently added")
     public void clickOnAddButtonOnAddCategoryWhichIsCurrentlyAdded() {
         System.out.println("click preview ");

     }

     @And("Enter all the fields on add password")
     public void enterAllTheFieldsOnAddPassword() {
         System.out.println("click preview ");

     }




     //..................................................................................................
//...........(password manager )............................................................
// ..........................................................................................


     @And("Click on Passoword Manager module")
     public void clickOnPassowordManagerModule() throws InterruptedException {
         myPassword.setPassword_manager();
     }





































     @And("should display company Location page")
     public void shouldDisplayCompanyLocationPage() throws InterruptedException {
         Thread.sleep(4000);
         cmp_loc.setloc();
     }

     @Then("click on Add button should open Add company Location")
     public void clickOnAddButtonShouldOpenAddCompanyLocation() {
         System.out.println("click on Add button should open Add company Location");

     }

     @When("Fill all the mandatory field should enable save button")
     public void fillAllTheMandatoryFieldShouldEnableSaveButton() {
         System.out.println("Fill all the mandatory field should enable save button");

     }

     @Then("on click on save button data should save")
     public void onClickOnSaveButtonDataShouldSave() {
         System.out.println("on click on save button data should save");

     }

     @And("Search company Location which is currently added")
     public void searchCompanyLocationWhichIsCurrentlyAdded() {
         System.out.println("Search company Location which is currently added");

     }

     @And("Delete company Location")
     public void deleteCompanyLocation() {
         System.out.println("Delete company Location");

     }








     @And("mouse over on general")
     public void
     mouseOverOnGeneral() throws InterruptedException {

bank_detals.setGenral();
         bank_detals.setadd();
     }

     @And("should display Bank Details page")
     public void shouldDisplayBankDetailsPage() throws InterruptedException {
         Thread.sleep(3000);
bank_detals.setBank();
     }

     @Then("click on Add button should open Bank Details")
     public void clickOnAddButtonShouldOpenBankDetails()throws InterruptedException  {
         System.out.println("");
     }

     @Then("Enter Bank Name")
     public void enterBankName() throws InterruptedException {
         Thread.sleep(3000);

         bank_detals.setBank_name();

     }

     @And("Enter Branch Name")
     public void enterBranchName() throws InterruptedException {
         bank_detals.setBranch();
     }

     @And("Enter Branch IFSC code")
     public void enterBranchIFSCCode() throws InterruptedException{
         bank_detals.setIFSC();
     }

     @And("Enter Current AC Number")
     public void enterCurrentACNumber() throws InterruptedException{
         bank_detals.setAC();
     }

     @And("SWIFT Code on Bank Details")
     public void swiftCodeOnBankDetails() throws InterruptedException{
         bank_detals.setCode();
     }

     @And("Enter Description on Bank Details")
     public void enterDescriptionOnBankDetails() {

     }

     @Then("click on save button on")
     public void clickOnSaveButtonOn() {
     }

     @And("Search Bank Details which is currently added")
     public void searchBankDetailsWhichIsCurrentlyAdded() {
     }

     @And("Delete Bank Details which is currently added")
     public void deleteBankDetailsWhichIsCurrentlyAdded() {
     }















     @And("Click on Individual Reminder tab")
     public void clickOnIndividualReminderTab() throws InterruptedException {
         individual_re.setDrop_down();
     }
     @And("Select  the Client")
     public void selectTheClient() {
     }

     @Then("Click add button on Individual Reminder")
     public void clickAddButtonOnIndividualReminder() {
     }

     @Then("Enter Reminder Date")
     public void enterReminderDate() {
     }

     @And("Enter the Time for Individual Reminder")
     public void enterTheTimeForIndividualReminder() {
     }

     @And("Enter ReminderTask on Individual Reminder")
     public void enterReminderTaskOnIndividualReminder() {
     }

     @Then("Enter Description on Individual Reminder")
     public void enterDescriptionOnIndividualReminder() {
     }

     @Then("Select Repeat options")
     public void selectRepeatOptions() {
     }

     @Then("Select Notify options")
     public void selectNotifyOptions() {
     }




     @Then("Search Individual Reminder which is currently added")
     public void searchIndividualReminderWhichIsCurrentlyAdded() {
     }

     @Then("Delete Individual Reminder which is currently added")
     public void deleteIndividualReminderWhichIsCurrentlyAdded() {
     }


     @Then("Delete Group Reminder which is currently added")
     public void deleteGroupReminderWhichIsCurrentlyAdded() {

     }











































     @And("Click on Group Reminder tab")
     public void clickOnGroupReminderTab() throws InterruptedException {
         grb_reminder.setDrop_down();
     }

     @Then("Click add button on Group Reminder")
     public void clickAddButtonOnGroupReminder() {
     }

     @Then("Select the Employee for Group Reminder")
     public void selectTheEmployeeForGroupReminder() {
     }

     @And("Select  the Client for Group Reminder")
     public void selectTheClientForGroupReminder() {
     }

     @And("Enter the Time for Group Reminder")
     public void enterTheTimeForGroupReminder() {
     }

     @And("Enter ReminderTask on Group Reminder")
     public void enterReminderTaskOnGroupReminder() {
     }

     @Then("Enter Description on Group Reminder")
     public void enterDescriptionOnGroupReminder() {
     }

     @Then("Search Group Reminder which is currently added")
     public void searchGroupReminderWhichIsCurrentlyAdded() {
     }






















































  @And("mouse over on Employee tab")
  public void mouseOverOnEmployeeTab() throws InterruptedException {
      emp_list.setEmp_tab();

  }
     @And("Click on Employee List tab")
     public void clickOnEmployeeListTab() throws InterruptedException {
     }

     @Then("Click add button on Employee List")
     public void clickAddButtonOnEmployeeList() {
     }

     @Then("Select basic information option")
     public void selectBasicInformationOption() {
     }

     @And("Enter All mendetry fields on basic information")
     public void enterAllMendetryFieldsOnBasicInformation() {
     }

     @Then("Select basic Company Related option")
     public void selectBasicCompanyRelatedOption() {
     }

     @And("Enter All mendetry fields on Company Related")
     public void enterAllMendetryFieldsOnCompanyRelated() {
     }



     @Then("Search Employee List which is currently added")
     public void searchEmployeeListWhichIsCurrentlyAdded() {
     }

     @Then("Delete Employee List which is currently added")
     public void deleteEmployeeListWhichIsCurrentlyAdded() {
     }





















     @And("mouse over on  Depatment tab")
     public void mouseOverOnDepatmentTab() throws InterruptedException {
         dept_master.setDepartment();
       //  dept_master.setType();
      //   dept_master.setGrade();
     }

     @And("click on add button Existing Depatment page should display")
     public void clickOnAddButtonExistingDepatmentPageShouldDisplay() {
     }

     @Then("again click on add button Add Depatment page should display")
     public void againClickOnAddButtonAddDepatmentPageShouldDisplay() {
     }

     @Then("Enter Depatment")
     public void enterDepatment() {
     }

     @Then("Enter Description")
     public void enterDescription() {
     }



     @Then("varify")
     public void varify() {
     }





















     @And("mouse over on  desigation tab")
     public void mouseOverOnDesigationTab() throws InterruptedException {
         add_dec.Desiganation();
     }

     @And("click on add button Existing Designations page should display")
     public void clickOnAddButtonExistingDesignationsPageShouldDisplay() {
     }

     @Then("again click on add button Add Designation page should display")
     public void againClickOnAddButtonAddDesignationPageShouldDisplay() {
     }

     @Then("Enter Designation")
     public void enterDesignation() {
     }

     @Then("save and varify")
     public void saveAndVarify() {
     }











     @And("Click on Passoword Manager tab")
     public void clickOnPassowordManagerTab() throws InterruptedException {
         password_company.setloc();
     }

     @And("Go to Companies tab")
     public void goToCompaniesTab() throws InterruptedException {
         password_company.setCity();
     }

     @And("click on add Companies tab")
     public void clickOnAddCompaniesTab() {
     }

     @And("Enter all the fields Companies tab")
     public void enterAllTheFieldsCompaniesTab() {
     }

































     //Client
     @And("Click on add button on Clients")
     public void clickOnAddButtonOnClients() throws InterruptedException {

        // add_clint_pm.setAdd_cir();
     }

     @Then("Add client page should display")
     public void addClientPageShouldDisplay() {
     }

     @Then("Select the SERVICE TYPE option")
     public void selectTheSERVICETYPEOption() {
     }

     @Then("fill all mendotry fields in SERVICE TYPE tab and click on save button")
     public void fillAllMendotryFieldsInSERVICETYPETabAndClickOnSaveButton() throws InterruptedException {
         add_clint_pm.setCity();
         add_clint_pm.setGenral();
         add_clint_pm.setLocation();
         add_clint_pm.setAdmin();
         // add_clint_pm.setAdd_cir();

     }

     @Then("Select the GENERAL option")
     public void selectTheGENERALOption() {
     }

     @Then("fill all mendotry fields in GENERAL tab and click on save button")
     public void fillAllMendotryFieldsInGENERALTabAndClickOnSaveButton() {
     }

     @Then("Select the LOCATION option")
     public void selectTheLOCATIONOption() {
     }

     @Then("fill all mendotry fields in LOCATION tab and click on save button")
     public void fillAllMendotryFieldsInLOCATIONTabAndClickOnSaveButton() {
     }

     @Then("Select the ADMIN option")
     public void selectTheADMINOption() {
     }

     @Then("fill all mendotry fields in ADMIN tab and click on save button")
     public void fillAllMendotryFieldsInADMINTabAndClickOnSaveButton() {
     }

























 ///'''''''''''''''''''''''Upload folder (cloud)>>>>>>>>>>>>>>>>>...............
     @Then("Select the Folder")
     public void selectTheFolder() throws InterruptedException {

         up_file.setFolder();

     }

     @Then("Click On Delete button on folder")
     public void clickOnDeleteButtonOnFolder() throws InterruptedException {
         System.out.println("Click On Delete button on folder");
     }

     @Then("Click on the DeleteButton and delete folder")
     public void clickOnTheDeleteButtonAndDeleteFolder() throws InterruptedException {
         up_file.setUpload_dlt();

     }










































     @Then("Select the Department in list")
     public void selectTheDepartmentInList() throws InterruptedException {
         move.setMs();
     }

     @Then("Click on checkbox")
     public void clickOnCheckbox() {
     }

     @Then("Click on move option")
     public void clickOnMoveOption() {
     }

     @Then("Select the location to move")
     public void selectTheLocationToMove() {
     }

     @Then("Go to the move location")
     public void goToTheMoveLocation() {
         System.out.println("");

     }

     @Then("Select the file from move location")
     public void selectTheFileFromMoveLocation() {
         System.out.println("");

     }

     @Then("click on copy option")
     public void clickOnCopyOption() {
         System.out.println("");

     }

     @Then("click on copy button")
     public void clickOnCopyButton() {
         System.out.println("");

     }

     @And("Click on Move")
     public void clickOnMove() {
         System.out.println("");

     }































     //password_manager

     @And("Click on Password Manager tab")
     public void clickOnPasswordManagerTab() throws InterruptedException {
         System.out.println("");

         password_company.setloc();

     }

     @And("Click on add button on particular Client")
     public void clickOnAddButtonOnParticularClient()throws InterruptedException {
         System.out.println("");

         add_location.setAdd_cir();

     }

     @And("Click on add button")
     public void clickOnAddButton() {
         System.out.println("");

     }

     @Then("Select the Client from Client Location")
     public void selectTheClientFromClientLocation() {
         System.out.println("");

     }

     @Then("Enter Location Name")
     public void enterLocationName() {
         System.out.println("");

     }

     @Then("Select Contact Person")
     public void selectContactPerson() {
         System.out.println("");

     }

     @Then("Select Department for Client")
     public void selectDepartmentForClient() {
         System.out.println("");

     }

     @Then("Enter address for Client")
     public void enterAddressForClient() {
         System.out.println("");

     }

     @Then("Enter City ,State,Country")
     public void enterCityStateCountry() {
         System.out.println("");

     }

     @Then("Enter email id ,number for client")
     public void enterEmailIdNumberForClient() {
         System.out.println("");

     }
































     //password share
     @Then("Click on share button")
     public void clickOnShareButton() throws InterruptedException{
         System.out.println("");

         pawssword_share.setSearch();
     }

     @Then("Password Share and Download page should display")
     public void passwordShareDownloadPageShouldDisplay() {
         System.out.println("");

     }

     @Then("Select the checkbox which file we need to send and download")
     public void selectTheCheckboxWhichFileWeNeedToSendAndDownload() {
         System.out.println("");

     }

     @Then("Click on download button")
     public void clickOnDownloadButton() {
         System.out.println("");

     }

     @Then("Enter Email id and Press Tab")
     public void enterEmailIdAndPressTab() {
         System.out.println("");

     }

     @Then("Click on Sent button")
     public void clickOnSentButton() {
         System.out.println("");

     }


























     //Employee
     @And("Click on add button on Employees")
     public void clickOnAddButtonOnEmployees() throws InterruptedException {
         System.out.println("");

         add_emp_passwordManager.setEmp_tab();
     }

     @And("Add Employee page should display")
     public void addEmployeePageShouldDisplay() throws InterruptedException {         System.out.println("");

         add_emp_passwordManager.setCompany_related();
     }

     @And("Select Company from Add Employee page")
     public void selectCompanyFromAddEmployeePage() {
         System.out.println("");

     }

     @Then("Enter Badge code")
     public void enterBadgeCode() {
         System.out.println("");

     }

     @Then("Select basic information tab")
     public void selectBasicInformationTab() {
         System.out.println("");

     }

     @Then("Enter First name ,middile name,last name")
     public void enterFirstNameMiddileNameLastName() {
         System.out.println("");

     }

     @Then("Select the Gender from dropdown")
     public void selectTheGenderFromDropdown() {
         System.out.println("");

     }

     @Then("Enter DOB Official,DOB Actual,DOJ")
     public void enterDOBOfficialDOBActualDOJ() {
         System.out.println("");

     }

     @Then("Enter Official Email id")
     public void enterOfficialEmailId() {
         System.out.println("");

     }

     @Then("Enter Mobile number")
     public void enterMobileNumber() {
         System.out.println("");

     }

     @Then("Select basic Company Related tab")
     public void selectBasicCompanyRelatedTab() {
         System.out.println("");

     }

     @Then("Select Location from dropdown")
     public void selectLocationFromDropdown() {
         System.out.println("");

     }

     @Then("Select Department from dropdown")
     public void selectDepartmentFromDropdown() {
         System.out.println("");

     }

     @Then("Select Desigation from dropdown")
     public void selectDesigationFromDropdown() {         System.out.println("");

     }

     @Then("Select Reporting To You")
     public void selectReportingToYou() {
         System.out.println("");

     }

     @Then("Select Reporting Authority")
     public void selectReportingAuthority() {
         System.out.println("");

     }

     @Then("Select Weekday Cycle for Employee")
     public void selectWeekdayCycleForEmployee() {
         System.out.println("");

     }

     @Then("Select Shift Type for Employee")
     public void selectShiftTypeForEmployee() {
         System.out.println("");

     }

     @Then("Select Grade and save")
     public void selectGradeAndSave() {
         System.out.println("");

     }








































     //add_password
     @Then("click on add button to add Password")
     public void clickOnAddButtonToAddPassword() throws InterruptedException {
         System.out.println("");

         add_password.setAdd_circle();
     }

     @Then("Enter name ,User Id, Password")
     public void enterNameUserIdPassword() {
         System.out.println("");


     }

     @Then("Enter Registered Name")
     public void enterRegisteredName() {
         System.out.println("");

     }

     @Then("Enter Registered Email")
     public void enterRegisteredEmail() {
         System.out.println("");

     }

     @Then("Enter Expiry Date and Remarks")
     public void enterExpiryDateAndRemarks() {
         System.out.println("");

     }

     @Then("Enter Domain name")
     public void enterDomainName() {
         System.out.println("");

     }

     @Then("Enter Secret Question")
     public void enterSecretQuestion() {
         System.out.println("");

     }

     @Then("click on save tab")
     public void clickOnSaveTab() {
         System.out.println("");

     }

















     @And("Click on add button on particular company")
     public void clickOnAddButtonOnParticularCompany() throws InterruptedException {
         System.out.println("");


         add_company_loaction.setAdd_cir();     }

     @Then("Select the Client from company Location")
     public void selectTheClientFromCompanyLocation() {
         System.out.println("");

     }

     @Then("Enter Company Location Name")
     public void enterCompanyLocationName() {
         System.out.println("");

     }

     @Then("Enter address for company")
     public void enterAddressForCompany() {
         System.out.println("");

     }

     @Then("Enter email id ,number for company")
     public void enterEmailIdNumberForCompany() {


 }
































//   share company

     @Then("Click on share button on company")
     public void clickOnShareButtonOnCompany() throws InterruptedException {
         System.out.println("");

         share_password_company.setSearch();

     }








     //view company

     @And("Click on view button")
     public void clickOnViewButton() throws InterruptedException {
         System.out.println("");

         importfile_com.setView();

     }

     @Then("Click on Import Icon")
     public void clickOnImportIcon() {         System.out.println("");

     }

     @Then("Click on Download sample file option")
     public void clickOnDownloadSampleFileOption() {
         System.out.println("");

     }

     @Then("click on Upload button")
     public void clickOnUploadButton() {
         System.out.println("");

     }

     @Then("Upload file on password manager")
     public void uploadFileOnPasswordManager() {
         System.out.println("");

     }












     //import-client
     @And("Click on view button on client")
     public void clickOnViewButtonOnClient() throws InterruptedException {
         System.out.println("");

         file_client.setView();
     }

     @Then("Click add button on my password tab")
     public void clickAddButtonOnMyPasswordTab() {
         System.out.println("");

     }

     @Then("Enter All mendetry fields on my password tab")
     public void enterAllMendetryFieldsOnMyPasswordTab() {
         System.out.println("");

     }

     @Then("Click on save button my password tab")
     public void clickOnSaveButtonMyPasswordTab() {
         System.out.println("Click on save button my password tab");

     }

     @Then("Create folder")
     public void createFolder() {
         System.out.println("Create folder");

     }

     @Then("uplaod folder")
     public void uplaodFolder() {
         System.out.println("uplaod folder");

     }

     @Then("Rename folder")
     public void renameFolder() {
         System.out.println("Rename folder");

     }

     @Then("Download file")
     public void downloadFile() {
         System.out.println("Download file");

     }

     @Then("click on details icon and see the Details")
     public void clickOnDetailsIconAndSeeTheDetails() {
         System.out.println("click on details icon and see the Details");

     }

     @Then("Click on Folder Access icon and give Access to particular user")
     public void clickOnFolderAccessIconAndGiveAccessToParticularUser() {
         System.out.println("Click on Folder Access icon and give Access to particular user");

     }

     @Then("Click on mail tab enter mail id  click on sent button")
     public void clickOnMailTabEnterMailIdClickOnSentButton() {
         System.out.println("Click on mail tab enter mail id  click on sent button");

     }

     @And("cLick on preview option")
     public void clickOnPreviewOption() {
         System.out.println("cLick on preview option");

     }

     @And("Click on download option and download the file")
     public void clickOnDownloadOptionAndDownloadTheFile() {
         System.out.println("");

     }

     @And("Click on rename option and change the name of folder")
     public void clickOnRenameOptionAndChangeTheNameOfFolder() {
         System.out.println("");


     }

     @Then("Click on replace option and replace the file")
     public void clickOnReplaceOptionAndReplaceTheFile() {

     }

     @Then("click on link file option")
     public void clickOnLinkFileOption() {
     }

     @Then("click on file log option")
     public void clickOnFileLogOption() {
     }

     @Then("click on share option")
     public void clickOnShareOption() {
     }

     @Then("Click on mail and sent mail")
     public void clickOnMailAndSentMail() {
     }

     @Then("delete the file")
     public void deleteTheFile() {
     }
     @And("CLick on add button on client")
     public void clickOnAddButtonOnClient() throws InterruptedException {
         add_client_master.setClient_code();
     }
     @And("CLick on add button on client icon")
     public void clickOnAddButtonOnClientIcon() throws InterruptedException {
        add_client_master.setCity();
         add_client_master.setGenral();
         add_client_master.setLocation();
         add_client_master.setAdmin();
     }

     @Then("fill all mendotry fields in SERVICE TYPE on client tab and click on save button")
     public void fillAllMendotryFieldsInSERVICETYPEOnClientTabAndClickOnSaveButton() {
     }

     @Then("Right Click on folder to see the Details\\(Client Cloud)")
     public void rightClickOnFolderToSeeTheDetailsClientCloud() throws InterruptedException {
         right_folder.setClent_text_box();
     }






// master client location

     @Then("Select the Client from Client Location\\(master)")
     public void selectTheClientFromClientLocationMaster() throws InterruptedException {
         add_client_master.setAddloction_client();
     }

     @Then("Enter Location Name\\(master)")
     public void enterLocationNameMaster() {
     }

     @Then("Select Contact Person\\(master)")
     public void selectContactPersonMaster() {
     }

     @Then("Select Department for Client\\(master)")
     public void selectDepartmentForClientMaster() {
     }

     @Then("Enter address for Client\\(master)")
     public void enterAddressForClientMaster() {
     }

     @Then("Enter City ,State,Country\\(master)")
     public void enterCityStateCountryMaster() {
     }

     @Then("Enter email id ,number for client\\(master)")
     public void enterEmailIdNumberForClientMaster() {
     }










     // staff




     @Then("Select the Client from Add Staff page\\(master)")
     public void selectTheClientFromAddStaffPageMaster() {
         add_client_master.setClient_staff();
     }
     @Then("Enter mail id,First name,Middile name ,last name, Number")
     public void enterMailIdFirstNameMiddileNameLastNameNumber() throws InterruptedException {
         add_client_master.setStaff();
     }

     @Then("click on Allow Login checkbox")
     public void clickOnAllowLoginCheckbox() {

     }









     //cloud
     @And("Click on Create Folder Icon on Client Cloud")
     public void clickOnCreateFolderIconOnClientCloud() throws InterruptedException {
         Cloud.setUpload_client();

     }

     @Then("Create folder pop up open and create new Folder")
     public void createFolderPopUpOpenAndCreateNewFolder() {
     }










     // Resource
     @Then("Click on Resource")
     public void clickOnResource() {
         driver.findElement(By.xpath("//*[text()=\"Resource\"]")).click();
     }

     @Then("Right Click on folder to see the Details\\(Resource)")
     public void rightClickOnFolderToSeeTheDetailsResource() throws InterruptedException {
         right_folder.setDlt();
     }






//emp
     @And("Click on Employee tab\\(export)")
     public void clickOnEmployeeTabExport() throws InterruptedException {
         export_file_emp.setemp();
         export_file_emp.setCloud();
     }



     //resorse
     @When("Create folder pop up opens Name a new Folder\\(Resource)")
     public void createFolderPopUpOpensNameANewFolderResource() throws InterruptedException {
         Cloud.setBox();
     }







































     //Report....................Company location
     @And("Click on Report module")
     public void clickOnReportModule() throws InterruptedException{
         report_company_location.setReport();
     }

     @Then("Report page should display")
     public void reportPageShouldDisplay() throws InterruptedException{
     }

     @Then("mouse over on master tab")
     public void mouseOverOnMasterTab() throws InterruptedException{
         report_company_location.setMaster();
     }

     @Then("Click on view button Company loaction tab")
     public void clickOnViewButtonCompanyLoactionTab() throws InterruptedException{
         report_company_location.setCompany_location();
     }
     @Then("click on download button and Excel file")
     public void clickOnDownloadButtonAndExcelFile() throws InterruptedException{
         report_company_location.setDownload();
     }
     @Then("Click on coloum Selection option")
     public void clickOnColoumSelectionOption() throws InterruptedException{
         report_company_location.setFilter_list();
     }

     @Then("Select the coloums and click on save button")
     public void selectTheColoumsAndClickOnSaveButton() throws InterruptedException{
         report_company_location.setCheckbox();

         report_company_location.setSave();
     }

     @Then("Click on checkbox from view list")
     public void clickOnCheckboxFromViewList() throws InterruptedException{
         report_company_location.setView_check_box();
     }

     @Then("Click on share button\\(Report)")
     public void clickOnShareButtonReport() throws InterruptedException{
         report_company_location.setShare();
     }

     @Then("Enter email id and click on send button")
     public void enterEmailIdAndClickOnSendButton() throws InterruptedException{
     }



     @Then("Click on Cancel button")
     public void clickOnCancelButton() throws InterruptedException{
         report_company_location.setCancel();
     }

     @Then("mouse over on download option and click on download")
     public void mouseOverOnDownloadOptionAndClickOnDownload() throws InterruptedException{
         report_company_location.setSave_name();
         Thread.sleep(2000);
         report_company_location.setFavourites();

     }












     //bank details

     @Then("Click on view button Bank Details tab")
     public void clickOnViewButtonBankDetailsTab() throws InterruptedException {
         report_company_location.setBankdetails();
     }
     @Then("Click on Cancel button\\(bank details)")
     public void clickOnCancelButtonBankDetails() throws InterruptedException {
         report_company_location.setDownload_option_bank_details();

     }

     @Then("Select the file from the view list")
     public void selectTheFileFromTheViewList() throws InterruptedException{
     }


     //download excel and pdf file =registration



     @Then("Click on view button Registration tab")
     public void clickOnViewButtonRegistrationTab() throws InterruptedException{
         report_company_location.setRegistration();
     }

     @Then("Click on Cancel button\\(Registration)")
     public void clickOnCancelButtonRegistration() throws InterruptedException{
         report_company_location.setDownload_option_Registration();
     }

     @Then("Remove from favourites list")
     public void removeFromFavouritesList()throws InterruptedException {
         report_company_location.setRemove();
     }



























     @Then("Click on view button Employee name tab")
     public void clickOnViewButtonEmployeeNameTab() throws InterruptedException {
         report_company_location.setEmplyee_name();

     }

     @Then("Click on Cancel button\\(Employee)")
     public void clickOnCancelButtonEmployee()throws InterruptedException {
         report_company_location.setEmplyee_name_download();
     }

     @Then("Click on share tab")
     public void clickOnShareTab() throws InterruptedException {
         report_company_location.empname();
     }

     @Then("Select the checkbox")
     public void selectTheCheckbox() {

//driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

     }
     @Then("click on download button and Excel file tab")
     public void clickOnDownloadButtonAndExcelFileTab() throws InterruptedException {
         report_company_location.setDownload1();
     }



//Department
     @Then("Click on view button Department tab")
     public void clickOnViewButtonDepartmentTab() {
         report_company_location.setDepartment_view();
     }

     @Then("Click on Cancel button\\(Department)")
     public void clickOnCancelButtonDepartment() throws InterruptedException {
         report_company_location.setDepartment_download();
     }







     // Degignation
     @Then("Click on view button Desigation tab")
     public void clickOnViewButtonDesigationTab() {
         report_company_location.setDegiganation();
     }

     @Then("Click on Cancel button\\(Desigation)")
     public void clickOnCancelButtonDesigation() throws InterruptedException {
         report_company_location.setDegiganation_download();
     }









     //Employee Type
     @Then("Click on view button Employee Type tab")
     public void clickOnViewButtonEmployeeTypeTab() throws InterruptedException {
         report_company_location.setEmplyee_name();
     }

     @Then("Click on Cancel button\\(Employee Type)")
     public void clickOnCancelButtonEmployeeType() throws InterruptedException {
        // report_company_location.setEmployee_type_download();
     }







     //Employee Grade

     @Then("Click on view button Employee Grade tab")
     public void clickOnViewButtonEmployeeGradeTab() throws InterruptedException {
         report_company_location.setEmployee_grade();
     }

     @Then("Click on Cancel button\\(Employee Grade)")
     public void clickOnCancelButtonEmployeeGrade() throws InterruptedException {
         report_company_location.setEmplyee_Grade_download();
     }






     //client name
     @Then("Click on view button Client name tab")
     public void clickOnViewButtonClientNameTab() {
         report_company_location.setClient_name();
     }

     @Then("Click on Cancel button\\(Client name)")
     public void clickOnCancelButtonClientName() throws InterruptedException {

         report_company_location.setClient_name_download();
     }


     // category
     @Then("Click on view button Category tab")
     public void clickOnViewButtonCategoryTab() {
         report_company_location.setCategory();
     }

     @Then("Click on Cancel button\\(Category)")
     public void clickOnCancelButtonCategory() throws InterruptedException {
         report_company_location.setCategory_download();
     }










     // location
     @Then("Click on view button Location tab")
     public void clickOnViewButtonLocationTab() {
         report_company_location.setLocation();
     }

     @Then("Click on Cancel button\\(Location)")
     public void clickOnCancelButtonLocation() throws InterruptedException {
         report_company_location.setLocation_download();
     }











     //   Client location Reg

     @Then("Click on view button Client location Reg tab")
     public void clickOnViewButtonClientLocationRegTab() {

         report_company_location.setClient_location();
     }

     @Then("Click on Cancel button\\(Client location Reg)")
     public void clickOnCancelButtonClientLocationReg() throws InterruptedException {
         report_company_location.setClient_location_reg_download();
     }



















     // Staff
     @Then("Click on view button Staff tab")
     public void clickOnViewButtonStaffTab() {
         report_company_location.setStaff();
     }

     @Then("Click on Cancel button\\(Staff)")
     public void clickOnCancelButtonStaff() throws InterruptedException {
         report_company_location.setStaff_download();
     }








     //Job_department_download
     @Then("Click on view button job department tab")
     public void clickOnViewButtonJobDepartmentTab() {
         report_company_location.setJob_department();
     }

     @Then("Click on Cancel button\\(job department)")
     public void clickOnCancelButtonJobDepartment() throws InterruptedException {
         report_company_location.setJob_department_download();
     }






     //Employee permission
     @Then("Click on view button Employee Permission tab")
     public void clickOnViewButtonEmployeePermissionTab() {
        // driver.findElement(By.xpath("(//*[text()=\"get_app\"])[15]")).click();
     }


     //Staff permission
     @Then("Click on view button staff permission tab")
     public void clickOnViewButtonStaffPermissionTab() {
      //   driver.findElement(By.xpath("(//*[text()=\"get_app\"])[19]")).click();

     }




     // Gl account

     @Then("Click on view button Gl_account tab")
     public void clickOnViewButtonGl_accountTab() {
         report_company_location.setGl_account();
     }

     @Then("Click on Cancel button\\(Gl_account)")
     public void clickOnCancelButtonGl_account() throws InterruptedException {
         report_company_location.setSubGl_Account_download();
     }




     //subgl account
     @Then("Click on view button Sub_gl_account tab")
     public void clickOnViewButtonSub_gl_accountTab() {
         report_company_location.setSubgl_account();
     }

     @Then("Click on Cancel button\\(Sub_gl_account)")
     public void clickOnCancelButtonSub_gl_account() throws InterruptedException {
         report_company_location.setSubGl_Account_download();
     }


     //password share


















     // cost center
     @Then("Click on view button cost_center tab")
     public void clickOnViewButtonCost_centerTab() {
         report_company_location.setCost_center();
     }

     @Then("Click on Cancel button\\(cost_center)")
     public void clickOnCancelButtonCost_center() throws InterruptedException {
         report_company_location.setCost_center_download();
     }






     // account_categoty

     @Then("Click on view button Account category tab")
     public void clickOnViewButtonAccountCategoryTab() throws InterruptedException {
         report_company_location.setAccount_category();
     }

     @Then("Click on Cancel button\\(Account category)")
     public void clickOnCancelButtonAccountCategory() throws InterruptedException {
         report_company_location.setAccount_category_download();
     }



     //global gl
     @Then("Click on view button Global_gl tab")
     public void clickOnViewButtonGlobal_glTab() {
         report_company_location.setGlobel_gl();
     }

     @Then("Click on Cancel button\\(Global_gl)")
     public void clickOnCancelButtonGlobal_gl() throws InterruptedException {
         report_company_location.setGlobel_Gl_download();
     }



     //managment entity
     @Then("Click on view button managment tab")
     public void clickOnViewButtonManagmentTab() {
         report_company_location.setManagement_enitity();
     }

     @Then("Click on Cancel button\\(managment)")
     public void clickOnCancelButtonManagment() throws InterruptedException {
         report_company_location.setManagment_entity_download();
     }


     @Then("mouse over on clock tab")
     public void mouseOverOnClockTab() throws InterruptedException {
         clock_report.clock();
     }

     @Then("Click on view button Timesheet tab")
     public void clickOnViewButtonTimesheetTab() throws InterruptedException {
         clock_report.Timeshhet();
     }

     @Then("Select the employee from dropdown")
     public void selectTheEmployeeFromDropdown() throws InterruptedException {
         clock_report.timesheet();
     }

     @Then("Select the client from dropdown")
     public void selectTheClientFromDropdown() {
     }

     @Then("Select the Hours")
     public void selectTheHours() {
     }

     @Then("Slect the options")
     public void slectTheOptions() {
     }

     @Then("select the date")
     public void selectTheDate() {
     }

     @Then("click on go option")
     public void clickOnGoOption() {
     }

     @Then("click on download")
     public void clickOnDownload() {
     }

     @Then("download excel and pdf file")
     public void downloadExcelAndPdfFile() {
     }










     //
     @Then("Click on view button Duration tab")
     public void clickOnViewButtonDurationTab() throws InterruptedException {
         clock_report.duration();
     }





     // exception
     @Then("Click on view button exception tab")
     public void clickOnViewButtonExceptionTab() throws InterruptedException {
         clock_report.setException();
     }

     @Then("Select the employee from dropdown\\(exception)")
     public void selectTheEmployeeFromDropdownException() throws InterruptedException {
         clock_report.exption();

     }


     @And("Click on GL Category\\(client)")
     public void clickOnGLCategoryClient() {
         driver.findElement(By.xpath("//*[text()=\"Category\"]")).click();
     }

     @And("Click on Add Button on GL Category\\(client)")
     public void clickOnAddButtonOnGLCategoryClient() throws InterruptedException {
       //  driver.findElement(By.xpath("         (//*[text()=\"add\"])[5]\n")).click();
         add_client_master.setAdd_1();

     }

     @And("Enter Name on Add Account Category Drawer\\(client)")
     public void enterNameOnAddAccountCategoryDrawerClient() throws InterruptedException {
         add_client_master.setName();

     }

     @And("Enter Description on Account Category Drawer\\(client)")
     public void enterDescriptionOnAccountCategoryDrawerClient() {
     }

     @And("save Gl category\\(client)")
     public void saveGlCategoryClient() {
     }

     @And("Search Gl category which is currently added\\(client)")
     public void searchGlCategoryWhichIsCurrentlyAddedClient() {
     }

     @And("Delete Gl category\\(client)")
     public void deleteGlCategoryClient() {
     }
























     //department
     @And("Click on Job Department\\(client)")
     public void clickOnJobDepartmentClient() throws InterruptedException {
         driver.findElement(By.xpath("//*[text()=\"Job Department\"]")).click();
         Thread.sleep(8000);


         //*[text()="Department"]
     }

     @And("Click on Add Button on Job Department\\(client)")
     public void clickOnAddButtonOnJobDepartmentClient() throws InterruptedException {
         Thread.sleep(5000);


     }

     @And("Enter Name on Job Department\\(client)")
     public void enterNameOnJobDepartmentClient() throws InterruptedException {
         add_client_master.setJob_department();
     }

     @And("Enter Shot code of Department on Job Department\\(client)")
     public void enterShotCodeOfDepartmentOnJobDepartmentClient() {
     }

     @And("Select the activity code and Enter the job code")
     public void selectTheActivityCodeAndEnterTheJobCode() {
     }

     @And("Search Job Department which is currently added\\(client)")
     public void searchJobDepartmentWhichIsCurrentlyAddedClient() {
     }

     @And("Delete Job Department\\(client)")
     public void deleteJobDepartmentClient() {
     }






















     @And("Click on Clock module")
     public void clickOnClockModule() throws InterruptedException {
         time_sheet_clock.clock();
         //driver.findElement(By.xpath("//*[text()=\"hourglass_empty\"]")).click();
     }

     @Then("click on Reports icon")
     public void clickOnReportsIcon() throws InterruptedException {
         time_sheet_clock.setReports();



     }

     @Then("Select the Timesheet Report option")
     public void selectTheTimesheetReportOption() throws InterruptedException {
         time_sheet_clock.setTimsheet();
         Thread.sleep(5000);
         time_sheet_clock.timesheetClock();
     }

     @Then("select the Employee\\(clock)")
     public void selectTheEmployeeClock() {
       System.out.println("select the Employee\\(clock)");
     }

     @Then("Select the Client\\(clock)")
     public void selectTheClientClock() {
     }

     @Then("Select the Hours\\(clock)")
     public void selectTheHoursClock() {
     }

     @Then("Select the On\\(clock)")
     public void selectTheOnClock() {
     }

     @Then("Select the Start_date\\(clock)")
     public void selectTheStart_dateClock() {
     }

     @Then("Click on Go\\(clock)")
     public void clickOnGoClock() {
     }















     //duration
     @Then("Select the duration Report option")
     public void selectTheDurationReportOption() throws InterruptedException {
         time_sheet_clock.duration();
         Thread.sleep(5000);
         time_sheet_clock.setDuration_chekbox();
     }




     // exception
     @Then("Select the Exception Report option")
     public void selectTheExceptionReportOption() throws InterruptedException {
         Thread.sleep(5000);

         time_sheet_clock.setException();
         Thread.sleep(5000);

         time_sheet_clock.exption();

     }










     //Automated Mail Setting
     @Then("Select the Automated mail setting Report option")
     public void selectTheAutomatedMailSettingReportOption() throws InterruptedException {
         time_sheet_clock.setAutomated_mail();
         time_sheet_clock.Automail();
     }

     @Then("select employee\\(clock)")
     public void selectEmployeeClock() {
     }

     @Then("enter External Mails")
     public void enterExternalMails() {
     }

     @Then("select the day")
     public void selectTheDay() {
     }





















     // Managelock\/unlock Icon


     @Then("Select the Employee")
     public void selectTheEmployee() throws InterruptedException {
         manage_lock.setClock();
     }

     @Then("Enter Start date, End date,Auto date")
     public void enterStartDateEndDateAutoDate() {
     }

     @Then("enter discription")
     public void enterDiscription() {
     }

     @Then("click on Add button then Emplyee will add suessesfully in the list")
     public void clickOnAddButtonThenEmplyeeWillAddSuessesfullyInTheList() {
     }

     @Then("click on Managelock,unlock Icon")
     public void clickOnManagelockUnlockIcon() {
     }

     @Then("click on Add Managelock,unlock button")
     public void clickOnAddManagelockUnlockButton() {
     }

     @Then("Add Manage Unlock,Lock page should display")
     public void addManageUnlockLockPageShouldDisplay() {
     }

















     //Filter list
     @And("Click on Filter list Icon")
     public void clickOnFilterListIcon() throws InterruptedException {
         manage_lock.setFilter_list();
     }

     @And("Select Client from the list\\(clock)")
     public void selectClientFromTheListClock() {
     }

     @And("Select Employee from the list\\(clock)")
     public void selectEmployeeFromTheListClock() {
     }

     @Then("Click on go button")
     public void clickOnGoButton() {

     }

     @Then("click on refresh Task list Icon")
     public void clickOnRefreshTaskListIcon() {
     }



















     // task temlate
     @And("Click on Task Template list icon")
     public void clickOnTaskTemplateListIcon() throws InterruptedException {
         manage_lock.setList();
       //  manage_lock.setAdd_circle();
     }

     @Then("Task list page should display")
     public void taskListPageShouldDisplay() {
     }

     @Then("Enter primary Task")
     public void enterPrimaryTask() {
     }

     @Then("Enter Summary")
     public void enterSummary() {
     }

     @Then("click on Add option")
     public void clickOnAddOption() {
     }














     //new task
     @Then("click on add new task")
     public void clickOnAddNewTask() throws InterruptedException {
         manage_lock.setAdd_circle();

     }

     @Then("Main Task page should display")
     public void mainTaskPageShouldDisplay() {
     }



     @Then("Select the Lead")
     public void selectTheLead() {
     }



     @Then("Enter Issue Type")
     public void enterIssueType() {
     }

     @Then("Set Priority and linked with option")
     public void setPriorityAndLinkedWithOption() {
     }

     @Then("Enter Start date nad End date\\(clock)")
     public void enterStartDateNadEndDateClock() {
     }

     @Then("Enter Decription")
     public void enterDecription() {
     }

     @Then("Assign TO and  Hours")
     public void assignTOAndHours() {
     }

     @Then("click on create button")
     public void clickOnCreateButton() {
     }


     @Then("Enter primary task\\(clock)")
     public void enterPrimaryTaskClock() {
     }

     @Then("select the client\\(clock module)")
     public void selectTheClientClockModule() {
     }

















     @Then("Click on Add Client icon")
     public void clickOnAddClientIcon() throws InterruptedException {
         add_client_clock.setAdd_client();
         add_client_clock.setCity();
     }

     @Then("Fill all mandatory fields in Service Type option")
     public void fillAllMendatoryFieldsInServiceTypeOption() {
     }

     @Then("Fill all mandatory fields in Basic Information option")
     public void fillAllMendatoryFieldsInBasicInformationOption() {
     }

     @Then("Fill all mandatory fields in Location details option")
     public void fillAllMendatoryFieldsInLocationDetailsOption() {
     }

     @Then("Fill all mandatory fields in Admin  option")
     public void fillAllMendatoryFieldsInAdminOption() {
     }

     @Then("click on submit button\\(clock)")
     public void clickOnSubmitButtonClock() {
     }
















     // work day
     @And("Select the Day Type")
     public void selectTheDayTypeWorkDay() throws InterruptedException {
         workDay.setWorkday_dropdown();
     }

     @And("Select the Task Type")
     public void selectTheTaskType() throws InterruptedException {
         workDay.setWorkday();

     }

     @And("Select the Time Specific option")
     public void selectTheTimeSpecificOption() {
     }

     @And("Select the client for work day")
     public void selectTheClientForWorkDay() {
     }
     @And("Select the Task")
     public void selectTheTask() {
     }

     @And("Enter From Time and To Time")
     public void enterFromTimeAndToTime() {
     }

     @And("Select the Work from location")
     public void selectTheWorkFromLocation() {
     }

     @And("Enter Remarks\\(clock)")
     public void enterRemarksClock() {
     }

     @And("Click on submit \\(clock)")
     public void clickOnSubmitClock() {
     }









     @And("Select Day Type option as-Leave")
     public void selectDayTypeOptionAsLeave() throws InterruptedException {
         workDay.setLeave();
     }

     @Then("Select the Leave Type option from dropdown")
     public void selectTheLeaveTypeOptionFromDropdown() {
     }

     @Then("Select Unassigned Task Type")
     public void selectUnassignedTaskType() {
     }

     @And("Select the client for \\(Leave)")
     public void selectTheClientForLeave() {
     }

     @And("Select the Task \\(Leave)")
     public void selectTheTaskLeave() {
     }

     @And("Enter the Hours")
     public void enterTheHours() {
     }




     // partial work

     @And("Select Day Type option as-Partial work")
     public void selectDayTypeOptionAsPartialWork() throws InterruptedException {
         workDay.setPartial_work_day();
     }

     @Then("Select the Partial work Type option from dropdown")
     public void selectThePartialWorkTypeOptionFromDropdown() {
     }

     @And("Select the client for \\(Partial work)")
     public void selectTheClientForPartialWork() {
     }

     @And("Select the Task \\(Partial work)")
     public void selectTheTaskPartialWork() {
     }











     //Holiday
     @And("Select Day Type option as-Holiday")
     public void selectDayTypeOptionAsHoliday() throws InterruptedException {
         workDay.setHoliday();
     }

     @And("Enter Holiday name")
     public void enterHolidayName() {

     }

     @And("Select the client for \\(Holiday)")
     public void selectTheClientForHoliday() {
     }

     @And("Select the Task \\(Holiday)")
     public void selectTheTaskHoliday() {
     }

     @And("click on TeamWork")
     public void clickOnTeamWork() throws InterruptedException {
         workDay.setMyteam();

     }


























































































     // ADMIN PANEL
     @Given("I launch admin Panel")
     public void iLaunchAdminPanel() {
     }

     @When("I open Admin Panel Url {string}")
     public void iOpenAdminPanelUrl(String string) {
         driver.get(string);

     }

     @And("I enter Admin Panel UserName {string} And Password {string}")
     public void iEnterAdminPanelUserNameAndPassword(String username, String password) throws InterruptedException {
         add_trial_licencee.setusername(username);
         Thread.sleep(2000);
         add_trial_licencee.Setpassword(password);
         Thread.sleep(2000);

     }

     @And("I Click on Login for Admin Panel")
     public void iClickOnLoginForAdminPanel() {
         add_trial_licencee.setLogin();

     }

     @Then("Click on Licencee tab")
     public void clickOnLicenceeTab() throws InterruptedException {
         Thread.sleep(4000);

         add_trial_licencee.setLicence();
         Thread.sleep(4000);
     }

     @Then("Click on add Licencee icon")
     public void clickOnAddLicenceeIcon() {
         add_trial_licencee.setAdd_Licencee();

     }

     @Then("Licencee Master Creation page should display")
     public void licenceeMasterCreationPageShouldDisplay() {

     }

     @Then("Fill Basic Licencee Data")
     public void fillBasicLicenceeData() {
     }

     @Then("select Licence Type \\(Trial)")
     public void selectLicenceTypeTrial() {
         add_trial_licencee.setLicence_type();
         add_trial_licencee.setSubmit();

     }

     @Then("Enter Licencee Name")
     public void enterLicenceeName() throws InterruptedException {
         add_trial_licencee.setName_Licencee();
     }








     @Then("Enter Contact Person Firstname")
     public void enterContactPersonFirstname() throws InterruptedException {
         add_client_master.setAdd_1();
         add_client_master.setAddloction_client();
     }

     @Then("select the gender")
     public void selectTheGender() {
     }

     @Then("Enter Lastname")
     public void enterLastname() {
     }

     @Then("Enter DOB")
     public void enterDOB() {
     }

     @Then("Enter Incorp. Date")
     public void enterIncorpDate() {
     }

     @Then("Enter Contact Email")
     public void enterContactEmail() {
     }

     @Then("Enter Address,PinCode,City,State,Country")
     public void enterAddressPinCodeCityStateCountry() {
     }

     @Then("Enter Mobile Number ,Landline No")
     public void enterMobileNumberLandlineNo() {
     }

     @Then("click on submit")
     public void clickOnSubmit() {
     }


















     //Licenced
     @Then("select Licence Type \\(Licenced)")
     public void selectLicenceTypeLicenced() {
         add_trial_licencee.setLicence_type_Licenced();
     }

     @Then("Enter Licencee Name \\(Licenced)")
     public void enterLicenceeNameLicenced() throws InterruptedException {
         add_trial_licencee.setName_Licencee();

     }

     @Then("Enter PAN Number")
     public void enterPANNumber() throws InterruptedException {
         add_trial_licencee.setPAN_NUMBER();

     }

     @Then("Enter TIN number")
     public void enterTINNumber() {
     }

     @Then("Enter Modules Selection options")
     public void enterModulesSelectionOptions() {
     }

     @Then("Enter Parameter Attributes\\(Timesheet Lock)")
     public void enterParameterAttributesTimesheetLock() {
     }

























     @Then("Click on the Package Create Label on the left Panel of the page")
     public void clickOnThePackageCreateLabelOnTheLeftPanelOfThePage() throws InterruptedException {
         Thread.sleep(4000);

         package_create.setAdd_package();
     }

     @Then("Click on the Add Package button")
     public void clickOnTheAddPackageButton() {
     }

     @Then("Select the module where you wish to add the data")
     public void selectTheModuleWhereYouWishToAddTheData() {
     }

     @Then("Enter the Package Name")
     public void enterThePackageName() {
     }

     @Then("Enter the Price of the package per user which is for month")
     public void enterThePriceOfThePackagePerUserWhichIsForMonth() {
     }

     @Then("Enter the Number of the Number of the Guest Users allowed to the package")
     public void enterTheNumberOfTheNumberOfTheGuestUsersAllowedToThePackage() {
     }

     @Then("Enter the Space per user in the package and Parameter")
     public void enterTheSpacePerUserInThePackageAndParameter() {
     }

     @Then("Enter the File Size upload limit and Parameter")
     public void enterTheFileSizeUploadLimitAndParameter() {
     }

     @Then("Enter the Package  Size  limit and Parameter")
     public void enterThePackageSizeLimitAndParameter() {
     }

     @Then("Select the parameter Packages as per the Module")
     public void selectTheParameterPackagesAsPerTheModule() {

     }
















     // Employee type

     @And("click on add button Existing Employee Type page should display")
     public void clickOnAddButtonExistingEmployeeTypePageShouldDisplay() throws InterruptedException {
         dept_master.setType();
     }
     @Then("again click on add button Employee Type page should display")
     public void againClickOnAddButtonEmployeeTypePageShouldDisplay() {
     }


     @Then("Enter Description\\(Employee Type)")
     public void enterDescriptionEmployeeType() {
     }

     @Then("Enter Depatment\\(Employee Type)")
     public void enterDepatmentEmployeeType() {

     }








     //employee grade
     @And("click on add button Existing Employee Grade page should display")
     public void clickOnAddButtonExistingEmployeeGradePageShouldDisplay() throws InterruptedException {
         dept_master.setGrade();
     }

     @Then("again click on add button Employee Grade page should display")
     public void againClickOnAddButtonEmployeeGradePageShouldDisplay() {
     }

     @Then("Enter Depatment\\(Employee Grade)")
     public void enterDepatmentEmployeeGrade() {
     }

     @Then("Enter Description\\(Employee Grade)")
     public void enterDescriptionEmployeeGrade() {
     }





































     //export
     @And("Click on Export Button on  GL Account")
     public void clickOnExportButtonOnGLAccount() throws InterruptedException {
         reco_bulk.setglaccountEXCEL();
         reco_bulk.setglaccountPDF();
         reco_bulk.setglaccounttemplate();
     }

     @And("Select the file from the GL Account list")
     public void selectTheFileFromTheGLAccountList() {
     }

     @And("Click on GL Account\\(Export)")
     public void clickOnGLAccountExport() throws InterruptedException {
         reco_bulk.setgl_account();

     }












     @And("Click on GL Category\\(export)")
     public void clickOnGLCategoryExport() throws InterruptedException {
         reco_bulk.setGl_category_page();
     }

     @And("Click on Export Button on  GL Category")
     public void clickOnImportButtonOnGLCategory() throws InterruptedException {
         reco_bulk.setcategoryEXCEl();
        reco_bulk.settiMESHEET_AND_SAVE();
         reco_bulk.setcategoryPDF();
     }

     @And("Select the file from the GL Category list\\(Export)")
     public void selectTheFileFromTheGLCategoryListExport() {
     }







     //globel
     @And("Click on Export Button on Global Gl")
     public void clickOnExportButtonOnGlobalGl() throws InterruptedException {
         reco_bulk.Globel_gl_excel();
         reco_bulk.globel_export_PDF();
         reco_bulk.save_and_template_globel_g();
     }

     @And("Select the file from the Global Gl list\\(Export)")
     public void selectTheFileFromTheGlobalGlListExport() {
     }













     // sub gl account export
     @And("Click on Sub Gl Account\\(export)")
     public void clickOnSubGlAccountExport() throws InterruptedException {
         reco_bulk.setSub_gl_balance();

     }

     @And("Click on Export Button on  Sub Gl Account")
     public void clickOnExportButtonOnSubGlAccount() throws InterruptedException {
         reco_bulk.Sub_gl_account_excel();
       //  reco_bulk.Sub_gl_account_pdf();
         reco_bulk.Sub_gl_account_Save_template();

     }

     @And("Select the file from the Sub Gl Account list\\(Export)")
     public void selectTheFileFromTheSubGlAccountListExport() {
     }


















     // cost center
     @And("Click on Export Button on  Cost Center")
     public void clickOnExportButtonOnCostCenter() throws InterruptedException {
         reco_bulk.Cost_Center_Save_template();
         reco_bulk.Cost_Center_Excel();
         reco_bulk.Cost_Center_PDF();
     }

     @And("Select the file from the Cost Center list\\(Export)")
     public void selectTheFileFromTheCostCenterListExport() {
     }




















     //Assign company
     @And("Click on Assign company Icon")
     public void clickOnAssignCompanyIcon() throws InterruptedException {
         //assign_company.setUpload_client();
         password_company.setAssign_company();
     }

     @And("Select the company")
     public void selectTheCompany() {
     }

     @And("Click on submit \\(PM)")
     public void clickOnSubmitPM() {
     }

     @And("Click on Assign client Icon")
     public void clickOnAssignClientIcon() throws InterruptedException {
         password_company.setAssign_clint();

     }



     @And("Select the client\\(PM)")
     public void selectTheClientPM() {
     }






















     // my task
     @Then("Click on view button My_task tab")
     public void clickOnViewButtonMy_taskTab() {

         report_company_location.setMy_task();
     }

     @Then("Click on Cancel button\\(My_task)")
     public void clickOnCancelButtonMy_task() throws InterruptedException {
         report_company_location.setMy_Task_download();
     }











     @Then("Click on view button My_team tab")
     public void clickOnViewButtonMy_teamTab() {
         report_company_location.setMy_team();
     }

     @Then("Click on Cancel button\\(My_team)")
     public void clickOnCancelButtonMy_team() throws InterruptedException {
         report_company_location.setMy_team_download();
     }

     @Then("Select the coloums and click on save button\\(my task)")
     public void selectTheColoumsAndClickOnSaveButtonMyTask() throws InterruptedException {
         report_company_location.checkbox2();

         report_company_location.setSave();
     }





     @Then("Click on share button\\(Report_task)")
     public void clickOnShareButtonReport_task() throws InterruptedException {
         report_company_location.settask1();
     }



     // Employee to company

     @Then("Click on view button Employee To Company tab")
     public void clickOnViewButtonEmployeeToCompanyTab() {
         report_company_location.setEmployee_to_company();
     }

     @Then("Click on Cancel button\\(Employee To Company)")
     public void clickOnCancelButtonEmployeeToCompany() throws InterruptedException {
         //report_company_location.setEmployee_to_company_download();
     }










     // empoyee to client
     @Then("Click on view button Employee To Client tab")
     public void clickOnViewButtonEmployeeToClientTab() {
         report_company_location.setEmolyee_to_client();
     }

     @Then("Click on Cancel button\\(Employee To Client)")
     public void clickOnCancelButtonEmployeeToClient() {
     }







     //staff to client
     @Then("Click on view button Staff to client tab")
     public void clickOnViewButtonStaffToClientTab() {
         report_company_location.setStaff_to_client();
     }

     @Then("Click on Cancel button\\(Staff to client)")
     public void clickOnCancelButtonStaffToClient() {
     }




     @Then("Click on view button Staff permission")
     public void clickOnViewButtonStaffPermission() {
         report_company_location.staff_permission();

     }

     @Then("Click on download button\\(Staff permission)")
     public void clickOnCancelButtonStaffPermission() throws InterruptedException {
         report_company_location.setStaff_permission_download();
     }




     @Then("Click on view button Employee Permission")
     public void clickOnViewButtonEmployeePermission() {
         report_company_location.employee_permission();
     }

     @Then("Click on download button Employee Permission")
     public void clickOnCancelButtonEmployeePermission() throws InterruptedException {
         report_company_location.setEmployee_permission_download();
     }

     @Then("Click on view button Client_log tab")
     public void clickOnViewButtonClient_logTab() {
         report_company_location.setClient_log();
     }

     @Then("Click on Cancel button\\(Client_log)")
     public void clickOnCancelButtonClient_log() throws InterruptedException {
         report_company_location.setClient_log_download();
     }

     @Then("Click on view button Company_log tab")
     public void clickOnViewButtonCompany_logTab() {
         report_company_location.setCompany_log();
     }

     @Then("Click on Cancel button\\(Company_log)")
     public void clickOnCancelButtonCompany_log() throws InterruptedException {
         report_company_location.setCompany_log_download();
     }





     @Then("Click on view button password_manager tab")
     public void clickOnViewButtonPassword_managerTab() {
         report_company_location.setPassword_manger_log();
     }

     @Then("Click on Cancel button\\(password_manager)")
     public void clickOnCancelButtonPassword_manager() throws InterruptedException {
         report_company_location.setPassword_manager_log_download();
     }









     @Then("click on favourites option on Company loaction")
     public void clickOnFavouritesOptionOnCompanyLoaction() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[2]")).click();

     }



     @Then("click on favourites option on Bankdetails")
     public void clickOnFavouritesOptionOnBankdetails() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[3]")).click();

     }
     @Then("click on favourites option on registration")
     public void clickOnFavouritesOptionOnRegistration() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[4]")).click();

     }

     @Then("click on favourites option on Employee name")
     public void clickOnFavouritesOptionOnEmployeeName() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[5]")).click();

     }
     @Then("click on favourites option on department")
     public void clickOnFavouritesOptionOnDepartment() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[6]")).click();

     }
     @Then("click on favourites option on Desigation")
     public void clickOnFavouritesOptionOnDesigation() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[7]")).click();

     }
     @Then("click on favourites option on Employee type tab")
     public void clickOnFavouritesOptionOnEmployeeTab() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[8]")).click();

     }

     @Then("click on favourites option on Employee Grade")
     public void clickOnFavouritesOptionOnEmployeeGrade() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[9]")).click();

     }

     @Then("click on favourites option on client name")
     public void clickOnFavouritesOptionOnClientName() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[10]")).click();

     }

     @Then("click on favourites option on Category")
     public void clickOnFavouritesOptionOnCategory() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[11]")).click();

     }
     @Then("click on favourites option on  loaction")
     public void clickOnFavouritesOptionOnLoaction() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[12]")).click();

     }




     @Then("click on favourites option on Client loaction")
     public void clickOnFavouritesOptionOnClientLoaction() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[13]")).click();

     }

     @Then("click on favourites option on staff")
     public void clickOnFavouritesOptionOnStaff() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[14]")).click();

     }

     @Then("click on favourites option on job department")
     public void clickOnFavouritesOptionOnJobDepartment() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[15]")).click();

     }

     @Then("click on favourites option on Employee permission")
     public void clickOnFavouritesOptionOnEmployeePermission() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[16]")).click();

     }

     @Then("click on favourites option on Employee to Company")
     public void clickOnFavouritesOptionOnEmployeeToCompany() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[17]")).click();

     }

     @Then("click on favourites option on Employee to cient")
     public void clickOnFavouritesOptionOnEmployeeToCient() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[18]")).click();

     }



     @Then("click on favourites option on staff to client")
     public void clickOnFavouritesOptionOnStaffToClient() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[19]")).click();

     }

     @Then("click on favourites option on staff permission")
     public void clickOnFavouritesOptionOnStaffPermission() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[20]")).click();

     }

     @Then("click on favourites option on  Guest user")
     public void clickOnFavouritesOptionOnGuestUser() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[21]")).click();

     }
     @Then("click on favourites option on Assign Guest user")
     public void clickOnFavouritesOptionOnAssignGuestUser() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[22]")).click();

     }




     @Then("click on favourites option on password manager")
     public void clickOnFavouritesOptionOnPasswordManager() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[2]")).click();
     }

     @Then("click on favourites option on Client log")
     public void clickOnFavouritesOptionOnClientLog() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[5]")).click();


     }

     @Then("click on favourites option on Company log")
     public void clickOnFavouritesOptionOnCompanyLog() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[4]")).click();

     }


     @Then("click on favourites option on Gl ac")
     public void clickOnFavouritesOptionOnGlAc() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[2]")).click();

     }

     @Then("click on favourites option on sub gl account")
     public void clickOnFavouritesOptionOnSubGlAccount() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[3]")).click();

     }
     @Then("click on favourites option on Costcenter")
     public void clickOnFavouritesOptionOnCostcenter() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[4]")).click();

     }
     @Then("click on favourites option on Globel gl")
     public void clickOnFavouritesOptionOnGlobelGl() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[5]")).click();

     }
     @Then("click on favourites option on Account cateory")
     public void clickOnFavouritesOptionOnAccountCateory() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[6]")).click();

     }


     @Then("click on favourites option on managment")
     public void clickOnFavouritesOptionOnManagment() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[7]")).click();

     }




     @Then("click on favourites option on my task")
     public void clickOnFavouritesOptionOnMyTask() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[2]")).click();

     }

     @Then("click on favourites option on my team")
     public void clickOnFavouritesOptionOnMyTeam() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[3]")).click();

     }


     @Then("click on favourites option on Timesheet")
     public void clickOnFavouritesOptionOnTimesheet() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[4]")).click();

     }

     @Then("click on favourites option on Duration")
     public void clickOnFavouritesOptionOnDuration() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[5]")).click();

     }

     @Then("click on favourites option on exception")
     public void clickOnFavouritesOptionOnException() {
         driver.findElement(By.xpath("(//*[text()=\"star_border\"])[6]")).click();

     }






     @Then("Click on view button Guest user tab")
     public void clickOnViewButtonGuestUserTab() throws InterruptedException {
         report_company_location.guest();
         report_company_location.guest1();
     }

     @Then("Click on Cancel button\\(guest user)")
     public void clickOnCancelButtonGuestUser() throws InterruptedException {
         report_company_location.guestdownload();
     }



     @Then("Click on view button Assign Guest user tab")
     public void clickOnViewButtonAssignGuestUserTab() {
         report_company_location.assign_guest();
     }

     @Then("Click on Cancel button\\(Assign user)")
     public void clickOnCancelButtonAssignUser() throws InterruptedException {
         report_company_location.assign_guest_download();
     }

     @Then("mouse over on Account reconcilation tab")
     public void mouseOverOnAccountReconcilationTab() throws InterruptedException {
         report_company_location.setAccount_reconcilation();
     }

     @Then("click on favourites")
     public void clickOnFavourites() {
         driver.findElement(By.xpath(" //*[text()=\"Favourites\"]\n")).click();
     }









     @Then("Click on more icon")
     public void clickOnMoreIcon() {
         more.more();

     }

     @Then("click on Employee to Company tab")
     public void clickOnEmployeeToCompanyTab() throws InterruptedException {
         more.emp_to_cmp();
     }

     @Then("Select the  emplaoyee")
     public void selectTheEmplaoyee() {
     }
     @Then("Select the  Company \\(cloud)")
     public void selectTheCompanyCloud() {
     }


     @Then("click download button and download the file")
     public void clickDownloadButtonAndDownloadTheFile() {
     }

     @Then("click on submit button")
     public void clickOnSubmitButton() {
     }

     @Then("click on Add employee tab")
     public void clickOnAddEmployeeTab() {
     }

     @Then("Click add button on Employee List\\(cloud)")
     public void clickAddButtonOnEmployeeListCloud() {
     }





     @Then("Select basic information option\\(cloud)")
     public void selectBasicInformationOptionCloud() throws InterruptedException {
         more.setEmp_tab();
     }

     @And("Enter All mendetry fields on basic information\\(cloud)")
     public void enterAllMendetryFieldsOnBasicInformationCloud() {
     }

     @Then("Select basic Company Related option\\(cloud)")
     public void selectBasicCompanyRelatedOptionCloud() {
     }

     @And("Enter All mendetry fields on Company Related\\(cloud)")
     public void enterAllMendetryFieldsOnCompanyRelatedCloud() {
     }

     @Then("Search Employee List which is currently added\\(cloud)")
     public void searchEmployeeListWhichIsCurrentlyAddedCloud() {
     }

     @Then("Delete Employee List which is currently added\\(cloud)")
     public void deleteEmployeeListWhichIsCurrentlyAddedCloud() {
     }


















     //
     @Then("Click on Roles and Permissions tab \\(cloud)")
     public void clickOnRolesAndPermissionsTabCloud() throws InterruptedException {
         more.setRole();
         more.setGo();
     }

     @And("Click on the Employee Permissions SubTab\\(cloud)")
     public void clickOnTheEmployeePermissionsSubTabCloud() {
     }

     @And("Click on Employee tab\\(import)")
     public void clickOnEmployeeTabImport() {
     }

     @Then("Attach the file on Attachment option")
     public void attachTheFileOnAttachmentOption() {
     }

     @Then("Click on Attachment option on View GL Account page")
     public void clickOnAttachmentOptionOnViewGLAccountPage() {
     }

     @Then("click on add button to upload the fie")
     public void clickOnAddButtonToUploadTheFie() {
     }

     @Then("Click upload icon to upload the file and click on save")
     public void clickUploadIconToUploadTheFileAndClickOnSave() {
     }

     @Then("Go to the Attachment GL Account Page")
     public void goToTheAttachmentGLAccount() {
     }

     @Then("Click on Replace icon to replace the file")
     public void clickOnReplaceIconToReplaceTheFile() {
     }

     @Then("Click on Attachment option on View sub GL Account page")
     public void clickOnAttachmentOptionOnViewSubGLAccountPage() {
     }






















     @And("Click on password button")
     public void clickOnPasswordButton() throws InterruptedException {
         file_client.Clientpassword();
     }

     @And("Enter the name for Client password")
     public void enterTheNameForClientPassword() {
     }

     @And("Enter the User_id for Client password")
     public void enterTheUser_idForClientPassword() {
     }

     @And("Enter the Description for Client password")
     public void enterTheDescriptionForClientPassword() {
     }

     @And("Enter the password for Client")
     public void enterThePasswordForClient() {
     }

     @And("Enter the Remarks for  password")
     public void enterTheRemarksForPassword() {
     }

     @And("save")
     public void save() {
     }












     // company
     @And("Click on view button on Company")
     public void clickOnViewButtonOnCompany() throws InterruptedException {
         file_client.Companypassword();

     }

     @And("Click on password button on Company")
     public void clickOnPasswordButtonOnCompany() {
     }

     @And("Enter the name for Company password")
     public void enterTheNameForCompanyPassword() {
     }

     @And("Enter the User_id for Company password")
     public void enterTheUser_idForCompanyPassword() {
     }

     @And("Enter the Description for Company password")
     public void enterTheDescriptionForCompanyPassword() {
     }

     @And("Enter the password for Company")
     public void enterThePasswordForCompany() {
     }

     @And("cLick on mouse over on file")
     public void clickOnMouseOverOnFile() throws InterruptedException {
         preview.setPriview1();

     }


















     // import file
     @Then("Click on Import Icon on View Client\\(Master)")
     public void clickOnImportIconOnViewClientMaster() throws InterruptedException {
         Import_file.setCloud();

     }

     @Then("Download Sample file")
     public void downloadSampleFile() {
     }








     // employee transfer

     @And("Click on Employee Transfer")
     public void clickOnEmployeeTransfer() throws InterruptedException {
         Employee_Transfer.setEmp_tab();
     }

     @And("Select Group company")
     public void selectGroupCompany() {
     }








     @Then("Enter All mendetry fields in \\(Employee Transfer)page")
     public void enterAllMendetryFieldsInEmployeeTransferPage() {
     }





     @And("Click on Add client request")
     public void clickOnAddClientRequest() throws InterruptedException {
         add_client_master.setClient_request();
     }

     @And("Enter All mendetry fields for client request")
     public void enterAllMendetryFieldsForClientRequest() {
     }

     @Then("Go to Team Log tab")
     public void goToTeamLogTab() {
     }

     @Then("Perform Aprrove and Reject function")
     public void performAprroveAndRejectFunction() {

     }













     //  Client-Location Registration

     @And("Client-Location Registration page should display")
     public void clientLocationRegistrationPageShouldDisplay() {

     }

     @And("Click on add button on Client-Location Registration")
     public void clickOnAddButtonOnClientLocationRegistration() {

     }
     @And("Fill all the mandatory field on Client-Location Registration and save")
     public void fillAllTheMandatoryFieldOnClientLocationRegistrationAndSave() {
     }
     @And("Click on Edit button")
     public void clickOnEditButton() {
     }

     @Then("Modify")
     public void modify() {
     }





     @Then("download Excel  files")
     public void downloadExcelFiles() throws InterruptedException {
         excel_pdf.setSetting();
     }

     @Then("download pdf and excel files")
     public void downloadPdfAndExcelFiles() throws InterruptedException {
         excel_pdf.setPdf();
     }






     @And("I Click on aaaaa Login")
     public void iClickOnAaaaaLogin() {

     }

     @And("Click on aaa masters")
     public void clickOnAaaMasters() {
         driver.findElement(By.xpath("")).click();
     }

     @And("Go to the Group company icon")
     public void goToTheGroupCompanyIcon() throws InterruptedException {
         cmp_loc.setGroup_company();
     }

     @And("click on view button on Group company")
     public void clickOnViewButtonOnGroupCompany() {
     }


     /////// leave





     @Then("Click on the Basic Read check Box to allow the employee to the View Options")
     public void clickOnTheBasicReadCheckBoxToAllowTheEmployeeToTheViewOptions() throws InterruptedException {
         Actions actions =new Actions(driver);
         WebElement closeMenuOption = driver.findElement(By.xpath("//*[text()=\"Company\"]"));
         actions.moveToElement(closeMenuOption).perform();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@type=\"checkbox\"]")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("//span[contains(text(),'Go')]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("(//*[@type=\"text\"])[4]")).sendKeys("sarika");
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[35]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[36]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[37]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[38]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[39]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[40]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[41]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("//*[text()=\"Submit\"]\n")).click();
         Thread.sleep(8000);

     }

     @Then("Search the Specific name intot the Search Employee field")
     public void searchTheSpecificNameIntotTheSearchEmployeeField() {
     }

     @Then("Click on the Go Button to  Search Employee\\(s)")
     public void clickOnTheGoButtonToSearchEmployeeS() {
     }


     @Then("Uncheck  all the unwanted modules checked from the Searched Employee")
     public void uncheckAllTheUnwantedModulesCheckedFromTheSearchedEmployee() {
     }

     @Then("Click on submit on Employee Permssions")
     public void clickOnSubmitOnEmployeePermssions() {
     }
//verify

     @When("Login to the Employee using Node employees Details")
     public void loginToTheEmployeeUsingNodeEmployeesDetails() {
     }

     @Then("Click on the Roles and Permssions \\(Should be able to view the page )")
     public void clickOnTheRolesAndPermssionsShouldBeAbleToViewThePage() {
     }

     @Then("Click on the Roles and Permssions >> Employee Permssions")
     public void clickOnTheRolesAndPermssionsEmployeePermssions() {
     }

     @Then("On Clicking on go should display Permission Denied")
     public void onClickingOnGoShouldDisplayPermissionDenied() {
     }

     @Then("Logout")
     public void logout() {
     }


















     // write permission
     @Then("Click on the Basic write check Box to allow the employee to the View Options")
     public void clickOnTheBasicWriteCheckBoxToAllowTheEmployeeToTheViewOptions() throws InterruptedException {


         Actions actions =new Actions(driver);
         WebElement closeMenuOption = driver.findElement(By.xpath("//*[text()=\"Company\"]"));
         actions.moveToElement(closeMenuOption).perform();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         Thread.sleep(2000);
         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("//span[contains(text(),'Go')]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("(//*[@type=\"text\"])[4]")).sendKeys("sarika");
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[35]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[36]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[37]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[38]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[39]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[40]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[41]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("//*[text()=\"Submit\"]\n")).click();
         Thread.sleep(8000);
     }

     @Then("Click on the Basic admin check Box to allow the employee to the View Options")
     public void clickOnTheBasicAdminCheckBoxToAllowTheEmployeeToTheViewOptions() throws InterruptedException {



         Actions actions =new Actions(driver);
         WebElement closeMenuOption = driver.findElement(By.xpath("//*[text()=\"Company\"]"));
         actions.moveToElement(closeMenuOption).perform();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         Thread.sleep(2000);
         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[3]")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("//span[contains(text(),'Go')]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("(//*[@type=\"text\"])[4]")).sendKeys("sarika");
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[35]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[36]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[37]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[38]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[39]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[40]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[41]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("//*[text()=\"Submit\"]\n")).click();
         Thread.sleep(8000);
     }

     @Then("Click on the Master Read check Box to allow the employee to the View Options")
     public void clickOnTheMasterReadCheckBoxToAllowTheEmployeeToTheViewOptions() throws InterruptedException {


         Actions actions =new Actions(driver);
         WebElement closeMenuOption = driver.findElement(By.xpath("//*[text()=\"Company\"]"));
         actions.moveToElement(closeMenuOption).perform();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         Thread.sleep(2000);
         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[3]")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("//span[contains(text(),'Go')]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("(//*[@type=\"text\"])[4]")).sendKeys("sarika");
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[35]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[36]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[37]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[38]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[39]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[40]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[41]\n")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("//*[text()=\"Submit\"]\n")).click();
         Thread.sleep(8000);
     }


     @And("Click on Create Folder Icon Resource")
     public void clickOnCreateFolderIconResource() throws InterruptedException {
         Cloud.setText_boxresources();
     }


     @And("Hover on file Resource")
     public void hoverOnFileResource() throws InterruptedException {
         preview.mouser_resources();
     }

     @And("Click on Restore Icon Resource")
     public void clickOnRestoreIconResource() throws InterruptedException {
         auto_dlt.restore();
     }

     @And("click on my profile")
     public void clickOnChangePassword() throws InterruptedException {
         Thread.sleep(6000);

         driver.findElement(By.xpath("//*[text()=\" My Profile \"]")).click();
         Thread.sleep(6000);

         driver.findElement(By.xpath("(//*[@type=\"text\" ])[4]")).clear();

         driver.findElement(By.xpath("(//*[@type=\"text\" ])[4]")).sendKeys("raipur");
         Thread.sleep(6000);
         driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
         Thread.sleep(6000);
         driver.findElement(By.xpath("//*[text()=\"Cancel\"]")).click();
         Thread.sleep(6000);

//*[@type="button"]
        // driver.findElement(By.xpath("//*[text()=\" Change Password \"]")).click();
         Thread.sleep(8000);

     }

     @And("Enter Current password")
     public void enterCurrentPassword() {
         driver.findElement(By.xpath("(//*[@type=\"password\"])[1]")).sendKeys("123456");

     }

     @And("Enter new password")
     public void enterNewPassword() {
         driver.findElement(By.xpath("(//*[@type=\"password\"])[2]")).sendKeys("sarika@15");

     }

     @And("Enter confirm password")
     public void enterConfirmPassword() {
         driver.findElement(By.xpath("(//*[@type=\"password\"])[3]")).sendKeys("sarika@15");


     }

     @And("Click on submit and verify")
     public void clickOnSubmitAndVerify() {
         driver.findElement(By.xpath("//*[text()=\"Submit\"]")).click();

     }

     @And("log out the application")
     public void logOutTheApplication() throws InterruptedException {
         Thread.sleep(6000);

         driver.findElement(By.xpath("//*[text()=\"settings_power\"]")).click();
         Thread.sleep(9000);
     }

     @And("Again login the application")
     public void againLoginTheApplication() throws InterruptedException{

         driver.findElement(By.xpath("//*[text()=\" My Profile \"]")).click();
         Thread.sleep(6000);

         driver.findElement(By.xpath("(//*[@type=\"text\"])[4]")).getText();
         Thread.sleep(4000);
         driver.findElement(By.xpath("//*[text()=\"Cancel\"]")).click();
         Thread.sleep(6000);
         driver.findElement(By.xpath("//*[text()=\" Change Password \"]")).click();
         Thread.sleep(4000);


         driver.findElement(By.xpath("(//*[@type=\"password\"])[1]")).sendKeys("sarika@15");
         Thread.sleep(4000);

         driver.findElement(By.xpath("(//*[@type=\"password\"])[2]")).sendKeys("abc@123");
         Thread.sleep(4000);

         driver.findElement(By.xpath("(//*[@type=\"password\"])[3]")).sendKeys("abc@123");
         Thread.sleep(4000);

         driver.findElement(By.xpath("//*[text()=\"Submit\"]")).click();


     }

     @And("Go to the quick links page")
     public void goToTheQuickLinksPage() throws InterruptedException {
         recsPage.setQuick_Links();
     }

     @And("Click on  view links")
     public void clickOnViewLinks() {
     }

     @And("Click on add button to add a link")
     public void clickOnAddButtonToAddALink() {
     }

     @And("Enter the name for link")
     public void enterTheNameForLink() {
     }

     @Then("Enter the URL for link")
     public void enterTheURLForLink() {
     }

     @Then("Enter the comments for link")
     public void enterTheCommentsForLink() {
     }

     @Then("click on column selection option and verify")
     public void clickOnColumnSelectionOptionAndVerify() {
     }

     @Then("click on download tab")
     public void clickOnDownloadTab() {
     }

     @Then("download excel and pdf link file")
     public void downloadExcelAndPdfLinkFile() {
     }















     //---------------------------Business entities-----------------------------------------------------//


     @And("Go to the Business entities page")
     public void goToTheBusinessEntitiesPage() throws InterruptedException {
         recsPage.setBusiness_entities();
     }

     @Then("move to the toggle button legal Entity side")
     public void moveToTheToggleButtonLegalEntitySide() {
     }

     @Then("click on add button for adding a legal entity")
     public void clickOnAddButtonForAddingALegalEntity() {
     }

     @Then("fill all mandotry fileds and click on save and verify")
     public void fillAllMandotryFiledsAndClickOnSaveAndVerify() {
     }

     @Then("search details which we have currently added")
     public void searchDetailsWhichWeHaveCurrentlyAdded() {
     }

     @Then("click on edit button and modify the details")
     public void clickOnEditButtonAndModifyTheDetails() {
     }

     @Then("click on download to download the files")
     public void clickOnDownloadToDownloadTheFiles() {
     }

     @Then("click on location log")
     public void clickOnLocationLog() {
     }





     //---------------------------Business managment entities-----------------------------------------------------//


     @And("Go to the Business entities")
     public void goToTheBusinessEntities() throws InterruptedException {
         recsPage.setBusiness_entities_1();
     }

     @Then("move to the toggle button management Entity side")
     public void moveToTheToggleButtonManagementEntitySide() {
     }











     @And("Go to the FAQ page")
     public void goToTheFAQPage() throws InterruptedException {
         recsPage.setFaq();
     }










     @And("Go to the Account Recs page")
     public void goToTheAccountRecsPage() throws InterruptedException {
         recsPage.setAccount_recs();
     }

     @Then("I Click on login page")
     public void iClickOnLoginPage() throws InterruptedException {
         driver.findElement(By.xpath("(//*[text()=\"Login\"])[2]")).click();
         Thread.sleep(7000);
     }

     @Then("Click on preview folder")
     public void clickOnPreviewFolder() throws InterruptedException {
         Cloud.priview_option();
     }

     @Then("view all the options")
     public void viewAllTheOptions() {
     }









     @Then("click on right side")
     public void clickOnRightSide() throws InterruptedException {
         multiple_folder.setDetails();
     }

     @Then("Move multiple folder")
     public void moveMultipleFolder() {
     }

     @Then("Upload multiple file upload")
     public void uploadMultipleFileUpload() {
     }











     //------------------------example
     @Then("I Click on login page button")
     public void iClickOnLoginPageButton() {
       sarika.sarikamishras();

     }

     @And("I enter UserName button {string} And Password {string}")
     public void iEnterUserNameButtonAndPassword(String arg0, String arg1) {
     }

     @Then("Hover on Right Side hhhhhh panel GL Category")
     public void hoverOnRightSideHhhhhhPanelGLCategory() {
         page.setTest2();
         page.setTest3();
     }

     @And("Click on Account ggg Reconciliation tab")
     public void clickOnAccountGggReconciliationTab() {
     }

     @And("I Click on Login icon")
     public void iClickOnLoginIcon() throws InterruptedException {
         lp.setLogin_button();
         Thread.sleep(4000);

         driver.findElement(By.xpath("(//*[@type=\"radio\"])[1]")).click();
         Thread.sleep(4000);

           driver.findElement(By.xpath("//*[text()=\"save\"]")).click();
           Thread.sleep(8000);
     }
 }