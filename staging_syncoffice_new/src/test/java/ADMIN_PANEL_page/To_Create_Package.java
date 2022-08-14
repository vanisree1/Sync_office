package ADMIN_PANEL_page;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class To_Create_Package {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String random__name = Utilities_class.randomalphabet(5);
    public String Second_name = Utilities_class.randomalphabet(5);
    public String number = Utilities_class.randomnemeric(2);
    public String number1 = Utilities_class.randomnemeric(1);

    public String number2 = Utilities_class.randomnemeric(3);

            public To_Create_Package(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[text()=\"Package Create\"]")
    WebElement Package_Create;
    @FindBy(xpath = "//header/div[1]/div[1]/div[2]/a[1]/i[1]")
    WebElement Add_package;
    @FindBy(xpath = "    //*[@type=\"radio\"]\n")
    WebElement radio_button;
    @FindBy(xpath = "    //*[@name=\"package_name\"]\n")
    WebElement package_name;
    @FindBy(xpath = "//*[@name=\"price_per_user\"]")
    WebElement price_per_user;
    @FindBy(xpath = "//*[@name=\"free_guest_user\"]")
    WebElement free_guest_user;
    @FindBy(xpath = "//*[@name=\"space_peruser_value\"]")
    WebElement space_peruser_value;
    @FindBy(xpath = "//*[@name=\"file_upload_limit_value\"]")
    WebElement file_upload_limit_value;
    @FindBy(xpath = "//*[@name=\"packet_size_value\"]")
    WebElement packet_size_value;
    @FindBy(xpath = "//*[@value=\"Submit\"]")
    WebElement submit;
    @FindBy(xpath = "//Select[@name=\"space_peruser\"]")
    WebElement select_usr;
    @FindBy(xpath = "//Select[@name=\"file_upload_limit\"]")
    WebElement file_upload_limit;
    @FindBy(xpath = "//Select[@name=\"packet_size\"]")
    WebElement packet_size;
    @FindBy(xpath = "(//*[text()=\"OK\"])[1]")
    WebElement ok;
    @FindBy(xpath = "(//*[@type=\"radio\"])[2]")
    WebElement radio_cloud;
    @FindBy(xpath = "(//*[@type=\"radio\"])[2]")
    WebElement radio;
    @FindBy(xpath="//*[@id=\"create_license\"]")
    WebElement submit12;
    //*[@name="package_name"]
    public void setAdd_package() throws InterruptedException {

        Package_Create.click();
        Thread.sleep(4000);

        Add_package.click();
        Thread.sleep(4000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        Random random = new Random();
        int a = random.nextInt(3);
        System.out.println(a);
        //
        Thread.sleep(4000);
       // js.executeScript("arguments[0].scrollIntoView();", candy_clock);
        Thread.sleep(4000);
        radio_cloud.click();
        // driver.findElement(By.xpath("(//*[@type=\"radio\"])[" + (a + 1) + "]")).click();
        Thread.sleep(4000);

        package_name.sendKeys(random__name);
        Thread.sleep(4000);

        price_per_user.sendKeys(number);
        Thread.sleep(4000);

        free_guest_user.sendKeys(number);
        Thread.sleep(4000);

        space_peruser_value.sendKeys(number2);
        Thread.sleep(4000);

        file_upload_limit_value.sendKeys(number1);
        Thread.sleep(4000);

        packet_size_value.sendKeys(number);
        Thread.sleep(4000);

        Select sc=new Select(select_usr);

        sc.selectByVisibleText("MB");
        Thread.sleep(4000);

        Select sc1=new Select(file_upload_limit);
        Thread.sleep(4000);

        sc1.selectByVisibleText("MB");
        Thread.sleep(4000);

        Select sc2=new Select(packet_size);
        Thread.sleep(4000);

        sc2.selectByVisibleText("MB");
        Thread.sleep(4000);

        Random random1 = new Random();
        int b = random.nextInt(16);
        System.out.println(b);
        Thread.sleep(4000);

        driver.findElement(By.xpath("(//*[@id=\"package_access_cloud\"]//*[@type=\"checkbox\"])[" + (b + 1) + "]")).click();
        Thread.sleep(4000);

submit.click();
        Thread.sleep(1000);

        System.out.println("sarika");
       // ok.click();
        System.out.println("marika");

/*radio.click();
        Thread.sleep(4000);

        int c = random.nextInt(13);
        System.out.println(b);
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//*[@id=\"package_access_clock\"]//*[@type=\"checkbox\"])[" + (b + 1) + "]")).click();
        Thread.sleep(4000);
        System.out.println("mishra");

submit12.click();
System.out.println("sarika");

       // ok.click();*/
}


}


