package Account_Reconciliation_page;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Global_Gl_upload_file_page {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(5);


    public Global_Gl_upload_file_page(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//*[text()=\"business\"]")
    WebElement mouse;
    @FindBy(xpath = "//*[text()=\"cloud_upload\"]")
    WebElement cloud;
    @FindBy(xpath = "//*[text()=\"Upload\"]")
    WebElement upload;
    @FindBy(xpath = "//*[text()=\"Download Sample\"]")
    WebElement download;
    @FindBy(xpath="(//*[text()=\"delete\"])[4]")
    WebElement delete;
    @FindBy(xpath="(//*[text()=\"delete\"])[6]")
    WebElement dlt_2;
    @FindBy(xpath = "//*[@type=\"file\"]")
    WebElement file;
    @FindBy(xpath = "(//*[@type=\"button\"])[15]")
    WebElement button;
    @FindBy(xpath = "//button//span[text()=\"cloud_download\"]")
    WebElement bon;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement save;
    @FindBy(xpath = "(//*[text()=\"close\"])[3]")
    WebElement close;
    @FindBy(xpath="(//*[@type=\"text\"])[5]")
    WebElement search;
    @FindBy(xpath = "//div[@role=\"group\"]/button[2]")
    WebElement acbutton;

    public void setMouse() throws InterruptedException {
Thread.sleep(9000);
        System.out.println("Syncoffice Home Page Displayed");

        bon.click();
        System.out.println("Syncoffice upload");
        Thread.sleep(7000);

        file.sendKeys("/home/lenovo/Downloads/new_globel.xls");
        Thread.sleep(7000);

        save.click();
        Thread.sleep(7000);

     //   close.click();
       // Thread.sleep(9000);

       // mouse.click();
        Thread.sleep(4000);

        if (search.isDisplayed()) {
            Thread.sleep(8000);
            search.sendKeys("001");
            System.out.println(" New User successfully added in Cost center");
            Thread.sleep(8000);
            delete.click();
            Thread.sleep(8000);
            dlt_2.click();
            System.out.println(" New User successfully Deleted in Cost center");
            Thread.sleep(8000);
        } else {
            System.out.println(" New User not added in Cost center");
        }


    }

}
