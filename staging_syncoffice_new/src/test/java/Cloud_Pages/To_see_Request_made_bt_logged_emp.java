package Cloud_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class To_see_Request_made_bt_logged_emp {
    public WebDriver driver;

    public To_see_Request_made_bt_logged_emp(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//*[text()=\"delete_sweep\"]")
    WebElement dlt_Request ;
    @FindBy(xpath = "//*[text()=\"Request Log\"]")
    WebElement Request_Log ;

    @FindBy(xpath = "//*[text()=\"My Team\"]")
    WebElement my_team ;
    @FindBy(xpath = "(//*[@type=\"text\"])[4]")
    WebElement remark ;
    @FindBy(xpath = "(//*[@ type=\"text\" ])[4]")
    WebElement text_box ;
    @FindBy(xpath = "(//*[@ type=\"text\" ])[2]")
    WebElement text_box1;
    @FindBy(xpath = "(//*[text()=\"Approve\"])")
    WebElement aprrove ;
    @FindBy(xpath = "//*[text()=\"Delete File Request\"]")
    WebElement dlt_file_request ;
    @FindBy(xpath = "//*[@type=\"checkbox\"]")
    WebElement check ;
    @FindBy(xpath = "(//*[text()=\"add\"])[1]")
    WebElement add ;

    @FindBy(xpath = "//*[text()=\"Reject\"]\n")
    WebElement reject ;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[3]")
    WebElement box ;
    @FindBy(xpath = "(//*[text()=\"Create\"])[2]")
    WebElement create ;
    @FindBy(xpath = "//*[text()=\"syncoffice\"]")
    WebElement syncoffice ;

    @FindBy(xpath = "//*[text()=\"cloud_upload\"]")
    WebElement click_on_upload ;
    @FindBy(xpath = "(//*[text()=\"close\"])[5]")
    WebElement close;
    @FindBy(xpath = "(//*[text()=\"delete\"])[5]")
    WebElement delete_side ;
    @FindBy(xpath = "(//*[text()=\"Delete\"])[2]")
    WebElement delete_side2;
    @FindBy(xpath = "(//*[@type=\"file\"])[1]")
    WebElement file ;
    @FindBy(xpath = "(//*[text()=\"syncoffice\"])")
    WebElement syncoffice1 ;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement save_dlt ;
    @FindBy(xpath = "(//*[text()=\"Upload\"])[4]")
    WebElement upload_client ;
    @FindBy(xpath = "//*[@type=\"password\"]")
    WebElement password ;
    @FindBy(xpath = "(//*[text()=\"Delete Request\"])[2]")
    WebElement dlt_request ;
    @FindBy(xpath = "(//*[text()=\"delete\"])[1]")
    WebElement delete ;
    //*[text()="save"]
    @FindBy(xpath = "//*[text()=\"Update Existing\"]")
    WebElement existing;
    @FindBy(xpath = "(//*[text()=\"Delete\"])[3]")
    WebElement upload_dlt ;
    @FindBy(xpath = "//*[text()=\"Remove\"]")
    WebElement remove;
//*[text()="Reject"]

    @FindBy(xpath = "(//*[@ type=\"text\"])[3]\n")
    WebElement timesheet ;
    public void setDlt_Request( ) throws InterruptedException {

        Thread.sleep(5000);

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

        file.sendKeys("/home/lenovo/Downloads/noname");
        Thread.sleep(4000);

        if  ( upload_client.isDisplayed())
        {
            upload_client.click();
        }
        if(existing.isDisplayed()){
            existing.click();
        }

        Thread.sleep(8000);


        check.click();

        Thread.sleep(8000);

        dlt_Request.click();
        Thread.sleep(8000);

        dlt_file_request.click();
        Thread.sleep(8000);


        password.sendKeys("123456");
        Thread.sleep(4000);

        dlt_request.click();
        Thread.sleep(4000);
        dlt_Request.click();
        Thread.sleep(4000);

        Request_Log.click();
        Thread.sleep(4000);
        System.out.println("aaaaa");





    }



    public void setremove() throws InterruptedException{
        //text_box.click();
        Thread.sleep(5000);

        remove.click();
        Thread.sleep(5000);

        close.click();
        Thread.sleep(7000);
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

}
