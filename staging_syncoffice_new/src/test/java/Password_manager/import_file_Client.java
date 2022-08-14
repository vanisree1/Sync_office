package Password_manager;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class import_file_Client {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(4);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String number = Utilities_class.randomnemeric(3);
    public String Second_name = Utilities_class.randomalphabet(5);
    public String number1 = Utilities_class.randomnemeric(10);


    public import_file_Client(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/ul[1]/div[1]/li[1]/ul[1]/div[1]/li[1]/div[2]/button[1]/span[1]/span[1]")
    WebElement view;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[1]")
    WebElement view_company;
    @FindBy(xpath="//*[text()=\"Import\"]")
    WebElement import_icon;
    @FindBy(xpath="//*[@ type=\"file\"]")
    WebElement upload;
    @FindBy(xpath="//*[text()=\"Download Sample File\"]")
    WebElement download;
    @FindBy(xpath="(//*[text()=\"save\"])[2]\n")
    WebElement save;
    @FindBy(xpath="    (//*[@type=\"text\"])[8]\n")
    WebElement search;
    @FindBy(xpath="    (//*[text()=\"delete\"])\n")
    WebElement dlt;
    @FindBy(xpath="    (//*[text()=\"delete\"])[2]\n")
    WebElement dlt1;
    @FindBy(xpath="//*[text()=\"Password\"]")
    WebElement password;
    @FindBy(xpath="//*[@name=\"name\"]")
    WebElement name;
    @FindBy(xpath="//*[@name=\"user_id\"]")
    WebElement user_id;
    @FindBy(xpath="(//*[@name=\"password\"])")
    WebElement password_button;
    @FindBy(xpath="//*[@type=\"tel\"]")
    WebElement phone;
    @FindBy(xpath = "(//*[@type=\"button\"]//*[@focusable=\"false\"])[4]")
    WebElement dob_actual;
    @FindBy(xpath = "(//*[text()=\"28\"])")
    WebElement date_4;
    @FindBy(xpath="(//*[@name=\"description\"])[3]")
    WebElement description;
    @FindBy(xpath="//*[text()=\"save\"]")
    WebElement save1 ;

    @FindBy(xpath="    (//*[@type=\"text\"])[8]\n")
    WebElement search1 ;
    @FindBy(xpath="(//*[text()=\"not_interested\"])")
    WebElement user_aess ;
    @FindBy(xpath="//*[@type=\"checkbox\"]")
    WebElement checkbox ;
    @FindBy(xpath="//*[text()=\"Permit\"]")
    WebElement permit ;
    @FindBy(xpath="//*[text()=\"delete\"]")
    WebElement delete ;
    @FindBy(xpath="(//*[text()=\"Delete\"])[2]")
    WebElement dlt2e ;
    @FindBy(xpath="//body/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]/span[1]/span[1]")
    WebElement add_category ;
    @FindBy(xpath="//*[@name=\"category_name\"]")
    WebElement category_name ;
    @FindBy(xpath="//*[@name=\"url\"]")
    WebElement url ;

    @FindBy(xpath="(//*[@name=\"description\"])[3]")
    WebElement description1 ;
    @FindBy(xpath="//*[text()=\"--Select--\"]")
    WebElement select ;
    @FindBy(xpath="(//*[text()=\"sarika\"])[5]")
    WebElement sarika ;
    @FindBy(xpath="(//*[text()=\"Save\"])")
    WebElement save2 ;
    public void setView( ) throws InterruptedException {
        view.click();
        Thread.sleep(7000);
        import_icon.click();
        Thread.sleep(7000);

        download.click();
        Thread.sleep(7000);

        upload.sendKeys("/home/lenovo/Downloads/Password_sample.xlsx");
        Thread.sleep(7000);

        save.click();
        Thread.sleep(7000);

        search.sendKeys("gl");
        Thread.sleep(7000);

        dlt.click();
        Thread.sleep(7000);

        dlt1.click();


    }


    public void Companypassword() throws InterruptedException {
        view_company.click();
        Thread.sleep(7000);

        password.click();
        Thread.sleep(7000);

        name.sendKeys(random_name);
        Thread.sleep(7000);

        user_id.sendKeys(number);
        Thread.sleep(7000);

        password_button.sendKeys(random_name+"@15");
        Thread.sleep(7000);

        phone.sendKeys(number1);
        Thread.sleep(7000);

        description.sendKeys(random_Second_name);
        Thread.sleep(7000);

        save1.click();
        Thread.sleep(7000);

        search1.sendKeys(number);
        Thread.sleep(7000);

        user_aess.click();
        Thread.sleep(7000);

        checkbox.click();
        Thread.sleep(7000);

        permit.click();
        Thread.sleep(7000);

        delete.click();
        Thread.sleep(7000);

        dlt2e.click();
        Thread.sleep(7000);

    }

    public void Clientpassword() throws InterruptedException {
            view.click();
            Thread.sleep(7000);

            password.click();
            Thread.sleep(7000);

            name.sendKeys(random_name);
            Thread.sleep(7000);

            user_id.sendKeys(number);
            Thread.sleep(7000);

            password_button.sendKeys(random_name+"@15");
            Thread.sleep(7000);

            phone.sendKeys(number1);
            Thread.sleep(7000);

            description.sendKeys(random_Second_name);
            Thread.sleep(7000);

            save1.click();
        Thread.sleep(7000);

            search1.sendKeys(number);
        Thread.sleep(7000);

        user_aess.click();
        Thread.sleep(7000);

        checkbox.click();
        Thread.sleep(7000);

        permit.click();
        Thread.sleep(7000);

        delete.click();
        Thread.sleep(7000);

        dlt2e.click();
        Thread.sleep(7000);


    }


    public void category() throws InterruptedException {
        add_category.click();
        Thread.sleep(7000);

        name.sendKeys(random_name);
        Thread.sleep(7000);

        url.sendKeys("https://www.syncoffice.com/");
        Thread.sleep(7000);

        description1.sendKeys(random_Second_name);
        Thread.sleep(7000);
save2.click();

    }



    }




