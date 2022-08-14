package Account_Reconciliation_page;

import Utilities.Utilities_class;
import cucumber.api.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gl_account_page {

    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(4);
public  JavascriptExecutor executor = (JavascriptExecutor) driver;


    public Gl_account_page(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[text()=\"Account Reconciliation\"]")
    WebElement ac_button;
    @FindBy(xpath = "//*[text()=\"account_balance_wallet\"]")
    WebElement mouse;
    @FindBy(xpath = "(//*[text()=\"close\"])[6]")
    WebElement close;
    @FindBy(xpath = "//*[text()=\"GL Account\"]")
    WebElement gl_account;
    @FindBy(xpath = "(//*[text()=\"GL Account\"])[2]")
    WebElement gl_account1;
    @FindBy(xpath = "//*[text()=\"Account Reconciliation\"]")
    WebElement ac_page;
    @FindBy(xpath = "(//*[text()=\"add\"])[1]")
    WebElement add;
    @FindBy(xpath = "//*[@name=\"gl_code\"]")
    WebElement gl_ode;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement selct;
    @FindBy(xpath = "//div[contains(text(),'DELL')]")
    WebElement expance;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement selct1;
    @FindBy(xpath = "//div[contains(text(),'Microsoft')]")
    WebElement project_igi;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement selct2;
    @FindBy(xpath = "//*[text()=\"Select All\"]")
    WebElement mg;
    @FindBy(xpath = "(//*[text()=\"Select All\"])[2]")
    WebElement mg1;
    @FindBy(xpath = "//*[text()=\"add_circle\"]")
    WebElement circle;
    @FindBy(xpath = "(//*[text()=\"add_circle\"])[2]")
    WebElement circle1;
    @FindBy(xpath = "(//*[text()=\"add_circle\"])[3]")
    WebElement circle2;
    @FindBy(xpath = "(//*[@name=\"description\"])[3]")
    WebElement discription;
    @FindBy(xpath = "(//div[text()=\"Select...\"])[1]")
    WebElement select;
    @FindBy(xpath = "(//*[@ type=\"text\"])[3]")
    WebElement search;
    @FindBy(xpath = "(//*[@ type=\"text\"])[5]")
    WebElement search1;
    @FindBy(xpath = "(//*[@ type=\"text\"])[7]")
    WebElement discription_;
    @FindBy(xpath = "(//div[text()=\"Select...\"])[1]")
    WebElement slect_2;

    @FindBy(xpath = "//*[@name=\"city\"]")
    WebElement city;
    @FindBy(xpath = "(//div[text()=\"Select...\"])[1]")
    WebElement slet_2;
    @FindBy(xpath = "(//div[text()=\"All\"])[2]")
    WebElement ALL2_;
    @FindBy(xpath = "//*[@name=\"gl_account_purpose\"]")
    WebElement purpose_;
    @FindBy(xpath = "(//*[text()=\"Save\"])[2]")
    WebElement save;
    @FindBy(xpath="(//*[text()=\"delete\"])[3]")
    WebElement delete;
    @FindBy(xpath="(//*[contains(text(),'Delete')])[3]")
    WebElement dlt_2;
    @FindBy(xpath="//*[@name=\"name\"]")
    WebElement name1;
    @FindBy(xpath="//*[@name=\"comp_code\"]")
    WebElement code_comp;
    @FindBy(xpath="//*[@name=\"cmpLocName\"]")
    WebElement loc;
    @FindBy(xpath="//*[@ name=\"address1\"]")
    WebElement address;
    @FindBy(xpath="//*[@ name=\"pincode\"]")
    WebElement pincode;
    @FindBy(xpath="//*[@name=\"email\"]")
    WebElement mail;
    @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[4]")
    WebElement DATE;
    @FindBy(xpath="(//*[text()=\"1\"])[2]")
    WebElement lc_5;
    @FindBy(xpath="(//*[text()=\"Select...\"])[3]")
    WebElement Select_entity;
    @FindBy(xpath="//div[contains(text(),'Sarika Mishra')]")
    WebElement max;
    @FindBy(xpath="(//*[text()=\"add_circle\"])[1]")
    WebElement add_category;
    @FindBy(xpath="//*[@name=\"name\"]")
    WebElement name_category;
    @FindBy(xpath="(//*[text()=\"Save\"])[2]")
    WebElement save_category;
    @FindBy(xpath = "//*[@name=\"landline_num\" ]")
    WebElement number1;

    @FindBy(xpath = "(//*[text()=\"Select...\"])[2]")
    WebElement mng_slct;
    @FindBy(xpath = "//div[contains(text(),'Microsoft')]")
    WebElement test_assoction;
    @FindBy(xpath = "//*[@name=\"code\" ]")
    WebElement code;
    @FindBy(xpath = "//*[@name=\"landline_num\" ]")
    WebElement numbr1;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement save1;
    @FindBy(xpath = "//div[contains(text(),'Sarika Mishra')]")
    WebElement sarika_manage;
    @FindBy(xpath = "//*[text()=\"cloud_download\"]")
    WebElement cloud;
    @FindBy(xpath = "//*[text()=\"Download Sample\"]")
    WebElement download;

    @FindBy(xpath = "//*[@type=\"file\"]")
    WebElement file;
    @FindBy(xpath="(//*[text()=\"delete\"])[4]")
    WebElement delete1;
    @FindBy(xpath="(//*[text()=\"delete\"])[6]")
    WebElement dlt_21;
    @FindBy(xpath = "//body/div[7]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/span[1]/label[1]/span[1]/span[1]")
    WebElement attacment;
    @FindBy(xpath = "//*[text()=\"account_balance_wallet\"]")
    WebElement mouse1;

    @FindBy(xpath = "//*[text()=\"Account Reconciliation\"]")
    WebElement a_button;
    @FindBy(xpath = "(//*[text()=\"GL Account\"])[2]")
    WebElement gl_page;
    @FindBy(xpath = " (//*[text()=\"attachment\"])[2]")
    WebElement attachment2;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement save2;
    @FindBy(xpath = "(//*[text()=\"Save\"])[1]")
    WebElement save_upload;
    @FindBy(xpath = "  (//*[text()=\"attachment\"])")
    WebElement attachment1;
    @FindBy(xpath = "(//*[text()=\"close\"])")
    WebElement cencel;
    @FindBy(xpath="(//*[@type=\"text\"])[3]")
    WebElement search2;
    @FindBy(xpath = "(//*[@type=\"file\"])")
    WebElement file1;
    @FindBy(xpath = "(//*[@type=\"file\"])[2]")
    WebElement file2;
    @FindBy(xpath = "(//*[text()=\"add\"])[3]")
    WebElement add_attachment;
    @FindBy(xpath = "     //*[text()=\"get_app\"]\n")
    WebElement download1;
    @FindBy(xpath = "  (//*[text()=\"Attachment File\"])")
    WebElement attachment_page;
    @FindBy(xpath = "    //*[text()=\"Add Attachment\"]\n")
    WebElement add_attachment_page;

    public void setAc_button() {
        ac_button.click();
    }

    public void setMouse() {
        Actions actions = new Actions(driver);
        actions.moveToElement(mouse).perform();
        mouse.isDisplayed();
       //WebElement gl= gl_page.getText();
    }

    public void setGl_account( ) throws InterruptedException {
      // mouse.click();
        Thread.sleep(5000);

      // gl_account.click();
        Thread.sleep(4000);

    }
    public void setAdd( ) throws InterruptedException {
       JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", mouse);
        Thread.sleep(4000);
        executor.executeScript("arguments[0].click();", add);

        //add.click();
       // Assert.assertEquals("GL Account" ,gl_page.getText());
        Thread.sleep(4000);

    }
    public void setGl_ode() throws InterruptedException{

        gl_ode.sendKeys(number);
        Thread.sleep(3000);

        discription.sendKeys(random_name);
        Thread.sleep(3000);


    }

    public void setCircle() throws InterruptedException  {
      circle.click();
        Thread.sleep(5000);

        name1.sendKeys(random_name);
        Thread.sleep(5000);

        save.click();
        Thread.sleep(5000);

        Thread.sleep(5000);

        selct.click();
        Thread.sleep(5000);
        expance.click();
        Thread.sleep(5000);

    }

    public void setCircle1( ) throws InterruptedException {
       circle1.click();
        Thread.sleep(4000);

       // mail.sendKeys(random_name+"@gmail.com");
        //Thread.sleep(3000);

       // System.out.println("Enter email address");
        name1.sendKeys(Utilities_class.randomalphabet(9));
        Thread.sleep(3000);

        code_comp.sendKeys(Utilities_class.randomnemeric(5));
        Thread.sleep(3000);

        loc.sendKeys(Utilities_class.randomalphabet(9));
        Thread.sleep(3000);

        address.sendKeys(Utilities_class.randomalphabet(5));
        Thread.sleep(3000);
        DATE.click();
        Thread.sleep(6000);
        lc_5.click();
        Thread.sleep(3000);

        Select_entity.click();
        Thread.sleep(3000);

        max.click();
        Thread.sleep(3000);

        pincode.sendKeys("494442");
        Thread.sleep(3000);

        Actions actions = new Actions(driver);
        actions.moveToElement(city).perform();
        city.isDisplayed();

        Thread.sleep(3000);
        city.click();
        Thread.sleep(3000);

        number1.sendKeys(Utilities_class.randomnemeric(9));
        Thread.sleep(4000);

        save.click();
        Thread.sleep(8000);

        selct1.click();
        Thread.sleep(3000);
        mg.click();

    }

    public void setCircle2( )throws InterruptedException {
        Thread.sleep(5000);
       JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", circle2);

     //   circle2.click();
        Thread.sleep(5000);
       // executor.executeScript("arguments[0].click();", mng_slct);

       mng_slct.click();
        Thread.sleep(5000);
       // executor.executeScript("arguments[0].click();", mng_slct);

        test_assoction.click();
        Thread.sleep(5000);
       // executor.executeScript("arguments[0].click();", test_assoction);

        name1.sendKeys(random_name);
        Thread.sleep(5000);

        code.sendKeys(number);
        Thread.sleep(5000);


        mng_slct.click();
        Thread.sleep(5000);

        sarika_manage.click();
        Thread.sleep(5000);

        save.click();
        Thread.sleep(5000);





        selct2.click();
        Thread.sleep(4000);
        mg1.click();
        Thread.sleep(4000);
        purpose_.sendKeys(Utilities_class.randomalphabet(9));
        Thread.sleep(4000);

//gl_account1.click();
      //  Thread.sleep(6000);


       // file1.sendKeys("/home/lenovo/Pictures/Screenshot from 2021-03-03 13-44-12.png");
      //  Thread.sleep(5000);
        Thread.sleep(6000);
        Actions ac=new Actions(driver);
        ac.doubleClick(save1).build().perform();

        Thread.sleep(9000);
//cencel.click();
      //  close.click();
    //    Thread.sleep(9000);

      // mouse.click();
        Thread.sleep(7000);
        if (search2.isDisplayed()) {
          /*  Thread.sleep(4000);
            search.sendKeys(number);
            Thread.sleep(6000);
            WebDriverWait wait = new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()=\"attachment\"])")));
           attachment1.click();
           // Thread.sleep(6000);
          //  download1.click();
            Thread.sleep(9000);
            Thread.sleep(6000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" (//*[text()=\"Attachment File\"])")));
            attachment_page.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" (//*[text()=\"add\"])[3]")));
            add_attachment.click();

            Thread.sleep(6000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //*[text()=\"Add Attachment\"]")));

            add_attachment_page.isDisplayed();
            Thread.sleep(6000);
           file1.sendKeys("/home/lenovo/Pictures/download_save_template.png");
            Thread.sleep(9000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()=\"Save\"])[1]")));

            save_upload.click();
            Thread.sleep(9000);
            Thread.sleep(10000);

         //   attachment2.click();
        //    Thread.sleep(9000);           // attachment1.click();
         //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" (//*[text()=\"Attachment File\"])")));
            System.out.println(" New User successfully added in Gl account");
//attachment_page.click();

        //    Thread.sleep(6000);

          //  file1.sendKeys("/home/lenovo/Pictures/excel.png");
         //   Thread.sleep(9000);
            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()=\"close\"])[6]")));

           // close.click();
         //   download1.click();
            search.click();
            Thread.sleep(4000);

            search.sendKeys(number);
            search.clear();*/
            search2.sendKeys(number);
            Thread.sleep(6000);

            driver.findElement(By.xpath("(//*[text()=\"edit\"])[2]")).click();
            Thread.sleep(4000);

            gl_ode.clear();
            Thread.sleep(6000);

            gl_ode.sendKeys(number);
            Thread.sleep(6000);

          //  discription_.sendKeys(random_name + number);
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
            Thread.sleep(4000);
           // search.clear();
            //Thread.sleep(4000);

         //   search.sendKeys(number);

            //Thread.sleep(6000);

            delete.click();
            Thread.sleep(6000);
            dlt_2.click();
           System.out.println(" New User successfully Deleted in Gl account");
        } else {
            System.out.println("  Gl account");
        }}





        public void setCloud() throws InterruptedException {
            Thread.sleep(3000);
            cloud.click();
            Thread.sleep(5000);
            //  download.click();
            Thread.sleep(8000);
//file.click();
            Thread.sleep(8000);

            file.sendKeys("/home/nisha/Downloads/new gl_acount.xls");
            Thread.sleep(8000);

            save2.click();
            Thread.sleep(5000);

          //  close1.click();
            Thread.sleep(5000);

            mouse1.click();
            Thread.sleep(5000);

            if (search1.isDisplayed()) {
                Thread.sleep(8000);
                search1.sendKeys("123");
                System.out.println(" New User successfully added in Cost center");
                Thread.sleep(8000);
                delete1.click();
                Thread.sleep(8000);
                dlt_21.click();
                System.out.println(" New User successfully Deleted in Cost center");
            } else {
                System.out.println(" New User not added in Cost center");
            }


        }
    }









