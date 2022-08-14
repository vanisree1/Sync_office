package Account_Reconciliation_page;

import Step_defination.stepdefinitions;
import Utilities.Utilities_class;
//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upload_file_Sub_glaccount {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(5);
  //  static Logger log = Logger.getLogger(stepdefinitions.class.getName());


    public Upload_file_Sub_glaccount(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//*[text()=\"account_balance\"]")
    WebElement sub_gl_act;
    @FindBy(xpath = "//*[text()=\"account_balance\"]")
    WebElement account_balance;
    @FindBy(xpath = "//*[text()=\"cloud_download\"]")
    WebElement cloud;
    @FindBy(xpath = "//*[text()=\"Download Sample\"]")
    WebElement download;

    @FindBy(xpath = "//*[@type=\"file\"]")
    WebElement file;
    @FindBy(xpath="(//*[text()=\"delete\"])[4]")
    WebElement delete;
    @FindBy(xpath="(//*[text()=\"delete\"])[6]")
    WebElement dlt_2;
    @FindBy(xpath = "//div//input[@type=\"file\"]")
    WebElement ac_utton;
    @FindBy(xpath = "//*[text()=\"account_balance_wallet\"]")
    WebElement mouse;
    @FindBy(xpath = "//*[text()=\"Account Reconciliation\"]")
    WebElement acbutton;
    @FindBy(xpath = "//*[text()=\"Account Reconciliation\"]")
    WebElement a_button;
    @FindBy(xpath = "//*[text()=\"Account Reconciliation\"]")
    WebElement c_button;
    @FindBy(xpath = "//*[text()=\"Account Reconciliation\"]")
    WebElement ac_bton;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement save;
    @FindBy(xpath = "(//*[text()=\"close\"])[3]")
    WebElement close;
    @FindBy(xpath="(//*[@type=\"text\"])[5]")
    WebElement search;
    @FindBy(xpath = "//*[@type=\"checkbox\"]")
    WebElement check;
    public void setCloud() throws InterruptedException {
       // BasicConfigurator.configure();
        Thread.sleep(3000);

        sub_gl_act.click();
        Thread.sleep(3000);
        cloud.click();
       // log.info("click on cloud_create_folder");
        //  download.click();
//file.click();
        Thread.sleep(8000);

        file.sendKeys("/home/lenovo/Downloads/new_sub_gl.xls");
        Thread.sleep(8000);
      //  log.info("select the file");

        save.click();
        Thread.sleep(5000);

        close.click();
        Thread.sleep(5000);

        sub_gl_act.click();
        Thread.sleep(5000);

        if (search.isDisplayed()) {
            Thread.sleep(8000);
            search.sendKeys("501");
            System.out.println(" New User successfully added in sub_Gl_account ");
            Thread.sleep(8000);
            delete.click();
            Thread.sleep(8000);
            dlt_2.click();
            Thread.sleep(8000);

           // driver.close();

            System.out.println(" New User successfully Deleted in sub_Gl_account");
        } else {
            System.out.println(" New User not added in sub_Gl_account");
        }


    }
}
