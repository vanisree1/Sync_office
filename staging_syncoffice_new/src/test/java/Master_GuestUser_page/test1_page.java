package Master_GuestUser_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Utilities_class;

public class test1_page {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(5);
    public test1_page(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="(//*[text()=\"delete\"])[2]")
    WebElement test_ff;
    @FindBy(xpath="//*[text()=\"delete\"])[2]")
    WebElement test2;
    @FindBy(xpath="//*[text()=\"delete\"])[2]")
    WebElement test3;

    public void setTest2() {
        test2.click();
    }

    public void setTest_ff() {
        test_ff.sendKeys("sarika");
    }

    public void setTest3() {
        test3.sendKeys(random_name);
    }
}
