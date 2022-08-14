package Cloud_Pages;

import Utilities.Utilities_class;
import com.sun.tools.javac.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Right_folder_function {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String name= Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String number = Utilities_class.randomnemeric(5);
    public Right_folder_function(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//*[text()=\"CANDYTECNOLOGY\"]")
    WebElement function;
    @FindBy(xpath = "//*[text()=\"add\"]")
    WebElement add;
    @FindBy(xpath = "(//*[@ type=\"text\"])[2]")
    WebElement create_folder;
    @FindBy(xpath = "(//*[@ type=\"text\"])[3]")
    WebElement create_folder_client;
    @FindBy(xpath = "(//*[text()=\"Create\"])[2]")
    WebElement create;
    @FindBy(xpath = "//*[text()=\"Upload\"]")
    WebElement upload;
    @FindBy(xpath = "//*[@type=\"file\"]")
    WebElement file;
    @FindBy(xpath = "(//*[text()=\"Upload\"])[4]")
    WebElement upload1;
    @FindBy(xpath = "(//*[text()=\"Upload\"])[5]")
    WebElement upload_clent;
    @FindBy(xpath = "//*[text()=\"New Folder\"]")
    WebElement new_folder;
    @FindBy(xpath = "(//*[@ type=\"text\"])[2]")
    WebElement rename_box;
    @FindBy(xpath = "(//*[@ type=\"text\"])[3]")
    WebElement rename_client;
    @FindBy(xpath = "(//*[text()=\"Rename\"])[1]")
    WebElement rename;
    @FindBy(xpath = "(//*[text()=\"Rename\"])[2]")
    WebElement rename1;
    @FindBy(xpath = "(//*[text()=\"sarika\"])")
    WebElement syn;
    @FindBy(xpath = "(//*[text()=\"Download\"])[2]")
    WebElement download;
    @FindBy(xpath = "//*[text()=\"Details\"]")
    WebElement Details;
    @FindBy(xpath = "(//*[text()=\"close\"])[4]")
    WebElement close;
    @FindBy(xpath = "(//*[text()=\"close\"])[6]")
    WebElement close_client;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[7]")
    WebElement check1;
    @FindBy(xpath = "//*[text()=\"Folder Access\"]\n")
    WebElement folder;
    @FindBy(xpath = "//*[text()=\"arrow_forward\"]")
    WebElement arrow_forwd;
    @FindBy(xpath = "//*[text()=\"arrow_back\"]")
    WebElement arrow_back;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[11]\n")
    WebElement chek_8;
    @FindBy(xpath = "(//*[text()=\"Delete\"])[2]")
    WebElement dlt;
    @FindBy(xpath = "(//*[@type=\"password\"])")
    WebElement pass;
    @FindBy(xpath = "(//*[text()=\"Delete\"])[3]")
    WebElement delete;
    @FindBy(xpath = "(//*[text()=\"More\"])[3]")
    WebElement more;


    //*[text()="add"]
    @FindBy(xpath = "//*[text()=\"Zip & Mail\"]")
    WebElement mail;
    @FindBy(xpath = "    //*[text()=\"CC\"]\n")
    WebElement CC;
    @FindBy(xpath = "//*[text()=\"BCC\"]")
    WebElement Bcc;
    @FindBy(xpath = " (//*[@type=\"text\"])[5]\n")
    WebElement cc_text;
    @FindBy(xpath = " (//*[@type=\"text\"])[5]\n")
    WebElement cc_text_client;
    @FindBy(xpath = " (//*[@type=\"text\"])[6]\n")
    WebElement bcc_mail;
    @FindBy(xpath = " (//*[@type=\"text\"])[6]\n")
    WebElement bcc_mail_client;
    @FindBy(xpath = "    (//*[@type=\"text\"])[4]\n")
    WebElement To;
    @FindBy(xpath = "    (//*[@type=\"text\"])[4]\n")
    WebElement To_client;
    @FindBy(xpath = "(//*[@type=\"text\"])[7]")
    WebElement subject;
    @FindBy(xpath = "(//*[@type=\"text\"])[7]")
    WebElement subject_client;
    @FindBy(xpath = "//*[text()=\"Send\"]")
    WebElement save;
    @FindBy(xpath = "//*[@type=\"checkbox\"]")
    WebElement checkbox;

    @FindBy(xpath = "(//*[text()=\"Tax\"])[6]\n")
    WebElement Tax;
    @FindBy(xpath = "(//*[text()=\"Move\"])[3]")
    WebElement move;

    public void setDetails() throws InterruptedException {
        Actions ac=new Actions(driver);

add.click();


        Thread.sleep(9000);

        create_folder.sendKeys("CANDYTECNOLOGY");
        Thread.sleep(8000);

        create.click();
        Thread.sleep(8000);

        function.click();
        Thread.sleep(8000);

        upload.click();
        Thread.sleep(8000);

        file.sendKeys("/home/lenovo/Pictures/Weekday.png");
        Thread.sleep(8000);

        upload1.click();
        Thread.sleep(11000);
        Thread.sleep(12000);

        checkbox.click();

        ac.contextClick(function).build().perform();
        Thread.sleep(8000);
      //  Details.click();
new_folder.click();
        Thread.sleep(8000);

create_folder.sendKeys("sarika");
        Thread.sleep(8000);

create.click();
        Thread.sleep(8000);

        ac.contextClick(function).build().perform();
        Thread.sleep(8000);

       // rename.click();

      //  Thread.sleep(8000);
//rename_box.clear();
       // Thread.sleep(8000);

  //      rename_box.sendKeys("sync");
      //  Thread.sleep(8000);

      //  rename1.click();
     //   Thread.sleep(8000);

        ac.contextClick(syn).build().perform();
        Thread.sleep(8000);

        download.click();
        Thread.sleep(9000);
        checkbox.click();
        Thread.sleep(9000);
        ac.contextClick(syn).build().perform();
Details.click();
        Thread.sleep(9000);

close.click();
        Thread.sleep(9000);
        ac.contextClick(syn).build().perform();
        Thread.sleep(9000);

        folder.click();
        Thread.sleep(6000);

        check1.click();
        Thread.sleep(6000);

        arrow_forwd.click();
        Thread.sleep(6000);

        chek_8.click();
        Thread.sleep(5000);

        arrow_back.click();
        Thread.sleep(6000);
        close.click();
        Thread.sleep(7000);

        ac.contextClick(syn).build().perform();
        Thread.sleep(8000);
//*[text()="Folder Access"]
        mail.click();
        Thread.sleep(6000);

        CC.click();
        Thread.sleep(6000);

        Bcc.click();
        Thread.sleep(6000);


        To.sendKeys("sarika.mishra@candytechnologies.in");
        Thread.sleep(6000);

        cc_text.sendKeys("sarika.mishra@candytechnologies.in");
        Thread.sleep(6000);

        bcc_mail.sendKeys("sarika.mishra@candytechnologies.in");
        Thread.sleep(6000);

        subject.sendKeys(random_Second_name);
        Thread.sleep(6000);

        save.click();
        Thread.sleep(6000);
        ac.contextClick(syn).build().perform();
        Thread.sleep(6000);

        ac.contextClick(more).build().perform();
        Thread.sleep(6000);

        driver.findElement(By.xpath("(//*[text()=\"Copy\"])[2]")).click();
        Thread.sleep(6000);

        ac.contextClick(syn).build().perform();
        Thread.sleep(6000);

        ac.contextClick(more).build().perform();
        Thread.sleep(6000);

        driver.findElement(By.xpath("(//*[text()=\"Paste\"])")).click();

        Thread.sleep(6000);


        ac.contextClick(syn).build().perform();
        Thread.sleep(6000);

        dlt.click();
        Thread.sleep(6000);

        pass.sendKeys("123456");
        Thread.sleep(6000);

        delete.click();

    }

    public void setClent_text_box() throws InterruptedException {
        Thread.sleep(9000);

        Actions ac=new Actions(driver);
        ac.doubleClick(add).build().perform();
      //  add.click();
      //  add.click();

        Thread.sleep(9000);



        create_folder.sendKeys("CANDYTECNOLOGY");
        Thread.sleep(8000);

        create.click();
        Thread.sleep(8000);

        function.click();
        Thread.sleep(8000);

        upload.click();
        Thread.sleep(8000);

        file.sendKeys("/home/lenovo/Downloads/globalGL (1).xls");
        Thread.sleep(8000);
        upload_clent.click();
        Thread.sleep(8000);

        checkbox.click();

        Actions ac1=new Actions(driver);
        ac1.contextClick(function).build().perform();
        Thread.sleep(8000);
        //  Details.click();
        new_folder.click();
        Thread.sleep(8000);

        create_folder_client.sendKeys("sarika");
        Thread.sleep(8000);

        create.click();
        Thread.sleep(8000);

        ac.contextClick(function).build().perform();
        Thread.sleep(8000);

        rename.click();

        Thread.sleep(8000);
        rename_client.clear();
        Thread.sleep(8000);

        rename_client.sendKeys("sync");
        Thread.sleep(8000);

        rename1.click();
        Thread.sleep(8000);

        ac.contextClick(syn).build().perform();
        Thread.sleep(8000);

        download.click();
        Thread.sleep(9000);
        checkbox.click();
        Thread.sleep(9000);
        ac.contextClick(syn).build().perform();
        Details.click();
        Thread.sleep(9000);

        close_client.click();
        Thread.sleep(9000);
        ac.contextClick(syn).build().perform();
        Thread.sleep(9000);

        folder.click();
        Thread.sleep(6000);

        check1.click();
        Thread.sleep(6000);

        arrow_forwd.click();
        Thread.sleep(6000);

        chek_8.click();
        Thread.sleep(5000);

        arrow_back.click();
        Thread.sleep(6000);
        close_client.click();
        Thread.sleep(9000);

        ac.contextClick(syn).build().perform();
        Thread.sleep(8000);
        mail.click();
        Thread.sleep(6000);

        CC.click();
        Thread.sleep(6000);

        Bcc.click();
        Thread.sleep(6000);

        Thread.sleep(6000);

        To_client.sendKeys("sarika.mishra@candytechnologies.in");
        Thread.sleep(6000);

        cc_text_client.sendKeys("sarika.mishra@candytechnologies.in");
        Thread.sleep(6000);

        bcc_mail_client.sendKeys("sarika.mishra@candytechnologies.in");
        Thread.sleep(6000);

        subject_client.sendKeys(random_Second_name);
        Thread.sleep(6000);

        save.click();
        Thread.sleep(6000);


        ac.contextClick(syn).build().perform();
        Thread.sleep(6000);

        dlt.click();
        Thread.sleep(6000);

        pass.sendKeys("123456");
        Thread.sleep(6000);

        delete.click();

    }

    public void setDlt() throws InterruptedException {
        Actions ac=new Actions(driver);

        add.click();
        Thread.sleep(9000);


        Thread.sleep(9000);

        create_folder.sendKeys("CANDYTECNOLOGY");
        Thread.sleep(8000);

        create.click();
        Thread.sleep(8000);

        function.click();
        Thread.sleep(8000);

        upload.click();
        Thread.sleep(8000);

        file.sendKeys("/home/lenovo/Pictures/Weekday.png");
        Thread.sleep(8000);

        upload_clent.click();
        Thread.sleep(11000);
        Thread.sleep(12000);

        checkbox.click();

        ac.contextClick(function).build().perform();
        Thread.sleep(8000);
        //  Details.click();
        new_folder.click();
        Thread.sleep(8000);

        create_folder.sendKeys("sarika");
        Thread.sleep(8000);

        create.click();
        Thread.sleep(8000);

        ac.contextClick(function).build().perform();
        Thread.sleep(8000);

        rename.click();

        Thread.sleep(8000);
        rename_box.clear();
        Thread.sleep(8000);

        rename_box.sendKeys("sync");
        Thread.sleep(8000);

        rename1.click();
        Thread.sleep(8000);

        ac.contextClick(syn).build().perform();
        Thread.sleep(8000);

        download.click();
        Thread.sleep(9000);
        checkbox.click();
        Thread.sleep(9000);
        ac.contextClick(syn).build().perform();
        Details.click();
        Thread.sleep(9000);

        close_client.click();
        Thread.sleep(9000);


        ac.contextClick(syn).build().perform();
        Thread.sleep(8000);
//*[text()="Folder Access"]
        mail.click();
        Thread.sleep(6000);

        CC.click();
        Thread.sleep(6000);

        Bcc.click();
        Thread.sleep(6000);

        Thread.sleep(6000);

        To.sendKeys("sarika.mishra@candytechnologies.in");
        Thread.sleep(6000);

        cc_text.sendKeys("sarika.mishra@candytechnologies.in");
        Thread.sleep(6000);

        bcc_mail.sendKeys("sarika.mishra@candytechnologies.in");
        Thread.sleep(6000);

        subject.sendKeys(random_Second_name);
        Thread.sleep(6000);

        save.click();
        Thread.sleep(6000);
        ac.contextClick(syn).build().perform();
        Thread.sleep(6000);

        ac.contextClick(more).build().perform();
        Thread.sleep(6000);

        driver.findElement(By.xpath("(//*[text()=\"Copy\"])[2]")).click();
        Thread.sleep(6000);

        ac.contextClick(syn).build().perform();
        Thread.sleep(6000);

        ac.contextClick(more).build().perform();
        Thread.sleep(6000);

        driver.findElement(By.xpath("(//*[text()=\"Paste\"])")).click();

        Thread.sleep(6000);


        ac.contextClick(syn).build().perform();
        Thread.sleep(6000);

        dlt.click();
        Thread.sleep(6000);

        pass.sendKeys("123456");
        Thread.sleep(6000);

        delete.click();
    }
}
