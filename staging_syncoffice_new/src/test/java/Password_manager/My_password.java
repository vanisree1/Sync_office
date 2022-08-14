package Password_manager;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_password {

    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(7);
    public String number =Utilities_class.randomnemeric(5);


    public My_password(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//*[text()=\"Password Manager\"]")
    WebElement password_manager;
    @FindBy(xpath = "(//*[text()=\"add_circle\"])[1]")
    WebElement add;
    @FindBy(xpath = "//*[@name=\"category_name\"]")
    WebElement name;
    @FindBy(xpath = "//*[@name=\"url\"]")
    WebElement url;
    @FindBy(xpath = "(//*[@name=\"description\" ])[3]")
    WebElement description;
    @FindBy(xpath = "//*[@class=\"MuiBox-root-4094 jss4134 jss4098\"]//span")
    WebElement add_circle;
    @FindBy(xpath = "//*[@name=\"name\"]")
    WebElement name1;
    @FindBy(xpath = "(//*[@name=\"description\"])[4]")
    WebElement dec;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement save;
    @FindBy(xpath = "//*[text()=\"--Select--\"]")
    WebElement select;
    @FindBy(xpath = "(//*[text()=\"TATA\"])[2]")
    WebElement india;
    @FindBy(xpath = "//*[text()=\"--Select--\"]")
    WebElement selet;
    //*[text()="India"]


    public void setPassword_manager() throws InterruptedException {
        Thread.sleep(4000);
        password_manager.click();
        Thread.sleep(8000);

        add.click();
        Thread.sleep(8000);

        name.sendKeys(random_name);
        Thread.sleep(8000);

        url.sendKeys("https://www.syncoffice.com/");
        Thread.sleep(8000);

        description.sendKeys(random_name+random_Second_name);
        Thread.sleep(8000);

     //   add_circle.click();
       // Thread.sleep(8000);

        //name1.sendKeys(random_name);
        //Thread.sleep(4000);

        //dec.sendKeys(random_Second_name);
        //Thread.sleep(8000);
        //save.click();
       // Thread.sleep(4000);

        select.click();
        Thread.sleep(4000);

india.click();
        Thread.sleep(4000);

        save.click();

    }
}
