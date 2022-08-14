package Cloud_Pages;

import Utilities.Utilities_class;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class To_Set_the_Limit_to_the_employee_to_Download_and_Upload {
    public WebDriver driver;

    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(5);


    public To_Set_the_Limit_to_the_employee_to_Download_and_Upload(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "(//*[@role=\"presentation\"])[9]")
    WebElement admistration;
    @FindBy(xpath = "(//*[text()=\"error_outline\"])[1]")
    WebElement limit;
    @FindBy(xpath = "(//*[@type=\"text\"])[3]")
    WebElement search;
    @FindBy(xpath = "(//*[@id=\"upload_limit_8\"])")
    WebElement upload_box;

    @FindBy(xpath = "//select [@class=\"form-control\" ]")
    WebElement GB;
    @FindBy(xpath = "//*[@id=\"download_limit_8\"]")
    WebElement download;
    @FindBy(xpath = "(//select [@class=\"form-control\" ])[2]")
    WebElement GB1;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[5]")
    WebElement checkbox;
    @FindBy(xpath = "(//*[text()=\"Set Limit\"])")
    WebElement limit2;
    @FindBy(xpath = "//body/div[8]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/span[1]/span[1]")
    WebElement upload_limit;
    @FindBy(xpath = "(//*[text()=\"Download\"])[2]")
    WebElement download_limit;
    @FindBy(xpath = "(//*[@class=\"mdc-select mdc-select--outlined  w-100 customFieldHeight\"])[4]//*[text()=\"GB\"]")
    WebElement Type_MB;
    @FindBy(xpath = "(//*[@class=\"mdc-select__native-control customFieldText py-0\"])[5]//*[@value=\"mb\"]")
    WebElement type_mb;
    //*[text()="Set Limit"]
    @FindBy(xpath = "(//*[@type=\"number\"])[3]")
    WebElement number_mb;
    @FindBy(xpath = "(//*[@type=\"number\"])[3]")
    WebElement number_mb1;
    public void setAdmistration() {
        admistration.click();
    }

    public void setLimit() {
        limit.click();
    }

    public void setSearch() throws InterruptedException {
        checkbox.click();

        search.sendKeys("sarika");
        Thread.sleep(500);

    }



    public void setBox() throws InterruptedException {
        upload_box.clear();
        Thread.sleep(500);
        upload_box.sendKeys("2");
    }
    public void setGB() throws InterruptedException {
       // GB.click();
        Select sc=new Select(GB);
        sc.selectByVisibleText("GB");
        Thread.sleep(500);

    }

    public void setDownload() throws InterruptedException {
        download.clear();
        download.sendKeys("2");
        Thread.sleep(500);
        Select sc=new Select(GB1);
        sc.selectByVisibleText("GB");
        Thread.sleep(5000);
        limit2.click();

    }

    public void setGB1() throws InterruptedException {
        Thread.sleep(2000);

     //   GB1.click();
        Thread.sleep(5000);
////*[@class="mdc-layout-grid__inner mdc-typography--subtitle2   border-bottom px-1 py-1"]//div[4]
    }

    public void setLimit2() {
     //   Assert.assertEquals("Set Limit\n" ,limit_displaye);


    }

    public void setUpload_limit() throws InterruptedException {
        Thread.sleep(5000);

     //   upload_limit.click();
    }

    public void setDownload_limit()throws InterruptedException {
        Thread.sleep(5000);
      //  JavascriptExecutor js = (JavascriptExecutor)driver;
      //  js.executeScript("arguments[0].click();", download_limit);
       // number_mb.click();

      /*  Actions actions = new Actions(driver);
        actions.moveToElement(download_limit);
        actions.click();
        actions.sendKeys("3");
        actions.build().perform();
        Thread.sleep(5000);
      //  download_limit.sendKeys("3");*/

       // type_mb.click();

      //  Type_MB.click();

    }
}
