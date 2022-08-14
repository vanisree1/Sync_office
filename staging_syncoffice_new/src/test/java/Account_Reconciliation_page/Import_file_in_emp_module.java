package Account_Reconciliation_page;

import Utilities.Utilities_class;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Import_file_in_emp_module {
    public WebDriver driver;
    public String random_num= Utilities_class.randomnemeric(6);
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(9);
    public Import_file_in_emp_module(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//*[text()=\"people_outline\"]")
    WebElement emp;
    @FindBy(xpath="//*[text()=\"settings\"]")
    WebElement setting;
    @FindBy(xpath="//*[text()=\"Score\"]")
    WebElement score;
    @FindBy(xpath="//body/div[4]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]/span[1]")
    WebElement cloud;
    @FindBy(xpath="    //*[@type=\"checkbox\"]\n")
    WebElement checkbox;
    @FindBy(xpath="(//*[@type=\"checkbox\"])[3]")
    WebElement selct_box;
    @FindBy(xpath="//*[text()=\">\"]")
    WebElement arrow;
    @FindBy(xpath="(//*[@type=\"checkbox\"])[5]")
    WebElement nextselect;
    @FindBy(xpath="(//*[@type=\"checkbox\"])[7]")
    WebElement modify;
    @FindBy(xpath="(//*[@type=\"text\"])[5]")
    WebElement search;
    @FindBy(xpath="//*[text()=\"PDF\"]")
    WebElement pdf;
    @FindBy(xpath = "//*[text()=\"people_outline\"]")
    WebElement mouse;
    @FindBy(xpath="    //*[text()=\"Download & Save Template\"]\n")
    WebElement save_template;
    @FindBy(xpath="//*[text()=\"Excel\"]")
    WebElement excel;
    //(//*[text()="Download"])[3]
    @FindBy(xpath="(//*[text()=\"Download\"])[3]")
    WebElement doenload;
    @FindBy(xpath="(//*[text()=\"Download\"])[4]\n")
    WebElement doenload1;
    public void setemp() throws InterruptedException {
        Actions ac = new Actions(driver);
        ac.moveToElement(mouse).build().perform();
        mouse.click();
        Thread.sleep(10000);
        System.out.println("sarika");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", cloud);

        //cloud.isDisplayed();
        System.out.println("ika");
      //  cloud.click();


        Actions actions = new Actions(driver);

        actions.moveToElement(cloud).click().perform();

    }

    public void setCloud() throws InterruptedException {

        System.out.println("sarika");
        Thread.sleep(8000);

        //  search.sendKeys("sarika");
      //  checkbox.click();

        cloud.click();
        Thread.sleep(6000);
        selct_box.click();
        Thread.sleep(4000);
        arrow.click();
        Thread.sleep(4000);

        nextselect.click();
        Thread.sleep(4000);

        modify.click();
        Thread.sleep(4000);
        Thread.sleep(7000);

        doenload.click();
        // doenload1.click();
        Thread.sleep(4000);
        excel.click();
        Thread.sleep(4000);

    }
}
