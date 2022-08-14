package Account_Reconciliation_page;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gl_category {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number=Utilities_class.randomnemeric(4);
    public Gl_category(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    //*[text()="developer_board"]
    @FindBy(xpath="//*[text()=\"developer_board\"]")
    WebElement mouse_over;
    @FindBy(xpath="")
    WebElement mse;
    @FindBy(xpath="//*[text()=\"GL Category\"]")
    WebElement Gl_category;
    @FindBy(xpath="//*[text()=\"add\"]")
    WebElement add;
    @FindBy(xpath="//*[@name=\"name\"]")
    WebElement name;
    @FindBy(xpath="//*[text()=\"Save\"]")
    WebElement save;
    @FindBy(xpath="(//*[@type=\"text\"])[3]")
    WebElement select;
    @FindBy(xpath="(//*[@name=\"description\"])[3]")
    WebElement decription;
    @FindBy(xpath="(//*[text()=\"GL Account\"])[3]")
    WebElement Gl_page;
    @FindBy(xpath="(//*[text()=\"delete\"])[4]")
    WebElement delete;
    @FindBy(xpath="(//*[text()=\"delete\"])[6]")
    WebElement dlt_2;
    @FindBy(xpath = "/html/body/div[5]/div[3]/div/div[1]/div/div/div[1]/div[3]/button/span[1]/span")
    WebElement clear;
    @FindBy(xpath = "(//*[text()=\"close\"])[3]")
    WebElement close;


    public void setMouse_over() {
        Actions ac=new Actions(driver);
        ac.moveToElement(mouse_over).build().perform();
    }
    public void setGl_page() throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", Gl_category);
      //  Gl_category.click();
        Thread.sleep(5000);
      //  add.click();
        executor.executeScript("arguments[0].click();", add);

    }
    public void  add(){
        add.click();
    }
    public void setName() throws InterruptedException {

        Thread.sleep(5000);
        name.sendKeys(random_name);
        Thread.sleep(5000);
        decription.sendKeys(random_name);
        Thread.sleep(5000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        executor.executeScript("arguments[0].click();", save);
     //   close.click();

     //   mouse_over.click();
        Thread.sleep(4000);


        if (select.isDisplayed()) {
            Thread.sleep(4000);
//            select.sendKeys(number);
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()=\"edit\"]")).click();
            Thread.sleep(4000);


            decription.clear();
            Thread.sleep(3000);

            decription.sendKeys(random_name);
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
            Thread.sleep(4000);
           // clear.click();
            Thread.sleep(4000);

            //mouse_over.click();
            //Thread.sleep(4000);

            //select.sendKeys(number);

            // select.sendKeys(random_name);
            System.out.println(" New User successfully added in Gl category");
            Thread.sleep(4000);
            delete.click();
            Thread.sleep(4000);
            dlt_2.click();
            Thread.sleep(8000);

          //  driver.close();
            System.out.println(" New User successfully Deleted in Gl category");
        } else {
            System.out.println(" New User not added in Gl category");
        }

    }

    }

