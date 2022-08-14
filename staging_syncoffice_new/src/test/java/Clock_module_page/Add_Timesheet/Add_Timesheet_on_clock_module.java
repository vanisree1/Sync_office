package Clock_module_page.Add_Timesheet;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Timesheet_on_clock_module {



        public WebDriver driver;
        public String random_num= Utilities_class.randomnemeric(6);
        public String random_name = Utilities_class.randomalphabet(5);
        public String random_Second_name =Utilities_class.randomalphabet(9);
        public Add_Timesheet_on_clock_module(WebDriver rdriver)
        {
            driver=rdriver;
            PageFactory.initElements(rdriver,this);
        }

        @FindBy(xpath="//*[text()=\"hourglass_empty\"]")
        WebElement clock;
        @FindBy(xpath="//*[text()=\"Automated Mail Setting\"]")
        WebElement automated_mail;
        @FindBy(xpath="//*[text()=\"Duration Report\"]")
        WebElement duration;
        @FindBy(xpath="(//*[text()=\"Exception Report\"])")
        WebElement exception;
        @FindBy(xpath="(//*[text()=\"Select...\"])")
        WebElement select;
        @FindBy(xpath="(//*[text()=\"Select All\"])")
        WebElement selt_all;
        @FindBy(xpath="(//*[text()=\"Select All\"])[2]")
        WebElement selt_all1;
        @FindBy(xpath="(//*[text()=\"< 8Hrs\"])")
        WebElement hrs;
        @FindBy(xpath="(//*[text()=\"All\"])[2]")
        WebElement on;
    @FindBy(xpath="(//*[text()=\"On\"])[2]")
    WebElement on_drop;
        @FindBy(xpath="(//*[@type=\"checkbox\"])[3]")
        WebElement view_check_box;
        @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[4]")
        WebElement date_box;
    @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[5]")
    WebElement exption_strtdate;
    @FindBy(xpath="//body/div[4]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement ldate_box;
        //(//*[text()="Download"])[3]
        @FindBy(xpath="(//*[text()=\"28\"])[3]")
        WebElement date;
    @FindBy(xpath="(//*[text()=\"2\"])[2]")
    WebElement date1;
        @FindBy(xpath="(//*[text()=\"Go\"])")
        WebElement Go;
        @FindBy(xpath="    //*[text()=\"Send\"]\n")
        WebElement send;
        @FindBy(xpath="/html/body/div[5]/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div[2]/div[7]/div/span/span/span[1]/input")
        WebElement duration_chekbox;
        @FindBy(xpath="//*[text()=\"Between\"]")
        WebElement Between;
        @FindBy(xpath="//*[text()=\"None selected\"]")
        WebElement none_selected;
        @FindBy(xpath="(//*[contains(text(),'mani mishra')])")
        WebElement nisha_kar;
        @FindBy(xpath="//*[text()=\"PDF\"]")
        WebElement pdf;
        @FindBy(xpath="    //*[text()=\"Download\"]\n")
        WebElement download;
        @FindBy(xpath="//*[text()=\"list_alt\"]")
        WebElement Reports;
        @FindBy(xpath="//*[text()=\"Excel\"]")
        WebElement excel;
        @FindBy(xpath="    //*[text()=\"Save Template\"]\n")
        WebElement save_template;
        @FindBy(xpath="     //*[text()=\"Favourites\"]\n")
        WebElement Favourites;
        @FindBy(xpath="//*[text()=\"Timesheet Report\"]")
        WebElement Timsheet;
        @FindBy(xpath="//*[text()=\"Excel\"]")
        WebElement Excel;
        @FindBy(xpath="//*[text()=\"PDF\"]")
        WebElement PDF;
        //*[text()="Clock"]
        @FindBy(xpath="(//*[text()=\"filter_list\"])")
        WebElement filter_list;
        @FindBy(xpath="/html/body/div[8]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/span/span/span[1]/input")
        WebElement checkbox;
        @FindBy(xpath="(//*[text()=\"save\"])[2]")
        WebElement save;
    @FindBy(xpath="//*[text()=\"Save\"]")
    WebElement save1;
        @FindBy(xpath="//*[text()=\"share\"]")
        WebElement share;
        //(//*[text()="Download"])[3]
        @FindBy(xpath="(//*[@name=\"email\"])")
        WebElement mail;
        @FindBy(xpath="//*[text()=\"Cancel\"]\n")
        WebElement cancel1;
        public void clock()throws InterruptedException {
            Thread.sleep(4000);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", clock);
          //  clock.click();
            Thread.sleep(4000);

        }

        public void setReports() throws InterruptedException {
            Reports.click();
            Thread.sleep(4000);

        }

        public void setTimsheet()throws InterruptedException {
            Actions sc=new Actions(driver);
            sc.moveToElement(Timsheet).build().perform();
            Thread.sleep(4000);
            Timsheet.click();

        }

        public void duration()throws InterruptedException {
            duration.click();
            Thread.sleep(4000);



        }

    public void setAutomated_mail() { automated_mail.click();
    }

    public void setException()throws InterruptedException {
            exception.click();


        }




        public void timesheetClock( ) throws InterruptedException{
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
            Thread.sleep(4000);

            Go.click();
            Thread.sleep(9000);


         //   Actions ac=new Actions(driver);
          //  ac.moveToElement(filter_list).build().perform();
          //  Thread.sleep(4000);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", filter_list);
          //  filter_list.click();
            Thread.sleep(4000);
            checkbox.click();
            Thread.sleep(4000);
            save.click();
            Thread.sleep(8000);

            view_check_box.click();
            Thread.sleep(8000);
            System.out.println("share button");
            share.click();
           // executor.executeScript("arguments[0].click();", share);
            System.out.println("share button");
          //  share.click();
            Thread.sleep(4000);

            mail.sendKeys("mishrasarika699@gmail.com");

            Thread.sleep(8000);
         //   cancel1.click();
send.click();
            Thread.sleep(8000);



       //     driver.findElement(By.xpath("(//*[text()=\"Download\"])[2]")).click();
       //     Thread.sleep(8000);

    /*    view_check_box.click();
        Thread.sleep(4000);

        download.click();
        Thread.sleep(6000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", excel);
        excel.click();
        Thread.sleep(4000);
     //   pdf.click();
        executor.executeScript("arguments[0].click();", pdf);

        Thread.sleep(4000);*/
        //    excel.click();
            Thread.sleep(6000);
           //   pdf.click();
         //   Thread.sleep(9000);

            driver.findElement(By.xpath("(//*[text()=\"All\"])[2]")).click();
            Thread.sleep(6000);

            on_drop.click();
            Thread.sleep(9000);

            ldate_box.sendKeys("07/06/2021");
            Thread.sleep(4000);

          //  date.click();
            Thread.sleep(4000);

            Go.click();
            Thread.sleep(8000);
        }

    public void setDuration_chekbox( ) throws InterruptedException {
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
        Thread.sleep(4000);

        Go.click();
        Thread.sleep(9000);

        /*    date_box.click();
            Thread.sleep(4000);

            date.click();
            Thread.sleep(4000);

            Go.click();
            Thread.sleep(8000);*/
        //   Actions ac=new Actions(driver);
        //  ac.moveToElement(filter_list).build().perform();
        //  Thread.sleep(4000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", filter_list);
        //  filter_list.click();
        Thread.sleep(4000);
        checkbox.click();
        Thread.sleep(4000);
        save.click();
        Thread.sleep(8000);

        duration_chekbox.click();
        Thread.sleep(8000);
        System.out.println("share button");
        share.click();
        // executor.executeScript("arguments[0].click();", share);
        System.out.println("share button");
        //  share.click();
        Thread.sleep(4000);

        mail.sendKeys("mishrasarika699@gmail.com");

        Thread.sleep(8000);
        //   cancel1.click();
        send.click();
        Thread.sleep(8000);



        driver.findElement(By.xpath("(//*[text()=\"Download\"])[2]")).click();
        Thread.sleep(8000);

    /*    view_check_box.click();
        Thread.sleep(4000);

        download.click();
        Thread.sleep(6000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", excel);
        excel.click();
        Thread.sleep(4000);
     //   pdf.click();
        executor.executeScript("arguments[0].click();", pdf);

        Thread.sleep(4000);*/
        excel.click();
        Thread.sleep(6000);
        pdf.click();
        Thread.sleep(6000);

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
Between.click();
            // hrs.click();
        date_box.click();
        Thread.sleep(4000);

        date1.click();
        Thread.sleep(4000);
            Thread.sleep(4000);
exption_strtdate.click();
        Thread.sleep(4000);

date.click();


            Go.click();
            Thread.sleep(8000);
           // view_check_box.click();
           // Thread.sleep(4000);

           // download.click();
           // Thread.sleep(4000);

          //  excel.click();
          //  Thread.sleep(4000);
          //  pdf.click();
          //  Thread.sleep(4000);


        }
        public  void Automail() throws InterruptedException {
            Thread.sleep(8000);

           // none_selected.click();
            //Thread.sleep(8000);

           // nisha_kar.click();
            //Thread.sleep(8000);

            save1.click();
        }


    }


