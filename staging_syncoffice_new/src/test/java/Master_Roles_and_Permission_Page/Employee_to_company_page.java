package Master_Roles_and_Permission_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Employee_to_company_page {
    public WebDriver driver;

    public Employee_to_company_page(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "(//*[text()=\"keyboard_arrow_right\"])[2]")
    WebElement Employee_to_Company ;
    @FindBy(xpath = "//*[@type=\"checkbox\"][1]")
    WebElement All_emp;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[3]/div/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/div/span/span/span[1]")
    WebElement All_company;
    @FindBy(xpath = "//*[text()=\"Submit\"]")
    WebElement submit;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[2]")
    WebElement one_emp;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/input[1]")
    WebElement one_company;

    public void setEmployee_to_Company() throws InterruptedException {
        Thread.sleep(2000);
        Employee_to_Company.click();
    }

    public void setAll_emp() throws InterruptedException {
        Actions actions =new Actions(driver);
       // WebElement closeMenuOption = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/span[1]/span[1]/span[1]/input[1]"));
        actions.moveToElement(All_emp).perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Mouse hover on 'Register' from Menu");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[text()=\"Download\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@type=\"checkbox\"][1]")).click();
        System.out.println("Click on Employee");
        All_company.click();
        submit.click();

    }
    public void setAll_company() throws InterruptedException {
        //All_emp.click();
        Thread.sleep(8000);

       // All_company.click();
    }

    public void setSubmit() throws InterruptedException {
        submit.click();
        Thread.sleep(8000);
        one_emp.click();
        Thread.sleep(8000);
        one_company.click();
        Thread.sleep(8000);
        submit.click();
        Thread.sleep(8000);





    }
}
