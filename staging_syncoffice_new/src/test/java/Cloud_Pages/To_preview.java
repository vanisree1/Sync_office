package Cloud_Pages;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class To_preview {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String name = Utilities_class.randomalphabet(5);

    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String number = Utilities_class.randomnemeric(5);

    public To_preview(WebDriver rdriver) {
        driver = rdriver;

        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "(//*[text()=\"Finance\"])[2]")
    WebElement function;
    @FindBy(xpath = "(//*[text()=\"Financer\"])[4]")
    WebElement admistration;
    @FindBy(xpath = "//*[text()=\"Untitled Folder 2\"]")
    WebElement folder;
    @FindBy(xpath = "(//*[text()=\"1\"])[2]")
    WebElement element;
    @FindBy(xpath = "(//*[text()=\"get_app\"])[2]")
    WebElement download;
    @FindBy(xpath = "(//*[text()=\"title\"])")
    WebElement rename;
    @FindBy(xpath = "(//*[text()=\"find_replace\"])")
    WebElement replace_file;
    @FindBy(xpath = "(//*[text()=\"move_to_inbox\"])[2]")
    WebElement move;
    @FindBy(xpath = "(//*[text()=\"link\"])")
    WebElement link;
    @FindBy(xpath = "(//*[text()=\"layers\"])")
    WebElement varsion;
    @FindBy(xpath = "(//*[text()=\"delete\"])[2]")
    WebElement dlt;
    @FindBy(xpath = "(//*[text()=\"access_time\"])")
    WebElement file_log;
    @FindBy(xpath = "(//*[text()=\"delete\"])[4]")
    WebElement delete_side ;
    @FindBy(xpath = "(//*[text()=\"Delete\"])[2]")
    WebElement delete_side2;
    @FindBy(xpath = "(//*[@type=\"rename\"])")
    WebElement rename_text;
    @FindBy(xpath = "(//*[text()=\"Rename\"])[2]")
    WebElement re_save;
    @FindBy(xpath = "//*[@type=\"file\"]")
    WebElement upload_file1;
    @FindBy(xpath = "(//*[text()=\"Replace\"])[2]")
    WebElement replace;
    @FindBy(xpath = "(//*[text()=\"delete\"])[4]")
    WebElement dt;
    @FindBy(xpath = "(//*[text()=\"Move\"])[3]")
    WebElement move1;

    @FindBy(xpath = "(//*[text()=\"save\"])")
    WebElement save;
    @FindBy(xpath = "(//*[text()=\"get_app\"])[4]")
    WebElement download_link;
    @FindBy(xpath = "//*[@title=\"Add Link\"]")
    WebElement link1;

    @FindBy(xpath = "(//*[text()=\"close\"])[5]")
    WebElement cencel;
    @FindBy(xpath = "(//*[text()=\"close\"])[6]")
    WebElement cencel_re;
    @FindBy(xpath = "//*[text()=\"cloud_download\"]")
    WebElement export;
    @FindBy(xpath = "(//*[text()=\"email\"])[2]")
    WebElement email;
    @FindBy(xpath = "(//*[@type=\"text\"])[2]")
    WebElement email_box;
    @FindBy(xpath = "(//*[@type=\"text\"])[3]")
    WebElement CC;
    @FindBy(xpath = "(//*[@type=\"text\"])[4]")
    WebElement bcc;
    @FindBy(xpath = "//*[text()=\"CC\"]")
    WebElement cc_text;
    @FindBy(xpath = "//*[text()=\"BCC\"]")
    WebElement bcc_text;
    @FindBy(xpath = "(//*[@type=\"text\"])[5]\n")
    WebElement subject;
    @FindBy(xpath = "//*[text()=\"Send\"]")
    WebElement send;
    @FindBy(xpath = "//*[text()=\"remove_red_eye\"]")
    WebElement priview;
    @FindBy(xpath = "//*[@type=\"password\"]")
    WebElement password;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[7]")
    WebElement box;
    @FindBy(xpath = "(//*[text()=\"close\"])[4]")
    WebElement cencel1;
    @FindBy(xpath = "   //*[text()=\"Save\"]\n")


    WebElement savhe;
    @FindBy(xpath = "(//*[text()=\"close\"])[4]")
    WebElement close_mail;
    @FindBy(xpath = "(//*[text()=\"Financer\"])[1]")
    WebElement admistration1;
    @FindBy(xpath = "//*[text()=\"Upload File(s)\"]")
    WebElement upload_file;
    @FindBy(xpath = "(//*[@type=\"file\"])[1]")
    WebElement file;
    @FindBy(xpath = "//*[text()=\"cloud_upload\"]")
    WebElement click__upload;
    @FindBy(xpath = "(//*[text()=\"Upload\"])[4]")
    WebElement upload;
    @FindBy(xpath = "(//*[text()=\"Upload\"])[5]")
    WebElement upload_client;
    @FindBy(xpath = "//*[text()=\"share\"]")
    WebElement share;
    @FindBy(xpath = "(//*[text()=\"close\"])[5]")
    WebElement close_upload;
    @FindBy(xpath = "(//*[@type=\"text\"])[4]")
    WebElement to_share;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[1]")
    WebElement button;
    @FindBy(xpath = "(//*[text()=\"Delete\"])[3]")
    WebElement dlt_file;
    @FindBy(xpath = "(//*[text()=\"Send\"])")
    WebElement mail_save;
    @FindBy(xpath = "/html/body/div[7]/div[3]/div/div/div[1]/div[2]/div/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div[3]/div/span/span/span[1]/input")
    WebElement link_check;
    @FindBy(xpath = "(//*[text()=\"2nd October Drishyam\"])[2]")
    WebElement fince;
    @FindBy(xpath = "    (//*[text()=\"HR\"])[2]\n")
    WebElement banglore;
    @FindBy(xpath = " (//*[text()=\"Headoffice\"])[2]")
    WebElement headoffice;
    @FindBy(xpath = "    (//*[text()=\"HR\"])[2]\n")
    WebElement bangmlore;
    @FindBy(xpath = "    (//*[text()=\"HR\"])[2]\n")
    WebElement banbglore;
    @FindBy(xpath = "    (//*[text()=\"HR\"])[2]\n")
    WebElement banglorelll;
    @FindBy(xpath = "    (//*[text()=\"HR\"])[2]\n")
    WebElement banglorekk;
    @FindBy(xpath = "    (//*[text()=\"HR\"])[2]\n")
    WebElement bangllore;
    @FindBy(xpath = "    (//*[text()=\"HR\"])[2]\n")
    WebElement banglohhre;
    @FindBy(xpath = "    (//*[text()=\"HR\"])[2]\n")
    WebElement bangloreu;
    @FindBy(xpath = "    (//*[text()=\"HR\"])[2]\n")
    WebElement banglored;
    @FindBy(xpath = "(//*[text()=\"add\"])[1]")
    WebElement add ;
    @FindBy(xpath = "(//*[@type=\"text\"])[3]")
    WebElement text_box ;
    @FindBy(xpath = "(//*[text()=\"Create\"])[2]")
    WebElement create ;
    @FindBy(xpath = "//*[text()=\"syncoffice\"]")
    WebElement syncoffice ;

    //*[text()="Add More"]
    //*[@class="jstree-wholerow jstree-wholerow-clicked"]

    public void setFolder() throws InterruptedException {
       // function.click();
        Thread.sleep(6000);

        click__upload.click();
        Thread.sleep(6000);

        file.sendKeys("/home/lenovo/Downloads/noname");
        Thread.sleep(6000);

        upload.click();


    }

    public void setPriview() throws InterruptedException {
        Thread.sleep(4000);

        element.click();
        Thread.sleep(4000);

        priview.click();
        Thread.sleep(4000);

        cencel1.click();
        Thread.sleep(6000);

    }

    public void setElement() throws InterruptedException {
        Actions ac = new Actions(driver);
        ac.moveToElement(element).build().perform();
        element.click();
        Thread.sleep(6000);

    }

    public void setDownload() throws InterruptedException {
        download.click();
        Thread.sleep(6000);
        System.out.println("click on download button");

    }

    public void setRename() throws InterruptedException {
        Thread.sleep(4000);

        rename.click();
        System.out.println("click on rename button option");

        Thread.sleep(4000);
        rename_text.clear();
        Thread.sleep(4000);

        rename_text.sendKeys(Utilities_class.randomalphabet(6));
        Thread.sleep(4000);
        System.out.println("Enter new name");

        re_save.click();
        Thread.sleep(4000);
        System.out.println("click on save");


    }

    public void setUpload_file() throws InterruptedException {
        element.click();
        Thread.sleep(6000);

        replace_file.click();
        System.out.println("click on replace option");

        Thread.sleep(4000);

        file.sendKeys("/home/lenovo/Pictures/download.png");
        Thread.sleep(6000);
        System.out.println("upload new file");

        replace.click();
        System.out.println("click on replace button");

    }

    public void setFinance() throws InterruptedException {
        //  element.click();

        //  move.click();

        //  admistration.click();

        //  move1.click();
    }

    public void setLink() throws InterruptedException {
        Thread.sleep(6000);
        element.click();
        Thread.sleep(4000);

        link.click();
        Thread.sleep(4000);
        System.out.println("click on Link option");

        link1.click();
        System.out.println("click on Link button");

        Thread.sleep(5000);
       fince.click();
        Thread.sleep(4000);
        link_check.click();
        Thread.sleep(4000);
        System.out.println("click on checkbox");

        save.click();
        Thread.sleep(4000);

        cencel.click();
    }

    public void setEmail() throws InterruptedException {
        element.click();

        Thread.sleep(5000);

        email.click();
        System.out.println("click on email option");

        Thread.sleep(4000);

        email_box.sendKeys(random_name + "@gmail.com");
        Thread.sleep(6000);
        System.out.println("enter email id ");

        cc_text.click();
        Thread.sleep(6000);

        bcc_text.click();
        Thread.sleep(6000);

        CC.sendKeys(random_Second_name + "@gmail.com");
        Thread.sleep(6000);

        bcc.sendKeys(name + "@gmail.com");
        Thread.sleep(6000);
        subject.click();
        subject.sendKeys(random_name);
        System.out.println("enter subject ");

        Thread.sleep(6000);
       // box.click();
        Thread.sleep(6000);

        send.click();
        Thread.sleep(6000);
        System.out.println("Click on send button ");

//close_mail.click();
        Thread.sleep(6000);

    }

    public void setExport() throws InterruptedException {
        element.click();

        Thread.sleep(6000);

        file_log.click();
        System.out.println("click file log option");

        Thread.sleep(6000);

        export.click();
        System.out.println("click export option");

        Thread.sleep(6000);
        close_upload.click();
        Thread.sleep(6000);

        element.click();
        Thread.sleep(6000);

        share.click();
        Thread.sleep(6000);

        System.out.println("click share option");

        Thread.sleep(6000);

        to_share.sendKeys(random_name + "@gmail.com");
        Thread.sleep(6000);

        System.out.println("enter mail option");

        mail_save.click();

    }

    public void setDlt() throws InterruptedException {
        element.click();

        dlt.click();
        Thread.sleep(8000);

        password.sendKeys("123456");
        Thread.sleep(9000);

        dlt_file.click();

    }





    public void setPriview1() throws InterruptedException {
        Thread.sleep(9000);

        banglore.click();
        Thread.sleep(9000);

        click__upload.click();
        Thread.sleep(9000);

        file.sendKeys("/home/lenovo/Downloads/noname");
        Thread.sleep(6000);

        upload_client.click();
        Thread.sleep(4000);



     /*   priview.click();
        Thread.sleep(4000);

        cencel1.click();
        Thread.sleep(6000);
*/


        Actions ac = new Actions(driver);
        ac.moveToElement(element).build().perform();
        element.click();
        Thread.sleep(6000);



        download.click();
        Thread.sleep(6000);
        System.out.println("click on download button");



        Thread.sleep(4000);

        rename.click();
        System.out.println("click on rename button option");

        Thread.sleep(4000);
        rename_text.clear();
        Thread.sleep(4000);

        rename_text.sendKeys(Utilities_class.randomalphabet(6));
        Thread.sleep(4000);
        System.out.println("Enter new name");

        re_save.click();
        Thread.sleep(4000);
        System.out.println("click on save");




        element.click();
        Thread.sleep(6000);

        replace_file.click();
        System.out.println("click on replace option");

        Thread.sleep(4000);

        file.sendKeys("/home/lenovo/Downloads/createdFiles.lst");
        Thread.sleep(6000);
        System.out.println("upload new file");

        replace.click();
        System.out.println("click on replace button");


        Thread.sleep(6000);
        element.click();
        Thread.sleep(4000);

        link.click();
        Thread.sleep(4000);
        System.out.println("click on Link option");

        link1.click();
        System.out.println("click on Link button");

        Thread.sleep(5000);
       // fince.click();
        Thread.sleep(4000);
        link_check.click();
        Thread.sleep(4000);
        System.out.println("click on checkbox");

        save.click();
        Thread.sleep(4000);

        cencel.click();


        element.click();

        Thread.sleep(5000);

        email.click();
        System.out.println("click on email option");

        Thread.sleep(4000);

        email_box.sendKeys(random_name + "@gmail.com");
        Thread.sleep(6000);
        System.out.println("enter email id ");

        cc_text.click();
        Thread.sleep(6000);

        bcc_text.click();
        Thread.sleep(6000);

        CC.sendKeys(random_Second_name + "@gmail.com");
        Thread.sleep(6000);

        bcc.sendKeys(name + "@gmail.com");
        Thread.sleep(6000);
        subject.click();
        subject.sendKeys(random_name);
        System.out.println("enter subject ");

        Thread.sleep(6000);
        box.click();
        Thread.sleep(6000);

        send.click();
        Thread.sleep(6000);
        System.out.println("Click on send button ");

//close_mail.click();
        Thread.sleep(6000);


        element.click();

        Thread.sleep(6000);

        file_log.click();
        System.out.println("click file log option");

        Thread.sleep(6000);

        export.click();
        System.out.println("click export option");

        Thread.sleep(6000);
        close_upload.click();
        Thread.sleep(6000);

        element.click();
        Thread.sleep(6000);

        share.click();
        Thread.sleep(6000);

        System.out.println("click share option");

        Thread.sleep(6000);

        to_share.sendKeys(random_name + "@gmail.com");
        Thread.sleep(6000);

        System.out.println("enter mail option");

        mail_save.click();


        element.click();

        dlt.click();
        Thread.sleep(8000);

        password.sendKeys("123456");
        Thread.sleep(9000);

        dlt_file.click();


    }




    public void mouser_resources() throws InterruptedException {
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

        click__upload.click();
        Thread.sleep(6000);

        file.sendKeys("/home/lenovo/Downloads/noname");
        Thread.sleep(6000);

        upload_client.click();




        Thread.sleep(4000);

      //  element.click();
       // Thread.sleep(4000);

       // priview.click();
        //Thread.sleep(4000);

       // cencel1.click();
        Thread.sleep(6000);



        Actions ac = new Actions(driver);
        ac.moveToElement(element).build().perform();
        element.click();
        Thread.sleep(6000);



        download.click();
        Thread.sleep(6000);
        System.out.println("click on download button");


        Thread.sleep(4000);

        rename.click();
        System.out.println("click on rename button option");

        Thread.sleep(4000);
        rename_text.clear();
        Thread.sleep(4000);

        rename_text.sendKeys(Utilities_class.randomalphabet(6));
        Thread.sleep(4000);
        System.out.println("Enter new name");

        re_save.click();
        Thread.sleep(4000);
        System.out.println("click on save");



        element.click();
        Thread.sleep(6000);

        replace_file.click();
        System.out.println("click on replace option");

        Thread.sleep(4000);

        file.sendKeys("/home/lenovo/Downloads/createdFiles.lst");
        Thread.sleep(6000);
        System.out.println("upload new file");

        replace.click();
        System.out.println("click on replace button");



        //  element.click();

        //  move.click();

        //  admistration.click();

        //  move1.click();

        Thread.sleep(6000);
        element.click();
        Thread.sleep(4000);

        link.click();
        Thread.sleep(4000);
        System.out.println("click on Link option");

        link1.click();
        System.out.println("click on Link button");

        Thread.sleep(5000);
        headoffice.click();
        Thread.sleep(4000);
        link_check.click();
        Thread.sleep(4000);
        System.out.println("click on checkbox");

        save.click();
        Thread.sleep(4000);
        download_link.click();
        Thread.sleep(4000);
dt.click();
        Thread.sleep(4000);

        cencel_re.click();
        Thread.sleep(4000);


        element.click();

        Thread.sleep(5000);

        email.click();
        System.out.println("click on email option");

        Thread.sleep(4000);

        email_box.sendKeys(random_name + "@gmail.com");
        Thread.sleep(6000);
        System.out.println("enter email id ");

        cc_text.click();
        Thread.sleep(6000);

        bcc_text.click();
        Thread.sleep(6000);

        CC.sendKeys(random_Second_name + "@gmail.com");
        Thread.sleep(6000);

        bcc.sendKeys(name + "@gmail.com");
        Thread.sleep(6000);
        subject.click();
        subject.sendKeys(random_name);
        System.out.println("enter subject ");

        Thread.sleep(6000);
        box.click();
        Thread.sleep(6000);

        send.click();
        Thread.sleep(6000);
        System.out.println("Click on send button ");

//close_mail.click();
        Thread.sleep(6000);



        element.click();

        Thread.sleep(6000);

        file_log.click();
        System.out.println("click file log option");

        Thread.sleep(6000);

        export.click();
        System.out.println("click export option");

        Thread.sleep(6000);
        cencel_re.click();
        Thread.sleep(6000);

        element.click();
        Thread.sleep(6000);

        share.click();
        Thread.sleep(6000);

        System.out.println("click share option");

        Thread.sleep(6000);

        to_share.sendKeys(random_name + "@gmail.com");
        Thread.sleep(6000);

        System.out.println("enter mail option");

        mail_save.click();

        Thread.sleep(6000);

cencel_re.click();
        Thread.sleep(3000);

        element.click();
        Thread.sleep(3000);

        dlt.click();
        Thread.sleep(8000);

        password.sendKeys("123456");
        Thread.sleep(9000);

        dlt_file.click();
        Thread.sleep(9000);

        ac.contextClick(syncoffice).build().perform();
        Thread.sleep(6000);

        delete_side2.click();
        Thread.sleep(6000);

        password.sendKeys("123456");
        Thread.sleep(6000);

        delete_side.click();
        Thread.sleep(6000);

    }





}