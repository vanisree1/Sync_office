package Master_GuestUser_page;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Individual_Reminder_page {

    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String number = Utilities_class.randomnemeric(3);


    public Individual_Reminder_page(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath="(//*[text()=\"delete\"])[2]")
    WebElement delete;
    @FindBy(xpath="(//span[contains(text(),'Delete')])[2]")
    WebElement dlt_2;
    @FindBy(xpath = "(//*[@class=\" mdc-select__dropdown-icon mr-2\"])[1]")
    WebElement drop_down;
    @FindBy(xpath = "(//*[text()=\"add\"])[5]")
    WebElement add;
    @FindBy(xpath = "(//*[@type=\"text\"])[2]")
    WebElement search;
    @FindBy(xpath = "//*[text()=\"HH:MM\"]\n")
    WebElement HH_MM;
    @FindBy(xpath = "(//*[text()=\"Individual Reminder\"])[2]")
    WebElement Individual;
    @FindBy(xpath = "//div[contains(text(),'EY')]")
    WebElement ibm;
    @FindBy(xpath = "(//*[text()=\"save\"])")
    WebElement save;
    @FindBy(xpath = "(//*[text()=\"Individual Reminder\"])")
    WebElement Individual_Reminder;
    @FindBy(xpath = "//*[text()=\"00\"]\n")
    WebElement time;
    @FindBy(xpath = "//*[text()=\"5\"]")
    WebElement mint;
    @FindBy(xpath = "//*[text()=\"Done\"]")
    WebElement done;
    @FindBy(xpath = "(//*[@type=\"text\"])[4]")
    WebElement EditREmanider_task;



    @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[4]")
    WebElement DATE;
    @FindBy(xpath="(//*[text()=\"1\"])[1]")
    WebElement lc_5;
    @FindBy(xpath = "(//*[@type=\"text\" ])[5]")
    WebElement REmanider_task;

    @FindBy(xpath = "(//*[@type=\"text\" ])[6]")
    WebElement description;
    @FindBy(xpath = "//*[text()=\"Every Day\"]")
    WebElement every_day;
    @FindBy(xpath = "//*[text()=\"Mail\"]")
    WebElement mail;
    @FindBy(xpath = "//*[text()=\"Select...\"]")
    WebElement select;
    public void setDrop_down( ) throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Thread.sleep(4000);


        executor.executeScript("arguments[0].click();", Individual_Reminder);
        Thread.sleep(4000);
        executor.executeScript("arguments[0].click();", add);
        Thread.sleep(4000);
        DATE.click();
        Thread.sleep(4000);
        lc_5.click();
        Thread.sleep(4000);

        REmanider_task.sendKeys(random_name);
        Thread.sleep(4000);

        description.sendKeys(random_Second_name+number);
       // executor.executeScript("arguments[0].click();", lc_5);

HH_MM.click();
        Thread.sleep(3000);

        Actions actions =new Actions(driver);

        Thread.sleep(3000);
time.click();
        Thread.sleep(3000);

time.click();
        Thread.sleep(3000);

        mint.click();
        Thread.sleep(3000);
done.click();
        Thread.sleep(3000);
select.click();
        Thread.sleep(3000);

ibm.click();
        Thread.sleep(3000);
        Individual.click();
        Thread.sleep(3000);

        select.click();
        Thread.sleep(3000);

        every_day.click();
        Thread.sleep(3000);

        select.click();
        Thread.sleep(3000);

        mail.click();
        Thread.sleep(3000);

        save.click();
        Thread.sleep(4000);


        if (search.isDisplayed()) {
            Thread.sleep(4000);
            search.sendKeys(number);
            driver.findElement(By.xpath("//*[text()=\"edit\"]")).click();
            Thread.sleep(4000);


            REmanider_task.clear();
            Thread.sleep(6000);

            REmanider_task.sendKeys(random_name);
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
            Thread.sleep(4000);

          //  search.clear();
         //   Thread.sleep(4000);
          //  search.clear();
          //  search.sendKeys(number);
            System.out.println(" New User successfully added in Group Reminder");
            Thread.sleep(4000);
            delete.click();
            Thread.sleep(4000);
            dlt_2.click();
            System.out.println(" New User successfully Deleted in Group Reminder");
        } else {
            System.out.println(" New User not added in Cost center");
        }


    }
}
