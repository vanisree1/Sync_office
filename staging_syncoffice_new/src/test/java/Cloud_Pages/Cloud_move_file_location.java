package Cloud_Pages;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Cloud_move_file_location {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(5);


    public Cloud_move_file_location(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "(//*[@class=\"mdc-select__native-control customFieldText py-0\"])[6]")
    WebElement drop;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[1]")
    WebElement button;
    @FindBy(xpath = "(//*[text()=\"move_to_inbox\"])[1]")
    WebElement move;
    @FindBy(xpath = "(//*[text()=\"Head Office\"])[4]")
    WebElement pune;
    @FindBy(xpath = " (//*[text()=\"Move\"])[3]")
    WebElement ac_buttn;
    @FindBy(xpath = "//*[@type=\"checkbox\"]")
    WebElement check;
    @FindBy(xpath = "//*[text()=\"file_copy\"]")
    WebElement file_copy;
    @FindBy(xpath = "(//*[text()=\"syncoffice\"])[2]")
    WebElement mubai;
    @FindBy(xpath = "(//*[text()=\"Copy\"])[3]")
    WebElement copy1;
    @FindBy(xpath = "//*[@type=\"checkbox\"]")
    WebElement check1;
    @FindBy(xpath = "//*[text()=\"delete\"]")
    WebElement delete;
    @FindBy(xpath = "//*[@ type=\"password\"]")
    WebElement password;
    @FindBy(xpath = "(//*[text()=\"HR\"])[2]")
    WebElement HR;
    @FindBy(xpath = "(//*[text()=\"delete\"])[5]")
    WebElement dlt;
    @FindBy(xpath = "(//*[text()=\"add\"])[1]")
    WebElement add ;
    @FindBy(xpath = "(//*[@type=\"text\"])[3]")
    WebElement text_box ;
    @FindBy(xpath = "(//*[text()=\"Create\"])[2]")
    WebElement create ;
    @FindBy(xpath = "//*[text()=\"syncofficee\"]")
    WebElement syncoffice ;

    @FindBy(xpath = "//*[text()=\"cloud_upload\"]")
    WebElement click_on_upload ;
    @FindBy(xpath = "(//*[text()=\"Financer\"])[1]")
    WebElement admistration;
    @FindBy(xpath = "(//*[text()=\"delete\"])[4]")
    WebElement delete_side ;
    @FindBy(xpath = "(//*[@type=\"file\"])[1]")
    WebElement file ;
    @FindBy(xpath = "(//*[@type=\"file\"])[2]")
    WebElement folder ;
    @FindBy(xpath = "(//*[text()=\"Upload\"])[4]")
    WebElement upload ;
    @FindBy(xpath = "(//*[text()=\"Upload\"])[4]")
    WebElement upload_client ;
    @FindBy(xpath = "//*[@type=\"password\"]")
    WebElement password1 ;
    @FindBy(xpath = "//*[@type=\"checkbox\"]")
    WebElement search1 ;
    @FindBy(xpath = "(//*[text()=\"Delete\"])[2]")
    WebElement delete1;
    public void setMs() throws InterruptedException {

        add.click();
        Thread.sleep(5000);
        text_box.sendKeys("syncofficee");
        Thread.sleep(8000);
        create.click();
        Thread.sleep(10000);
        syncoffice.click();
        Thread.sleep(4000);

        click_on_upload.click();
        Thread.sleep(4000);

        file.sendKeys("/home/lenovo/ro");
        Thread.sleep(4000);

        upload_client.click();
        Thread.sleep(8000);



        Thread.sleep(4000);

        syncoffice.click();
        Thread.sleep(4000);

        button.click();

        move.click();
        Thread.sleep(6000);

        pune.click();
        Thread.sleep(6000);

        ac_buttn.click();
        Thread.sleep(6000);


        Actions ac=new Actions(driver);
        ac.contextClick(syncoffice).build().perform();
        Thread.sleep(6000);

        delete1.click();
        Thread.sleep(6000);

        password.sendKeys("123456");
        Thread.sleep(6000);

        delete_side.click();
        Thread.sleep(6000);





    }
}


