package Account_Reconciliation_page;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Download_Score {
    public WebDriver driver;
    public String random_num= Utilities_class.randomnemeric(6);
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(9);
    public Download_Score(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//*[text()=\"settings\"]")
    WebElement setting;
    @FindBy(xpath="//*[text()=\"Score\"]")
    WebElement score;
    @FindBy(xpath="//*[text()=\"cloud_upload\"]")
    WebElement cloud;
    @FindBy(xpath="    //*[@type=\"checkbox\"]\n")
    WebElement checkbox;
    @FindBy(xpath="(//*[@type=\"checkbox\"])[3]")
    WebElement selct_box;
    @FindBy(xpath="//*[text()=\">\"]")
    WebElement arrow;
    @FindBy(xpath="(//*[@type=\"checkbox\"])[5]")
    WebElement nextselect;
    @FindBy(xpath="(//*[@type=\"checkbox\"])[7]")
    WebElement modify;
    @FindBy(xpath="(//*[@type=\"text\"])[5]")
    WebElement search;
    @FindBy(xpath="//*[text()=\"PDF\"]")
    WebElement pdf;
    @FindBy(xpath="    //*[text()=\"Download & Save Template\"]\n")
    WebElement save_template;
    @FindBy(xpath="//*[text()=\"Excel\"]")
    WebElement excel;
    //(//*[text()="Download"])[3]
    @FindBy(xpath="(//*[text()=\"Download\"])[3]")
    WebElement doenload;
    @FindBy(xpath="(//*[text()=\"Download\"])[4]\n")
    WebElement doenload1;
    public void setSetting() throws InterruptedException {
        Thread.sleep(4000);
         setting.click();
        Thread.sleep(4000);
         score.click();

        Thread.sleep(4000);
        search.sendKeys("sarika");
        Thread.sleep(4000);
        checkbox.click();
        Thread.sleep(4000);

        cloud.click();
        Thread.sleep(4000);
     //   selct_box.click();
        Thread.sleep(4000);
     //   arrow.click();
        Thread.sleep(4000);

       // nextselect.click();
      //  Thread.sleep(4000);

      //  modify.click();
        //Thread.sleep(4000);
        Thread.sleep(7000);

        doenload.click();
       // doenload1.click();
        Thread.sleep(4000);
excel.click();
        Thread.sleep(4000);

}

    public void setPdf() throws InterruptedException {
        checkbox.click();

        Thread.sleep(4000);

        cloud.click();
        Thread.sleep(4000);
     //   selct_box.click();
        Thread.sleep(4000);
     //   arrow.click();
        Thread.sleep(4000);

      //  nextselect.click();
        Thread.sleep(4000);

      //  modify.click();
        Thread.sleep(4000);
        Thread.sleep(7000);

        doenload.click();
        // doenload1.click();
        Thread.sleep(4000);
        pdf.click();
        Thread.sleep(4000);
    }

    public void setSave_template() throws InterruptedException {
        checkbox.click();
        Thread.sleep(4000);

        cloud.click();
        Thread.sleep(4000);
      //  selct_box.click();
        Thread.sleep(4000);


        //modify.click();
        Thread.sleep(4000);

        doenload.click();
        // doenload1.click();
        Thread.sleep(4000);
        save_template.click();
        Thread.sleep(4000);
    }
}
