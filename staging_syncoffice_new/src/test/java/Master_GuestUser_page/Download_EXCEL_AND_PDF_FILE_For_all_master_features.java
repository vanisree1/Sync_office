package Master_GuestUser_page;

import Utilities.Utilities_class;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Download_EXCEL_AND_PDF_FILE_For_all_master_features {
    public WebDriver driver;
    public String random_num = Utilities_class.randomnemeric(6);
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(9);

    public Download_EXCEL_AND_PDF_FILE_For_all_master_features(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//*[text()=\"GL Sub Account\"]")
    WebElement sub_gl_act;
    @FindBy(xpath = "//*[text()=\"account_balance\"]")
    WebElement account_balance;
    @FindBy(xpath = "//*[text()=\"Reco Status\"]")
    WebElement Reco_status;
    @FindBy(xpath = "//*[text()=\"cloud_download\"]")
    WebElement cloud;
    @FindBy(xpath = "//body/div[7]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/input[1]")
    WebElement selct_box;

    @FindBy(xpath = "//body/div[5]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/input[1]")
    WebElement nextselect;
    @FindBy(xpath = "//body/div[8]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/input[1]")
    WebElement emp_box;
    @FindBy(xpath = "//*[text()=\"<\"]")
    WebElement arrow2;
    //(//*[text()="Download"])[3]
    @FindBy(xpath = "//*[text()=\">\"]")
    WebElement arrow;
    @FindBy(xpath = "//*[text()=\"PDF\"]")
    WebElement pdf;
    @FindBy(xpath = "(//*[text()=\"Download\"])[3]")
    WebElement doenload;
    @FindBy(xpath = "//*[text()=\"Excel\"]")
    WebElement excel;
    @FindBy(xpath = "(//*[text()=\"Download\"])[2]")
    WebElement doenload1;
    @FindBy(xpath = "(//*[text()=\"Download\"])[1]")
    WebElement doenload_emp;

    @FindBy(xpath = "    //*[text()=\"Download & Save Template\"]\n")
    WebElement save_template;

    @FindBy(xpath = "(//*[@type=\"checkbox\"])[2]")
    WebElement chekbox;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div[1]/div[2]/div/div/div/div/div/div[1]/div/div[1]/div[1]/span/span/span[1]/input")
    WebElement check_box;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]/input[1]")
    WebElement checkbox_1;
    @FindBy(xpath="//*[text()=\"GL Category\"]")
    WebElement Gl_category;


    public void setSetting() throws InterruptedException {
        Thread.sleep(7000);

        cloud.click();
        //   selct_box.click();

        Thread.sleep(7000);
        check_box.click();
        // modify.click();
        Thread.sleep(7000);
        arrow.click();
        Thread.sleep(8000);

      //  nextselect.click();
        Thread.sleep(6000);

        doenload.click();
        Thread.sleep(6000);

        excel.click();
        Thread.sleep(6000);

        //  doenload1.click();
        //  Thread.sleep(7000);
        pdf.click();
        Thread.sleep(6000);

    }

    public void setPdf() throws InterruptedException {
        Thread.sleep(7000);

        cloud.click();
        //   selct_box.click();

        Thread.sleep(7000);
        checkbox_1.click();
        // modify.click();
        Thread.sleep(7000);
        arrow.click();
        Thread.sleep(5000);

       // nextselect.click();
     //   Thread.sleep(6000);

        doenload.click();
        Thread.sleep(6000);

        excel.click();
        Thread.sleep(6000);

     /*   arrow2.click();
        Thread.sleep(6000);

        checkbox_1.click();
        Thread.sleep(6000);

        arrow.click();
        Thread.sleep(4000);

        nextselect.click();
        Thread.sleep(6000);

        doenload.click();
        Thread.sleep(6000);
        //  doenload1.click();
        //  Thread.sleep(7000);*/
        pdf.click();
        Thread.sleep(6000);

    }
}
