package Account_Reconciliation_page;

import Utilities.Utilities_class;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class Download_Reco_Status {

    public WebDriver driver;
    public String random_num = Utilities_class.randomnemeric(6);
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(9);

    public Download_Reco_Status(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//*[text()=\"GL Sub Account\"]")
    WebElement sub_gl_act;
    @FindBy(xpath = "//*[text()=\"account_balance\"]")
    WebElement account_balance;
    @FindBy(xpath = "//*[text()=\"Reco Status\"]")
    WebElement Reco_status;
    @FindBy(xpath = "//*[text()=\"cloud_upload\"]")
    WebElement cloud;
    @FindBy(xpath = "//body/div[7]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/input[1]")
    WebElement selct_box;
    @FindBy(xpath = "//*[text()=\">\"]")
    WebElement arrow;
    @FindBy(xpath = "/html/body/div[8]/div[3]/div/div/div[1]/div[2]/div/div/div/div/div/div[3]/div/div[1]/div[1]/span/span/span[1]/input")
    WebElement nextselect;
    @FindBy(xpath = "//body/div[8]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/input[1]")
    WebElement emp_box;
    @FindBy(xpath = "(//*[@type=\"text\"])[5]")
    WebElement search;
    //(//*[text()="Download"])[3]
    @FindBy(xpath = "(//*[text()=\"Download\"])[3]")
    WebElement doenload;
    @FindBy(xpath = "(//*[text()=\"Download\"])[2]")
    WebElement doenload1;
    @FindBy(xpath = "(//*[text()=\"Download\"])[1]")
    WebElement doenload_emp;
    @FindBy(xpath = "//*[text()=\"PDF\"]")
    WebElement pdf;
    @FindBy(xpath = "    //*[text()=\"Download & Save Template\"]\n")
    WebElement save_template;
    @FindBy(xpath = "//*[text()=\"Excel\"]")
    WebElement excel;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[2]")
    WebElement chekbox;
    @FindBy(xpath = "/html/body/div[10]/div[3]/div/div/div[1]/div[2]/div/div/div/div/div/div[3]/div/div[1]/div[1]/span/span/span[1]/input")
    WebElement reco_box;
    @FindBy(xpath = "//*[text()=\"account_balance_wallet\"]")
    WebElement mouse;
    @FindBy(xpath="//*[text()=\"GL Category\"]")
    WebElement Gl_category;

// subgl_account
    public void setSub_gl_balance() throws InterruptedException {
        Actions ac = new Actions(driver);
        ac.moveToElement(account_balance).perform();
        account_balance.isDisplayed();
        Thread.sleep(8000);
        sub_gl_act.click();
        Thread.sleep(4000);}


    // gl_account

    public void setgl_account() throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", mouse);
        Thread.sleep(8000);
    }

    // gl_category

    public void setGl_category_page() throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", Gl_category);
        Thread.sleep(5000);

    }


    // reco download
    public void setSetting() throws InterruptedException {
        Thread.sleep(4000);
        //  setting.click();
        Reco_status.click();

        Thread.sleep(4000);
        search.sendKeys("asti");
        Thread.sleep(4000);
        cloud.click();
        //   selct_box.click();
        //  arrow.click();

        //  nextselect.click();
        Thread.sleep(4000);
reco_box.click();
        // modify.click();
        Thread.sleep(4000);

        doenload.click();
        Thread.sleep(4000);

        excel.click();
        //  doenload1.click();
        //  Thread.sleep(7000);
    }

    public void setPdf() throws InterruptedException {
        Thread.sleep(4000);
        Thread.sleep(4000);
        cloud.click();
        Thread.sleep(4000);
           reco_box.click();
        Thread.sleep(4000);
        doenload.click();
        Thread.sleep(4000);
        pdf.click();//driver.close();
        Thread.sleep(4000);

    }

    public void setSave_template() throws InterruptedException {
        //   search.sendKeys("asti");
        Thread.sleep(4000);
        cloud.click();
        Thread.sleep(4000);

reco_box.click();
        //  modify.click();
        Thread.sleep(4000);

        doenload.click();
        Thread.sleep(4000);
        save_template.click();
    }























    // export gl account
    public void setglaccounttemplate() throws InterruptedException {
        Thread.sleep(4000);
        cloud.click();
        Thread.sleep(4000);

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(4000);
       // js.executeScript("arguments[0].scrollIntoView();", nextselect);
          nextselect.click();
        Thread.sleep(4000);

        //  modify.click();
        Thread.sleep(4000);

        doenload1.click();
        Thread.sleep(4000);
        save_template.click();
    }

    public void setglaccountPDF() throws InterruptedException {
        Thread.sleep(4000);
        // search.sendKeys("asti");
        cloud.click();
        Thread.sleep(4000);
        // selct_box.click();
          //arrow.click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;

          nextselect.click();
        Thread.sleep(4000);
        doenload1.click();
        Thread.sleep(4000);
        pdf.click();//driver.close();
        Thread.sleep(4000);

    }

    public void setglaccountEXCEL() throws InterruptedException {
        Thread.sleep(4000);
        //  setting.click();

        Thread.sleep(4000);
        cloud.click();
        Thread.sleep(4000);
         // selct_box.click();
      //  Thread.sleep(4000);
        //arrow.click();
       // Thread.sleep(4000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        //js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(4000);
        //js.executeScript("arguments[0].scrollIntoView();", nextselect);

          nextselect.click();
        Thread.sleep(4000);

        // modify.click();
        Thread.sleep(4000);

        doenload1.click();
        Thread.sleep(4000);

        excel.click();
        //  doenload1.click();
        //  Thread.sleep(7000);
    }















    // export file emp............................................................................................
    public void setSettingEMPLOYEE_EXCEL() throws InterruptedException {
        Thread.sleep(4000);

        Thread.sleep(4000);
        cloud.click();
        Thread.sleep(4000);
        //   selct_box.click();
        Thread.sleep(4000);
        //  arrow.click();


       // js.executeScript("arguments[0].scrollIntoView();", chekbox);

        chekbox.click();
        // modify.click();
        Thread.sleep(4000);

        doenload.click();
        Thread.sleep(4000);

        excel.click();

    }

    public void setEMPLOYEEPdf() throws InterruptedException {
        Thread.sleep(4000);
        // search.sendKeys("asti");
        Thread.sleep(4000);
        cloud.click();
        Thread.sleep(4000);
        //  selct_box.click();
        Thread.sleep(4000);
        //  arrow.click();
        Thread.sleep(4000);

           nextselect.click();
        Thread.sleep(4000);

        //    modify.click();
        Thread.sleep(4000);

        doenload.click();
        Thread.sleep(4000);
        pdf.click();//driver.close();
        Thread.sleep(4000);

    }

    public void setEMPOYEESave_template() throws InterruptedException {
        //   search.sendKeys("asti");
        Thread.sleep(4000);
        cloud.click();
        Thread.sleep(4000);
        //   selct_box.click();
        Thread.sleep(4000);
        //   arrow.click();

           nextselect.click();
        Thread.sleep(4000);

        //  modify.click();
        Thread.sleep(4000);

        doenload.click();
        Thread.sleep(4000);
        save_template.click();
    }

    public void EMPsetPdf() throws InterruptedException {
        Thread.sleep(4000);
        cloud.click();
        Thread.sleep(4000);
        emp_box.click();
        Thread.sleep(4000);
        doenload_emp.click();
        Thread.sleep(4000);
        pdf.click();//driver.close();
        Thread.sleep(4000);

    }
    public void EMPsetEXcel() throws InterruptedException {
        Thread.sleep(4000);
        cloud.click();
        Thread.sleep(4000);
        emp_box.click();
        Thread.sleep(4000);
        doenload_emp.click();
        Thread.sleep(4000);
        excel.click();//driver.close();
        Thread.sleep(4000);

    }
    public void EMPsettimesheet() throws InterruptedException {
        Thread.sleep(4000);
        cloud.click();
        Thread.sleep(4000);
        emp_box.click();
        Thread.sleep(4000);
        doenload_emp.click();
        Thread.sleep(4000);
        save_template.click();//driver.close();
        Thread.sleep(4000);

    }











    // category........................................................................

    public void setcategoryEXCEl() throws InterruptedException {
        Thread.sleep(4000);
        // search.sendKeys("asti");
        cloud.click();
        Thread.sleep(4000);
        //selct_box.click();
        Thread.sleep(4000);

        //arrow.click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        nextselect.click();
        Thread.sleep(4000);

        //  modify.click();

        doenload1.click();
        Thread.sleep(4000);
        excel.click();//driver.close();
        Thread.sleep(4000);

    }
    public void settiMESHEET_AND_SAVE() throws InterruptedException {
        Thread.sleep(4000);
        // search.sendKeys("asti");
        cloud.click();
        Thread.sleep(4000);
     //   selct_box.click();
        Thread.sleep(4000);

      //  arrow.click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        nextselect.click();
        Thread.sleep(4000);

        //  modify.click();

        doenload1.click();
        Thread.sleep(4000);
        save_template.click();//driver.close();
        Thread.sleep(4000);

    }
    public void setcategoryPDF() throws InterruptedException {
        Thread.sleep(4000);
        cloud.click();
        Thread.sleep(4000);

        JavascriptExecutor executor = (JavascriptExecutor) driver;

        nextselect.click();
        Thread.sleep(4000);


        doenload1.click();
        Thread.sleep(4000);
        pdf.click();//driver.close();
        Thread.sleep(4000);

    }



















    // globel..........................................................................................................................................................................................
    public void globel_export_PDF() throws InterruptedException {
        Thread.sleep(4000);
        cloud.click();
        Thread.sleep(4000);

        nextselect.click();
        Thread.sleep(4000);


        doenload1.click();
        Thread.sleep(4000);
        pdf.click();//driver.close();
        Thread.sleep(4000);

    }
    public void Globel_gl_excel() throws InterruptedException {
        Thread.sleep(4000);
        cloud.click();
       // selct_box.click();
        Thread.sleep(4000);

     //   arrow.click();

        JavascriptExecutor executor = (JavascriptExecutor) driver;

        nextselect.click();
        Thread.sleep(4000);


        doenload1.click();
        Thread.sleep(4000);
        excel.click();//driver.close();
        Thread.sleep(4000);

    }
    public void save_and_template_globel_g() throws InterruptedException {
        Thread.sleep(4000);
        cloud.click();
        Thread.sleep(4000);

        nextselect.click();
        Thread.sleep(4000);


        doenload1.click();
        Thread.sleep(4000);
        save_template.click();//driver.close();
        Thread.sleep(4000);

    }























    // sub gl account
    public void Sub_gl_account_excel() throws InterruptedException {
        Thread.sleep(4000);
        cloud.click();
        Thread.sleep(5000);

        nextselect.click();
        Thread.sleep(4000);


        doenload1.click();
        Thread.sleep(4000);
        excel.click();//driver.close();
        Thread.sleep(4000);

    }
    public void Sub_gl_account_pdf() throws InterruptedException {
        Thread.sleep(4000);
        cloud.click();
        Thread.sleep(4000);


        doenload1.click();
        Thread.sleep(4000);
        pdf.click();//driver.close();
        Thread.sleep(4000);

    }
    public void Sub_gl_account_Save_template() throws InterruptedException {
        Thread.sleep(4000);
        cloud.click();
        Thread.sleep(4000);

        nextselect.click();
        Thread.sleep(4000);


        doenload1.click();
        Thread.sleep(4000);
        save_template.click();//driver.close();
        Thread.sleep(4000);

    }

    public void Cost_Center_Save_template() throws InterruptedException {
        Thread.sleep(4000);
        cloud.click();
        Thread.sleep(4000);
     //   selct_box.click();
      //  Thread.sleep(4000);

     //   arrow.click();
      ///  Thread.sleep(4000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        nextselect.click();
        Thread.sleep(4000);


        doenload1.click();
        Thread.sleep(4000);
        save_template.click();//driver.close();
        Thread.sleep(4000);

    }
    public void Cost_Center_Excel() throws InterruptedException {
        Thread.sleep(4000);
        cloud.click();
       // selct_box.click();

     //   arrow.click();
        Thread.sleep(4000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        nextselect.click();
        Thread.sleep(4000);


        doenload1.click();
        Thread.sleep(4000);
        excel.click();//driver.close();
        Thread.sleep(4000);

    }
    public void Cost_Center_PDF() throws InterruptedException {
        Thread.sleep(4000);
        cloud.click();

        Thread.sleep(4000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        nextselect.click();
        Thread.sleep(4000);


        doenload1.click();
        Thread.sleep(4000);
        pdf.click();//driver.close();
        Thread.sleep(4000);

    }





}




