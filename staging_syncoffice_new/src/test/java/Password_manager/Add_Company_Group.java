package Password_manager;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Company_Group {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String number = Utilities_class.randomnemeric(3);
    public String number1 = Utilities_class.randomnemeric(10);


    public Add_Company_Group(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath="(//*[text()=\"manisha mishra\"])[2]")
    WebElement max;
    @FindBy(xpath="(//*[@type=\"text\"])[7]")
    WebElement overhead;
    @FindBy(xpath = " //*[text()=\"Select...\"]")
    WebElement selct;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[2]")
    WebElement box;
    @FindBy(xpath = "(//*[text()=\"Submit\"])")
    WebElement submit;
    @FindBy(xpath = "(//*[text()=\"how_to_reg\"])")
    WebElement assign_company;
    @FindBy(xpath = "(//*[text()=\"how_to_reg\"])[2]")
    WebElement assign_Client;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h5[1]/div[1]/div[3]/span[1]/button[1]/span[1]/span[1]")
    WebElement add_cir;
    @FindBy(xpath = "(//*[@type=\"text\"])[8]")
    WebElement name;
    @FindBy(xpath = "(//*[@type=\"text\"])[9]")
    WebElement code;
    @FindBy(xpath = "(//*[@type=\"text\"])[11]")
    WebElement address;
    @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[4]")
    WebElement DATE;
    @FindBy(xpath="(//*[text()=\"1\"])[1]")
    WebElement lc_5;
    @FindBy(xpath="(//*[@type=\"text\"])[10]")
    WebElement loc;
    @FindBy(xpath="(//*[@type=\"text\"])[19]")
    WebElement number11;
    @FindBy(xpath="(//*[@type=\"text\"])[13]")
    WebElement pincode;
    @FindBy(xpath="(//*[@type=\"text\"])[17]")

    WebElement mail;
    @FindBy(xpath = "//*[text()=\"Password Manager\"]")
    WebElement password_manager;
    @FindBy(xpath = "(//*[@type=\"text\"])[14]")
    WebElement city;
    @FindBy(xpath = "(//*[text()=\"save\"])")
    WebElement save;
    @FindBy(xpath = "//*[text()=\"Select...\"]\n")
    WebElement select;

    @FindBy(xpath = "//*[text()=\"nisha kar\"]")
    WebElement nisha_kar;

    @FindBy(xpath = "(//*[text()=\"save\"])")
    WebElement sssave;

    @FindBy(xpath = "(//*[text()=\"save\"])")
    WebElement sammve;

    public void setloc() throws InterruptedException {
        password_manager.click();

        Thread.sleep(4000);
    }

    public void setCity( ) throws InterruptedException {
    add_cir.click();
        Thread.sleep(4000);

        DATE.click();
        Thread.sleep(3000);
        lc_5.click();
        Thread.sleep(3000);

        overhead.click();
        Thread.sleep(3000);

        name.sendKeys(random_name);
        Thread.sleep(3000);

        code.sendKeys(number);
        Thread.sleep(3000);

        loc.sendKeys(random_name);
        Thread.sleep(3000);

        address.sendKeys(random_Second_name);
        Thread.sleep(3000);

        pincode.sendKeys("494442");
        Thread.sleep(5000);
        city.click();
        Thread.sleep(5000);
        mail.sendKeys(random_name + "@gmail.com");
        Thread.sleep(3000);



        number11.sendKeys(number1);
        Thread.sleep(3000);
        selct.click();
        Thread.sleep(3000);

        max.click();

        save.click();

    }

    public void setAssign_company() throws InterruptedException {
        Thread.sleep(3000);

        assign_company.click();
        Thread.sleep(3000);

        box.click();
        Thread.sleep(3000);
        select.click();
        Thread.sleep(3000);

        nisha_kar.click();
        Thread.sleep(3000);

        submit.click();
        Thread.sleep(3000);

    }
    public void setAssign_clint() throws InterruptedException {
        Thread.sleep(3000);

        assign_Client.click();
        Thread.sleep(3000);

      //  box.click();
        Thread.sleep(3000);
        select.click();
        Thread.sleep(3000);

        nisha_kar.click();
        Thread.sleep(3000);

        submit.click();
        Thread.sleep(3000);

    }
}
