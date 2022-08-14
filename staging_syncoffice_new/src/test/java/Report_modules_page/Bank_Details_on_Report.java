package Report_modules_page;

import Utilities.Utilities_class;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bank_Details_on_Report {
    public WebDriver driver;
    public String random_num= Utilities_class.randomnemeric(6);
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(9);
    public Bank_Details_on_Report(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath="//*[text()=\"Clock\"]")
    WebElement clock;
    @FindBy(xpath="(//*[text()=\"visibility\"])[3]")
    WebElement timeshhet;
    @FindBy(xpath="(//*[text()=\"visibility\"])[4]")
    WebElement duration;
    @FindBy(xpath="(//*[text()=\"visibility\"])[5]")
    WebElement exception;
    @FindBy(xpath="(//*[text()=\"Select...\"])")
    WebElement select;
    @FindBy(xpath="(//*[text()=\"Select All\"])")
    WebElement selt_all;
    @FindBy(xpath="(//*[text()=\"Select All\"])[2]")
    WebElement selt_all1;
    @FindBy(xpath="(//*[text()=\"< 8Hrs\"])")
    WebElement hrs;
    @FindBy(xpath="(//*[text()=\"On\"])[2]")
    WebElement on;
    @FindBy(xpath="(//*[@type=\"checkbox\"])")
    WebElement view_check_box;
    @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[4]")
    WebElement date_box;
    //(//*[text()="Download"])[3]
    @FindBy(xpath="(//*[text()=\"4\"])")
    WebElement date;
    @FindBy(xpath="(//*[text()=\"Go\"])")
    WebElement Go;
    @FindBy(xpath="    //*[text()=\"Send\"]\n")
    WebElement send;
    @FindBy(xpath="(//*[@type=\"checkbox\"])")
    WebElement selct_box;
    @FindBy(xpath="//*[text()=\">\"]")
    WebElement arrow;
    @FindBy(xpath="//*[text()=\"Cancel\"]\n")
    WebElement cancel;
    @FindBy(xpath="    //*[text()=\"get_app\"]\n")
    WebElement download_option;
    @FindBy(xpath="//*[text()=\"PDF\"]")
    WebElement pdf;
    @FindBy(xpath="    //*[text()=\"Download\"]\n")
    WebElement download;
    @FindBy(xpath=" //*[text()=\" Report \"]")
    WebElement Report;
    @FindBy(xpath="//*[text()=\"Excel\"]")
    WebElement excel;
    @FindBy(xpath="    //*[text()=\"Save Template\"]\n")
    WebElement save_template;
    @FindBy(xpath="     //*[text()=\"Favourites\"]\n")
    WebElement Favourites;
    @FindBy(xpath="    //*[@title=\"Delete\"]")
    WebElement dlt;
    @FindBy(xpath="    (//*[text()=\"Download\"])[2]")
    WebElement downld;
    @FindBy(xpath="    //*[text()=\"Save Template\"]\n")
    WebElement savemplate;

    @FindBy(xpath="//*[text()=\"filter_list\"]")
    WebElement filter_list;
    @FindBy(xpath="//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/input[1]")
    WebElement checkbox;
    @FindBy(xpath="//*[text()=\"save\"]")
    WebElement save;
    @FindBy(xpath="//*[text()=\"share\"]")
    WebElement share;
    //(//*[text()="Download"])[3]
    @FindBy(xpath="(//*[@name=\"email\"])")
    WebElement mail;
    @FindBy(xpath="//*[text()=\"Cancel\"]\n")
    WebElement cancel1;
    public void clock()throws InterruptedException {
        clock.click();
        Thread.sleep(4000);

    }

    public void Timeshhet()throws InterruptedException {
      timeshhet.click();


    }
    public void duration()throws InterruptedException {
        duration.click();


    }
    public void setException()throws InterruptedException {
        exception.click();


    }




    public void timesheet( ) throws InterruptedException{
        Thread.sleep(4000);
select.click();
        Thread.sleep(4000);

selt_all.click();
        Thread.sleep(4000);

        select.click();
        Thread.sleep(4000);

        selt_all1.click();
        Thread.sleep(4000);

        select.click();
        Thread.sleep(4000);

        hrs.click();
        Thread.sleep(4000);
        select.click();
        Thread.sleep(4000);

        on.click();
        date_box.click();
        Thread.sleep(4000);

        date.click();
        Thread.sleep(4000);

        Go.click();
        Thread.sleep(8000);
        Actions ac=new Actions(driver);
        ac.moveToElement(filter_list).build().perform();
        Thread.sleep(4000);

        filter_list.click();
        Thread.sleep(4000);
        checkbox.click();
        Thread.sleep(4000);
        save.click();
        Thread.sleep(8000);

        view_check_box.click();
        Thread.sleep(4000);
        share.click();
        Thread.sleep(4000);

        mail.sendKeys("mishrasarika699@gmail.com");
        Thread.sleep(4000);

        send.click();
        Thread.sleep(8000);
        cancel1.click();


    /*    view_check_box.click();
        Thread.sleep(4000);

        download.click();
        Thread.sleep(6000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", excel);
      //  excel.click();
        Thread.sleep(4000);
     //   pdf.click();
        executor.executeScript("arguments[0].click();", pdf);

        Thread.sleep(4000);*/


    }

    public void exption() throws InterruptedException{

            Thread.sleep(4000);
            select.click();
            Thread.sleep(4000);

            selt_all.click();
            Thread.sleep(4000);

            select.click();
            Thread.sleep(4000);

            selt_all1.click();
            Thread.sleep(4000);

            select.click();
            Thread.sleep(4000);

           // hrs.click();
            Thread.sleep(4000);

            date_box.click();
            Thread.sleep(4000);

            date.click();
            Thread.sleep(4000);

            Go.click();
            Thread.sleep(8000);
            view_check_box.click();
            Thread.sleep(4000);

            download.click();
            Thread.sleep(4000);

            excel.click();
            Thread.sleep(4000);
            pdf.click();
            Thread.sleep(4000);


        }


    }

