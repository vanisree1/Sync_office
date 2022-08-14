package Password_manager;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_password_on_myPassword {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(4);
    public String number =Utilities_class.randomnemeric(5);
    public String number1 =Utilities_class.randomnemeric(10);


    public Add_password_on_myPassword(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//*[text()=\"Password Manager\"]")
    WebElement password_manager;
    @FindBy(xpath = "(//*[@type=\"text\"])[2]")
    WebElement search;
    @FindBy(xpath = "(//*[text()=\"add_circle\"])[2]")
    WebElement add_circle;
    @FindBy(xpath = "(//*[@ name=\"name\" ])")
    WebElement name;
    @FindBy(xpath = "(//*[@name=\"user_id\"  ])")
    WebElement usr_id;
    @FindBy(xpath = "(//*[@name=\"password\"])")
    WebElement password;
    @FindBy(xpath = "(//*[@type=\"tel\" ])")
    WebElement phone;
    @FindBy(xpath = "(//*[@name=\"description\"])[3]")
    WebElement remark;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement save;
    @FindBy(xpath = "(//*[@type=\"text\" ])[12]")
    WebElement domain;
    @FindBy(xpath = "(//*[text()=\"visibility\"])[1]")
    WebElement view;
    @FindBy(xpath = "(//*[text()=\"Delete\"])[1]")
    WebElement dlt;
    @FindBy(xpath = "(//*[text()=\"Delete\"])[3]")
    WebElement dlt1;
    //*[text()="India"]


    public void setAdd_circle() throws InterruptedException {
        search.sendKeys("sarika");
        Thread.sleep(3000);
        add_circle.click();
        Thread.sleep(3000);

        name.sendKeys("manisha");
        Thread.sleep(3000);

        usr_id.sendKeys(number);
        Thread.sleep(3000);

        password.sendKeys(random_Second_name+"@15");
        Thread.sleep(3000);

        phone.sendKeys(number1);
        Thread.sleep(3000);


        remark.sendKeys(random_name);
        Thread.sleep(3000);

       // domain.sendKeys(random_Second_name);
        Thread.sleep(3000);

        save.click();

        Thread.sleep(8000);
        search.clear();

search.sendKeys("manisha");
        Thread.sleep(5000);


view.click();
        Thread.sleep(5000);

dlt.click();
        Thread.sleep(5000);

dlt1.click();
    }
}
