package Cloud_Pages;

import Utilities.Utilities_class;
import cucumber.api.java.en_old.Ac;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class Cloud_folder {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String number = Utilities_class.randomnemeric(3);
    public String number1 = Utilities_class.randomnemeric(10);


    public Cloud_folder(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//*[text()=\"Cloud\"]")
    WebElement click_on_cloud ;
    @FindBy(xpath = "//*[text()=\"My Cloud\"]")
    WebElement mycloud ;
    @FindBy(xpath = "(//*[text()=\"add\"])[1]")
    WebElement add ;
    @FindBy(xpath = "(//*[@type=\"text\"])[2]")
    WebElement text_box ;
    @FindBy(xpath = "(//*[text()=\"Create\"])[2]")
    WebElement create ;
    @FindBy(xpath = "//*[text()=\"syncoffice\"]")
    WebElement syncoffice ;

    @FindBy(xpath = "//*[text()=\"cloud_upload\"]")
    WebElement click_on_upload ;


    @FindBy(xpath = "(//*[@type=\"file\"])[1]")
    WebElement file ;
    @FindBy(xpath = "(//*[@type=\"file\"])[2]")
    WebElement folder ;
    @FindBy(xpath = "(//*[text()=\"Upload\"])[4]")
    WebElement upload ;
    @FindBy(xpath = "(//*[text()=\"Upload\"])[5]")
    WebElement upload_client ;
    @FindBy(xpath = "//*[@type=\"password\"]")
    WebElement password ;
    @FindBy(xpath = "//*[@type=\"checkbox\"]")
    WebElement search1 ;
    @FindBy(xpath = "(//*[text()=\"delete\"])[1]")
    WebElement delete ;
    @FindBy(xpath = "(//*[text()=\"delete\"])[6]")
    WebElement delete_side ;
    @FindBy(xpath = "(//*[text()=\"Delete\"])[2]")
    WebElement delete_side2;
    @FindBy(xpath = "(//*[text()=\"Delete\"])[3]")
    WebElement upload_dlt ;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[1]")
    WebElement button;
    @FindBy(xpath = "//*[@type=\"password\"]")
    WebElement password1;
    @FindBy(xpath = "(//*[text()=\"delete\"])[5]")
    WebElement save_dlt;
    @FindBy(xpath = "(//*[text()=\"1\"])[1]")
    WebElement element;
    @FindBy(xpath = "    //*[@class=\"jstree-wholerow jstree-wholerow-clicked\"]\n")
    WebElement fince;
    @FindBy(xpath = "(//*[text()=\"email\"])[1]")
    WebElement email;
    @FindBy(xpath = "(//*[@type=\"text\"])[2]")
    WebElement email_box;
    @FindBy(xpath = "(//*[@type=\"text\"])[3]")
    WebElement email_box_client;
    @FindBy(xpath = "(//*[@type=\"text\"])[3]")
    WebElement CC;
    @FindBy(xpath = "(//*[@type=\"text\"])[4]")
    WebElement CC1;
    @FindBy(xpath = "(//*[@type=\"text\"])[4]")
    WebElement bcc;
    @FindBy(xpath = "(//*[@type=\"text\"])[5]")
    WebElement bcc1;
    @FindBy(xpath = "//*[text()=\"CC\"]")
    WebElement cc_text;
    @FindBy(xpath = "//*[text()=\"BCC\"]")
    WebElement bcc_text;
    @FindBy(xpath = "(//*[@type=\"text\"])[5]\n")
    WebElement subject;
    @FindBy(xpath = "(//*[@type=\"text\"])[6]\n")
    WebElement subject1;
    @FindBy(xpath = "(//*[text()=\"Delete\"])[2]")
    WebElement dlt;
    @FindBy(xpath = "/html/body/div[7]/div[3]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div[3]/div/span/span/span[1]/input")
    WebElement checkbox;
    @FindBy(xpath = "//*[text()=\"Send\"]")
    WebElement send1;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[4]")
    WebElement box;
    @FindBy(xpath = "/html/body/div[5]/div[3]/div/div/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div[1]/span/span/span[1]/input")
    WebElement zip;
    @FindBy(xpath = "//*[text()=\"Attach\"]")
    WebElement attach;
    @FindBy(xpath = "//*[text()=\"Attach\"]")
    WebElement resource;


    @FindBy(xpath = "(//*[text()=\"add\"])[3]")
    WebElement add1;







    //     preview options----------------------
    @FindBy(xpath = "(//*[text()=\"preview\"])[2]")
    WebElement preview;
    @FindBy(xpath = "(//*[text()=\"close\"])[3]")
    WebElement close;
    @FindBy(xpath = "(//*[text()=\"close\"])[3]")
    WebElement close1;
    @FindBy(xpath = "    //*[@title=\"Close lightbox\"]\n")
    WebElement closejpeg;
    @FindBy(xpath = "//*[text()=\"remove_red_eye\"]")
    WebElement priview1;
    @FindBy(xpath = "//*[@type=\"text\"]")
    WebElement searchbox;
  /*  @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;

    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;*/

    //*[@class="jstree-wholerow jstree-wholerow-clicked"]

    public void setUpload_dlt() throws InterruptedException {
        delete.click();
        Thread.sleep(4000);

        password.sendKeys("123456");
        Thread.sleep(8000);

        upload_dlt.click();
        Thread.sleep(5000);
    }



    public void setClick_on_cloud() {
        click_on_cloud.click();
    }

    public void setMycloud() {
        mycloud.isDisplayed();
        mycloud.click();
    }

    public void setAdd() throws InterruptedException {
        Thread.sleep(5000);

        add.click();
    }

    public void setText_box() throws InterruptedException {
        Thread.sleep(5000);

        text_box.sendKeys("syncoffice");
        Thread.sleep(8000);
        create.click();
        Thread.sleep(8000);
        syncoffice.click();
        Thread.sleep(4000);

        click_on_upload.click();
        Thread.sleep(4000);

        file.sendKeys("/home/lenovo/Downloads/noname");
        Thread.sleep(4000);

        upload.click();
        Thread.sleep(8000);

        button.click();

        Thread.sleep(8000);

        email.click();
        Thread.sleep(4000);

        email_box.sendKeys("sarika.mishra@candytechnologies.in");
        Thread.sleep(4000);

        cc_text.click();
        Thread.sleep(4000);

        bcc_text.click();
        Thread.sleep(4000);

        CC.sendKeys(random_name+"@gmail.com");
         Thread.sleep(4000);

        bcc.sendKeys(random_Second_name+"@gmail.com");
        Thread.sleep(4000);

        subject.sendKeys(random_Second_name);
        Thread.sleep(4000);

      //  box.click();
        //Thread.sleep(4000);

        zip.click();
       // Thread.sleep(4000);

        add1.click();
        Thread.sleep(4000);

       // msoffice.click();
      //  Thread.sleep(6000);

        checkbox.click();
        Thread.sleep(8000);

        attach.click();
        Thread.sleep(6000);

        send1.click();
        Thread.sleep(6000);
        Actions ac=new Actions(driver);
        ac.contextClick(syncoffice).build().perform();
        Thread.sleep(6000);

        delete_side2.click();
        Thread.sleep(8000);

        password.sendKeys("123456");
        Thread.sleep(8000);

        delete_side.click();
        Thread.sleep(6000);


    }

    public void setUpload_client() throws InterruptedException {
       // add.click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", add);
        Actions ac=new Actions(driver);
        ac.doubleClick(add).build().perform();
        Thread.sleep(8000);
      //  text_box.sendKeys("syncoffice");
        Thread.sleep(8000);
        create.click();
        Thread.sleep(10000);
        syncoffice.click();
        Thread.sleep(4000);

        click_on_upload.click();
        Thread.sleep(4000);

        file.sendKeys("/home/lenovo/Downloads/noname");
        Thread.sleep(4000);

        upload_client.click();
        Thread.sleep(8000);

        button.click();

        Thread.sleep(8000);

        email.click();
        Thread.sleep(4000);

        email_box_client.sendKeys("sarika.mishra@candytechnologies.in");
        Thread.sleep(4000);

        cc_text.click();
        Thread.sleep(4000);

        bcc_text.click();
        Thread.sleep(4000);

        CC1.sendKeys(random_name+"@gmail.com");
        Thread.sleep(4000);

        bcc1.sendKeys(random_Second_name+"@gmail.com");
        Thread.sleep(4000);

        subject1.sendKeys(random_Second_name);
        Thread.sleep(4000);

        box.click();
        Thread.sleep(4000);

      //  zip.click();
        Thread.sleep(4000);

        add1.click();
        Thread.sleep(4000);

        // msoffice.click();
        Thread.sleep(6000);

        checkbox.click();
        Thread.sleep(8000);

        attach.click();
        Thread.sleep(6000);

        send1.click();
        Thread.sleep(6000);
        Actions ac1=new Actions(driver);
        ac1.contextClick(syncoffice).build().perform();
        Thread.sleep(6000);

        delete_side2.click();
        Thread.sleep(6000);

        password.sendKeys("123456");
        Thread.sleep(6000);

        delete_side.click();
        Thread.sleep(6000);



    }



    public void setText_boxresources() throws InterruptedException {
        add.click();

        Thread.sleep(5000);

        text_box.sendKeys("syncoffice");
        Thread.sleep(8000);
        create.click();
        Thread.sleep(8000);
       // plus_resources.click();
        //Thread.sleep(8000);

        syncoffice.click();
        Thread.sleep(4000);

        click_on_upload.click();
        Thread.sleep(4000);

        file.sendKeys("/home/lenovo/Downloads/noname");
        Thread.sleep(4000);

        upload_client.click();
        Thread.sleep(8000);

        button.click();

        Thread.sleep(8000);

        email.click();
        Thread.sleep(4000);

        email_box.sendKeys("sarika.mishra@candytechnologies.in");
        Thread.sleep(4000);

        cc_text.click();
        Thread.sleep(4000);

        bcc_text.click();
        Thread.sleep(4000);

        CC.sendKeys(random_name+"@gmail.com");
        Thread.sleep(4000);

        bcc.sendKeys(random_Second_name+"@gmail.com");
        Thread.sleep(4000);

        subject.sendKeys(random_Second_name);
        Thread.sleep(4000);

        //  box.click();
        //Thread.sleep(4000);

        //  zip.click();
        // Thread.sleep(4000);

        add1.click();
        Thread.sleep(4000);

        // msoffice.click();
        //  Thread.sleep(6000);

        checkbox.click();
        Thread.sleep(8000);

        attach.click();
        Thread.sleep(6000);

        send1.click();
        Thread.sleep(6000);
        Actions ac=new Actions(driver);
        ac.contextClick(syncoffice).build().perform();
        Thread.sleep(6000);

        delete_side2.click();
        Thread.sleep(6000);

        password.sendKeys("123456");
        Thread.sleep(6000);

        delete_side.click();
        Thread.sleep(6000);


    }

    public void setBox() throws InterruptedException {
        add.click();


        Thread.sleep(5000);
        text_box.sendKeys("syncoffice");
        Thread.sleep(8000);
        create.click();
        Thread.sleep(8000);
        syncoffice.click();
        Thread.sleep(4000);

        click_on_upload.click();
        Thread.sleep(4000);

        file.sendKeys("/home/lenovo/Downloads/noname");
        Thread.sleep(4000);

        upload_client.click();
        Thread.sleep(8000);

        button.click();

        Thread.sleep(8000);

        email.click();
        Thread.sleep(4000);

        email_box.sendKeys("sarika.mishra@candytechnologies.in");
        Thread.sleep(4000);

        cc_text.click();
        Thread.sleep(4000);

        bcc_text.click();
        Thread.sleep(4000);

        CC.sendKeys(random_name+"@gmail.com");
        Thread.sleep(4000);

        bcc.sendKeys(random_Second_name+"@gmail.com");
        Thread.sleep(4000);

        subject.sendKeys(random_Second_name);
        Thread.sleep(4000);

       // box.click();
      //  Thread.sleep(4000);

       // zip.click();
        //Thread.sleep(4000);

        add1.click();
        Thread.sleep(4000);

        // msoffice.click();
        Thread.sleep(6000);

        checkbox.click();
        Thread.sleep(8000);

        attach.click();
        Thread.sleep(6000);

        send1.click();
        Thread.sleep(6000);
        Actions ac=new Actions(driver);
        ac.contextClick(syncoffice).build().perform();
        Thread.sleep(6000);

        delete_side2.click();
        Thread.sleep(6000);

        password.sendKeys("123456");
        Thread.sleep(6000);

        delete_side.click();
        Thread.sleep(6000);



    }
    public void priview_option() throws InterruptedException {
        Thread.sleep(6000);

        preview.click();
        Thread.sleep(6000);
        searchbox.sendKeys("ogg");
        Actions ac = new Actions(driver);
        ac.moveToElement(element).build().perform();
        Thread.sleep(2000);

      //  element.click();
        priview1.click();
        Thread.sleep(7000);

        close1.click();
        Thread.sleep(5000);

        searchbox.clear();
        Thread.sleep(2000);

        searchbox.sendKeys("wav");
        Thread.sleep(2000);

        ac.moveToElement(element).build().perform();

        Thread.sleep(2000);
        priview1.click();
        Thread.sleep(9000);

        close.click();

        searchbox.clear();
        Thread.sleep(2000);

        searchbox.sendKeys("xls");
        Thread.sleep(2000);

        ac.moveToElement(element).build().perform();

        Thread.sleep(2000);
        priview1.click();
        Thread.sleep(8000);

        close.click();
        searchbox.clear();
        Thread.sleep(2000);

        searchbox.sendKeys("mkv");
        Thread.sleep(2000);

        ac.moveToElement(element).build().perform();

        Thread.sleep(2000);
        priview1.click();
        Thread.sleep(5000);

        close.click();
        searchbox.clear();
        Thread.sleep(2000);

        searchbox.sendKeys("mp4");
        Thread.sleep(2000);

        ac.moveToElement(element).build().perform();

        Thread.sleep(2000);
        priview1.click();
        Thread.sleep(8000);

        close.click();
        searchbox.clear();
        Thread.sleep(2000);



        searchbox.sendKeys("mp3");
        Thread.sleep(2000);
        Thread.sleep(2000);

        ac.moveToElement(element).build().perform();

        Thread.sleep(2000);
        priview1.click();
        Thread.sleep(8000);

        close.click();
        searchbox.clear();
        Thread.sleep(2000);

        searchbox.sendKeys("pdf");
        Thread.sleep(2000);

        ac.moveToElement(element).build().perform();

        Thread.sleep(2000);
        priview1.click();
        Thread.sleep(8000);

        close.click();
        searchbox.clear();
        Thread.sleep(2000);

        searchbox.sendKeys("ppt");
        Thread.sleep(2000);

        ac.moveToElement(element).build().perform();

        Thread.sleep(2000);
        priview1.click();
        Thread.sleep(8000);

        close.click();


        searchbox.clear();
        Thread.sleep(2000);

        searchbox.sendKeys("pptx");
        Thread.sleep(2000);

        ac.moveToElement(element).build().perform();

        Thread.sleep(2000);
        priview1.click();
        Thread.sleep(8000);

        close.click();


        searchbox.clear();
        Thread.sleep(2000);

        searchbox.sendKeys("png");
        Thread.sleep(2000);

        ac.moveToElement(element).build().perform();

        Thread.sleep(2000);
        priview1.click();
        Thread.sleep(8000);

        closejpeg.click();

    }



}
