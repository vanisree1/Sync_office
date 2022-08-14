package Account_Reconciliation_page;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Clock;

public class Reco_status_page {
    public WebDriver driver;
    public String random_num= Utilities_class.randomnemeric(2);
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(9);
    public Reco_status_page(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//*[text()=\"settings\"]")
    WebElement setting;
    @FindBy(xpath="/html/body/div[4]/div[3]/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/div/button[1]/span[1]/span")
    WebElement Reco_status;
    @FindBy(xpath="(//*[text()=\"delete\"])[4]")
    WebElement delete;
    @FindBy(xpath="//*[text()=\"add\"]")
    WebElement add1;

    @FindBy(xpath="(//span[contains(text(),'Delete')])[2]")
    WebElement dlt;
    @FindBy(xpath="//*[@name=\"reco_name\"]")
    WebElement reconame;
    @FindBy(xpath="(//*[@name=\"description\"])[3]")
    WebElement decription;
    @FindBy(xpath="//*[text()=\"Save\"]")
    WebElement save;
    @FindBy(xpath="(//*[@type=\"text\"])[3]")
    WebElement search;
    @FindBy(xpath = "//*[text()=\"cloud_upload\"]")
    WebElement cloud_upload;
    @FindBy(xpath = "(//*[text()=\"Download\"])[3]")
    WebElement download;
    @FindBy(xpath = "(//*[text()=\"Excel\"])")
    WebElement excel;
    @FindBy(xpath = "(//*[text()=\"PDF\"])")
    WebElement pdf;
    @FindBy(xpath = "(//*[text()=\"Download & Save Template\"])")
    WebElement Save_Template;
    @FindBy(xpath = "/html/body/div[5]/div[3]/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/div/button[1]/span[1]/span\n")
    WebElement view;
    @FindBy(xpath = "/html/body/div[7]/div[3]/div/div/div/div/div/div/div[1]/div[3]/button/span[1]/span")
    WebElement clear;

    public void setSetting() throws InterruptedException {
        setting.click();





    }

    public void setreconame() throws InterruptedException {
        //  Thread.sleep(8000);
       // add.click();
        Thread.sleep(4000);
        Reco_status.click();
        Thread.sleep(9000);

        System.out.println("aaaa");
        add1.click();
        Thread.sleep(9000);
        reconame.sendKeys(random_name);
        Thread.sleep(8000);
        decription.sendKeys(random_name+random_num);
        Thread.sleep(8000);
        save.click();
        Thread.sleep(8000);


      //  close.click();
     //   Thread.sleep(8000);

        Thread.sleep(8000);

        if (search.isDisplayed()) {
            Thread.sleep(8000);
          //  search.sendKeys(random_num);


            driver.findElement(By.xpath("(//*[text()=\"edit\"])[2]")).click();
            Thread.sleep(4000);


            decription.clear();
            Thread.sleep(6000);

            decription.sendKeys(random_name);
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
//clear.click();
            Thread.sleep(8000);
            delete.click();
            Thread.sleep(8000);
            dlt.click();

         //   search.sendKeys(random_num);

            System.out.println(" New User successfully added in  Reco_status");
            cloud_upload.click();
            Thread.sleep(4000);

            download.click();
            Thread.sleep(4000);

            excel.click();
            Thread.sleep(4000);

            pdf.click();
            Thread.sleep(4000);

            Save_Template.click();
            Thread.sleep(4000);

           // driver.close();
            System.out.println(" New User successfully Deleted in Reco_status");
        } else {
            System.out.println(" New User not added in Reco_status");
        }



    }


}
