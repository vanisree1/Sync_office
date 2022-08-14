package Master_Roles_and_Permission_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class Staff_permission {
    public WebDriver driver;

    public Staff_permission(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "(//*[text()=\"keyboard_arrow_right\"])[5]")
    WebElement permission;
    //   @FindBy(xpath = "//*[@type=\"text\"]")
    WebElement text;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[5]")
    WebElement box;
    @FindBy(xpath = "//*[text()=\"EY\"]")
    WebElement Ey;
    @FindBy(xpath = "//*[text()=\"All\"]")
    WebElement All;
    @FindBy(xpath = "//*[text()=\"EY\"]")
    WebElement Eay;
    @FindBy(xpath = "//*[text()=\"Staff Permission\"]")
    WebElement staff_permission;
    @FindBy(xpath = "//*[text()=\"Submit\"]")
    WebElement submit;

    public void setPermission() throws InterruptedException {
        Thread.sleep(3000);

        permission.click();
        Thread.sleep(3000);

    }

    public void setText() throws InterruptedException {
       // lcd.click();
        System.out.println("permission");
       // staff_permission.click();
        Thread.sleep(3000);
        // text1.sendKeys("Ey");
    //    JavascriptExecutor js = (JavascriptExecutor) driver;

      //  js.executeScript("arguments[0].scrollIntoView();", Ey);
        //Thread.sleep(6000);

      // Ey.click();
      //  Thread.sleep(3000);

      //  All.click();
      //  box.click();
        //Thread.sleep(5000);

        Random random = new Random();
        int a = random.nextInt(3);
        System.out.println(a);
        driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[" + (a + 1) + "]")).click();
        Thread.sleep(5000);
driver.findElement(By.xpath("//*[text()=\"Download\"]")).click();
        Thread.sleep(5000);

        submit.click();
        Thread.sleep(3000);
        //    lcd.click();
    }

    public void setBox() throws InterruptedException
    {



    }
    }
