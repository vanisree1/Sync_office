package Account_Reconciliation_page;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Global_GL_page {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(4);
    public String number1 =Utilities_class.randomnemeric(2);



    public Global_GL_page(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//*[text()=\"language\"]")
    WebElement cost;
    @FindBy(xpath = "/html/body/div[5]/div[3]/div/div[1]/div/div/div[1]/div[3]/button/span[1]/span")
    WebElement clear;
    @FindBy(xpath = "//*[text()=\"add\"]")
    WebElement add;
    @FindBy(xpath = "//*[@name=\"code\"]")
    WebElement Code1;
    @FindBy(xpath = "(//*[@name=\"description\"])[3]")
    WebElement decription;
    @FindBy(xpath = "(//*[@name=\"remarks\"])")
    WebElement remark;
    @FindBy(xpath = "(//*[text()=\"Save\"])")
    WebElement save;
    @FindBy(xpath = "(//*[@type=\"text\"])[5]")
    WebElement search;
    @FindBy(xpath = "(//*[@type=\"text\"])[3]")
    WebElement search1;
    @FindBy(xpath="(//*[text()=\"delete\"])[4]")
    WebElement delete;
    @FindBy(xpath="(//*[text()=\"delete\"])[6]")
    WebElement dlt_2;

    public void setCost() throws InterruptedException {
        Thread.sleep(3000);

        cost.click();
    }

    public void setAdd( ) throws InterruptedException {
        Thread.sleep(4000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", add);
       // add.click();
        Thread.sleep(3000);

    }



    public void setDecription( ) throws InterruptedException {
        Code1.sendKeys(random_name);

        Thread.sleep(4000);

        decription.sendKeys(random_Second_name);
        Thread.sleep(3000);

    }

    public void setRemark() throws InterruptedException {
        remark.sendKeys(random_Second_name);
        Thread.sleep(8000);

    }

    public void setSave() throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", save);
      //  save.click();
        Thread.sleep(8000);

    }

    public void setSearch() throws InterruptedException {
        // search.sendKeys(number);
        if (search1.isDisplayed()) {
            Thread.sleep(5000);
         //   search1.sendKeys(number1);
            Thread.sleep(4000);
            driver.findElement(By.xpath("(//*[text()=\"edit\"])[2]")).click();
            Thread.sleep(4000);


            decription.clear();
            Thread.sleep(6000);

            decription.sendKeys(random_name);
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
            Thread.sleep(4000);
           // clear.click();

            //cost.click();

          //  search.sendKeys(number);
          //  Thread.sleep(4000);

            // select.sendKeys(random_name);
            System.out.println(" New User successfully added in Global Gl");
            Thread.sleep(3000);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", delete);
            Thread.sleep(3000);
           // dlt_2.click();
            executor.executeScript("arguments[0].click();", dlt_2);
            Thread.sleep(3000);

            //  driver.close();
            System.out.println(" New User successfully Deleted in Global Gl");
        } else {
            System.out.println(" New User not added in Global Gl");
        }

    }





}
