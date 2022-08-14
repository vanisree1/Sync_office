package Cloud_Pages;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upload_file {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(5);
    public Upload_file(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//*[text()=\"cloud_upload\"]")
    WebElement click_on_upload ;
    @FindBy(xpath = "(//*[text()=\"Finance\"])[2]")
    WebElement admistration;
    @FindBy(xpath = "(//*[text()=\"cloud_upload\"])[5]")
    WebElement upload_folder ;
    @FindBy(xpath = "(//*[@type=\"file\"])[1]")
    WebElement file ;
    @FindBy(xpath = "(//*[text()=\"add\"])[1]")
    WebElement add ;
    @FindBy(xpath = "(//*[@type=\"text\"])[2]")
    WebElement text_box ;
    @FindBy(xpath = "(//*[text()=\"Create\"])[2]")
    WebElement create ;
    @FindBy(xpath = "//*[text()=\"syncoffice\"]")
    WebElement syncoffice ;




    @FindBy(xpath = "(//*[@type=\"file\"])[2]")
    WebElement folder ;
    @FindBy(xpath = "(//*[text()=\"Upload\"])[4]")
    WebElement upload ;
    @FindBy(xpath = "//*[@type=\"text\"]")
    WebElement search ;
    @FindBy(xpath = "//*[@type=\"checkbox\"]")
    WebElement search1 ;
    @FindBy(xpath = "(//*[text()=\"delete\"])[1]")
    WebElement delete ;
    @FindBy(xpath = "(//*[text()=\"Delete\"])[3]")
    WebElement upload_dlt ;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[1]")
    WebElement button;
    @FindBy(xpath = "//*[@type=\"password\"]")
    WebElement password;
    @FindBy(xpath = "(//*[text()=\"delete\"])[5]")
    WebElement save_dlt;
    @FindBy(xpath = "    //*[@class=\"jstree-wholerow jstree-wholerow-clicked\"]\n")
    WebElement fince;
    //*[@class="jstree-wholerow jstree-wholerow-clicked"]
    public void setAdmistration() { admistration.click();
    }

    public void setClick_on_upload() {
        click_on_upload.click();
    }


    public void setFile()  throws InterruptedException {
        file.sendKeys("/home/lenovo/Downloads/noname");
        Thread.sleep(4000);


    }

    public void setUpload() throws InterruptedException  {
        upload.click();
        Thread.sleep(6000);
        //admistration.click();
       // fince.click();
        Thread.sleep(4000);

    }

    public void setSearch() throws InterruptedException  {
        admistration.click();
        Thread.sleep(4000);

        search.sendKeys("noname");
        System.out.println("noname");
        Thread.sleep(4000);

    }

    public void setButton() throws InterruptedException  {
        button.click();
        Thread.sleep(4000);

    }

    public void setDelete() throws InterruptedException {
        Thread.sleep(4000);

        delete.click();
        Thread.sleep(4000);

        password.sendKeys("Creta_123");
        Thread.sleep(8000);

        save_dlt.click();
        Thread.sleep(5000);

    }

    public void setFince( ) {
        fince.click();
    }

    public void setFolder() throws InterruptedException {
        Thread.sleep(5000);
        add.click();

        text_box.sendKeys("syncoffice");
        Thread.sleep(8000);
        create.click();
        Thread.sleep(8000);
        syncoffice.click();
        Thread.sleep(4000);

        click_on_upload.click();
        Thread.sleep(4000);

        folder.sendKeys("/home/lenovo/Desktop/preview");
        Thread.sleep(4000);

        upload.click();
        Thread.sleep(8000);
        delete.click();
        Thread.sleep(4000);

        password.sendKeys("Creta_123");
        Thread.sleep(8000);

        upload_dlt.click();
        Thread.sleep(5000);

    }

    public void setUpload_dlt() throws InterruptedException {
        delete.click();
        Thread.sleep(4000);

        password.sendKeys("Creta_123");
        Thread.sleep(8000);

        upload_dlt.click();
        Thread.sleep(5000);
    }


    public void setAdd( ) throws InterruptedException {
        Thread.sleep(5000);
        add.click();

        text_box.sendKeys("syncoffice");
        Thread.sleep(8000);
        create.click();
        Thread.sleep(8000);
        syncoffice.click();
        Thread.sleep(4000);

        click_on_upload.click();
        Thread.sleep(4000);

        folder.sendKeys("/home/lenovo/Desktop/preview");
        Thread.sleep(4000);

        upload.click();
        Thread.sleep(8000);
        delete.click();
        Thread.sleep(4000);

        password.sendKeys("Creta_123");
        Thread.sleep(8000);

        upload_dlt.click();
        Thread.sleep(5000);
    }
}


