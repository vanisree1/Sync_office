package Master_GuestUser_page;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Import_File_page {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(5);


    public Import_File_page(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "(//*[text()=\"cloud_upload\"])[1]")
    WebElement cloud;
    @FindBy(xpath = "//*[text()=\"account_balance_wallet\"]\n")
    WebElement gl_act;
    @FindBy(xpath = "(//*[text()=\"Clients\"])")
    WebElement clients;
    @FindBy(xpath = "(//*[text()=\"Client\"])[2]")
    WebElement client;
    @FindBy(xpath = "//*[@type=\"file\"]")
    WebElement file;
    @FindBy(xpath="(//*[text()=\"delete\"])[2]")
    WebElement delete;
    @FindBy(xpath="(//*[text()=\"delete\"])[4]")
    WebElement dlt_2;
    @FindBy(xpath = "//div//input[@type=\"file\"]")
    WebElement ac_utton;
    @FindBy(xpath = "//*[text()=\"account_balance_wallet\"]")
    WebElement mouse;
    @FindBy(xpath = "//*[text()=\"Account Reconciliation\"]")
    WebElement acbutton;
    @FindBy(xpath = "//*[text()=\"Account Reconciliation\"]")
    WebElement a_button;
    @FindBy(xpath = "//*[@type=\"checkbox\"]")
    WebElement check;
    @FindBy(xpath = "//*[text()=\"Account Reconciliation\"]")
    WebElement ac_bton;
    @FindBy(xpath = "(//*[text()=\"save\"])[2]")
    WebElement save;
    @FindBy(xpath = "(//*[text()=\"close\"])[3]")
    WebElement close;
    @FindBy(xpath="(//*[@type=\"text\"])[2]")
    WebElement search;
    @FindBy(xpath = "//*[text()=\"Download Sample File\"]")
    WebElement download;

    public void setCloud() throws InterruptedException {
        clients.click();
        Thread.sleep(8000);
        client.click();
       // gl_act.click();
        //    mouse.click();

        Thread.sleep(3000);
        cloud.click();
        Thread.sleep(8000);
        download.click();
        Thread.sleep(8000);

System.out.println("aaaa");
        file.sendKeys("/home/lenovo/Downloads/New_Master_Client_sample.xls");
        Thread.sleep(8000);
        System.out.println("aaaa");

        save.click();
        Thread.sleep(9000);

      //  close.click();
        //Thread.sleep(9000);

       // mouse.click();
      //  Thread.sleep(9000);

        if (search.isDisplayed()) {
            Thread.sleep(8000);
            search.sendKeys("cl");
            System.out.println(" New User successfully added in GLaccount");
            Thread.sleep(8000);
            check.click();
            Thread.sleep(8000);
            delete.click();
            Thread.sleep(8000);
            dlt_2.click();
            System.out.println(" New User successfully Deleted in GLaccount");
        } else {
            System.out.println(" New User not added in GLaccount");
        }


    }
}
