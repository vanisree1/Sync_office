package Cloud_Pages;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Move_Multiple_folder {

        public WebDriver driver;
        public String random_name = Utilities_class.randomalphabet(5);
        public String name= Utilities_class.randomalphabet(5);
        public String random_Second_name = Utilities_class.randomalphabet(5);
        public String number = Utilities_class.randomnemeric(5);
        public Move_Multiple_folder(WebDriver rdriver) {
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
        @FindBy(xpath = "(//*[@ type=\"text\"])[3]")
        WebElement rename_box;
        @FindBy(xpath = "(//*[@ type=\"text\"])[3]")
        WebElement rename_client;
        @FindBy(xpath = "(//*[text()=\"Rename\"])[1]")
        WebElement rename;
        @FindBy(xpath = "(//*[text()=\"Rename\"])[2]")
        WebElement rename1;
        @FindBy(xpath = "(//*[text()=\"sync\"])")
        WebElement syn;
        @FindBy(xpath = "(//*[text()=\"Move\"])[2]")
        WebElement move;
        @FindBy(xpath = "(//*[text()=\"Multiple Folder\"])[1]")
        WebElement multiple_folder;
        @FindBy(xpath = "(//*[text()=\"close\"])[4]")
        WebElement close;
        @FindBy(xpath = "(//*[text()=\"close\"])[6]")
        WebElement close_client;
        @FindBy(xpath = "(//Select[@class=\"mdc-select__native-control customFieldText py-0\"])[9]")
        WebElement select1;
        @FindBy(xpath = "//*[text()=\"Folder Access\"]\n")
        WebElement folder;
        @FindBy(xpath = "//*[text()=\"arrow_forward\"]")
        WebElement arrow_forwd;
        @FindBy(xpath = "//*[text()=\"arrow_back\"]")
        WebElement arrow_back;
        @FindBy(xpath = "(//*[@type=\"checkbox\"])[3]\n")
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
        WebElement move1;

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

           ac.moveToElement(move).build().perform();
            Thread.sleep(8000);

           // ac.moveToElement(multiple_folder).build().perform();


            multiple_folder.click();

            Thread.sleep(9000);

            chek_8.click();
            Thread.sleep(9000);

            Select sc =new Select(select1);
sc.selectByVisibleText("Finance");
            Thread.sleep(8000);

move1.click();

            Thread.sleep(8000);

            ac.contextClick(function).build().perform();
            Thread.sleep(6000);

            dlt.click();
            Thread.sleep(6000);

            pass.sendKeys("123456");
            Thread.sleep(6000);


            delete.click();
            Thread.sleep(8000);

            ac.contextClick(function).build().perform();
            Thread.sleep(6000);

            dlt.click();
            Thread.sleep(6000);

            pass.sendKeys("123456");
            Thread.sleep(6000);


            delete.click();



        }



    }


