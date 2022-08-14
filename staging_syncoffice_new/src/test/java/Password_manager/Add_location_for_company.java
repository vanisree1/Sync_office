package Password_manager;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_location_for_company {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String random__name = Utilities_class.randomalphabet(5);
    public String Second_name = Utilities_class.randomalphabet(5);
    public String number = Utilities_class.randomnemeric(3);
    public String number1 = Utilities_class.randomnemeric(10);


    public Add_location_for_company(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "(//*[text()=\"save\"])")
    WebElement save;
    @FindBy(xpath="//*[text()=\"Admin\"]")
    WebElement admin;
    @FindBy(xpath="//*[@ name=\"email\"]")
    WebElement email;

    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/ul[1]/div[1]/li[1]/ul[1]/li[1]/div[1]/div[2]/div[2]/button[1]/span[1]/span[1]")
    WebElement add_circle;

    @FindBy(xpath="//*[text()=\"Select...\"]")
    WebElement selct_add;
    @FindBy(xpath="//*[@name=\"address1\"]")
    WebElement adrres_add;
    @FindBy(xpath="//*[@name=\"pincode\"]")
    WebElement pincode2;
    @FindBy(xpath="//*[@name=\"city\"]")
    WebElement city_add;
    @FindBy(xpath="//*[text()=\"Select...\"]")
    WebElement selcet_dept;
    @FindBy(xpath="//*[text()=\"Administration\"]")
    WebElement adminstration_add;
    @FindBy(xpath="(//*[@type=\"text\"])[4]")
    WebElement search;
    @FindBy(xpath="(//*[text()=\"Sarika Mishra\"])[3]")
    WebElement maxx;
    @FindBy(xpath="//*[@name=\"name\" ]")
    WebElement name;
//(//*[ @class="material-icons MuiIcon-root-2355 MuiIcon-fontSizeSmall-2362"])[2]






    public void setAdd_cir() throws InterruptedException {
        //   password_manager.click();

        Thread.sleep(5000);



        add_circle.click();
        Thread.sleep(9000);



        selct_add.click();
        Thread.sleep(5000);

        maxx.click();
        Thread.sleep(3000);

       // selcet_dept.click();
        Thread.sleep(3000);

        //adminstration_add.click();
        Thread.sleep(3000);
        name.sendKeys(random_name);
        Thread.sleep(4000);
        adrres_add.sendKeys(random_name);
        Thread.sleep(3000);

        pincode2.sendKeys("494442");
        Thread.sleep(3000);

        city_add.click();
        Thread.sleep(9000);

        email.sendKeys("damawalemidc@gmail.com");
        Thread.sleep(3000);

        save.click();
    }
}
