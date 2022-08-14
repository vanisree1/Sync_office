package Clock_module_page.Add_Timesheet;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Client_in_clockList {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String random__name = Utilities_class.randomalphabet(5);
    public String Second_name = Utilities_class.randomalphabet(5);

    public String number = Utilities_class.randomnemeric(3);
    public String number1 = Utilities_class.randomnemeric(10);


    public Add_Client_in_clockList(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath="//*[text()=\"Prospective\"]")
    WebElement prosoect;
    @FindBy(xpath="//*[@name=\"fee\"]")
    WebElement fee;
    @FindBy(xpath = " //*[text()=\"Select...\"]")
    WebElement selct;
    @FindBy(xpath = "//body/div[4]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement status;
    @FindBy(xpath = "//*[text()=\"--Select--\"]")
    WebElement selct1;
    @FindBy(xpath = "    (//*[text()=\"Select...\"])[2]\n")
    WebElement selct_loc;
    @FindBy(xpath = "//*[text()=\"Manager\"]")
    WebElement job_department;
    @FindBy(xpath = "//*[@title=\"Add Client\"]")
    WebElement add_cir;
    @FindBy(xpath="//*[text()=\"General\"]")
    WebElement genral;
    @FindBy(xpath="//*[@name=\"name\"]")
    WebElement name_genral;
    @FindBy(xpath="//*[@name=\"client_code\"]")
    WebElement client_code;
    @FindBy(xpath="//*[text()=\"banking\"]")
    WebElement sarika;
    @FindBy(xpath="(//*[@name=\"gstin\"])")
    WebElement gstin;
    @FindBy(xpath="(//*[@name=\"pan\"])")
    WebElement PAN;
    @FindBy(xpath="(//*[@name=\"tin\"])")
    WebElement TIN;
    @FindBy(xpath="(//*[@type=\"text\"])[16]")
    WebElement City_clock;
    @FindBy(xpath="    //*[@name=\"website\"]\n")
    WebElement web;
    @FindBy(xpath="(//*[text()=\"Location Details\"])[1]")
    WebElement location;
    @FindBy(xpath="(//*[@type=\"text\"])[12]")
    WebElement location_name;
    @FindBy(xpath="(//*[@type=\"text\"])[13]")
    WebElement address_clock;
    @FindBy(xpath="//*[text()=\"Administration\"]")
    WebElement adminstration;
    @FindBy(xpath="(//*[@type=\"text\"])[15]")
    WebElement pin_code;

    @FindBy(xpath="//*[text()=\"None selected\"]")
    WebElement none_selected;
    @FindBy(xpath="(//*[text()=\"None selected\"])[2]")
    WebElement none_selected2;
    @FindBy(xpath="//*[text()=\"Sarika\"]")
    WebElement sarika1;


    @FindBy(xpath = "//*[@name=\"address2\"]")
    WebElement adrees2;
    @FindBy(xpath = "(//*[@type=\"text\"])[9]")
    WebElement code;
    @FindBy(xpath = "//*[@ name=\"address1\"]")
    WebElement address;
    @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[4]")
    WebElement DATE;
    @FindBy(xpath="(//*[text()=\"1\"])[2]")
    WebElement dat_1;
    @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[5]")
    WebElement to;
    @FindBy(xpath="(//*[text()=\"28\"])[2]")
    WebElement to_date;
    @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[6]")
    WebElement DATE_genral;
    @FindBy(xpath="(//*[@type=\"text\"])[10]")
    WebElement loc;
    @FindBy(xpath="//*[@ name=\"landline_num\"]")
    WebElement number11;
    @FindBy(xpath="//*[@ name=\"pincode\" ]")
    WebElement pincode;
    @FindBy(xpath="//*[@  name=\"address1\"]")


    WebElement address1;
    @FindBy(xpath = "//*[text()=\"Password Manager\"]")
    WebElement password_manager;
    @FindBy(xpath = "//*[@  name=\"city\"]")
    WebElement city;
    @FindBy(xpath = "(//*[text()=\"save\"])")
    WebElement save;
    @FindBy(xpath="//*[text()=\"Admin\"]")
    WebElement admin;
    @FindBy(xpath="(//*[@type=\"text\"])[22]")
    WebElement email;
    @FindBy(xpath="(//*[@type=\"text\"])[23]")
    WebElement first_name;
    @FindBy(xpath="(//*[@type=\"text\"])[27]")
    WebElement mobile_nmbr;
    @FindBy(xpath="(//*[@type=\"text\"])[25]")
    WebElement last_name;
    @FindBy(xpath="(//*[@type=\"text\"])[26]")
    WebElement isd;

    @FindBy(xpath="//*[text()=\"person_add\"]")
    WebElement add_client;
    @FindBy(xpath="//*[text()=\"Basic Info\"]")
    WebElement Basic_information;
    @FindBy(xpath="(//*[@type=\"text\"])[4]")
    WebElement client_name;
    @FindBy(xpath="(//*[@type=\"text\"])[5]")
    WebElement client_code1;


//(//*[ @class="material-icons MuiIcon-root-2355 MuiIcon-fontSizeSmall-2362"])[2]

public void setAdd_client(){
    add_client.click();
}



    public void setCity( ) throws InterruptedException {
        Thread.sleep(6000);

        status.click();
        Thread.sleep(4000);

        prosoect.click();
        Thread.sleep(4000);

        Basic_information.click();
      //  job_department.click();
        Thread.sleep(4000);
client_name.sendKeys(random_name);
        Thread.sleep(4000);

client_code1.sendKeys(number);
        Thread.sleep(4000);

        DATE.click();
        Thread.sleep(4000);

        dat_1.click();
        Thread.sleep(4000);

        location.click();
        Thread.sleep(4000);
        Thread.sleep(3000);

        location_name.sendKeys(random_name);
        Thread.sleep(7000);
        address_clock.sendKeys(random_Second_name);

        pin_code.sendKeys("494442");
        Thread.sleep(3000);
City_clock.click();
        Thread.sleep(3000);
        none_selected.click();
        Thread.sleep(3000);

        adminstration.click();
admin.click();
        Thread.sleep(3000);

        email.sendKeys("damawalemidc@gmail.com");
        Thread.sleep(3000);

        first_name.sendKeys(random_name);
        Thread.sleep(3000);

        last_name.sendKeys(random_Second_name);
        Thread.sleep(3000);

        isd.sendKeys("91");
        Thread.sleep(3000);

        mobile_nmbr.sendKeys("8839024912");
        Thread.sleep(3000);
none_selected.click();
        Thread.sleep(3000);

sarika1.click();
        Thread.sleep(5000);

driver.findElement(By.xpath("//*[text()=\"Submit\"]")).click();
        Thread.sleep(7000);



        add_client.click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[text()=\"Team Log\"]")).click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[text()=\"Approve\"]")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("//*[text()=\"Client Log\"]")).click();

        Thread.sleep(7000);


    }


}
