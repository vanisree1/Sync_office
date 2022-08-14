package Master_GuestUser_page;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_designation {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String middle_name = Utilities_class.randomalphabet(5);
    public String number = Utilities_class.randomnemeric(3);
    public String mobilenumber = Utilities_class.randomnemeric(10);

    public Add_designation(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//*[text()=\"Designation\"]")
    WebElement designation;
    //*[text()="developer_board"]
    //  (//*[text()="keyboard_arrow_right"])
    @FindBy(xpath = "//*[text()=\"gesture\"]")
    WebElement genral;
    @FindBy(xpath = "(//*[text()=\"keyboard_arrow_right\"])")
    WebElement arrorw;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement box;
    @FindBy(xpath = "(//*[text()=\"add\"])[2]")
    WebElement add;
    @FindBy(xpath = "(//*[text()=\"add\"])[5]")
    WebElement add1;
    @FindBy(xpath = "(//*[text()=\"add\"])[7]")
    WebElement add2;
    @FindBy(xpath = "//*[@name=\"name\"]")
    WebElement Designation;
    @FindBy(xpath = "(//*[@name=\"description\"])[3]")
    WebElement description;
    @FindBy(xpath = "//*[text()=\"Designations\"]")
    WebElement desi_name;
    @FindBy(xpath = "(//*[@type=\"text\"])[4]")
    WebElement decription1;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement save;

    @FindBy(xpath = "(//*[@type=\"text\"])[3]")
    WebElement search;
    //*[@name="overhead"]
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/input")
    WebElement search1;
    @FindBy(xpath="(//*[text()=\"remove_circle\"])[2]")
    WebElement delete;
    @FindBy(xpath="(//*[contains(text(),'Remove')])")
    WebElement delete_popup;
    @FindBy(xpath="//*[text()=\"Remove\"]")
    WebElement remove;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[1]/div[3]/button/span[1]/span")
    WebElement close_type;
    public void Desiganation( ) throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Actions actions =new Actions(driver);
        // WebElement closeMenuOption = driver.findElement(By.xpath("//*[text()=\"Company\"]"));
        actions.moveToElement(genral).perform();
        Thread.sleep(4000);
        add.click();
        Thread.sleep(4000);

        designation.click();
        Thread.sleep(4000);

        actions.moveToElement(desi_name).perform();

       // add1.click();
        Thread.sleep(4000);
        executor.executeScript("arguments[0].click();", add1);
        Thread.sleep(4000);

        add2.click();
        //executor.executeScript("arguments[0].click();", add2);

        Thread.sleep(4000);

        Designation.sendKeys(random_name);
        Thread.sleep(4000);

        description.sendKeys(random_Second_name+number);
        Thread.sleep(4000);

//box.click();
        save.click();
        Thread.sleep(8000);

        close_type.click();
        Thread.sleep(6000);

        if (search.isDisplayed()) {
            Thread.sleep(4000);
            search.sendKeys(number);
            driver.findElement(By.xpath("//*[text()=\"filter_list\"]")).click();
            Thread.sleep(5000);


            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/span/span/span[1]/input")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("(//*[text()=\"save\"])[2]")).click();
            Thread.sleep(5000);
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()=\"edit\"]")).click();
            Thread.sleep(4000);


            decription1.clear();
            Thread.sleep(6000);

            decription1.sendKeys(random_name);
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
            Thread.sleep(4000);



            System.out.println(" New User successfully added in Guest User");
            Thread.sleep(4000);
            delete.click();
            Thread.sleep(4000);
            delete_popup.click();
            System.out.println(" New User successfully Deleted in Guest User");
        } else {
            System.out.println(" New User not added in Guest User");
        }
    }

    }

//*[text()="Department"]



