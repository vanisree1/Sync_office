package Master_Roles_and_Permission_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Client_to_staff {
    public WebDriver driver;

    public Client_to_staff(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//span[contains(text(),'Staff to Client')]")
    WebElement Staff_to_client;
    @FindBy(xpath = "//*[@class=\"mdc-select__native-control customFieldText py-0\"]")
    WebElement drop_down;
    @FindBy(xpath = "//*[text()=\"IBM\"]\n")
    WebElement IBM;
    @FindBy(xpath = "//*[@type=\"checkbox\"]")
    WebElement all_stafft;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[3]/div/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/div/div/div[1]/div[1]/span/span/span[1]/input")
    WebElement all_client;
    @FindBy(xpath = "//*[text()=\"Submit\"]")
    WebElement submit;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[3]/div/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/span/span/span[1]/input")
    WebElement all_deprtment;

    public void setStaff_to_client() {
        Staff_to_client.click();
    }

    public void setDrop_down() throws InterruptedException {
       // WebElement menuOption1 = driver.findElement(By.xpath("// select[@class=\"mdc-select__native-control customFieldText py-0\" ]"));
        Select sc=new Select(drop_down);
        //menuOption1.click();
        sc.selectByVisibleText("EY");
        Thread.sleep(5000);
       // driver.findElement(By.xpath("//*[text()=\"IBM\"]\n")).click();
       Thread.sleep(5000);
    }



    public void setAll_client() throws InterruptedException {
      /*  driver.findElement(By.xpath("//div[contains(text(),'I')]\n")).click();
        Thread.sleep(4000);

       driver.findElement(By.xpath("//body/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[1]/span[1]/span[1]/span[1]/input[1]")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("(//*[text()=\"delete\"])[1]")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("(//*[text()=\"delete\"])[3]")).click();
        Thread.sleep(4000);


        driver.findElement(By.xpath("(//*[text()=\"close\"])")).click();
        Thread.sleep(4000);
*/
        all_stafft.click();
        Thread.sleep(5000);

        all_client.click();
        Thread.sleep(5000);

        all_deprtment.click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[text()=\"Download\"]")).click();
        Thread.sleep(5000);
        Thread.sleep(5000);

    }

    public void setAll_staff() throws InterruptedException {
        submit.click();
        Thread.sleep(5000);

       driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")) .click();
        Thread.sleep(5000);
       System.out.println("checkbox");

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/div/div/div[1]/div[2]/div[7]/span/span/span[1]/input")) .click();
        Thread.sleep(5000);

        System.out.println("checkbox");
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div[2]/span/span/span[1]/input")).click();
        Thread.sleep(5000);

        submit.click();

    }
}
