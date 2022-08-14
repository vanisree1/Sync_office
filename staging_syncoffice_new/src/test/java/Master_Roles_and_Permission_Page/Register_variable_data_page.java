package Master_Roles_and_Permission_Page;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_variable_data_page {
    public WebDriver ldriver;
    public WebDriver driver;
    public String number= Utilities_class.randomnemeric(2);

    public Register_variable_data_page(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="(//*[@class='MuiButton-label'])[1]")
    WebElement login;

    @FindBy(xpath = "(//*[@type=\"text\"])[1]")
    WebElement Username;
    @FindBy(xpath="//*[@type='password']")
    WebElement password;
    @FindBy(xpath = "//*[text()=\"login\"]")
    WebElement login_button;
    @FindBy(xpath = "//span[contains(text(),'Master')]")
    WebElement master;

    @FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[2]/div/div/div/div/nav/div[3]/div[1]/div[1]/span")
    WebElement mouse_over_clint;

    @FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[2]/div/div/div/div/nav/div[3]/div[1]/div[2]/span")
    WebElement clint;
    @FindBy(xpath="//span[contains(text(),'Register Variable-Data')]")
    WebElement Register;
    @FindBy(xpath="(//*[text()=\"add\"])[5]")
    WebElement Add_register;
    @FindBy(xpath="(//*[@type=\"text\" ])[3]")
    WebElement registeration_value;
    @FindBy(xpath="(//*[@type=\"text\" ])[4]")
   WebElement Doucument_name;
    @FindBy(xpath="//*[text()=\"save\"]")
    WebElement Save_button;
    @FindBy(xpath="(//*[@type=\"text\"])[5]")
    WebElement edittext;
    @FindBy(xpath="(//*[@type=\"text\"])[2]")
    WebElement search;
    @FindBy(xpath="(//*[text()=\"delete\"])[2]")
    WebElement delete;
    @FindBy(xpath="(//span[contains(text(),'Delete')])[2]")
    WebElement delete_popup;


    //Actions items----------------------------------------------------------------------------------------------------------------
    public void set()
    {
        login.click();
    }
    public void setusername(String uname)
    {
       // Username.clear();
        Username.sendKeys(uname);
        System.out.println("Enter the email id");
    }
    public void Setpassword(String pass)
    {
      //  password.clear();
        password.sendKeys(pass);
        System.out.println("Enter the password");
    }
    public void setLogin_button()
    {
        System.out.println("click on Login");
        login_button.click();

    }
    public void setMaster()
    {
        master.click();
    }
    public void setMouse_over_clint() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div/div/div/nav/div[3]/div[1]/div[1]/span"));
        actions.moveToElement(menuOption).perform();
    }
    public void setClint()
    {
        clint.click();
    }
    public void setRegister() {
    Register.click(); }
    public void setAdd_register() throws InterruptedException {
        Thread.sleep(5000);

        Add_register.click();
    }
    public void setRegisteration_value(String value) throws InterruptedException {
        Thread.sleep(5000);


        registeration_value.sendKeys(value);
    }
    public void setDoucument_name(String doc_name) throws InterruptedException {
        Thread.sleep(5000);

        Doucument_name.sendKeys(doc_name+number);
        Thread.sleep(5000);

        Save_button.click();
        Thread.sleep(5000);

        if (search.isDisplayed()) {
            Thread.sleep(4000);
            search.sendKeys(number);


            driver.findElement(By.xpath("//*[text()=\"edit\"]")).click();
            Thread.sleep(4000);


            edittext.clear();
            Thread.sleep(6000);

            edittext.sendKeys(number);
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
            Thread.sleep(4000);

            search.clear();
            Thread.sleep(4000);

            search.sendKeys(number);
            Thread.sleep(4000);


            System.out.println(" New User successfully added in Register_varible");
            Thread.sleep(4000);
            delete.click();
            Thread.sleep(4000);
            delete_popup.click();
            System.out.println(" New User successfully Deleted in r");
        } else {
            System.out.println(" New User not added in Register_varible");
        }



    }










      /*  if(driver.findElements(By.xpath("//*[text()='Variable Data']")).size()>0) {
            List<WebElement> elements = driver.findElements(By.xpath("//tbody//tr"));
            int count = elements.size();
            System.out.println("Count of Register Variable - " + count);

            for(int i =count;i>0;i--){
                String doc=   driver.findElement(By.xpath("//tbody//tr["+i+"]//td[1]")).getText();
                System.out.println(" Added Doc value " + doc );

                System.out.println("Doc value displaying in Registered page " +dac_name);

                if (doc.equals(dac_name))
                {

                    System.out.println("Doc Successfully added in Registered page" );
                    break;

                }
                else{
                    System.out.println("Doc already exist or NOt added properly");
                }
            }

        }

        else{

            System.out.println(" Employe not added ");
        }*/
    }


