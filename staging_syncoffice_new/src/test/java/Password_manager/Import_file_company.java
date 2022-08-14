package Password_manager;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Import_file_company {
    public WebDriver driver;

    public String Second_name = Utilities_class.randomalphabet(5);
    public String number = Utilities_class.randomnemeric(3);
    public String number1 = Utilities_class.randomnemeric(10);


    public Import_file_company(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "(//*[text()=\"visibility\"])[1]")
    WebElement view;
    @FindBy(xpath="//*[text()=\"Import\"]")
    WebElement import_icon;
    @FindBy(xpath="//*[@ type=\"file\"]")
    WebElement upload;
    @FindBy(xpath="//*[text()=\"Download Sample File\"]")
    WebElement download;
    @FindBy(xpath="(//*[text()=\"save\"])[2]\n")
    WebElement save;
    @FindBy(xpath="    (//*[@type=\"text\"])[8]\n")
    WebElement search;
    @FindBy(xpath="    (//*[text()=\"delete\"])\n")
    WebElement dlt;
    @FindBy(xpath="    (//*[text()=\"delete\"])[2]\n")
    WebElement dlt1;
    public void setView( ) throws InterruptedException {
view.click();
Thread.sleep(7000);
    import_icon.click();
        Thread.sleep(7000);

        download.click();
        Thread.sleep(7000);

        upload.sendKeys("/home/lenovo/Downloads/Password_sample.xlsx");
        Thread.sleep(7000);

        save.click();
        Thread.sleep(7000);

    search.sendKeys("gl");
       Thread.sleep(7000);

        dlt.click();
        Thread.sleep(7000);

        dlt1.click();


    }
}
