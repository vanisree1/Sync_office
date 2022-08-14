package Master_GuestUser_page;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Department {

    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String middle_name = Utilities_class.randomalphabet(5);
    public String number = Utilities_class.randomnemeric(3);
    public String mobilenumber = Utilities_class.randomnemeric(10);

    public Add_Department(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "    //*[text()=\"Department\"]\n")
    WebElement department;
    //*[text()="developer_board"]
    //  (//*[text()="keyboard_arrow_right"])
    @FindBy(xpath = "//*[text()=\"gesture\"]")
    WebElement genral;
    @FindBy(xpath = "(//*[text()=\"Confirm\"])[2]")
    WebElement confirm;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement box;
    @FindBy(xpath = "(//*[text()=\"add\"])[2]")
    WebElement add;
    @FindBy(xpath = "(//*[text()=\"add\"])[5]")
    WebElement add1;
    @FindBy(xpath = "(//*[text()=\"add\"])[7]")
    WebElement add_depart;
    @FindBy(xpath = "(//*[@title=\"Add\"])[2]")
    WebElement add2;
    @FindBy(xpath = "(//*[@title=\"Add\"])[7]")
    WebElement add3;
    @FindBy(xpath = "//*[@name=\"name\"]")
    WebElement dept;
    @FindBy(xpath = "(//*[@name=\"description\"])[3]")
    WebElement decription;
    @FindBy(xpath = "(//*[@type=\"text\"])[4]")
    WebElement decription1;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement save;
    @FindBy(xpath = "(//*[text()=\"close\"])[4]\n")
    WebElement close;

    @FindBy(xpath = "(//*[@type=\"text\"])[3]")
    WebElement search;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[1]/div[3]/button/span[1]/span")
    WebElement close_type;
    @FindBy(xpath = "(//*[text()=\"remove_circle\"])[2]")
    WebElement delete;
    @FindBy(xpath = "//*[contains(text(),'Remove')]")
    WebElement delete_popup;


    @FindBy(xpath = "//*[text()=\"Type\"]")
    WebElement Type;
    @FindBy(xpath = "//*[text()=\"Employment Type\"]")
    WebElement Employment_Type;


    @FindBy(xpath = "//*[text()=\"Grade\"]")
    WebElement grade;
    @FindBy(xpath = "//*[text()=\"Grade\"]")
    WebElement Grades;

    public void setDepartment() throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver);
        // WebElement closeMenuOption = driver.findElement(By.xpath("//*[text()=\"Company\"]"));
        actions.moveToElement(genral).perform();
        Thread.sleep(4000);
//add.click();
        executor.executeScript("arguments[0].click();", add);

        Thread.sleep(4000);

        department.click();
        Thread.sleep(4000);
        executor.executeScript("arguments[0].click();", add1);

        //  add1.click();
        Thread.sleep(4000);

        executor.executeScript("arguments[0].click();", add_depart);
        // add3.click();
        Thread.sleep(4000);

        dept.sendKeys(random_name);
        Thread.sleep(4000);

        decription.sendKeys(random_Second_name + number);
        Thread.sleep(4000);
        save.click();
        Thread.sleep(9000);

        close_type.click();
        Thread.sleep(9000);

        if (search.isDisplayed()) {
            Thread.sleep(4000);
            search.sendKeys(number);
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()=\"filter_list\"]")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/span/span/span[1]/input")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("(//*[text()=\"save\"])[2]")).click();
            Thread.sleep(5000);
            //   driver.findElement(By.xpath("(//*[text()=\"Cancel\"])[2]")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[text()=\"edit\"]")).click();
            Thread.sleep(6000);


            decription1.clear();
            Thread.sleep(6000);

            decription1.sendKeys(random_name + number);
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
            Thread.sleep(4000);
//driver.findElement(By.xpath("(//*[text()=\"Confirm\"])[2]")).click();
            System.out.println(" New User successfully added in Department");

           /* department.click();

            Thread.sleep(4000);

            search.sendKeys(number);
            Thread.sleep(4000);
*/

            delete.click();
            Thread.sleep(4000);
            delete_popup.click();
            System.out.println(" New User successfully Deleted in Department");
        } else {
            System.out.println(" New User not added in Department");
        }
    }


    public void setType() throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver);
        // WebElement closeMenuOption = driver.findElement(By.xpath("//*[text()=\"Company\"]"));
        actions.moveToElement(genral).perform();
        Thread.sleep(4000);
//add.click();
        executor.executeScript("arguments[0].click();", add);

        Type.click();
        Thread.sleep(4000);

        Employment_Type.click();
        //  JavascriptExecutor executor = (JavascriptExecutor) driver;
        Thread.sleep(4000);

        executor.executeScript("arguments[0].click();", add1);

        //  add1.click();
        Thread.sleep(4000);

        executor.executeScript("arguments[0].click();", add2);
        // add2.click();
        Thread.sleep(4000);


        dept.sendKeys(random_name);
        Thread.sleep(4000);

        decription.sendKeys(random_Second_name + number);
        Thread.sleep(4000);
        save.click();
        Thread.sleep(10000);

        close_type.click();
        Thread.sleep(7000);

        if (search.isDisplayed()) {
            Thread.sleep(6000);
            search.sendKeys(number);
            driver.findElement(By.xpath("//*[text()=\"filter_list\"]")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/span/span/span[1]/input")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("(//*[text()=\"save\"])[2]")).click();
            Thread.sleep(5000);
            //   driver.findElement(By.xpath("(//*[text()=\"Cancel\"])[2]")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("//*[text()=\"edit\"]")).click();
            Thread.sleep(4000);


            decription1.clear();
            Thread.sleep(6000);

            decription1.sendKeys(random_name);
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
            Thread.sleep(4000);

            System.out.println(" New User successfully added in Department");
            Thread.sleep(4000);



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

    public void setGrade() throws InterruptedException {
        Actions actions = new Actions(driver);
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        // WebElement closeMenuOption = driver.findElement(By.xpath("//*[text()=\"Company\"]"));
        actions.moveToElement(genral).perform();
        Thread.sleep(4000);
//add.click();
        executor.executeScript("arguments[0].click();", add);
        Thread.sleep(4000);

        grade.click();
        Thread.sleep(4000);

     //   Grades.click();
        Thread.sleep(4000);
        executor.executeScript("arguments[0].click();", add1);

        //  add1.click();
        Thread.sleep(4000);

        executor.executeScript("arguments[0].click();", add2);
        // add2.click();
        Thread.sleep(4000);


        dept.sendKeys(random_name);
        Thread.sleep(4000);

        decription.sendKeys(random_Second_name + number);
        Thread.sleep(4000);
        save.click();
        Thread.sleep(9000);

        close_type.click();
        Thread.sleep(9000);

        if (search.isDisplayed()) {
            Thread.sleep(4000);
            search.sendKeys(number);

            driver.findElement(By.xpath("//*[text()=\"filter_list\"]")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/span/span/span[1]/input")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("(//*[text()=\"save\"])[2]")).click();
            Thread.sleep(5000);
         //   driver.findElement(By.xpath("(//*[text()=\"Cancel\"])[2]")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("//*[text()=\"edit\"]")).click();
            Thread.sleep(4000);


            decription1.clear();
            Thread.sleep(6000);

            decription1.sendKeys(random_name );
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
            Thread.sleep(4000);
driver.findElement(By.xpath("(//*[text()=\"Confirm\"])[2]")).click();
            Thread.sleep(5000);
//driver.findElement(By.xpath("(//*[text()=\"Cancel\"])[2]")).click();
          //  Thread.sleep(5000);

            System.out.println(" New User successfully added in Department");
            Thread.sleep(4000);
         //   search.clear();
            //Thread.sleep(4000);


            System.out.println(" New User successfully added in Guest User");
            delete.click();
            Thread.sleep(4000);
            delete_popup.click();
            System.out.println(" New User successfully Deleted in Guest User");
        } else {
            System.out.println(" New User not added in Guest User");


        }


//*[text()="Department"]
    }
}