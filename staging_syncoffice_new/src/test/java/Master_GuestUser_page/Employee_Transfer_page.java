package Master_GuestUser_page;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Employee_Transfer_page {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String middle_name = Utilities_class.randomalphabet(5);
    public String number = Utilities_class.randomnemeric(3);
    public String mobilenumber = Utilities_class.randomnemeric(9);

    public Employee_Transfer_page(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "    //*[text()=\"person\"]\n")
    WebElement emp_tab;
    //*[text()="developer_board"]
    //  (//*[text()="keyboard_arrow_right"])
    @FindBy(xpath = "(//*[text()=\"keyboard_arrow_right\"])")
    WebElement arrorw;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[2]")
    WebElement box;
    @FindBy(xpath = "(//*[text()=\"add\"])[2]")
    WebElement add;

    @FindBy(xpath = "//*[text()=\"gesture\"]")
    WebElement genral;
    @FindBy(xpath = "//*[text()=\"transfer_within_a_station\"]")
    WebElement emp_transfer;
    @FindBy(xpath = "//*[text()=\"View\"]")
    WebElement view;
    @FindBy(xpath = "(//select[@ class=\"mdc-select__native-control customFieldText py-0\"])[1]")
    WebElement select_group;
    @FindBy(xpath = "(//select[@ class=\"mdc-select__native-control customFieldText py-0\"])[2]")
    WebElement select_location;
    @FindBy(xpath = "(//select[@ class=\"mdc-select__native-control customFieldText py-0\"])[3]")
    WebElement select_department;
    @FindBy(xpath = "(//select[@ class=\"mdc-select__native-control customFieldText py-0\"])[4]")
    WebElement select_desigation;
    @FindBy(xpath = "(//select[@ class=\"mdc-select__native-control customFieldText py-0\"])[5]")
    WebElement select_grade;
    @FindBy(xpath = "(//select[@ class=\"mdc-select__native-control customFieldText py-0\"])[6]")
    WebElement select_Reporting;
    @FindBy(xpath = "(//*[@type=\"text\"])[3]")
    WebElement code;
    @FindBy(xpath = "(//*[@type=\"text\"])[4]")
    WebElement date;
    @FindBy(xpath = "(//*[text()=\"2\"])")
    WebElement date_2;
    @FindBy(xpath = "(//*[@type=\"text\"])[5]")
    WebElement remark;
    @FindBy(xpath = "(//*[text()=\"5\"])")
    WebElement date_3;
    @FindBy(xpath = "(//*[@type=\"button\"]//*[@focusable=\"false\"])[6]")
    WebElement dob_actual;
    @FindBy(xpath = "(//*[text()=\"save\"])[2]")
    WebElement save;

    public void setEmp_tab( ) throws InterruptedException {
        Thread.sleep(4000);

        Actions actions = new Actions(driver);
        // WebElement closeMenuOption = driver.findElement(By.xpath("//*[text()=\"Company\"]"));
        actions.moveToElement(genral).perform();
        Thread.sleep(4000);

        add.click();
        Thread.sleep(4000);

        arrorw.click();
        Thread.sleep(4000);

view.click();
        Thread.sleep(4000);

        box.click();
        Thread.sleep(4000);

        emp_transfer.click();
        Thread.sleep(4000);

        remark.sendKeys(random_name);
        Thread.sleep(4000);

        code.sendKeys(number);
        Thread.sleep(4000);


        date.click();
        Thread.sleep(2000);

        date_2.click();
        Thread.sleep(4000);

        Select sc=new Select(select_group);
sc.selectByVisibleText("83 The World Cup");
        Thread.sleep(4000);
        Select sc1=new Select(select_location);
        sc1.selectByVisibleText("Mumbai");
        Thread.sleep(4000);

        Select sc2=new Select(select_department);
        sc2.selectByVisibleText("Administration");
        Thread.sleep(4000);

        Select sc3=new Select(select_desigation);
        sc3.selectByVisibleText("Managing Director");
        Thread.sleep(4000);

        Select sc4=new Select(select_grade);
        sc4.selectByVisibleText("AB");
        Thread.sleep(4000);

        Select sc6=new Select(select_Reporting);
        sc6.selectByVisibleText("MAX");
        Thread.sleep(4000);

        code.clear();
        Thread.sleep(4000);

        code.sendKeys("123");
        Thread.sleep(4000);

save.click();


    }
    }
