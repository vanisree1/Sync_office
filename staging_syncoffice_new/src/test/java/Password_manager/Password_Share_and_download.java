package Password_manager;

import Utilities.Utilities_class;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Password_Share_and_download {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String random__name = Utilities_class.randomalphabet(5);
    public String Second_name = Utilities_class.randomalphabet(5);

    public String number = Utilities_class.randomnemeric(3);
    public String number1 = Utilities_class.randomnemeric(10);


    public Password_Share_and_download(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath="(//*[@type=\"text\"])[4]")
    WebElement search;
    @FindBy(xpath = "//*[text()=\"Password Manager\"]")
    WebElement password_manager;
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/ul[1]/div[1]/li[1]/ul[1]/li[1]/div[1]/div[2]/div[1]/button[1]/span[1]/span[1]")
    WebElement share;
    @FindBy(xpath="(//*[@type=\"checkbox\"])[1]")
    WebElement check;
    @FindBy(xpath="//*[text()=\"Download\"]")
    WebElement download;
    @FindBy(xpath="(//*[@type=\"text\"])[6]")
    WebElement EMAIL;
    @FindBy(xpath="//*[text()=\"send\"]")
    WebElement send;
    @FindBy(xpath="//*[@name=\"fee\"]")
    WebElement feekk;


    public void setSearch( ) throws InterruptedException {
        password_manager.click();
        Thread.sleep(4000);
       // search.sendKeys("Sap");
        Thread.sleep(4000);

        share.click();
        Thread.sleep(4000);
check.click();
        Thread.sleep(4000);

        download.click();
        Thread.sleep(8000);
        EMAIL.sendKeys("sarika.mishra@candytechnologies.in");
        Thread.sleep(4000);

        EMAIL.sendKeys(Keys.ENTER);
        Thread.sleep(4000);

send.click();

    }
}
