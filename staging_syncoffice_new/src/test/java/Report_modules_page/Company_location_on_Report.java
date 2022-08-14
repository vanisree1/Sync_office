package Report_modules_page;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

public class Company_location_on_Report {
    public WebDriver driver;
    public String random_num = Utilities_class.randomnemeric(6);
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(9);

    public Company_location_on_Report(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[text()=\"Master\"]")
    WebElement master;
    @FindBy(xpath = "    //*[text()=\"Password Manager\"]\n")
    WebElement password_manager;
    @FindBy(xpath = "//*[text()=\"Account Reconciliation\"]")
    WebElement account_reconcilation;
    @FindBy(xpath = "//*[text()=\"Clock\"]")
    WebElement clock;


    //*[text()="Password Manager"]
    @FindBy(xpath = "(//*[text()=\"visibility\"])[1]")
    WebElement company_location;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[1]")
    WebElement password_manger_log;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[1]")
    WebElement gl_account;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[2]")
    WebElement Subgl_account;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[3]")
    WebElement cost_center;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[4]")
    WebElement globel_gl;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[5]")
    WebElement Account_category;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[1]")
    WebElement my_task;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[2]")
    WebElement my_team;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[3]")
    WebElement Timesheet_report;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[4]")
    WebElement Duration_Report;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[5]")
    WebElement Exception_Report;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[6]")
    WebElement management_enitity;

    @FindBy(xpath = "(//*[text()=\"visibility\"])[2]")
    WebElement company_log;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[3]")
    WebElement Client_log;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[3]")
    WebElement Registration;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[4]")
    WebElement employee;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[5]")
    WebElement department_view;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[6]")
    WebElement Degigation;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[7]")
    WebElement employee_type;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[8]")
    WebElement employee_grade;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[9]")
    WebElement Client_name;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[10]")
    WebElement category;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[11]")
    WebElement location;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[12]")
    WebElement Client_location;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[13]")
    WebElement Staff;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[14]")
    WebElement job_department;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[16]")
    WebElement Employee_to_company;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[17]")
    WebElement emolyee_to_client;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[18]")
    WebElement staff_to_client;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[20]")
    WebElement Guest_user;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[21]")
    WebElement Assign_guest_user;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[15]")
    WebElement emplyee_permission;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[19]")
    WebElement staff_permission;
    @FindBy(xpath = "//*[text()=\"filter_list\"]")
    WebElement filter_list;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement save;
    @FindBy(xpath = "//*[text()=\"Save\"]")
    WebElement Save;
    @FindBy(xpath = "/html/body/div[7]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/span/span/span[1]/input")
    WebElement checkbox;
    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/input[1]")
    WebElement checkbox_bank_details;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])")
    WebElement view_check_box;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[2]")
    WebElement view_check_box_1;

    @FindBy(xpath = "(//*[@type=\"checkbox\"])[3]")
    WebElement view_check_box_2;

    @FindBy(xpath = "//*[text()=\"share\"]")
    WebElement share;
    //(//*[text()="Download"])[3]
    @FindBy(xpath = "(//*[@name=\"email\"])")
    WebElement mail;
    @FindBy(xpath = "//*[@name=\"name\"]")
    WebElement save_name;
    @FindBy(xpath = "    //*[text()=\"Send\"]\n")
    WebElement send;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])")
    WebElement selct_box;
    @FindBy(xpath = "//*[text()=\">\"]")
    WebElement arrow;
    @FindBy(xpath = "//*[text()=\"Cancel\"]\n")
    WebElement cancel;
    @FindBy(xpath = "    //*[text()=\"get_app\"]\n")
    WebElement download_option;
    @FindBy(xpath = "    //*[text()=\"get_app\"]\n")
    WebElement password_manager_log_download;
    @FindBy(xpath = "    //*[text()=\"get_app\"]\n")
    WebElement Gl_Account_download;
    @FindBy(xpath = "    //*[text()=\"get_app\"]\n")
    WebElement My_Task_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[2]")
    WebElement download_option_bank_details;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[2]")
    WebElement SubGl_Account_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[2]")
    WebElement My_team_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[2]")
    WebElement company_log_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[3]")
    WebElement download_option_Registration;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[3]")
    WebElement cost_center_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[3]")
    WebElement Timesheet_reprt_download;

    @FindBy(xpath = "    (//*[text()=\"get_app\"])[3]")
    WebElement client_log_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[4]")
    WebElement emplyee_name_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[4]")
    WebElement Globel_Gl_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[4]")
    WebElement Duration_report_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[5]")
    WebElement Department_download;
    @FindBy(xpath = "(//*[text()=\"get_app\"])[5]")
    WebElement Account_category_download;
    @FindBy(xpath = "(//*[text()=\"get_app\"])[5]")
    WebElement Exception_report_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[6]")
    WebElement degiganation_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[6]")
    WebElement managment_entity_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[7]")
    WebElement Employee_type_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[8]")
    WebElement Emplyee_Grade_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[9]")
    WebElement Client_name_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[10]")
    WebElement category_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[11]")
    WebElement location_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[12]")
    WebElement client_location_reg_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[13]")
    WebElement staff_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[14]")
    WebElement job_department_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[16]")
    WebElement employee_to_company_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[17]")
    WebElement employee_to_client_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[20]")
    WebElement guest_user_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[21]")
    WebElement assign_guest_user_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[18]")
    WebElement staff_to_client_download;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[15]")
    WebElement employee_permission_donload;
    @FindBy(xpath = "    (//*[text()=\"get_app\"])[19]")
    WebElement staff_permission_download;
    @FindBy(xpath = "//*[text()=\"PDF\"]")
    WebElement pdf;
    @FindBy(xpath = "(    //*[text()=\"star_border\"])[2]")
    WebElement star;
    @FindBy(xpath = "//*[text()=\"close\"]")
    WebElement close;
    @FindBy(xpath = "(    //*[text()=\"star_border\"])[4]")
    WebElement star_registration;
    @FindBy(xpath = "(    //*[text()=\"star_filled\"])")
    WebElement remove;
    @FindBy(xpath = "(    //*[text()=\"star_filled\"])[1]")
    WebElement remove_bank;
    //
    @FindBy(xpath = "    //*[text()=\"Download\"]\n")
    WebElement download;
    @FindBy(xpath = " //*[text()=\" Report \"]")
    WebElement Report;
    @FindBy(xpath = "//*[text()=\"Excel\"]")
    WebElement excel;
    @FindBy(xpath = "    //*[text()=\"Save Template\"]\n")
    WebElement save_template;
    @FindBy(xpath = "     //*[text()=\"Favourites\"]\n")
    WebElement Favourites;
    @FindBy(xpath = "    //*[@title=\"Delete\"]")
    WebElement dlt;
    @FindBy(xpath = "    (//*[text()=\"Download\"])[2]")
    WebElement downld;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[2]")
    WebElement bankdetails;

    public void employee_permission(){

        emplyee_permission.click();
    }

    public void staff_permission(){

        staff_permission.click();
    }
    public void setReport() throws InterruptedException {
        Report.click();
        Thread.sleep(6000);
    }

    public void setMaster() throws InterruptedException {
        master.click();
        Thread.sleep(4000);

    }


    public void setCompany_location() throws InterruptedException {

        company_location.click();
        Thread.sleep(4000);

    }

    public void setFilter_list() throws InterruptedException {
        Thread.sleep(4000);

        //    view_check_box.click();

        Actions ac = new Actions(driver);
        ac.moveToElement(filter_list).build().perform();
        Thread.sleep(4000);

        filter_list.click();
        Thread.sleep(4000);

    }

    public void setCheckbox() throws InterruptedException {
        checkbox.click();
        Thread.sleep(4000);

    }

    public void setSave() throws InterruptedException {
        save.click();
        Thread.sleep(4000);


    }

    public void setView_check_box() throws InterruptedException {

        // JavascriptExecutor executor = (JavascriptExecutor) driver;
        //   executor.executeScript("arguments[0].click();", view_check_box);
        //   view_check_box.click();
        Thread.sleep(4000);

    }

    public void empname() throws InterruptedException {
        view_check_box.click();
        Thread.sleep(4000);

        view_check_box_1.click();
        Thread.sleep(4000);

        share.click();
        Thread.sleep(4000);

        mail.sendKeys("mishrasarika699@gmail.com");
        Thread.sleep(4000);

        send.click();
        Thread.sleep(4000);
    }

    public void setShare() throws InterruptedException {
        view_check_box.click();
        Thread.sleep(4000);

        share.click();
        Thread.sleep(4000);

        mail.sendKeys("mishrasarika699@gmail.com");
        Thread.sleep(4000);

        send.click();
        Thread.sleep(4000);


    }

    public void setDownload1() throws InterruptedException {
        view_check_box_1.click();
        Thread.sleep(4000);

        download.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);
        pdf.click();
        Thread.sleep(4000);


    }

    public void setDownload() throws InterruptedException {
        view_check_box.click();
        Thread.sleep(4000);

        download.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);
        pdf.click();
        Thread.sleep(4000);
        //cancel.click();


    }

    public void setCancel() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
       // star.click();
        Thread.sleep(4000);

        download_option.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);


    }


    public void setSave_name() throws InterruptedException {
        Thread.sleep(4000);

        save_name.sendKeys("report");
        Thread.sleep(4000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", Save);
        // Save.click();
        Thread.sleep(4000);

        cancel.click();
        Thread.sleep(4000);

    }


    public void setFavourites() throws InterruptedException {
        Favourites.click();
       // Thread.sleep(4000);
//driver.findElement(By.xpath("(//*[text()=\"get_app\"])[2]")).click();
  //      Thread.sleep(4000);

    //    driver.findElement(By.xpath("//*[text()=\"Excel\"]")).click();
        Thread.sleep(7000);

        dlt.click();
        Thread.sleep(4000);

    }


    public void setRemove() throws InterruptedException {
        Thread.sleep(4000);

        remove.click();
    }

    //bank details
    public void setBankdetails() throws InterruptedException {
        Thread.sleep(3000);

        bankdetails.click();
    }

    public void setDownload_option_bank_details() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
    //    star_bank_details.click();
        Thread.sleep(4000);

        download_option_bank_details.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }


    //setRegistration

    public void setRegistration() throws InterruptedException {
        Thread.sleep(4000);


        Registration.click();
    }

    public void setDownload_option_Registration() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
       // star_registration.click();
        Thread.sleep(4000);

        download_option_Registration.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }


    //emp name
    public void setEmplyee_name() throws InterruptedException {
        Thread.sleep(4000);

        employee.click();
        Thread.sleep(4000);

    }

    public void setEmplyee_name_download() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();
        Thread.sleep(4000);

        emplyee_name_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }


    // department
    public void setDepartment_view() {

        department_view.click();
    }

    public void setDepartment_download() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();
        Thread.sleep(4000);

        Department_download
                .click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }


    //   Degiganation

    public void setDegiganation() {

        Degigation.click();
    }

    public void setDegiganation_download() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        degiganation_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }


    // Employee_grade

    public void setEmployee_grade() throws InterruptedException {
        Thread.sleep(3000);

        employee_grade.click();
    }


    public void setEmplyee_Grade_download() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        Emplyee_Grade_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }


    //Employee_type
    public void setEmployee_type() {
        employee_type.click();
    }

    public void setEmployee_type_download() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        Employee_type_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }
public void guest() throws InterruptedException {
    Guest_user.click();
    Thread.sleep(4000);

    close.click();


}
    public void guest1() throws InterruptedException {
        Thread.sleep(4000);

        Guest_user.click();


    }
    public void guestdownload() throws InterruptedException {
        //cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        guest_user_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);}


public void assign_guest(){
        Assign_guest_user.click();

}

    public void assign_guest_download() throws InterruptedException {
        //cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        assign_guest_user_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }
    // client


    public void setClient_name() {
        Client_name.click();
    }

    public void setClient_name_download() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        Client_name_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }


    //Category
    public void setCategory() {

        category.click();
    }

    public void setCategory_download() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        category_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }


    public void setLocation() {

        location.click();
    }

    public void setLocation_download() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        location_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }


    // client location

    public void setClient_location() {

        Client_location.click();

    }

    public void setClient_location_reg_download() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        client_location_reg_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }


    //staff


    public void setStaff() {

        Staff.click();
    }

    public void setStaff_download() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        staff_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }
    public void setStaff_permission_download() throws InterruptedException {
        Thread.sleep(4000);
        //   star_registration.click();

        staff_permission_download.click();
        Thread.sleep(4000);

    /*    selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);*/
    }
    public void setEmployee_permission_download() throws InterruptedException {
     //   cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        emplyee_name_download.click();
        Thread.sleep(4000);

    /*    selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);*/
    }

    // job department
    public void setJob_department() {

        job_department.click();
    }

    public void setJob_department_download() throws InterruptedException {

        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        job_department_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }


    public void setEmployee_to_company() {

        Employee_to_company.click();
    }

    public void setEmployee_to_company_download() throws InterruptedException {


        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        employee_to_company_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }


    // emplyee to client


    public void setEmolyee_to_client() {

        emolyee_to_client.click();
    }

    public void setEmployee_to_client_downloadmolyee_to_client_d() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        employee_to_client_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }

    public void setStaff_to_client() {

        staff_to_client.click();
    }

    public void setstaff_to_client_download() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        staff_to_client_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }


    //passwordmanger


    public void setPassword_manager() {
        password_manager = password_manager;
    }

    public void setPassword_manger_log() {

        password_manger_log.click();
    }


    public void setPassword_manager_log_download() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        password_manager_log_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }


    //company log


    public void setCompany_log() {

        company_log.click();
    }


    public void setCompany_log_download() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        company_log_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }


    public void setClient_log() {

        Client_log.click();
    }


    public void setClient_log_download() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        client_log_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }


    //Account_reconcilation
    public void setAccount_reconcilation() throws InterruptedException {
        Thread.sleep(4000);

        account_reconcilation.click();
        Thread.sleep(4000);

    }

    public void setGl_account() {

        gl_account.click();
    }

    public void setGl_Account_download() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        Gl_Account_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }


    // sub gl account

    public void setSubgl_account() {

        Subgl_account.click();
    }

    public void setSubGl_Account_download() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        SubGl_Account_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }


// cost center


    public void setCost_center() {

        cost_center.click();
    }

    public void setCost_center_download() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        SubGl_Account_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }


    // globel


    public void setGlobel_gl() {


        globel_gl.click();
    }

    public void setGlobel_Gl_download() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        Globel_Gl_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }


    //Account Caterory


    public void setAccount_category() throws InterruptedException {
        Thread.sleep(4000);


        Account_category.click();
    }

    public void setAccount_category_download() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        Account_category_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);
pdf.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }


    public void setManagement_enitity() {

        management_enitity.click();
        ;
    }


    public void setManagment_entity_download() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        managment_entity_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }


    //clock


    public void setClock() {
        clock.click();
    }


    public void setMy_task() {
        my_task.click();
    }

    public void setMy_Task_download() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        my_task.click();
        Thread.sleep(4000);

        view_check_box_2.click();
        Thread.sleep(4000);

      //  arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);
    }

    public void checkbox2() {
        view_check_box.click();
    }


    // My team
    public void setMy_team() {
        my_team.click();
    }


    public void setMy_team_download() throws InterruptedException {

        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        My_team_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);


    }


    //team sheet
    public void setTimesheet_report() {
        Timesheet_report.click();
    }


    public void setTimesheet_reprt_download() throws InterruptedException {
        cancel.click();
        Thread.sleep(4000);
        //   star_registration.click();

        Timesheet_reprt_download.click();
        Thread.sleep(4000);

        selct_box.click();
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);

        downld.click();
        Thread.sleep(4000);

        excel.click();
        Thread.sleep(4000);

        save_template.click();
        Thread.sleep(4000);

    }


    //Duration_Report
    public void setDuration_Report() {
        Duration_Report.click();
    }


    //Exception_Report
    public void setException_Report() {
        Exception_Report.click();
    }


    public void settask1() throws InterruptedException {
        view_check_box_2.click();
        Thread.sleep(4000);

        share.click();
        Thread.sleep(4000);

        mail.sendKeys("mishrasarika699@gmail.com");
        Thread.sleep(4000);

        send.click();
        Thread.sleep(4000);


    }
}
