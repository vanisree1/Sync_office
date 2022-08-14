package Master_Roles_and_Permission_Page;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Add_client_in_master_module {


    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(3);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String random__name = Utilities_class.randomalphabet(5);
    public String Second_name = Utilities_class.randomalphabet(5);

    public String number = Utilities_class.randomnemeric(3);
    public String number1 = Utilities_class.randomnemeric(10);
    public String number2 = Utilities_class.randomnemeric(8);
    public String number4 = Utilities_class.randomnemeric(9);


    public Add_client_in_master_module(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[text()=\"Prospective\"]")
    WebElement prosoect;
    @FindBy(xpath = "//*[@ name=\"fee\"]")
    WebElement fee;
    @FindBy(xpath = " //*[text()=\"Select...\"]")
    WebElement selct;
    @FindBy(xpath = "(//*[text()=\"--Select--\"])[3]")
    WebElement selct_code;
    @FindBy(xpath = "    (//*[text()=\"--Select--\"])[2]\n")
    WebElement selct_loc;
    @FindBy(xpath = "//*[text()=\"Manager\"]")
    WebElement job_department;
    @FindBy(xpath = "//*[text()=\"manager\"]")
    WebElement job_code;
    @FindBy(xpath = "//*[@title=\"Add Client\"]")
    WebElement add_cir;
    @FindBy(xpath = "//*[text()=\"Basic Info\"]")
    WebElement genral;
    @FindBy(xpath = "//*[@name=\"name\"]")
    WebElement name_genral;
    @FindBy(xpath = "//*[@name=\"client_code\"]")
    WebElement client_code;
    @FindBy(xpath = "//div[contains(text(),'banking')]")
    WebElement sarika;
    @FindBy(xpath = "(//*[@name=\"gstin\"])")
    WebElement gstin;
    @FindBy(xpath = "//*[@name=\"pan\"]")
    WebElement PAN;
    @FindBy(xpath = "(//*[@name=\"tin\"])")
    WebElement TIN;
    @FindBy(xpath = "//*[text()=\"CIN\"]")
    WebElement CIN;
    @FindBy(xpath = "(//*[@type=\"text\"])[9]")
    WebElement web;
    @FindBy(xpath = "(//*[text()=\"Location Details\"])")
    WebElement location;
    @FindBy(xpath = "//*[@name=\"locName\"]")
    WebElement location1;
    @FindBy(xpath = "//*[@name=\"location_type\"]")
    WebElement location_type;
    @FindBy(xpath = "//*[text()=\"Administration\"]")
    WebElement adminstration;
    @FindBy(xpath = "//*[@name=\"address1\"]")
    WebElement adress_client;


    @FindBy(xpath = "(//*[@type=\"text\"])[6]")
    WebElement adrees2;
    @FindBy(xpath = "//*[@title=\"Download\"]")
    WebElement download;
    @FindBy(xpath = "(//*[@type=\"text\"])[5]")
    WebElement address;
    @FindBy(xpath = "(//*[@type=\"button\"]//*[@focusable=\"false\"])[4]")
    WebElement DATE;
    @FindBy(xpath = "(//*[text()=\"1\"])[1]")
    WebElement dat_1;
    @FindBy(xpath = "(//*[@type=\"button\"]//*[@focusable=\"false\"])[5]")
    WebElement to;
    @FindBy(xpath = "(//*[text()=\"28\"])[1]")
    WebElement to_date;
    @FindBy(xpath = "(//*[@type=\"button\"]//*[@focusable=\"false\"])[4]")
    WebElement DATE_genral;
    @FindBy(xpath = "(//*[@type=\"text\"])[10]")
    WebElement loc;
    @FindBy(xpath = "//*[@ name=\"landline_num\"]")
    WebElement number11;
    @FindBy(xpath = "//*[@name=\"pincode\"]")
    WebElement pincode;
    @FindBy(xpath = "//*[text()=\"None selected\"]")


    WebElement none;
    @FindBy(xpath = "//*[text()=\"Administration\"]")
    WebElement admins;
    @FindBy(xpath = "//*[@name=\"city\"]")
    WebElement city;
    @FindBy(xpath = "(//*[text()=\"save\"])")
    WebElement save;
    @FindBy(xpath = "//*[text()=\"Admin\"]")
    WebElement admin;
    @FindBy(xpath = "//*[@name=\"email\"]")
    WebElement email;
    @FindBy(xpath = "//*[@name=\"firstname\"]")
    WebElement first_name;
    @FindBy(xpath = "(//*[@type=\"text\"])[5]")
    WebElement middile_name;
    @FindBy(xpath = "//*[@name=\"lastname\"]")
    WebElement last_name;
    @FindBy(xpath = "//*[@type=\"tel\"]")
    WebElement tel;
    @FindBy(xpath = "//body/div[5]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/span[1]/span[1]/span[1]/input[1]")
    WebElement login_client_request;
    @FindBy(xpath = "//body/div[5]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/span[1]/span[1]/span[1]/input[1]")
    WebElement login;
    @FindBy(xpath = "//*[text()=\"Select All\"]")
    WebElement selct_all;
    @FindBy(xpath = "(//*[@class=\"material-icons MuiIcon-root-1671 MuiIcon-fontSizeSmall-1678\"])[2]")
    WebElement add_circle;
    @FindBy(xpath = "(//*[@ type=\"text\"])[3]")
    WebElement name;
    @FindBy(xpath = "//*[text()=\"--Select--\"]")
    WebElement selct_add;
    @FindBy(xpath = "//*[@name=\"address1\"]")
    WebElement adrres_add;
    @FindBy(xpath = "//*[@name=\"pincode\"]")
    WebElement pincode2;
    @FindBy(xpath = "//*[@name=\"city\"]")
    WebElement city_add;
    @FindBy(xpath = "//*[text()=\"Select...\"]")
    WebElement selcet_dept;
    @FindBy(xpath = "//*[text()=\"Administration\"]")
    WebElement adminstration_add;
    @FindBy(xpath = "(//*[@type=\"text\"])[4]")
    WebElement search;
    @FindBy(xpath = "//*[text()=\"tezBm\"]")
    WebElement maxx;
    @FindBy(xpath = "(//*[text()=\"Clients\"])")
    WebElement clients;
    @FindBy(xpath = "(//*[text()=\"Client\"])[2]")
    WebElement client;
    @FindBy(xpath = "(//*[@type=\"text\"])[3]")
    WebElement select;
    @FindBy(xpath = "(//*[@name=\"description\" ])[3]")
    WebElement decription;
    @FindBy(xpath = "//*[@name=\"name\" ]")
    WebElement category;
    @FindBy(xpath = "//*[text()=\"work\"]")
    WebElement add_client;
    @FindBy(xpath = "(//*[text()=\"add\"])[5]")
    WebElement add;

    @FindBy(xpath = "(//*[@type=\"text\"])[3]")
    WebElement text_search;
    @FindBy(xpath = "(//*[@type=\"text\"])[6]")
    WebElement Edit_function;
    @FindBy(xpath = "(//*[text()=\"delete\"])[2]")
    WebElement delete;
    @FindBy(xpath = "(//span[contains(text(),'Delete')])[2]")
    WebElement dlt_2;
    @FindBy(xpath = " (//*[text()=\"add\"])[5]\n")
    WebElement add_1;
    @FindBy(xpath = "(//*[@type=\"text\"])[4]")
    WebElement name_department;
    @FindBy(xpath = "(//*[@type=\"text\"])[5]")
    WebElement short_code_department;
    @FindBy(xpath = "//*[text()=\"Select...\"]")
    WebElement Activity_code;
    @FindBy(xpath = "//*[text()=\"Select All\"]")
    WebElement dropdown;
    @FindBy(xpath = "    //*[text()=\"Client Categories\"]\n")
    WebElement CLIENT;

    @FindBy(xpath = "(//*[@type=\"text\"])[4]\n")
    WebElement edit;
    @FindBy(xpath = "//*[text()=\"Client-Location Reg \"]")
    WebElement client_location_reg;
    @FindBy(xpath = "//*[text()=\"Update Client-Location\"]")
    WebElement Update_Client_Location;
    @FindBy(xpath = "(//*[text()=\"add\"])[5]")
    WebElement add_client_location;
    @FindBy(xpath = "//*[text()=\"Team Log\"]")
    WebElement Team_log;
    @FindBy(xpath = "    //*[text()=\"Client Categories\"]\n")
    WebElement CLkkIcENT;
    @FindBy(xpath = "    //*[text()=\"Client Categories\"]\n")
    WebElement CLaaIcENT;
    @FindBy(xpath = "    //*[text()=\"Client Categories\"]\n")
    WebElement CLIcEmmNT;



    // transfer
//(//*[ @class="material-icons MuiIcon-root-2355 MuiIcon-fontSizeSmall-2362"])[2]

    @FindBy(xpath="(//Select[@ class=\"mdc-select__native-control customFieldText py-0\"])[2]")
    WebElement contect_person;
    @FindBy(xpath="(//*[@ type=\"text\"])[14]")
    WebElement number_location;
    @FindBy(xpath="(//*[@ type=\"text\"])[12]")
    WebElement email_location;
    @FindBy(xpath="//*[text()=\"Client Locations\"]")
    WebElement Client_Locations;
    @FindBy(xpath="(//*[text()=\"kartike\"])[2]")
    WebElement max_loc;
    @FindBy(xpath="//*[@name=\"location\"]")
    WebElement location__name;
    @FindBy(xpath="//*[@name=\"name\"]")
    WebElement location_name;
    @FindBy(xpath="//*[text()=\"Location\"]")
    WebElement location_add;
    @FindBy(xpath="//*[@name=\"location_type\"]")
    WebElement location_type1;
    @FindBy(xpath="//*[@name=\"address1\"]")
    WebElement address_location;
    @FindBy(xpath="(//*[@name=\"address1\" ])")
    WebElement address2_location;
    @FindBy(xpath="(//*[@name=\"pincode\" ])")
    WebElement pincode_location;
    @FindBy(xpath="(//*[@name=\"state\" ])")
    WebElement city_location;

    @FindBy(xpath="(//*[text()=\"--Select--\" ])")
    WebElement select_client_person;
    @FindBy(xpath="(//*[text()=\"person_add\"])")
    WebElement person_add;
    @FindBy(xpath="//*[text()=\"FARMA\"]")
    WebElement harry_job_department;
    @FindBy(xpath="//*[text()=\"JM\"]")
    WebElement job_code_JM;
    @FindBy(xpath="(//*[text()=\"MAX\"])")
    WebElement max_admin;
    @FindBy(xpath="//div[contains(text(),'szqJo')]")
    WebElement sarika_drop;
    @FindBy(xpath="//*[text()=\"Select...\"]")
    WebElement selct_clientRequest;
    @FindBy(xpath="(//div[contains(text(),'LLC')])")
    WebElement LLc;
    @FindBy(xpath="//*[text()=\"--Select--\"]")
    WebElement select_category;
    @FindBy(xpath="//*[@name=\"city\"]")
    WebElement city_add_loc;
    @FindBy(xpath="//*[text()=\"Select...\"]")
    WebElement selcet_dept_loc;






    //staff
    @FindBy(xpath="    //*[text()=\"Client Staff\"]\n")
    WebElement client_staff;
    @FindBy(xpath="//*[text()=\"Staff\"]")
    WebElement staff;
    @FindBy(xpath="//*[@name=\"email\"]")
    WebElement mail_staff;
    @FindBy(xpath="//*[@name=\"firstname\"]")
    WebElement first_name_staff;
    @FindBy(xpath="(//*[@ type=\"text\"])[7]")
    WebElement middile_name_staff;
    @FindBy(xpath="//*[@name=\"lastname\"]")
    WebElement last_name_staff;
    @FindBy(xpath="(//*[@ type=\"tel\"])")
    WebElement teliphone_staff;
    @FindBy(xpath="//body/div[5]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[9]/div[1]/span[1]/span[1]/span[1]/input[1]")
    WebElement allow_login;











    // department
    @FindBy(xpath="//*[text()=\"Job Department\"]")
    WebElement Job_Department;
    @FindBy(xpath="//*[text()=\"Department\"]")
    WebElement department;
    @FindBy(xpath="(//*[text()=\"Select All\" ])")
    WebElement select_all;
    @FindBy(xpath="(//*[@type=\"text\"])[14]")
    WebElement edit_function;
    @FindBy(xpath="(//*[@type=\"text\"])[6]")
    WebElement edit_;
//*[text()="Client Locations"]
//(//*[ @class="material-icons MuiIcon-root-2355 MuiIcon-fontSizeSmall-2362"])[2]






    public void setAddloction_client() throws InterruptedException {
        //   password_manager.click();

location_add.click();
        Thread.sleep(3000);

        Client_Locations.click();
        Thread.sleep(3000);
        add.click();
        Thread.sleep(7000);
//select_client.click();
    //    Select sc=new Select(select_client);sc.selectByVisibleText("EY");
   //     JavascriptExecutor executor = (JavascriptExecutor) driver;
        // executor.executeScript("arguments[0].click();", add_circle);
        Thread.sleep(8000);

        location_name.sendKeys(random_name+number);
        Thread.sleep(3000);
        location_type1.sendKeys(random_name+number);
        Thread.sleep(3000);

        address2_location.sendKeys(random__name);
        Thread.sleep(3000);
        selct_clientRequest.click();
        Thread.sleep(3000);

        selct_all.click();
        Thread.sleep(3000);

        select_category.click();
        Thread.sleep(3000);

        sarika_drop.click();

       // address2_location.sendKeys(random_Second_name);
        Thread.sleep(3000);


        pincode_location.sendKeys("494442");
        Thread.sleep(3000);
        city_location.click();
//email_location.sendKeys(random_name+"@gmail.com");

//number_location.sendKeys("8839024912");
       // Select sc1=new Select(contect_person);
        //sc1.selectByVisibleText("kartike");

        //Activity_code.click();
        Thread.sleep(3000);

        //selct_all.click();

        Thread.sleep(3000);

        save.click();
        Thread.sleep(8000);

        if (text_search.isDisplayed()) {
            Thread.sleep(6000);
            text_search.sendKeys(number);
            Thread.sleep(6000);

            driver.findElement(By.xpath("//*[text()=\"filter_list\"]")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/span/span/span[1]/input")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("(//*[text()=\"save\"])[2]")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("//*[text()=\"edit\"]")).click();
            Thread.sleep(4000);
            address2_location.sendKeys(random_name+number2);

         //   decription1.clear();
            Thread.sleep(6000);

         //   decription1.sendKeys(random_name + number);
           // Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
            Thread.sleep(4000);

            // select.sendKeys(random_name);
            System.out.println(" New User successfully added in cost center");
            Thread.sleep(6000);
          //  text_search.clear();
          //  Thread.sleep(4000);

         //   text_search.sendKeys(number);

            JavascriptExecutor executor1 = (JavascriptExecutor) driver;
            executor1.executeScript("arguments[0].click();", delete);

            Thread.sleep(8000);
            executor1.executeScript("arguments[0].click();", dlt_2);

            // dlt_2.click();
            Thread.sleep(8000);

            //  driver.close();
            System.out.println(" New User successfully Deleted in cost center");
        } else {
            System.out.println(" New User not added in cost center");
        }
    }






    // staff

    public void setClient_staff(){
        client_staff.click();
    }
    public void setStaff() throws InterruptedException {
        Thread.sleep(8000);

        staff.click();
        Thread.sleep(4000);
        add.click();
        Thread.sleep(5000);

       // Select sc=new Select(select_client);sc.selectByVisibleText("EY");
        Thread.sleep(6000);

        mail_staff.sendKeys(random_name+"@gmail.com");
        Thread.sleep(3000);

        first_name_staff.sendKeys(random_name);
        Thread.sleep(3000);

      //  middile_name_staff.sendKeys(random_Second_name);
        Thread.sleep(3000);

        last_name_staff.sendKeys(random__name);
        Thread.sleep(3000);

        teliphone_staff.sendKeys("9"+number4);
        Thread.sleep(3000);

    //    allow_login.click();
        Thread.sleep(3000);

        save.click();

        if (text_search.isDisplayed()) {
            Thread.sleep(6000);
         //   download.click();
            Thread.sleep(6000);

            text_search.sendKeys(number4);

            Thread.sleep(6000);
            driver.findElement(By.xpath("//*[text()=\"filter_list\"]")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/span/span/span[1]/input")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("(//*[text()=\"save\"])[2]")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[text()=\"edit\"]")).click();
            Thread.sleep(4000);


            first_name_staff.clear();
            Thread.sleep(6000);

            first_name_staff.sendKeys(random_name);
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
            Thread.sleep(4000);

           // text_search.clear();
            Thread.sleep(4000);

           // text_search.sendKeys(number4);
           // Thread.sleep(4000);
            // select.sendKeys(random_name);
            System.out.println(" New User successfully added in cost center");
            Thread.sleep(6000);
            JavascriptExecutor executor1 = (JavascriptExecutor) driver;
            executor1.executeScript("arguments[0].click();", delete);
            Thread.sleep(8000);
            executor1.executeScript("arguments[0].click();", dlt_2);

            // dlt_2.click();

            //  driver.close();
            System.out.println(" New User successfully Deleted in cost center");
        } else {
            System.out.println(" New User not added in cost center");
        }


    }
















public void setAdd_1() throws InterruptedException {
    Thread.sleep(4000);

    CLIENT.click();
    Thread.sleep(4000);

    add_1.click();
    Thread.sleep(4000);

}
    public void setClient_code() throws InterruptedException {
        add_client.click();
        Thread.sleep(8000);


    }

    public void setCity() throws InterruptedException {

        clients.click();
        System.out.println("click on client");
        Thread.sleep(8000);
        client.click();

        Thread.sleep(8000);

        add.click();
        System.out.println("Click on add add button");

        //  add_cir.click();
        Thread.sleep(8000);

    /*    selct.click();
        Thread.sleep(5000);
        System.out.println("select options");

        prosoect.click();
        Thread.sleep(5000);
        System.out.println("Enter prosoect");

        fee.sendKeys(number);
        Thread.sleep(5000);
        System.out.println("Enter fee");

        DATE.click();
        Thread.sleep(3000);
        dat_1.click();
        Thread.sleep(3000);

        to.click();
        to_date.click();
        Thread.sleep(3000);

        selct.click();

        Thread.sleep(3000);

        job_department.click();
     //   selct.click();
        Thread.sleep(3000);
      //  selct_code.click();
      //  job_code.click();

*/
    }

    public void setGenral() throws InterruptedException {

        genral.click();
        Thread.sleep(3000);
        name_genral.sendKeys(random_name+" "+random_Second_name);
        Thread.sleep(3000);

        client_code.sendKeys(random_name);
        Thread.sleep(3000);


        Thread.sleep(3000);
        DATE_genral.click();
        Thread.sleep(3000);

        dat_1.click();
        Thread.sleep(3000);

        //selct1.click();
        //Thread.sleep(3000);

        // sarika.click();
        Thread.sleep(3000);
        select_client_person.click();
        //   gstin.sendKeys(random_Second_name);
        //  Thread.sleep(3000);
LLc.click();
        Thread.sleep(3000);

        PAN.sendKeys("FYLPM2113L");
        Thread.sleep(3000);

        //  CIN.sendKeys(random__name + number);
        //  Thread.sleep(3000);

        // TIN.sendKeys(random_Second_name + number);
        // Thread.sleep(3000);

        //web.sendKeys("https://www.syncoffice.com/");
        Thread.sleep(3000);

//save.click();
    }

    public void setLocation() throws InterruptedException {

        location.click();
        Thread.sleep(5000);

        location1.sendKeys("jagadalpur");
        Thread.sleep(4000);

        location_type.sendKeys(random_Second_name);
        Thread.sleep(3000);


        adress_client.sendKeys(random_Second_name+number2);
        Thread.sleep(4000);


        pincode.sendKeys("494442");
        Thread.sleep(3000);

        Thread.sleep(5000);
        city.click();
        Thread.sleep(5000);

selct.click();
        // number11.sendKeys(number1);
        Thread.sleep(3000);
selct_all.click();
        Thread.sleep(3000);

    }

    public void setAdmin() throws InterruptedException {
        admin.click();
        Thread.sleep(5000);


        first_name.sendKeys(random_Second_name);
        Thread.sleep(8000);

        // middile_name.sendKeys(random_name);
        Thread.sleep(3000);

        last_name.sendKeys(random__name);
        Thread.sleep(3000);

        tel.sendKeys("8839024912");
        Thread.sleep(3000);
       // login.click();
        Thread.sleep(3000);
        email.sendKeys(random_name+"@gmail.com");
        Thread.sleep(8000);
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;

        executor1.executeScript("arguments[0].click();", save);

        Thread.sleep(8000);

        if (text_search.isDisplayed()) {
            Thread.sleep(6000);
            //   download.click();
            Thread.sleep(6000);

       //     text_search.sendKeys(random_name);

            Thread.sleep(6000);
            driver.findElement(By.xpath("//*[text()=\"filter_list\"]")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/span/span/span[1]/input")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("(//*[text()=\"save\"])[2]")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[text()=\"edit\"]")).click();
            Thread.sleep(4000);
            client_code.clear();
            client_code.sendKeys(random_Second_name);

           // fee
            Thread.sleep(6000);

           // fee.sendKeys(number);
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
            Thread.sleep(4000);

        //    text_search.clear();
          //  Thread.sleep(4000);

          //  text_search.sendKeys(number);
          //  Thread.sleep(4000);
            // select.sendKeys(random_name);
            System.out.println(" New User successfully added in cost center");
            Thread.sleep(6000);
          //  JavascriptExecutor executor1 = (JavascriptExecutor) driver;
            executor1.executeScript("arguments[0].click();", delete);
            Thread.sleep(8000);
            executor1.executeScript("arguments[0].click();", dlt_2);

            // dlt_2.click();

            //  driver.close();
            System.out.println(" New User successfully Deleted in cost center");
        } else {
            System.out.println(" New User not added in cost center");
        }




    }


    public void setAdd_cir() throws InterruptedException {
        Thread.sleep(5000);

        search.sendKeys(random_name);
        Thread.sleep(3000);

        add_circle.click();
        Thread.sleep(3000);

        name.sendKeys("raipur");
        Thread.sleep(3000);

        selct_add.click();
        Thread.sleep(3000);

        maxx.click();
        Thread.sleep(3000);

        selcet_dept.click();
        Thread.sleep(3000);

        adminstration_add.click();
        Thread.sleep(3000);

        adrres_add.sendKeys(random_name);
        Thread.sleep(3000);

        pincode2.sendKeys("494442");
        Thread.sleep(3000);

        city_add.click();
        Thread.sleep(6000);

        email.sendKeys("damawalemidc@gmail.com");
        Thread.sleep(3000);

        save.click();


        Thread.sleep(6000);


        if (text_search.isDisplayed()) {
            Thread.sleep(6000);
            text_search.sendKeys(number);
            Thread.sleep(6000);
            // select.sendKeys(random_name);

            driver.findElement(By.xpath("//*[text()=\"filter_list\"]")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("//body/div[5]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/input[1]")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("(//*[text()=\"save\"])[2]")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("//*[text()=\"edit\"]")).click();
            Thread.sleep(4000);

            DATE.click();
            Thread.sleep(3000);
            dat_1.click();
            Thread.sleep(3000);

            to.click();
            to_date.click();

            driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
            Thread.sleep(4000);

            text_search.clear();
            Thread.sleep(4000);

            text_search.sendKeys(number);
            Thread.sleep(4000);
            System.out.println(" New User successfully added in cost center");
            Thread.sleep(6000);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", delete);
            Thread.sleep(8000);
            executor.executeScript("arguments[0].click();", dlt_2);

            // dlt_2.click();
            Thread.sleep(8000);

            //  driver.close();
            System.out.println(" New User successfully Deleted in cost center");
        } else {
            System.out.println(" New User not added in cost center");
        }
    }











    public void setName() throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        Thread.sleep(5000);
        category.sendKeys(random_name);
        Thread.sleep(5000);
        decription.sendKeys(random_name + number);
        Thread.sleep(5000);

        executor.executeScript("arguments[0].click();", save);
        Thread.sleep(8000);
        //   close.click();

        //   mouse_over.click();
        Thread.sleep(8000);


        if (select.isDisplayed()) {
            Thread.sleep(8000);

//download.click();

select.sendKeys(number);
            Thread.sleep(8000);
            // select.sendKeys(random_name);
            driver.findElement(By.xpath("//*[text()=\"filter_list\"]")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/span/span/span[1]")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("(//*[text()=\"save\"])[2]")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[text()=\"edit\"]")).click();
            Thread.sleep(4000);


            decription.clear();
            Thread.sleep(6000);

            decription.sendKeys(random_name + number);
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
            Thread.sleep(4000);

            System.out.println(" New User successfully added in Department");
            Thread.sleep(4000);
        //    select.clear();
          //  Thread.sleep(4000);

            //select.sendKeys(number);
            Thread.sleep(4000);
            System.out.println(" New User successfully added in Gl category");
            Thread.sleep(8000);
            delete.click();
            Thread.sleep(8000);
            dlt_2.click();
            Thread.sleep(8000);

            //  driver.close();
            System.out.println(" New User successfully Deleted in Gl category");
        } else {
            System.out.println(" New User not added in Gl category");
        }
    }






















    // department--------------------------------------------------------------------------

    public void setJob_department() throws InterruptedException {
        Thread.sleep(3000);

        department.click();
        Thread.sleep(3000);

      add.click();
        Thread.sleep(3000);

        name_department.sendKeys(random__name);
        Thread.sleep(3000);

        short_code_department.sendKeys(random_Second_name+number);
        Thread.sleep(3000);

        Activity_code.click();
        Thread.sleep(3000);

        dropdown.click();
        Thread.sleep(8000);

        save.click();
        Thread.sleep(8000);

        if (select.isDisplayed()) {
            Thread.sleep(3000);
            //download.click();
            Thread.sleep(3000);

           // select.sendKeys(number);
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[text()=\"filter_list\"]")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/span/span/span[1]/input")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("(//*[text()=\"save\"])[2]")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[text()=\"edit\"]")).click();
            Thread.sleep(4000);


            edit.clear();
            Thread.sleep(3000);

            edit.sendKeys(random_Second_name);
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
            Thread.sleep(4000);

          //  select.clear();
           // Thread.sleep(4000);

          //  select.sendKeys(number);
            Thread.sleep(4000);

            // select.sendKeys(random_name);
            System.out.println(" New User successfully added in Gl category");
            Thread.sleep(8000);
            delete.click();
            Thread.sleep(8000);
            dlt_2.click();
            Thread.sleep(8000);

            //  driver.close();
            System.out.println(" New User successfully Deleted in Gl category");
        } else {
            System.out.println(" New User not added in Gl category");
        }

    }



    public void setClient_request() throws InterruptedException {

        clients.click();
        Thread.sleep(8000);
        client.click();
        Thread.sleep(8000);
        person_add.click();
        Thread.sleep(8000);

        selct_clientRequest.click();
        Thread.sleep(3000);

        prosoect.click();
        Thread.sleep(3000);

        selct_clientRequest.click();
        Thread.sleep(3000);

        harry_job_department.click();
        Thread.sleep(3000);



        genral.click();

        Thread.sleep(3000);

        genral.click();
        Thread.sleep(3000);
        name_genral.sendKeys(random_name);
        Thread.sleep(3000);

        client_code.sendKeys(random_name);
        Thread.sleep(3000);


        Thread.sleep(3000);
        DATE_genral.click();
        Thread.sleep(3000);

        dat_1.click();
        Thread.sleep(3000);

        select_category.click();
        Thread.sleep(3000);

        sarika.click();
        Thread.sleep(3000);

        //   gstin.sendKeys(random_Second_name);
        //  Thread.sleep(3000);

        PAN.sendKeys("FYLPM2113L");
        Thread.sleep(3000);

        //  CIN.sendKeys(random__name + number);
        //  Thread.sleep(3000);

        // TIN.sendKeys(random_Second_name + number);
        // Thread.sleep(3000);

        //web.sendKeys("https://www.syncoffice.com/");
        Thread.sleep(9000);

        location.click();
        Thread.sleep(8000);

        location__name.sendKeys("jagadalpur");
        Thread.sleep(4000);

        location_type.sendKeys(random_Second_name);
        Thread.sleep(3000);


        adress_client.sendKeys(random_Second_name+number2);
        Thread.sleep(4000);


        pincode.sendKeys("494442");
        Thread.sleep(3000);

        Thread.sleep(5000);
        city.click();
        Thread.sleep(5000);

        selct.click();
        // number11.sendKeys(number1);
        Thread.sleep(3000);
        selct_all.click();
        Thread.sleep(3000);
//number_location.sendKeys("8839024912");
        admin.click();
        Thread.sleep(5000);


        first_name.sendKeys(random_Second_name);
        Thread.sleep(8000);

        // middile_name.sendKeys(random_name);
        Thread.sleep(3000);

        last_name.sendKeys(random__name);
        Thread.sleep(3000);

        tel.sendKeys("8839024912");
        Thread.sleep(3000);
        // login.click();
        Thread.sleep(3000);
        email.sendKeys(random_name+"@gmail.com");
        Thread.sleep(8000);


        selcet_dept.click();
        Thread.sleep(8000);

        selct_all.click();
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;

        executor1.executeScript("arguments[0].click();", save);

        Thread.sleep(8000);

    }



    public void Client_location_registration(){

    }



    }




