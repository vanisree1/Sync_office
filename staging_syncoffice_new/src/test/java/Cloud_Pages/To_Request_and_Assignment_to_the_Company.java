package Cloud_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class To_Request_and_Assignment_to_the_Company {
    public WebDriver driver;

    public To_Request_and_Assignment_to_the_Company(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[text()=\"transfer_within_a_station\"]")
    WebElement assign;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[3]")
    WebElement chekbox;
    @FindBy(xpath = "//*[text()=\"Save\"]")
    WebElement save;
    @FindBy(xpath = "(//*[text()=\"Request Log\"])")
    WebElement Request;
    @FindBy(xpath = "(//*[text()=\"email\"])[4]")
    WebElement email;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[4]")
    WebElement box;
    @FindBy(xpath = " //*[text()=\"Bulk Approve\"]")
    WebElement aprove;
    @FindBy(xpath = "//*[text()=\"Team Log\"]")
    WebElement team;
    @FindBy(xpath = "(//*[text()=\"Bulk Reject\"])")
    WebElement reject;
    @FindBy(xpath = "(//*[text()=\"add\"])[1]")
    WebElement add ;
    @FindBy(xpath = "(//*[@type=\"text\" ])[2]")
    WebElement text_box ;
    @FindBy(xpath = "(//*[text()=\"Create\"])[2]")
    WebElement create ;
    @FindBy(xpath = "//*[text()=\"syncoffice\"]")
    WebElement syncoffice ;

    @FindBy(xpath = "//*[text()=\"cloud_upload\"]")
    WebElement click_on_upload ;
    @FindBy(xpath = "(//*[text()=\"Cancel\"])")
    WebElement cencle;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[2]")
    WebElement client_box ;
    @FindBy(xpath = "(//*[@type=\"file\"])[1]")
    WebElement file ;
    @FindBy(xpath = "(//*[@type=\"file\"])[2]")
    WebElement folder ;
    @FindBy(xpath = "(//*[text()=\"Upload\"])[4]")
    WebElement upload ;
    @FindBy(xpath = "(//*[text()=\"Upload\"])[5]")
    WebElement upload_client ;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[4]")
    WebElement chek ;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[1]")
    WebElement button;
    @FindBy(xpath = "(//*[text()=\"Delete\"])[2]")
    WebElement delete ;

    @FindBy(xpath = "(//*[text()=\"Delete\"])[3]")
    WebElement delete_side2;
    //*[text()="Approve"]
    @FindBy(xpath = "//*[@type=\"password\"]")
    WebElement password1;
    public void setAssign() throws InterruptedException {
        Thread.sleep(8000);
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

        file.sendKeys("/home/lenovo/Downloads/noname");
        Thread.sleep(4000);

        upload.click();
        Thread.sleep(8000);

        button.click();
        Thread.sleep(8000);

        assign.click();
        Thread.sleep(8000);
        chekbox.click();
        Thread.sleep(8000);

        save.click();
        Thread.sleep(8000);

        Request.click();
        Thread.sleep(8000);

        email.click();
        Thread.sleep(8000);

        team.click();
        Thread.sleep(8000);

        box.click();
        Thread.sleep(8000);

        aprove.click();
        Thread.sleep(8000);

        chek.click();
        Thread.sleep(8000);

        reject.click();
        Thread.sleep(8000);

        cencle.click();
        Thread.sleep(8000);
        Actions ac=new Actions(driver);
        ac.contextClick(syncoffice).build().perform();
        Thread.sleep(6000);

        delete.click();
        Thread.sleep(6000);

        password1.sendKeys("123456");
        Thread.sleep(6000);

        delete_side2.click();
        Thread.sleep(6000);

    }

    public void setUpload_client() throws InterruptedException {


        Thread.sleep(8000);
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

        file.sendKeys("/home/lenovo/Downloads/noname");
        Thread.sleep(4000);
        client_box.click();
        Thread.sleep(4000);

        upload_client.click();
        Thread.sleep(8000);

        button.click();
        Thread.sleep(8000);

        assign.click();
        Thread.sleep(8000);
        chekbox.click();
        Thread.sleep(8000);

        save.click();
        Thread.sleep(8000);

        Request.click();
        Thread.sleep(8000);

        email.click();
        Thread.sleep(8000);

        team.click();
        Thread.sleep(8000);

        box.click();
        Thread.sleep(8000);

        aprove.click();
        Thread.sleep(8000);

        chek.click();
        Thread.sleep(8000);

        reject.click();
        Thread.sleep(8000);

        cencle.click();
        Thread.sleep(8000);
        Actions ac=new Actions(driver);
        ac.contextClick(syncoffice).build().perform();
        Thread.sleep(6000);

        delete.click();
        Thread.sleep(6000);

        password1.sendKeys("123456");
        Thread.sleep(6000);

        delete_side2.click();
        Thread.sleep(6000);


    }
}
