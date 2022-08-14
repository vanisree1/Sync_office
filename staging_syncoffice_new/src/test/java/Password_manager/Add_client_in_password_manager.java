package Password_manager;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_client_in_password_manager {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String random__name = Utilities_class.randomalphabet(5);
    public String Second_name = Utilities_class.randomalphabet(5);

    public String number = Utilities_class.randomnemeric(3);
    public String number1 = Utilities_class.randomnemeric(10);


    public Add_client_in_password_manager(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath="//*[text()=\"Prospective\"]")
    WebElement prosoect;
    @FindBy(xpath="//*[@name=\"fee\"]")
    WebElement fee;
    @FindBy(xpath = " //*[text()=\"Select...\"]")
    WebElement selct;
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
    @FindBy(xpath="//*[text()=\"CIN\"]")
    WebElement CIN;
    @FindBy(xpath="    //*[@name=\"website\"]\n")
    WebElement web;
    @FindBy(xpath="//*[text()=\"Location\"]")
    WebElement location;
    @FindBy(xpath="//*[@name=\"locName\"]")
    WebElement location1;
    @FindBy(xpath="//*[@name=\"location_type\"]")
    WebElement location_type;
    @FindBy(xpath="//*[text()=\"Administration\"]")
    WebElement adminstration;
    @FindBy(xpath="//*[@ type=\"address\" ]")
    WebElement adress;




    @FindBy(xpath = "//*[@name=\"address2\"]")
    WebElement adrees2;
    @FindBy(xpath = "(//*[@type=\"text\"])[9]")
    WebElement code;
    @FindBy(xpath = "//*[@ name=\"address1\"]")
    WebElement address;
    @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[4]")
    WebElement DATE;
    @FindBy(xpath="(//*[text()=\"1\"])[1]")
    WebElement dat_1;
    @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[5]")
    WebElement to;
    @FindBy(xpath="(//*[text()=\"28\"])[1]")
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
    @FindBy(xpath="//*[@ name=\"email\"]")
    WebElement email;
    @FindBy(xpath="//*[@name=\"firstname\"]")
    WebElement first_name;
    @FindBy(xpath="//*[@name=\"middlename\"]")
    WebElement middile_name;
    @FindBy(xpath="//*[@name=\"lastname\"]")
    WebElement last_name;
    @FindBy(xpath="//*[@type=\"tel\"]")
    WebElement tel;
    @FindBy(xpath="//body/div[5]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/span[1]/span[1]/span[1]/input[1]")
    WebElement login;
    @FindBy(xpath="(//*[@type=\"checkbox\"])[13]")
    WebElement log_in;
    @FindBy(xpath="(//*[@class=\"material-icons MuiIcon-root-1671 MuiIcon-fontSizeSmall-1678\"])[2]")
    WebElement add_circle;
    @FindBy(xpath="//*[@name=\"name\" ]")
    WebElement name;
    @FindBy(xpath="//*[text()=\"--Select--\"]")
    WebElement selct_add;
    @FindBy(xpath="//*[@name=\"address1\"]")
    WebElement adrres_add;
    @FindBy(xpath="//*[@name=\"pincode\"]")
    WebElement pincode2;
    @FindBy(xpath="//*[@name=\"city\"]")
    WebElement city_add;
    @FindBy(xpath="//*[text()=\"Select...\"]")
    WebElement selcet_dept;
    @FindBy(xpath="//*[text()=\"Administration\"]")
    WebElement adminstration_add;
    @FindBy(xpath="(//*[@type=\"text\"])[4]")
    WebElement search;
    @FindBy(xpath="//*[text()=\"tezBm\"]")
    WebElement maxx;
    @FindBy(xpath="//*[@name=\"email\"]")
    WebElement adrsggggess;
    @FindBy(xpath="//*[@ type=\"address\" ]")
    WebElement adrttttttttggess;
    @FindBy(xpath="//*[@ type=\"address\" ]")
    WebElement adrsssssssssssssess;
    @FindBy(xpath="//*[@ type=\"address\" ]")
    WebElement adrggesshhhhhhhhh;
    @FindBy(xpath="//*[@ type=\"address\" ]")
    WebElement adrsesllllllllllls;
    @FindBy(xpath="//*[@ type=\"address\" ]")
    WebElement adrggeslllllllllllls;
    @FindBy(xpath="//*[@ type=\"address\" ]")
    WebElement adrsuuuuess;
    @FindBy(xpath="//*[@ type=\"address\" ]")
    WebElement adrggesoos;
    @FindBy(xpath="//*[@ type=\"address\" ]")
    WebElement adrsessrr;

//(//*[ @class="material-icons MuiIcon-root-2355 MuiIcon-fontSizeSmall-2362"])[2]



    public void setloc() throws InterruptedException {
        password_manager.click();

        Thread.sleep(8000);
    }

    public void setCity( ) throws InterruptedException {
        add_cir.click();
        Thread.sleep(8000);

        selct.click();

        prosoect.click();
        fee.sendKeys(number);
        DATE.click();
        Thread.sleep(3000);
        dat_1.click();
        Thread.sleep(3000);

        to.click();
        to_date.click();

        selct.click();


        job_department.click();


    }

    public void setGenral() throws InterruptedException {

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

        selct1.click();
        Thread.sleep(3000);

        sarika.click();
        Thread.sleep(3000);

     //   gstin.sendKeys(random_Second_name);
        Thread.sleep(3000);

        PAN.sendKeys("FYLPM2113L");
        Thread.sleep(3000);

      //  CIN.sendKeys(random__name + number);
      //  Thread.sleep(3000);

       // TIN.sendKeys(random_Second_name + number);
       // Thread.sleep(3000);

        web.sendKeys("https://www.syncoffice.com/");
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

        selct_loc.click();
        Thread.sleep(6000);

        adminstration.click();
        Thread.sleep(6000);






        address.sendKeys(random_Second_name);
        Thread.sleep(4000);
adrees2.click();

        Thread.sleep(6000);

        pincode.sendKeys("494442");
        Thread.sleep(3000);

        Thread.sleep(5000);
        city.click();
        Thread.sleep(5000);



        number11.sendKeys(number1);
        Thread.sleep(3000);



    }

    public void setAdmin() throws InterruptedException {
        admin.click();
        Thread.sleep(5000);
        Actions ac=new Actions(driver);
         // ac.doubleClick(log_in).build().perform();
//log_in.click();
        System.out.println("aaaa");
        Thread.sleep(5000);

        email.sendKeys("damawalemidc@gmail.com");
        Thread.sleep(3000);

        first_name.sendKeys(random_Second_name);
        Thread.sleep(3000);
        System.out.println("baaa");

        middile_name.sendKeys(random_name);
        Thread.sleep(3000);

        last_name.sendKeys(random__name);
        Thread.sleep(3000);

        tel.sendKeys("8839024912");
        Thread.sleep(5000);
      //  ac.doubleClick(login).build().perform();
      //  login.click();
       // login.click();
        Thread.sleep(6000);

        save.click();
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
    }
}
