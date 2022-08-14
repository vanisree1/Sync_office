package Master_GuestUser_page;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Guest_user_page {

    public WebDriver driver;
    public String random_first_name =Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(4);

    public Guest_user_page(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="(//*[text()=\"emoji_people\"])[1]")
    WebElement click_on_Guesruser;
    @FindBy(xpath="(//*[text()=\"Guest User\"])[2]")
    WebElement click_on_Sub_Guesruser;
    @FindBy(xpath="(//*[text()=\"Guest User\"])[3]")
    WebElement guset_user_page;
    @FindBy(xpath="(//*[text()=\"add\"])[5]")
    WebElement click_on_add_button;
    @FindBy(xpath="//*[@name=\"firstname\"]")
    WebElement first_name;
    @FindBy(xpath="//*[@name=\"lastname\"]")
    WebElement Last_name;
    @FindBy(xpath="//*[@type=\"tel\"]")
    WebElement mobile_number;
    @FindBy(xpath="(//*[@name=\"username\"])")
    WebElement email;
    @FindBy(xpath="//*[@name=\"company_name\"]")
    WebElement Company_name;
    @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[4]")
    WebElement Login_from;
    @FindBy(xpath="(//*[text()=\"5\"])[1]")
    WebElement sae;
    @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[5]")
    WebElement Login_to;
    @FindBy(xpath="(//p[contains(text(),'28')])[2]")
    WebElement date;
    @FindBy(xpath="//*[text()=\"save\"]")
    WebElement save;
    @FindBy(xpath="(//*[text()=\"Guest User\"])[2]")
    WebElement guestuser;
    @FindBy(xpath="(//*[@ type=\"text\"])[3]")
    WebElement search;
    @FindBy(xpath="(//*[text()=\"delete\"])[2]")
    WebElement delete;
    @FindBy(xpath="(//*[contains(text(),'Delete')])[3]")
    WebElement delete_popup;
    @FindBy(xpath="(//*[text()=\"close\"])[3]")
    WebElement close;

    public void setClick_on_Guesruser() throws InterruptedException {
        Thread.sleep(3000);

        click_on_Guesruser.click();
        Thread.sleep(3000);
    }

    public void setClick_on_Sub_Guesruser() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", click_on_Sub_Guesruser);
       // click_on_Sub_Guesruser.click();
        System.out.println("Sub Module clicked");
    }

    public void setGuset_user_page() throws InterruptedException {
        Thread.sleep(5000);
        Actions actions =new Actions(driver);
        actions.moveToElement(guestuser).perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Mouse hover on 'Register' from Menu");
        Thread.sleep(2000);
        guestuser.isDisplayed();
        actions.moveToElement(guset_user_page).perform();

        System.out.println(guset_user_page.getText());
        Thread.sleep(2000);

        if(guset_user_page.getText().equalsIgnoreCase("Guest User")){
            System.out.println("Guest user displayed");
        }

    }

    public void setClick_on_add_button() throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", click_on_add_button);
       // click_on_add_button.click();
        System.out.println("Click on add button");
        Thread.sleep(5000);
    }

    public void set_Mandatory_field() throws InterruptedException {

        first_name.sendKeys(random_first_name);
        System.out.println("Enter First name");
        Thread.sleep(2000);
        Last_name.sendKeys(random_Second_name);
        System.out.println("Enter last name");
        Thread.sleep(2000);
        mobile_number.sendKeys("9" + Utilities_class.randomnemeric(9));
        System.out.println("Enter Mobile Number");
        Thread.sleep(2000);
        Company_name.sendKeys(Utilities_class.randomalphabet(6)+number);
        System.out.println("Enter Company Name");
        Thread.sleep(2000);
        email.sendKeys(random_first_name+"@gmail.com");
        System.out.println("Enter email address");
        Thread.sleep(3000);
        Login_from.click();
        Thread.sleep(3000);
        sae.click();
      //  Login_from.sendKeys(Base_Class.before_date());
        System.out.println("Enter Login From date");
        Thread.sleep(2000);
      //  sae.click();
        Login_to.click();
        Thread.sleep(5000);
        date.click();
    //    Login_to.sendKeys(Base_Class.current_date());
        Thread.sleep(2000);
        save.click();
        Thread.sleep(6000);
        //close.click();
      //  Thread.sleep(8000);

        if (search.isDisplayed()) {
            Thread.sleep(3000);
            search.sendKeys(number);
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[text()=\"filter_list\"]")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/span/span/span[1]/input")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("(//*[text()=\"save\"])[2]")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("//*[text()=\"edit\"]")).click();
            Thread.sleep(4000);


            first_name.clear();
            Thread.sleep(6000);

            first_name.sendKeys(random_Second_name);
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
            Thread.sleep(4000);

           // search.clear();
            //Thread.sleep(4000);

           // search.sendKeys(number);
            Thread.sleep(4000);
            // select.sendKeys(random_name);
            System.out.println(" New User successfully added in Guest User");
           // Thread.sleep(8000);
            delete.click();
            Thread.sleep(2000);
            delete_popup.click();
            System.out.println(" New User successfully Deleted in Guest User");
        } else {
            System.out.println(" New User not added in Guest User");
        }

    }


}
