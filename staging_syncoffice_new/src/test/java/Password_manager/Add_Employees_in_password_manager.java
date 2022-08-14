package Password_manager;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Employees_in_password_manager {


    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String middle_name = Utilities_class.randomalphabet(5);
    public String number = Utilities_class.randomnemeric(3);
    public String mobilenumber = Utilities_class.randomnemeric(10);

    public Add_Employees_in_password_manager(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[@class=\"material-icons MuiIcon-root-1217 MuiIcon-fontSizeSmall-1224\"]")
    WebElement emp;

    @FindBy(xpath = "//*[text()=\"Select...\"]")
    WebElement Select;
    @FindBy(xpath = "(//*[text()=\"Sarika\"])[2]")
    WebElement company;
    @FindBy(xpath = "(//*[text()=\"add\"])[5]")
    WebElement add1;
    @FindBy(xpath = "(//*[@type=\"text\"])[8]")
    WebElement firstclass;
    @FindBy(xpath = "(//*[@type=\"text\"])[9]")
    WebElement middile;
    @FindBy(xpath = "(//*[@type=\"text\"])[10]")
    WebElement last_name;
    @FindBy(xpath = "(//*[@type=\"text\"])[7]")
    WebElement code;
    @FindBy(xpath = "(//*[@type=\"text\"])[15]")
    WebElement mail;
    @FindBy(xpath = "(//*[@type=\"tel\"])")
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
    @FindBy(xpath = "(//*[text()=\"2021\"])[1]")
    WebElement offical_2020;
    @FindBy(xpath = "//*[text()=\"2000\"]")
    WebElement offial_2000;
    @FindBy(xpath = "//*[text()=\"Female\"]")
    WebElement female;
    @FindBy(xpath = "(//*[text()=\"Company Related\"])")
    WebElement company_related;
    @FindBy(xpath = "(//*[text()=\"bangluru\"])[2]")
    WebElement location;
    @FindBy(xpath="//*[text()=\"Managing Director\"]")
    WebElement degiganation;
    @FindBy(xpath="//*[text()=\"Administration\"]")
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
    @FindBy(xpath = "    (//*[text()=\"mani mishra\"])[2]\n")
    WebElement reporting_authorty;
    @FindBy(xpath = "   (//*[text()=\"Holiday\"])\n")
    WebElement holiday;
    public void setEmp_tab( ) throws InterruptedException {
        Thread.sleep(8000);

        emp.click();
        Thread.sleep(4000);

        Select.click();
        Thread.sleep(4000);

        company.click();
        Thread.sleep(4000);

        code.sendKeys(random_name + number);
        Thread.sleep(4000);

        firstclass.sendKeys(random_name);
        Thread.sleep(4000);

        middile.sendKeys(random_Second_name);
        Thread.sleep(4000);

        last_name.sendKeys(middle_name);
        Thread.sleep(4000);
        Select.click();
        Thread.sleep(4000);

        female.click();

        mail.sendKeys(random_name + "@gmail.com");
        Thread.sleep(4000);

        phone.sendKeys(mobilenumber);

        DOB.click();
        offical_2020.click();
        Thread.sleep(5000);

        offial_2000.click();
        Thread.sleep(5000);
        date_2.click();
        Thread.sleep(5000);
        dob_official.click();
        Thread.sleep(5000);
        offical_2020.click();
        Thread.sleep(5000);
        offial_2000.click();
        date_3.click();
        Thread.sleep(5000);
        dob_actual.click();
        Thread.sleep(5000);
        date_4.click();
        Thread.sleep(5000);


        //save.click();
        //Thread.sleep(5000);

    }

    public void setCompany_related( ) throws InterruptedException {
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



    }
}
