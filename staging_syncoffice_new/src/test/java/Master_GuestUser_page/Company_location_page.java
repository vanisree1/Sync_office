package Master_GuestUser_page;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Company_location_page {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String number = Utilities_class.randomnemeric(3);
    public String number1 = Utilities_class.randomnemeric(6);


    public Company_location_page(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "(//*[text()=\"delete\"])[2]")
    WebElement delete;
    @FindBy(xpath = "(//span[contains(text(),'Delete')])[2]")
    WebElement dlt_2;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/div/div[2]/div/div[3]/div/div/div[1]/div[4]/div/span/div/div[3]/div/span/button/span[1]/span")
    WebElement dlt_company;
    @FindBy(xpath = "(//*[text()=\"Delete\"])[5]")
    WebElement dlt_group2;
    @FindBy(xpath = "(//*[text()=\"add\"])[6]")
    WebElement add;
    @FindBy(xpath = "(//*[text()=\"add\"])[8]")
    WebElement add_company_view;
    @FindBy(xpath = "(//*[text()=\"add\"])[7]")
    WebElement add_company;
    @FindBy(xpath = "(//*[@type=\"text\" ])[3]")
    WebElement search;
    @FindBy(xpath = "(//*[@type=\"text\" ])[6]")
    WebElement search_group_company;
    @FindBy(xpath = "(//*[@type=\"text\" ])[13]")
    WebElement edit_number;

    @FindBy(xpath = "(//*[contains(text(),'manisha mishra')])[3]")
    WebElement name;
    @FindBy(xpath = "//*[text()=\"Select...\"]")
    WebElement select;
    @FindBy(xpath = "//*[@name=\"name\"]")
    WebElement loc;
    @FindBy(xpath = "//*[@name=\"address1\"]")
    WebElement address;
    @FindBy(xpath = "//*[@name=\"pincode\"]")
    WebElement pincode;
    @FindBy(xpath = "//*[@name=\"email\"]")


    WebElement mail;
    @FindBy(xpath = "//*[@name=\"city\"]")
    WebElement city;
    @FindBy(xpath = "(//*[text()=\"save\"])")
    WebElement save;





    //company

    @FindBy(xpath = "//*[text()=\"Excel\"]")
    WebElement excel;

    @FindBy(xpath = "(//*[text()=\"visibility\"])[1]")
    WebElement view;
    @FindBy(xpath = "(//*[text()=\"Select...\"])")
    WebElement select1;
    @FindBy(xpath = "/html/body/div[9]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/span/span/span[1]/input")
    WebElement checkbox;
    @FindBy(xpath = "(//*[text()=\"filter_list\"])[3]")
    WebElement filter_company;
    @FindBy(xpath = "//*[@name=\"cmpLocName\" ]")
    WebElement company_location;
    @FindBy(xpath = "(//*[@type=\"button\"]//*[@focusable=\"false\"])[5]")
    WebElement DATE;
    @FindBy(xpath = "(//*[text()=\"1\"])[1]")
    WebElement dat_1;
    @FindBy(xpath = "  //*[@name=\"overhead\"]")
    WebElement overload;
    public void setloc() throws InterruptedException {


        add.click();
        Thread.sleep(3000);

        loc.sendKeys(random_Second_name);
        Thread.sleep(3000);

        address.sendKeys(random_name + number);
        Thread.sleep(3000);
        pincode.sendKeys("560102");
        Thread.sleep(5000);

        Actions actions = new Actions(driver);
        actions.moveToElement(city).perform();
        city.isDisplayed();

        Thread.sleep(7000);
        city.click();
        Thread.sleep(7000);

     //   mail.sendKeys(random_name + "@gmail.com");
        Thread.sleep(3000);
        select.click();
        Thread.sleep(4000);

        name.click();
        Thread.sleep(4000);

        save.click();
        Thread.sleep(9000);

        if (search.isDisplayed()) {
            search.sendKeys(number);
            Thread.sleep(6000);
            driver.findElement(By.xpath("//*[text()=\"edit\"]")).click();
            Thread.sleep(6000);

            address.clear();
            address.sendKeys(random_name + number);

            //   decription1.clear();
            Thread.sleep(6000);

            //   decription1.sendKeys(random_name + number);
            // Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
            Thread.sleep(4000);

            // select.sendKeys(random_name);
            System.out.println(" New User successfully added in cost center");
            Thread.sleep(6000);
          //  search.clear();
           // Thread.sleep(4000);

            //search.sendKeys(number);
            System.out.println(" New User successfully added in location");
            Thread.sleep(8000);
            delete.click();
            Thread.sleep(8000);
            dlt_2.click();
            System.out.println(" New User successfully Deleted in location");
        } else {
            System.out.println(" New User not added in location");
        }


    }

    public void setGroup_company() throws InterruptedException {
view.click();
        Thread.sleep(5000);

driver.findElement(By.xpath("(//*[text()=\"All\"])[2]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("(//*[text()=\"Company\"])[3]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("(//*[@type=\"text\"])[6]")).sendKeys("Sar");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()=\"how_to_reg\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@class=\"dx-treeview-toggle-item-visibility\"]")).click();
        Thread.sleep(5000);
driver.findElement(By.xpath("//*[text()=\"Assign Employee\"]")).click();
        Thread.sleep(5000);

        //WebElement select=driver.findElement(By.xpath("//Select[@class=\"mdc-select__native-control customFieldText py-0\"]"));
        //Select sc=new Select(select);
        Thread.sleep(5000);

       // sc.selectByVisibleText("sarika mishra");
        Thread.sleep(5000);

        driver.findElement(By.xpath("(//*[text()=\"save\"])[2]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("(//*[text()=\"close\"])[8]")).click();

        Thread.sleep(3000);

        add_company_view.click();
        Thread.sleep(4000);
DATE.click();
        Thread.sleep(5000);

dat_1.click();
        loc.sendKeys(random_Second_name);
        Thread.sleep(5000);

        address.sendKeys(random_name + number);
        Thread.sleep(5000);
        pincode.sendKeys("560102");
        Thread.sleep(5000);

        Actions actions = new Actions(driver);
      //  actions.moveToElement(city).perform();
       // city.isDisplayed();
       // Thread.sleep(7000);

       // Thread.sleep(7000);
        city.click();
      //  Thread.sleep(7000);

      //  mail.sendKeys(random_name + "@gmail.com");
        Thread.sleep(5000);
        company_location.sendKeys(random_name);
        Thread.sleep(5000);
        overload.sendKeys(number);

        select.click();
        Thread.sleep(4000);

        name.click();
        Thread.sleep(4000);

        save.click();
        Thread.sleep(7000);

        if (search_group_company.isDisplayed()) {
           // search_group_company.sendKeys(number);
            Thread.sleep(6000);
            dlt_company.click();
            Thread.sleep(8000);
            dlt_group2.click();
            Thread.sleep(4000);

            filter_company.click();
            Thread.sleep(4000);

            checkbox.click();
            Thread.sleep(4000);

            save.click();
            Thread.sleep(6000);

            driver.findElement(By.xpath("(//*[text()=\"cloud_download\"])[3]")).click();
            Thread.sleep(6000);

            driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/div/div[1]/div[2]/div/div/div/div/div/div[1]/div/div[1]/div[1]/span/span/span[1]/input")).click();
            Thread.sleep(6000);

            driver.findElement(By.xpath("//*[text()=\">\"]")).click();
            Thread.sleep(6000);

            driver.findElement(By.xpath("//*[text()=\"save_alt\"]")).click();
            Thread.sleep(6000);


driver.findElement(By.xpath("//*[text()=\"Excel\"]")).click();
            Thread.sleep(6000);

          /*  driver.findElement(By.xpath("//body/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/div[1]/span[1]/div[1]/div[2]/div[1]/span[1]/button[1]/span[1]/span[1]")).click();
            Thread.sleep(4000);
            Thread.sleep(4000);
            address.clear();
            address.sendKeys(random_name + number);
            Thread.sleep(6000);


            driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
            Thread.sleep(4000);

            // select.sendKeys(random_name);
            System.out.println(" New User successfully added in cost center");
            Thread.sleep(6000);
            search_group_company.clear();
            Thread.sleep(4000);

            search_group_company.sendKeys(number);
            System.out.println(" New User successfully added in location");*/
            Thread.sleep(8000);

            System.out.println(" New User successfully Deleted in location");
        } else {
            System.out.println(" New User not added in location");
        }


    }
}