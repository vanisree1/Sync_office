package Master_GuestUser_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assign_Guest_user_page {

    public WebDriver driver;

    public Assign_Guest_user_page(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//*[text()=\"Assign Guest User\"]")
    WebElement Assign_user ;
    @FindBy(xpath = "//h6[contains(text(),'Guest To Client')]")
    WebElement Guest_to_client ;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[5]")
    WebElement all_client ;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[1]")
    WebElement all_guest ;
    @FindBy(xpath = "//*[text()=\"Submit\"]")
    WebElement submit ;
    @FindBy(xpath = "(//*[@type=\"text\"])[1]")
    WebElement Search_Guest;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[2]")
    WebElement single_guest ;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[4]")
    WebElement single_client ;

    public void setAssign_user() {
        Assign_user.click();
    }

    public void setGuest_to_client() {

        setGuest_to_client();
        System.out.println("");
    }

    public void setSearch_Guest() {

        Search_Guest.sendKeys("gopal");
        System.out.println("");

    }

    public void setSingle_guest() { single_guest.click();
    }
    public void setSingle_client() {
        single_client.click();
        submit.click();

    }

    public void setAll_guest() throws InterruptedException {
        Thread.sleep(3000);
        all_guest.click();
    }

    public void setAll_client() {
        all_client.click();
    }

    public void setSubmit() throws InterruptedException {
        submit.click();



    }
}
