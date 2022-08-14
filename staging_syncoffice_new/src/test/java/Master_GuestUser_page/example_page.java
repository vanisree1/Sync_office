package Master_GuestUser_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Utilities_class;

public class example_page {
    public WebDriver driver;

    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String number = Utilities_class.randomnemeric(3);


    public example_page(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath="//*[text()='text']")
    WebElement delete;
    @FindBy(xpath="")
    WebElement dlt_2;
    @FindBy(xpath = "")
    WebElement drop_down;





    public void sarikamishras() {
delete.click();
    dlt_2.sendKeys();}
}
