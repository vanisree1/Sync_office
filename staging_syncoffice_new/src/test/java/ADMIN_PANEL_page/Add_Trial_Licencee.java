package ADMIN_PANEL_page;

import Utilities.Utilities_class;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class Add_Trial_Licencee {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String random__name = Utilities_class.randomalphabet(5);
    public String Second_name = Utilities_class.randomalphabet(5);
    public String number = Utilities_class.randomnemeric(2);
    public String number1 = Utilities_class.randomnemeric(3);


    public Add_Trial_Licencee(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath="//select[@id='licence_type']")
    WebElement licence_type;


    @FindBy(xpath="    //*[@id=\"username\"]\n")
    WebElement username;
    @FindBy(xpath="//*[@id=\"password\"]")
    WebElement password;
    @FindBy(xpath="(//*[@type=\"button\"])[1]")
    WebElement login;
    @FindBy(xpath="//*[text()=\"Licencee\"]")
    WebElement Licencee;
    @FindBy(xpath="//header/div[1]/div[1]/div[2]/a[1]/i[1]")
    WebElement add_Licencee;
    @FindBy(xpath="//*[@name=\"licencee_name\"]")
    WebElement name_Licencee;
    @FindBy(xpath="//*[@name=\"contact_person\"]")
    WebElement first_name;
    @FindBy(xpath="//*[@name=\"lastname\"]")
    WebElement last_name;
    @FindBy(xpath="//*[@name=\"email\"]")
    WebElement email;
    @FindBy(xpath="//*[@name=\"address\"]")
    WebElement address;
    @FindBy(xpath="//*[@name=\"pincode\"]")
    WebElement pincode;
    @FindBy(xpath="//*[@name=\"dob\"]")
    WebElement dob;
    @FindBy(xpath="//*[@name=\"incorporation_date\"]")
    WebElement incorporation_date;
    @FindBy(xpath="//*[text()=\"1\"]")
    WebElement date1;
    @FindBy(xpath="//*[text()=\"4\"]")
    WebElement date2;
    @FindBy(xpath="    //*[@name=\"mobile_num\"]\n")
    WebElement mobile_num;
    @FindBy(xpath="//*[@name=\"landline_no\"]")
    WebElement landline_no;
    @FindBy(xpath="//*[@id=\"create_license\"]")
    WebElement submit;
    @FindBy(xpath="//body[1]/section[2]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/a[3]")
    WebElement dlt;
    @FindBy(xpath="//*[text()=\"OK\"]")
    WebElement dlt_ok;
    @FindBy(xpath="//*[@id=\"adminPsw\"]")
    WebElement enter_password;
    @FindBy(xpath="//*[text()=\"Submit\"]")
    WebElement submit_dlt;
    @FindBy(xpath="//*[@id=\"pan\"]")
    WebElement PAN_NUMBER;
    @FindBy(xpath="//*[@id=\"tin\"]")
    WebElement TIN;
    @FindBy(xpath="//Select[@name=\"package\"]")
    WebElement select_package;
    @FindBy(xpath="//*[@name=\"no_users\"]")
    WebElement No_users;
    @FindBy(xpath="//select[@name=\"duration\"]")
    WebElement duration_expense;
    @FindBy(xpath="//*[@id=\"to_date_expense\"]")
    WebElement To_date;
    @FindBy(xpath="//*[@name=\"from_date\"]")
    WebElement from_date_expense;
    @FindBy(xpath="//*[@id=\"per_order_number\"]")
    WebElement PO_NUMBER;
    @FindBy(xpath="//*[@id=\"paid_amount\"]")
    WebElement paid_amount;
    @FindBy(xpath="//select[@id=\"payment_type\"]")
    WebElement payment_type;
    @FindBy(xpath="//*[@id=\"remarks\"]")
    WebElement remarks;
    @FindBy(xpath="//*[@value=\"Submit\"]")
    WebElement submit_lincec;
    @FindBy(xpath="//*[text()=\"candy clock\"]")
    WebElement candy_clock;
    @FindBy(xpath="//*[text()=\"2\"]")
    WebElement dggaikkite2;

    //*[@name="mobile_num"]
   // Syncoffice@2020
    public void setusername(String uname)
    {
        username.sendKeys(uname);
        System.out.println("Enter the email id");
    }
    public void Setpassword(String pass)
    {
        password.sendKeys(pass);
        System.out.println("Enter the password");
    }

    public void setLogin() {
        login.click();
    }

    public void setLicence() {
        Licencee.click();
  }

    public void setAdd_Licencee() {
        add_Licencee.click();
    }

    public void setLicence_type() {
     //   licence_type.click();
        Select sc=new Select(licence_type);
        sc.selectByVisibleText("Trial");
    }
    public void setLicence_type_Licenced() {
        //   licence_type.click();
        Select sc=new Select(licence_type);
        sc.selectByVisibleText("Licenced");
    }
    public void setName_Licencee() throws InterruptedException {
        name_Licencee.sendKeys("driving");
        Thread.sleep(4000);
        first_name.sendKeys(random_name);
        Thread.sleep(4000);

        last_name.sendKeys("mishra");
        Thread.sleep(4000);

        email.sendKeys(random_name+"@gmail.com");
        Thread.sleep(4000);

        address.sendKeys("Tirupati");
        Thread.sleep(4000);

        pincode.sendKeys("494442");
        Thread.sleep(8000);

        mobile_num.sendKeys("8839024912");
        Thread.sleep(4000);

        landline_no.sendKeys("8839024912");
        Thread.sleep(4000);

incorporation_date.click();
        Thread.sleep(4000);

date1.click();
        Thread.sleep(4000);
    }

    public void setSubmit() {
        submit.click();
    }
















    //LLLLLLL
    public void setPAN_NUMBER() throws InterruptedException {
        PAN_NUMBER.sendKeys("FYMPM2113L");
        TIN.sendKeys("12345677");
        Thread.sleep(8000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(4000);

        Random random = new Random();
        int a = random.nextInt(3);
        System.out.println(a);
   //
        Thread.sleep(4000);
        js.executeScript("arguments[0].scrollIntoView();", candy_clock);
        Thread.sleep(4000);
       // driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[" + (a + 1) + "]")).click();
        driver.findElement(By.xpath("(//*[@type=\"checkbox\"])")).click();
        Thread.sleep(4000);

       Select sc=new Select(select_package);

       sc.selectByVisibleText("Standard");
        Thread.sleep(4000);

        No_users.sendKeys(number);
        Thread.sleep(4000);

        Select sc1=new Select(duration_expense);
        sc1.selectByVisibleText("Monthly");
        Thread.sleep(4000);

        from_date_expense.click();
        Thread.sleep(4000);

        date1.click();
        Thread.sleep(4000);

        PO_NUMBER.sendKeys(number);
        Thread.sleep(4000);

        paid_amount.sendKeys(number1);
        Thread.sleep(4000);

        Select sc3=new Select(payment_type);
        sc3.selectByVisibleText("Cash");
        //Cash
        Thread.sleep(4000);

        remarks.sendKeys("aaaaaa");
        Thread.sleep(4000);
       // js.executeScript("arguments[0].scrollIntoView(true);",element);

        js.executeScript("arguments[0].scrollIntoView();", submit_lincec);
        Thread.sleep(4000);
        js.executeScript("arguments[0].click();", submit_lincec);

    //    submit_lincec.click();
        Thread.sleep(4000);

    }
}
