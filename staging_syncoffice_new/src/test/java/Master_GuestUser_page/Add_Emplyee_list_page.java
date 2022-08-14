package Master_GuestUser_page;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_Emplyee_list_page {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String middle_name = Utilities_class.randomalphabet(5);
    public String number = Utilities_class.randomnemeric(3);
    public String number_aadhar = Utilities_class.randomnemeric(12);
    //   WebDriverWait wait=new WebDriverWait(driver, 20);

    public String mobilenumber = Utilities_class.randomnemeric(9);

    public Add_Emplyee_list_page(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "    //*[text()=\"person\"]\n")
    WebElement emp_tab;
    //*[text()="developer_board"]
    //  (//*[text()="keyboard_arrow_right"])
    @FindBy(xpath = "(//*[text()=\"keyboard_arrow_right\"])")
    WebElement arrorw;
    @FindBy(xpath = "//*[@type=\"checkbox\"]")
    WebElement box;
    @FindBy(xpath = "(//*[text()=\"add\"])[2]")
    WebElement add;
    @FindBy(xpath = "(//*[text()=\"add\"])[5]")
    WebElement add1;
    @FindBy(xpath = "//*[@class=\" css-1wa3eu0-placeholder\"]")
    WebElement selct_class;
    @FindBy(xpath = "(//*[text()=\"Sarika\" ])[3]")
    WebElement company_group;
    @FindBy(xpath = "//*[text()=\"Select...\" ]")
    WebElement Select;
    @FindBy(xpath = "//*[@name=\"firstname\" ]")
    WebElement firstclass;
    @FindBy(xpath = "//*[@name=\"middlename\" ]")
    WebElement middile;
    @FindBy(xpath = "//*[@name=\"lastname\" ]")
    WebElement last_name;
    @FindBy(xpath = "//*[@name=\"badge_code\" ]")
    WebElement code;
    @FindBy(xpath = "//*[@name=\"username\"]")
    WebElement mail;
    @FindBy(xpath = "//*[@type=\"tel\"]")
    WebElement phone;
    @FindBy(xpath = "(//*[@type=\"button\"]//*[@focusable=\"false\"])[4]")
    WebElement DOB;
    @FindBy(xpath = "(//*[text()=\"2\"])")
    WebElement date_2;
    @FindBy(xpath = "(//*[@type=\"button\"]//*[@focusable=\"false\"])[5]")
    WebElement dob_official;
    @FindBy(xpath = "(//*[text()=\"5\"])")
    WebElement date_3;
    @FindBy(xpath = "(//*[@type=\"button\"]//*[@focusable=\"false\"])[6]")
    WebElement dob_actual;
    @FindBy(xpath = "(//*[text()=\"6\"])")
    WebElement date_4;
    @FindBy(xpath = "(//*[text()=\"28\"])[2]")
    WebElement date_5;
    @FindBy(xpath = "(//*[text()=\"2021\"])[1]")
    WebElement offical_2020;
    @FindBy(xpath = "//*[text()=\"2000\"]")
    WebElement offial_2000;
    @FindBy(xpath = "//*[text()=\"Female\"]")
    WebElement female;
    @FindBy(xpath = "//*[text()=\"gesture\"]")
    WebElement genral;

    @FindBy(xpath = "(//*[text()=\"Company Related\"])")
    WebElement company_related;
    @FindBy(xpath = "//div[contains(text(),'bangluru')]")
    WebElement location;
    @FindBy(xpath="//div[contains(text(),'Managing Director')]")
    WebElement degiganation;
    @FindBy(xpath="//div[contains(text(),'Administration')]")
    WebElement dept;
    //*[text()="person"]
    @FindBy(xpath = "//*[text()=\"Yes\"]")
    WebElement reporting;
    @FindBy(xpath = "//*[text()=\"Save\"]")
    WebElement save;
    @FindBy(xpath = "//*[text()=\"A\"]")
    WebElement shift;
    @FindBy(xpath = "//*[text()=\"B\"]")
    WebElement Grade;
    @FindBy(xpath = "//*[text()=\"Select All\"]")
    WebElement reporting_authorty;
    @FindBy(xpath = "   (//*[text()=\"Holiday\"])\n")
    WebElement holiday;
    @FindBy(xpath = "(//*[text()=\"delete\"])[2]")
    WebElement delete;
    @FindBy(xpath = "(//*[text()=\"Delete\"])[3]")
    WebElement dlt_2;
    //*[text()="person"]
    @FindBy(xpath = "(//*[@type=\"text\"])[3]")
    WebElement search;
    @FindBy(xpath = "(//*[text()=\"save\"])[2]")
    WebElement save1;
    @FindBy(xpath = "    (//*[@type=\"checkbox\"])[3]\n")
    WebElement checkbox;
    @FindBy(xpath = "    (//*[@type=\"checkbox\"])[1]\n")
    WebElement active;
    @FindBy(xpath = "(//*[@title=\"Send activation link\"])")
    WebElement activation_link;
    @FindBy(xpath = "//*[text()=\"send\"]")
    WebElement send;
    @FindBy(xpath = "//*[@title=\"Set default password\"]")
    WebElement password;
    @FindBy(xpath = "    //*[text()=\"Set\"]\n")
    WebElement set;
    @FindBy(xpath = "    (//*[text()=\"save_alt\"])[1]\n")
    WebElement downlload;


    @FindBy(xpath = "//*[text()=\"Add More\"]")
    WebElement add_more;
    @FindBy(xpath = "//*[text()=\"--Select--\"]")
    WebElement select_relation;
    @FindBy(xpath = "(//select[@class=\"mdc-select__native-control customFieldText py-0\"])[3]")
    WebElement select_blood_group;
    @FindBy(xpath = "(//*[@type=\"tel\"])[2]")
    WebElement number_alternet1;
    @FindBy(xpath = "//*[@name=\"personalEmail\"]")
    WebElement persnal_mail;
    @FindBy(xpath = "//*[@name=\"presentAddress\"]")
    WebElement present_adress;
    @FindBy(xpath = "//*[@name=\"permanentAddress\"]")
    WebElement permanent_adress;
    @FindBy(xpath = " //*[@name=\"pincode\"]")
    WebElement pincode;
    @FindBy(xpath = "//*[@name=\"city\"]")
    WebElement city;
    @FindBy(xpath = "//*[text()=\"Employee Documents\"]")
    WebElement employee_doc;
    @FindBy(xpath = "//*[@type=\"file\"]")
    WebElement file;
    @FindBy(xpath = "//*[text()=\"Save\"]")
    WebElement save9;

    @FindBy(xpath = "(//*[text()=\"Save\"])[2]")
    WebElement save2;

    @FindBy(xpath = "//*[text()=\"Single\"]")
    WebElement single;
    @FindBy(xpath = "//*[text()=\"O +\"]")
    WebElement Opositive;
    @FindBy(xpath = "(//*[text()=\"Save\"])[2]")
    WebElement sasve2;
    @FindBy(xpath = "(//*[text()=\"Save\"])[2]")
    WebElement sakve2;
    @FindBy(xpath = "(//*[text()=\"Save\"])[2]")
    WebElement savhhe2;
    @FindBy(xpath = "(//*[text()=\"save\"])[5]")
    WebElement save3;
    @FindBy(xpath = "//*[@name=\"adhar_no\"]")
    WebElement Aadhar_number;
    @FindBy(xpath = "//*[@name=\"uan\"]")
    WebElement UAN_number;
    @FindBy(xpath = "//*[@name=\"pan\"]")
    WebElement PAN_number;
    @FindBy(xpath = "//*[@name=\"bank\"]")
    WebElement bank;
    @FindBy(xpath = "//*[@name=\"branch\"]")
    WebElement branch;
    @FindBy(xpath = "//*[@name=\"ifsc\"]")
    WebElement IFCS;
    @FindBy(xpath = "//*[@name=\"account_num\"]")
    WebElement Account_number;
    @FindBy(xpath = "//*[text()=\"Education Details\"]")
    WebElement Education_details;
    @FindBy(xpath = "(//*[@type=\"text\"])[14]")
    WebElement Class;
    @FindBy(xpath = "(//*[@type=\"text\"])[15]")
    WebElement University;
    @FindBy(xpath = "(//*[@type=\"text\"])[17]")
    WebElement remarks;
    @FindBy(xpath = "(//*[text()=\"add_circle\"])[4]")
    WebElement add_aadhar;
    @FindBy(xpath = "(//*[text()=\"add_circle\"])[5]")
    WebElement add_UAN_number;
    @FindBy(xpath = "(//*[text()=\"add_circle\"])[6]")
    WebElement add_pan_number;
    @FindBy(xpath = "(//select[@class=\"mdc-select__native-control customFieldText py-0\"])[2]")
    WebElement class_grade;
    @FindBy(xpath = "//*[@type=\"number\"]")
    WebElement marks;
    @FindBy(xpath = "(//select[@class=\"mdc-select__native-control customFieldText py-0\"])[3]")
    WebElement add_Action_education;
    @FindBy(xpath = "(//*[@type=\"text\"])[14]")
    WebElement class_2;
    @FindBy(xpath = "(//*[@type=\"text\"])[15]")
    WebElement university_2;
    @FindBy(xpath = "(//*[@type=\"text\"])[16]")
    WebElement remarks_2;
    @FindBy(xpath = "    (//*[text()=\"add\"])[8]\n")
    WebElement add2;
    @FindBy(xpath = "(//*[@type=\"text\"])[16]")
    WebElement remkarks_2;
    @FindBy(xpath = "(//*[text()=\"edit\"])[4]\n")
    WebElement edit_file;
    @FindBy(xpath = "(//*[text()=\"Service Record\"])")
    WebElement Service_Record;
    @FindBy(xpath = "(//*[@title=\"Add\"])[2]")
    WebElement add_service;
    @FindBy(xpath = "(//*[@type=\"text\"])[16]")
    WebElement previous_company;
    @FindBy(xpath = "(//Select[@class=\"mdc-select__native-control customFieldText py-0\"])[2]")
    WebElement desiganation;
    @FindBy(xpath = "(//*[@type=\"button\"]//*[@focusable=\"false\"])[8]")
    WebElement from_date;
    @FindBy(xpath = "(//*[@type=\"button\"]//*[@focusable=\"false\"])[9]")
    WebElement to_date;
    @FindBy(xpath = "//*[text()=\" Remarks \"]")
    WebElement remkarks;
    @FindBy(xpath = "//*[text()=\"Save Personal Details\"]\n")//*[text()=" Remarks "]
    WebElement save_Personal_Details;
    @FindBy(xpath = "//*[text()=\"Save Employee Documents\"]")//*[text()=" Remarks "]
    WebElement save_Documentl_Details;
    //  @FindBy(xpath = "")//*[text()=" Remarks "]
    //  WebElement remkarks;
    @FindBy(xpath = "//*[text()=\">\"]")
    WebElement arrow;
    @FindBy(xpath = "//*[text()=\"PDF\"]")
    WebElement pdf;
    @FindBy(xpath = "(//*[text()=\"Download\"])[3]")
    WebElement doenload;
    @FindBy(xpath = "//*[text()=\"Excel\"]")
    WebElement excel;
    @FindBy(xpath = "//*[text()=\"cloud_download\"]")
    WebElement cloud;
    public void setEmp_tab() throws InterruptedException {
        Thread.sleep(4000);

        Actions actions = new Actions(driver);
        // WebElement closeMenuOption = driver.findElement(By.xpath("//*[text()=\"Company\"]"));
        actions.moveToElement(genral).perform();
        Thread.sleep(4000);

        add.click();
        Thread.sleep(4000);

        arrorw.click();
        Thread.sleep(4000);
driver.findElement(By.xpath("(//*[text()=\"View\"])")).click();
        Thread.sleep(4000);

        add1.click();
        Thread.sleep(4000);

        Select.click();
        Thread.sleep(4000);

        company_group.click();
        Thread.sleep(4000);

       code.sendKeys(random_name + number);
        Thread.sleep(4000);

        firstclass.sendKeys(random_name);
        Thread.sleep(4000);

        middile.sendKeys(random_Second_name);
        Thread.sleep(4000);

        last_name.sendKeys(middle_name);
        Thread.sleep(4000);

        mail.sendKeys(random_name + "@gmail.com");
        Thread.sleep(5000);
        phone.click();
        Thread.sleep(9000);

        phone.sendKeys("8" + mobilenumber);
        Thread.sleep(4000);
      //  Select.click();

        Thread.sleep(7000);

        Select.click();
        Thread.sleep(6000);

        female.click();
        Thread.sleep(4000);

        DOB.click();
        offical_2020.click();
        Thread.sleep(5000);

        offial_2000.click();
        Thread.sleep(5000);
        Thread.sleep(5000);
        date_2.click();
        Thread.sleep(5000);
        dob_official.click();
        Thread.sleep(5000);


        date_3.click();
        Thread.sleep(5000);
        dob_actual.click();
        Thread.sleep(5000);
        date_4.click();
        Thread.sleep(5000);

        company_related.click();
        Thread.sleep(5000);

        Select.click();
        Thread.sleep(5000);

        location.click();
        Thread.sleep(5000);

        Select.click();
        Thread.sleep(5000);

        dept.click();
        Thread.sleep(5000);

        Select.click();
        Thread.sleep(5000);

        degiganation.click();
        Thread.sleep(5000);

        Select.click();
        Thread.sleep(5000);

        reporting.click();
        Thread.sleep(5000);

        Select.click();
        Thread.sleep(5000);

        reporting_authorty.click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@name=\"ctc\"]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@name=\"ctc\"]")).sendKeys("40000");
        Thread.sleep(5000);

        Select.click();
        Thread.sleep(5000);

        holiday.click();
        Thread.sleep(5000);

        Select.click();
        Thread.sleep(5000);

        shift.click();
        Thread.sleep(5000);

        Select.click();
        Thread.sleep(5000);

        Grade.click();
        Thread.sleep(5000);

        save.click();

        Thread.sleep(9000);


        driver.findElement(By.xpath("//*[@type=\"checkbox\"]")).click();
        Thread.sleep(6000);
        search.sendKeys(number);
        Thread.sleep(9000);


        driver.findElement(By.xpath("//*[text()=\"edit\"]")).click();
        Thread.sleep(9000);

        add_more.click();



        Thread.sleep(8000);

       select_relation.click();
       single.click();
        Thread.sleep(5000);
        select_relation.click();

        Thread.sleep(5000);

Opositive.click();        Thread.sleep(5000);

        number_alternet1.sendKeys("8839024912");
        Thread.sleep(5000);

        persnal_mail.sendKeys(random_name+"@gmail.com");
        Thread.sleep(5000);


        present_adress.sendKeys("jagdalpur");
        Thread.sleep(5000);

        permanent_adress.sendKeys("bihar");
        Thread.sleep(5000);

        pincode.sendKeys("494442");
        Thread.sleep(5000);

        city.click();
        Thread.sleep(8000);

        save_Personal_Details.click();
        Thread.sleep(8000);

        employee_doc.click();
        Thread.sleep(5000);

add_aadhar.click();
        Thread.sleep(5000);

file.sendKeys("/home/lenovo/Pictures/20 users.png");
        Thread.sleep(5000);
Actions ac=new Actions(driver);
//ac.doubleClick(save1).build().perform();
save1.click();
        Thread.sleep(10000);

        //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "(//*[@type=\"text\"])[11]")));
        Aadhar_number.sendKeys(number_aadhar);
        Thread.sleep(5000);

        add_UAN_number.click();
        Thread.sleep(5000);

        file.sendKeys("/home/lenovo/Pictures/20 users.png");
        Thread.sleep(5000);

      //  save1.click();
        save1.click();

        //ac.doubleClick(save1).build().perform();

        Thread.sleep(10000);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "(//*[@type=\"text\"])[12]")));

        UAN_number.sendKeys(number_aadhar);
        Thread.sleep(5000);

        add_pan_number.click();
        Thread.sleep(5000);

        file.sendKeys("/home/lenovo/Pictures/20 users.png");
        Thread.sleep(10000);
        save1.click();
        Thread.sleep(5000);

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "(//*[@type=\"text\"])[13]")));

        PAN_number.sendKeys("FYLPM2113L");
       // save1.click();
        Thread.sleep(5000);

        bank.sendKeys("SBI");
        Thread.sleep(5000);

branch.sendKeys("Pandripani");
        Thread.sleep(5000);

IFCS.sendKeys("SBIN0018683");
        Thread.sleep(5000);

Account_number.sendKeys(number_aadhar);
        Thread.sleep(5000);

        save_Documentl_Details.click();
        Thread.sleep(8000);

        Education_details.click();
        Thread.sleep(7000);


Class.sendKeys("first");
        Thread.sleep(5000);

University.sendKeys("Baster University");
        Thread.sleep(5000);


       Select.click();
        Thread.sleep(5000);
driver.findElement(By.xpath("//*[text()=\"%\"]")).click();
        Thread.sleep(5000);

        remarks.sendKeys(random_Second_name);
        Thread.sleep(5000);

        marks.sendKeys(number);
        Thread.sleep(5000);

        file.sendKeys("/home/lenovo/Pictures/Screenshot from 2021-04-05 23-17-33.png");
        Thread.sleep(5000);

        save.click();
        Thread.sleep(5000);
        Thread.sleep(9000);

     //   box.click();
        //*[@type="checkbox"]


    //    edit_file.click();
     //   Thread.sleep(5000);

      //  file.sendKeys("/home/lenovo/Pictures/grade.png");
        Thread.sleep(5000);

//save2.click();
        //Thread.sleep(5000);

       // save_Documentl_Details.click();
       // Thread.sleep(5000);

        Service_Record.click();
        Thread.sleep(5000);

add_service.click();
        Thread.sleep(5000);

previous_company.sendKeys(random_name);
        Thread.sleep(5000);

        Select sc6=new Select(desiganation);
        sc6.selectByVisibleText("QA");
        Thread.sleep(5000);

        from_date.click();
        date_2.click();
        Thread.sleep(5000);

        to_date.click();
        date_5.click();
        Thread.sleep(5000);

        remkarks.sendKeys(random_name);
        Thread.sleep(5000);

        save3.click();
        Thread.sleep(5000);
        Education_details.click();
        Thread.sleep(7000);

        save1.click();
        Thread.sleep(10000);

        if (search.isDisplayed()) {
            Thread.sleep(8000);
            search.sendKeys(number);
            Thread.sleep(3000);

            checkbox.click();
            Thread.sleep(3000);

            activation_link.click();
            Thread.sleep(5000);

            send.click();
            Thread.sleep(8000);

            search.clear();
            search.sendKeys(number);
            Thread.sleep(8000);

            password.click();
            Thread.sleep(4000);

            set.click();
            Thread.sleep(10000);

            active.click();
            Thread.sleep(5000);

            search.clear();

            search.sendKeys(number);
            Thread.sleep(8000);

            downlload.click();
            Thread.sleep(8000);



            middile.sendKeys(random_Second_name);
            Thread.sleep(4000);

            driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
            Thread.sleep(4000);

            search.clear();
            Thread.sleep(4000);

            search.sendKeys(number);
            Thread.sleep(4000);
            Thread.sleep(4000);
            System.out.println(" New User successfully added in employee list");
            Thread.sleep(8000);
           delete.click();
           Thread.sleep(8000);
            dlt_2.click();
            System.out.println(" New User successfully Deleted in employee list");
        } else {
            System.out.println(" New User not added in employee list");
        }

    /*
        driver.findElement(By.xpath("//*[text()=\"filter_list\"]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/input[1]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("(//*[text()=\"save\"])[2]")).click();
        Thread.sleep(9000);

        cloud.click();
        Thread.sleep(9000);

        driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/input[1]")).click();
        Thread.sleep(9000);

        arrow.click();
        Thread.sleep(9000);

        doenload.click();
        Thread.sleep(9000);

        excel.click();
*/
    }
}