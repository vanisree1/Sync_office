package Master_GuestUser_page;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bank_Details {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String number = Utilities_class.randomnemeric(12);
    public String number1 = Utilities_class.randomnemeric(3);


    public Bank_Details(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath="(//*[text()=\"delete\"])[2]")
    WebElement delete;
    @FindBy(xpath="(//*[contains(text(),'Delete')])[3]")
    WebElement dlt_2;
    @FindBy(xpath = "//*[text()=\"gesture\"]")
    WebElement genral;
    @FindBy(xpath = "(//*[text()=\"add\"])[1]")
    WebElement add;
    @FindBy(xpath = "(//*[text()=\"add\"])[5]")
    WebElement add_bank;
    @FindBy(xpath = "(//*[@type=\"text\"])[3]")
    WebElement search;
    @FindBy(xpath = "//*[text()=\"Bank Details\"]")
    WebElement bank;
    @FindBy(xpath = "(//*[text()=\"save\"])")
    WebElement save;
    @FindBy(xpath = "//*[@name=\"name\"]")
    WebElement bank_name;
    @FindBy(xpath = "//*[@name=\"branch\"]")
    WebElement branch;
    @FindBy(xpath = "//*[@name=\"ifsc\"]")
    WebElement IFSC;
    @FindBy(xpath = "//*[@name=\"account_number\"]")
    WebElement AC;
    @FindBy(xpath = "//*[@name=\"swift_code\"]")
    WebElement code;
    @FindBy(xpath = "(//*[@name=\"description\"])[3]")
    WebElement Edit_decription;
    @FindBy(xpath = "(//*[@type=\"text\"])[3]")
    WebElement baname;

    public void setGenral() {
        Actions actions =new Actions(driver);
       // WebElement closeMenuOption = driver.findElement(By.xpath("//*[text()=\"Company\"]"));
        actions.moveToElement(genral).perform();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
   //     executor.executeScript("arguments[0].click();", genral);
    }

    public void setadd( ) throws InterruptedException {
        Thread.sleep(4000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", add);
        Thread.sleep(4000);

      //  executor.executeScript("arguments[0].click();", add_bank);
      //  executor.executeScript("arguments[0].click();", add_bank);


    }

    public void setBank() throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", bank);
        Thread.sleep(4000);
         executor.executeScript("arguments[0].click();", add_bank);

    }

    public void setBank_name( ) {
bank_name.sendKeys("SBI");
    }

    public void setBranch( ) {
        branch.sendKeys("Tokapal");
    }

    public void setIFSC() {
       IFSC.sendKeys("SBIN0005516");
    }

    public void setAC( ) {
        AC.sendKeys(number);
    }

    public void setCode( ) throws InterruptedException {
        code.sendKeys(random_name+number1);
        Thread.sleep(3000);
        Edit_decription.sendKeys(random_name+number1);

        // decription.sendKeys(random_Second_name);
save.click();
        Thread.sleep(8000);


if (search.isDisplayed()) {
        Thread.sleep(8000);

     //   driver.findElement(By.xpath("//*[@title=\"Download\"]")).click();
  //  Thread.sleep(8000);

    search.sendKeys(number1);
    Thread.sleep(6000);
    driver.findElement(By.xpath("//*[text()=\"filter_list\"]")).click();
    Thread.sleep(5000);

    driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/input[1]")).click();
    Thread.sleep(5000);

    driver.findElement(By.xpath("(//*[text()=\"save\"])[2]")).click();
    Thread.sleep(5000);
    Thread.sleep(4000);

    driver.findElement(By.xpath("//*[text()=\"edit\"]")).click();
    Thread.sleep(8000);


    Edit_decription.clear();
    Thread.sleep(6000);

    Edit_decription.sendKeys(random_name+number1);
    Thread.sleep(4000);
    driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
    Thread.sleep(4000);

  // search.clear();
    //Thread.sleep(4000);
    //search.sendKeys(number1);
 //   Edit_decription.clear();
   // Edit_decription.sendKeys(random_name);
        System.out.println(" New User successfully added in Cost center");
        Thread.sleep(8000);
        delete.click();
        Thread.sleep(8000);
        dlt_2.click();
        System.out.println(" New User successfully Deleted in Cost center");
    } else {
        System.out.println(" New User not added in Cost center");
    }


}


}
