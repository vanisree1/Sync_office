package Account_Reconciliation_page;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Score_page {
    public WebDriver driver;
    public String random_num= Utilities_class.randomnemeric(3);
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(9);
    public Score_page(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//*[text()=\"settings\"]")
    WebElement setting;
    @FindBy(xpath="//*[text()=\"Score\"]")
    WebElement score;
    @FindBy(xpath="//*[text()=\"add\"]")
    WebElement add;
    @FindBy(xpath="//*[@name=\"score_name\"]")
    WebElement reconame;
    @FindBy(xpath="(//*[@name=\"description\"])[3]")
    WebElement decription;
    @FindBy(xpath="//*[text()=\"Save\"]")
    WebElement save;
    @FindBy(xpath="(//*[@type=\"text\"])[3]")
    WebElement search;
    @FindBy(xpath = "(//*[text()=\"close\"])[3]")
    WebElement close;
    @FindBy(xpath="(//*[text()=\"delete\"])[4]")
    WebElement delete;
    @FindBy(xpath="(//span[contains(text(),'Delete')])[2]")
    WebElement dlt_2;
    @FindBy(xpath = "/html/body/div[7]/div[3]/div/div/div/div/div/div/div[1]/div[3]/button/span[1]/span")
    WebElement clear;
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
    public void setSetting() throws InterruptedException {
        setting.click();
        Thread.sleep(8000);

        score.click();
        Thread.sleep(8000);

        add.click();
        Thread.sleep(6000);

        reconame.sendKeys(random_name);
        Thread.sleep(5000);

        decription.sendKeys(random_Second_name);
        Thread.sleep(3000);
        save.click();
        Thread.sleep(3000);
//close.click();
        //Thread.sleep(8000);

            if (search.isDisplayed()) {
                Thread.sleep(3000);
            //    search.sendKeys(random_num);
                driver.findElement(By.xpath("(//*[text()=\"edit\"])[2]")).click();
                Thread.sleep(4000);


                decription.clear();
                Thread.sleep(6000);

                decription.sendKeys(random_name);
                Thread.sleep(4000);
                driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
                Thread.sleep(4000);
              //  search.clear();
             //   Thread.sleep(4000);
              //  clear.click();
                Thread.sleep(4000);
               // score.click();

              //  Thread.sleep(4000);

              //  search.sendKeys(random_num);
                //Thread.sleep(4000);
            //    search.sendKeys(random_num);
                delete.click();
                Thread.sleep(4000);
                dlt_2.click();
                Thread.sleep(4000);

                System.out.println(" New User successfully added in Score center");
                Thread.sleep(4000);
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


                System.out.println(" New User successfully Deleted in Score center");
            } else {
                System.out.println(" New User not added in Score center");
            }


//score.click();


    }


}
