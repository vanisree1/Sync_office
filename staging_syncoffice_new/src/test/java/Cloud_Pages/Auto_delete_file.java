package Cloud_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Auto_delete_file {
    public WebDriver driver;

    public Auto_delete_file(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    ////*[@type="text"]
    @FindBy(xpath = "//*[@type=\"text\"]")
    WebElement serch ;
    @FindBy(xpath = "(//*[text()=\"delete\"])[1]")
    WebElement delete ;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement rtore ;
    @FindBy(xpath = "//*[text()=\"restore\"]")
    WebElement restore ;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[2]")
    WebElement text ;
    @FindBy(xpath = "(//*[text()=\"Financer\"])[1]")
    WebElement ms;
    @FindBy(xpath = "(//*[text()=\"Delete\"])[2]")
    WebElement dlt;
//(//*[text()="Finance"])[2]
    @FindBy(xpath = "//*[@id=\"scrollable-force-tabpanel-0\"]/div/div/div[2]/div/div[2]/div[5]/div/span/span/span[1]/input")
    WebElement checkbox;
    @FindBy(xpath = "//*[@type=\"number\"]")
    WebElement sms;


    @FindBy(xpath = "    (//*[text()=\"Restore\"])[3]\n")
    WebElement maas;
    @FindBy(xpath = "(//*[@type=\"text\"])[3]")
    WebElement search;
    @FindBy(xpath = "//*[@type=\"password\"]")
    WebElement password;
    @FindBy(xpath = "(//*[contains(text(),'Delete')])[4]")
    WebElement save;
    @FindBy(xpath = "//*[@type=\"password\"]")
    WebElement passwod;
    @FindBy(xpath = "(//*[text()=\"Restore\"])[5]")
    WebElement restor ;
    @FindBy(xpath = "(//*[text()=\"Financer\"])[1]")
    WebElement admistration;
    @FindBy(xpath = "//*[text()=\"Upload File(s)\"]")
    WebElement upload_file ;
    @FindBy(xpath = "(//*[@type=\"file\"])[1]")
    WebElement file ;
    @FindBy(xpath = "(//*[text()=\"Upload\"])[4]")
    WebElement upload ;
    @FindBy(xpath = "//*[text()=\"Save\"]")
    WebElement save1 ;

    @FindBy(xpath = "//*[text()=\"Submit\"]\n")
    WebElement submit ;
    @FindBy(xpath = "//*[text()=\"Cloud\"]")
    WebElement click_on_cloud ;
    @FindBy(xpath = "//*[text()=\"My Cloud\"]")
    WebElement mycloud ;
    @FindBy(xpath = "(//*[text()=\"add\"])[1]")
    WebElement add ;
    @FindBy(xpath = "(//*[@type=\"text\"])[3]")
    WebElement text_box ;
    @FindBy(xpath = "(//*[@type=\"text\"])[2]")
    WebElement text_box1 ;
    @FindBy(xpath = "(//*[text()=\"Create\"])[2]")
    WebElement create ;
    @FindBy(xpath = "//*[text()=\"syncoffice\"]")
    WebElement syncoffice ;
    @FindBy(xpath = "(//*[text()=\"Create\"])[2]")
    WebElement crealte ;
    @FindBy(xpath = "(//*[text()=\"Create\"])[2]")
    WebElement crseate ;
    @FindBy(xpath = "(//*[text()=\"Create\"])[2]")
    WebElement craeate ;
    @FindBy(xpath = "(//*[text()=\"Create\"])[2]")
    WebElement creasste ;
    @FindBy(xpath = "(//*[text()=\"MS Office\"])[4]")
    WebElement msoffice ;
    @FindBy(xpath = "(//*[text()=\"Create\"])[2]")
    WebElement crejjate ;
    @FindBy(xpath = "//*[text()=\"cloud_upload\"]")
    WebElement click_on_upload ;

    @FindBy(xpath = "(//*[text()=\"delete\"])[5]")
    WebElement delete_side ;
    @FindBy(xpath = "(//*[text()=\"delete\"])[5]")
    WebElement delete_sie ;
    @FindBy(xpath = "(//*[text()=\"delete\"])[7]")
    WebElement dele ;
    @FindBy(xpath = "(//span[contains(text(),'Delete')])[3]")
    WebElement delete_side_syn ;
    @FindBy(xpath = "(//*[@type=\"file\"])[2]")
    WebElement folder ;

    @FindBy(xpath = "(//*[text()=\"Upload\"])[4]")
    WebElement upload_client ;
    @FindBy(xpath = "(//*[text()=\"Upload\"])[5]")
    WebElement upload_cl;
    @FindBy(xpath = "//*[@type=\"checkbox\"]")
    WebElement search1 ;


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

    @FindBy(xpath = "    //*[@class=\"jstree-wholerow jstree-wholerow-clicked\"]\n")
    WebElement fince;
    //*[@class="jstree-wholerow jstree-wholerow-clicked"]

    public void setMs( ) throws InterruptedException {
        add.click();
        Thread.sleep(5000);
        text_box1.sendKeys("syncoffice");
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

        button.click();


        delete.click();
        Thread.sleep(3000);

        passwod.sendKeys("123456");
        Thread.sleep(4000);

        save.click();
        Thread.sleep(8000);

        restore.click();
        Thread.sleep(6000);

      //  overall.click();
        Thread.sleep(3000);

    /*    sms.clear();
        Thread.sleep(3000);

        sms.sendKeys("16");
        Thread.sleep(8000);

        save1.click();
        Thread.sleep(3000);*/
search.sendKeys("ro");
        Thread.sleep(4000);
checkbox.click();
        Thread.sleep(4000);

        maas.click();
        Thread.sleep(4000);

        password.sendKeys("123456");
        Thread.sleep(4000);

        restor.click();

        Thread.sleep(6000);
        Actions ac=new Actions(driver);
        ac.contextClick(syncoffice).build().perform();
        Thread.sleep(6000);

        delete_side2.click();
        Thread.sleep(6000);

        password.sendKeys("123456");
        Thread.sleep(6000);

        delete_sie.click();
        Thread.sleep(6000);

        restore.click();
        Thread.sleep(6000);

        search.sendKeys("syncoffice");
        Thread.sleep(6000);

        checkbox.click();
        Thread.sleep(6000);

        dlt.click();
        Thread.sleep(6000);


        password.sendKeys("123456");
        Thread.sleep(6000);

        delete_side_syn.click();
        Thread.sleep(6000);


    }


    public void restore() throws InterruptedException {
        add.click();
        Thread.sleep(5000);
        text_box.sendKeys("syncoffice");
        Thread.sleep(8000);
        create.click();
        Thread.sleep(10000);
        syncoffice.click();
        Thread.sleep(4000);

        click_on_upload.click();
        Thread.sleep(4000);

        file.sendKeys("/home/lenovo/ro");
        Thread.sleep(4000);

        upload_cl.click();
        Thread.sleep(8000);

        button.click();


        delete.click();
        Thread.sleep(3000);

        passwod.sendKeys("123456");
        Thread.sleep(4000);

        save.click();
        Thread.sleep(8000);

        restore.click();
        Thread.sleep(6000);

        //  overall.click();
        Thread.sleep(3000);

        sms.clear();
        Thread.sleep(3000);

        sms.sendKeys("1");
        Thread.sleep(8000);

        submit.click();
        Thread.sleep(3000);
        search.sendKeys("ro");
        Thread.sleep(4000);
        checkbox.click();
        Thread.sleep(4000);

        maas.click();
        Thread.sleep(4000);

        password.sendKeys("abc@123");
        Thread.sleep(4000);

        restor.click();

        Thread.sleep(6000);
        Actions ac=new Actions(driver);
        ac.contextClick(syncoffice).build().perform();
        Thread.sleep(6000);

        delete_side2.click();
        Thread.sleep(6000);

        password.sendKeys("abc@123");
        Thread.sleep(6000);

        delete_side.click();
        Thread.sleep(6000);

        restore.click();
        Thread.sleep(6000);

        search.sendKeys("syncoffice");
        Thread.sleep(6000);

        checkbox.click();
        Thread.sleep(6000);

        dlt.click();
        Thread.sleep(6000);


        password.sendKeys("abc@123");
        Thread.sleep(6000);

        delete_side_syn.click();
        Thread.sleep(6000);

    }
}
