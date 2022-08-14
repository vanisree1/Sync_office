package Account_Reconciliation_page;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cost_center_page {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(5);


    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div/div/div[1]/div[3]/button/span[1]/span")
    WebElement clear;
    @FindBy(xpath = "//*[text()=\"business\"]")
    WebElement cost;
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
    @FindBy(xpath = "(//*[@type=\"text\"])[3]")
    WebElement search;
    @FindBy(xpath = "//*[@name=\"code\"]")
    WebElement cd;
    @FindBy(xpath="(//*[text()=\"delete\"])[3]")
    WebElement delete;
    @FindBy(xpath="(//*[text()=\"delete\"])[5]")
    WebElement dlt_2;


    public Cost_center_page(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }




    public void setCost() throws InterruptedException {
        Thread.sleep(8000);

        cost.click();
    }

    public void setAdd( ) throws InterruptedException {
        Thread.sleep(6000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", add);




        Thread.sleep(6000);
       // JavascriptExecutor js = (JavascriptExecutor)driver;
      //  js.executeScript("arguments[0].value=number;", Code1);
        Code1.sendKeys(number);
        Thread.sleep(6000);


    }



    public void setDecription( ) throws InterruptedException {

        decription.sendKeys(number);
        Thread.sleep(6000);

    }

    public void setRemark() throws InterruptedException {
        remark.sendKeys(random_Second_name);
        Thread.sleep(6000);

    }

    public void setSave() throws InterruptedException {
      //  save.click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", save);
        Thread.sleep(6000);

    }

    public void setSearch() throws InterruptedException {
       // search.sendKeys(number);
        if (search.isDisplayed()) {
            Thread.sleep(6000);
          //search.sendKeys(number);
            driver.findElement(By.xpath("(//*[text()=\"edit\"])[2]")).click();
            Thread.sleep(4000);


            decription.clear();
            Thread.sleep(6000);

            decription.sendKeys(random_name);
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
          //  Thread.sleep(8000);
            //clear.click();
            Thread.sleep(4000);

           // cost.click();
            Thread.sleep(4000);

         //   search.sendKeys(number);

            // select.sendKeys(random_name);
            System.out.println(" New User successfully added in cost center");
            Thread.sleep(6000);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", delete);
            Thread.sleep(8000);
            executor.executeScript("arguments[0].click();", dlt_2);

           // dlt_2.click();
            Thread.sleep(8000);

            //  driver.close();
            System.out.println(" New User successfully Deleted in cost center");
        } else {
            System.out.println(" New User not added in cost center");
        }

    }


}
