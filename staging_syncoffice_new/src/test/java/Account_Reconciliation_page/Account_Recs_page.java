package Account_Reconciliation_page;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_Recs_page {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(5);

    public Account_Recs_page(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//*[text()=\"Quick Links\"]")
    WebElement Quick_Links;
    @FindBy(xpath = "//*[text()=\"visibility\"]")
    WebElement view;
    @FindBy(xpath = "//*[text()=\"add\"]")
    WebElement add;
    @FindBy(xpath = "//*[@name=\"name\"]")
    WebElement name;
    @FindBy(xpath = "(//*[@type=\"text\"])[5]")
    WebElement url;
    @FindBy(xpath = "(//*[@name=\"comments\"])")
    WebElement comments;
    @FindBy(xpath = "(//*[text()=\"save\"])")
    WebElement save;
    @FindBy(xpath = "/html/body/div[11]/div[3]/div/div/div[2]/div/div[2]/div[2]/span/span[1]/span/span")
    WebElement save1;

    @FindBy(xpath = "//*[text()=\"filter_list\"]")
    WebElement coloum_section;

    @FindBy(xpath = "//*[@name=\"comp_code\"]")
    WebElement code;
    @FindBy(xpath = "(//*[text()=\"edit\"])")
    WebElement edit;
    @FindBy(xpath = "(//*[text()=\"Modify\"])")
    WebElement modify;
    @FindBy(xpath = "(//*[text()=\"delete\"])[3]")
    WebElement delete;
    @FindBy(xpath = "(//*[text()=\"Delete\"])[3]")
    WebElement dlt_2;
    @FindBy(xpath = "//*[text()=\"cloud_upload\"]")
    WebElement upload;
    @FindBy(xpath = "//*[text()=\"cloud_download\"]")
    WebElement upload1;
    @FindBy(xpath = "(//*[@type=\"text\"])[2]")
    WebElement  serch;
    @FindBy(xpath = "(//*[@type=\"text\"])[3]")
    WebElement  serch1;
    @FindBy(xpath = "//*[text()=\">\"]")
    WebElement arrow_;
    @FindBy(xpath = "(//*[text()=\"Download\"])[3]")
    WebElement download;
    @FindBy(xpath = "(//*[text()=\"Download\"])[2]")
    WebElement download2;
    @FindBy(xpath = "//*[text()=\"PDF\"]")
    WebElement pdf;
    @FindBy(xpath = "/html/body/div[7]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/span/span/span[1]/input")
    WebElement checkbox;
    @FindBy(xpath = "//*[text()=\"Excel\"]")
    WebElement excel;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div[1]/div[2]/div/div/div/div/div/div[1]/div/div[1]/div[1]/span/span/span[1]/input")
    WebElement exce;
    @FindBy(xpath = "//*[@type=\"checkbox\"]")
    WebElement radio;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div[1]/div[2]/div/div/div/div/div/div[1]/div/div[1]/div[1]/span/span/span[1]/input")
    WebElement manage_download;
    @FindBy(xpath = "//*[text()=\"Select...\"]")
    WebElement select2;
    @FindBy(xpath = "//*[@name=\"cmpLocName\"]")
    WebElement comloc;
    @FindBy(xpath = "//*[@name=\"address1\"]")
    WebElement address;
    @FindBy(xpath = "//*[@name=\"pincode\"]")
    WebElement pincode;
    @FindBy(xpath = "(//*[text()=\"Sarika Mishra\"])[2]")


    WebElement contect_person;
    @FindBy(xpath = "//*[@name=\"city\"]")
    WebElement city;
    @FindBy(xpath = "//*[text()=\"Select...\"]")
    WebElement selec_entityt;

    @FindBy(xpath = "//*[text()=\"delete\"]\n")
    WebElement delet;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div[1]/div[2]/div/div/div/div/div/div[1]/div/div[1]/div[1]/span/span/span[1]/input")
    WebElement checkbox1;






    @FindBy(xpath = "//*[@id=\"scrollable-force-tabpanel-1\"]/div/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div/button/span[1]/span/span")
    WebElement account_recs;
    @FindBy(xpath = "//div[contains(text(),'N F S Most Wanted')]")
    WebElement NFS_WORLD;

    @FindBy(xpath = "(//*[@type=\"file\"])[1]")
    WebElement file;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]/span[1]/span[1]")
    WebElement managemnet;
    @FindBy(xpath = "//div[contains(text(),'ME001')]")
    WebElement Manage;
    @FindBy(xpath = "//span[contains(text(),'send')]")
    WebElement send;

    @FindBy(xpath = "//span[contains(text(),'Account Recs')]\n")
    WebElement Account_Recs;

    @FindBy(xpath = "//*[text()=\"Business Entities\"]")
    WebElement business_entities;
    @FindBy(xpath = "(//*[@type=\"button\"]//*[@focusable=\"false\"])[4]")
    WebElement DATE;
    @FindBy(xpath = "(//*[text()=\"1\"])[1]")
    WebElement dat_1;
    @FindBy(xpath = "//*[text()=\"add\"]")
    WebElement add_entities;

    @FindBy(xpath = "//div[contains(text(),'TATA')]")
    WebElement tata;
    @FindBy(xpath = "//div[contains(text(),'Sarika Mishra')]")
    WebElement sarika;
    @FindBy(xpath = "//*[@name=\"code\"]")
    WebElement code1;
    @FindBy(xpath = "//*[@id=\"scrollable-force-tabpanel-2\"]/div/div/div/div[2]/div/div[1]/div[3]/div/div[3]/div/div/div/div[6]/div/span/div/div[1]/div/span/button/span[1]/span")
    WebElement edit1;




    @FindBy(xpath = "//*[text()=\"FAQ\"]")
    WebElement faq ;
    @FindBy(xpath = "//*[text()=\"visibility\"]")
    WebElement view1 ;
    @FindBy(xpath = "(//*[text()=\"add\"])[4]")
    WebElement add_category;
    @FindBy(xpath = "//*[@name=\"name\"]")
    WebElement name1;
    @FindBy(xpath = "(//*[@name=\"description\"])[3]")
    WebElement description;

    @FindBy(xpath = "//*[text()=\"Select...\"]")
    WebElement select_category;
    @FindBy(xpath = "//div[contains(text(),'testing')]")
    WebElement testing;
    @FindBy(xpath = "(//*[@name=\"question\"])")
    WebElement question;
    @FindBy(xpath = "(//*[@name=\"answer\"])")
    WebElement answer;

    @FindBy(xpath = "/html/body/div[8]/div[3]/div/div[1]/div/div/div[1]/div[3]/button/span[1]/span")
    WebElement close;
    @FindBy(xpath = "//*[text()=\"attachment\"]\n")
    WebElement attachment;
    @FindBy(xpath = "(//*[@name=\"answer\"])")
    WebElement answder;
    @FindBy(xpath = "//*[text()=\"add\"]")
    WebElement add2;
    @FindBy(xpath = "(//*[@name=\"answer\"])")
    WebElement ansaawer;
    @FindBy(xpath = "(//*[@name=\"answer\"])")
    WebElement answmmer;

    public void setQuick_Links() throws InterruptedException {
        Quick_Links.click();
        view.click();


        add.click();

        name.sendKeys(random_name);

        url.sendKeys("https://www."+random_name+".com/");
        Thread.sleep(4000);

        comments.sendKeys(random_Second_name);
        Thread.sleep(4000);

        save.click();
        Thread.sleep(4000);

       // search.sendKeys(random_name);
        //Thread.sleep(4000);

        edit.click();

        comments.clear();

        comments.sendKeys(random_Second_name);
        Thread.sleep(4000);

        modify.click();
        Thread.sleep(4000);

        coloum_section.click();
        Thread.sleep(4000);

        checkbox.click();
        Thread.sleep(4000);

        save.click();
        Thread.sleep(4000);

        //search.sendKeys(random_name);
       // Thread.sleep(4000);

        delete.click();
        Thread.sleep(4000);

        dlt_2.click();
        Thread.sleep(4000);

        upload.click();
        Thread.sleep(4000);

exce.click();
        Thread.sleep(4000);

arrow_.click();
        Thread.sleep(4000);

download.click();
        Thread.sleep(4000);

excel.click();

        Thread.sleep(4000);

pdf.click();
        Thread.sleep(4000);

    }








    public void setBusiness_entities() throws InterruptedException {
        Thread.sleep(4000);

        business_entities.click();
        Thread.sleep(4000);
        add.click();
        Thread.sleep(4000);
        DATE.click();
        Thread.sleep(4000);

        dat_1.click();
        Thread.sleep(4000);

        name.sendKeys(random_name);
        Thread.sleep(4000);

        code.sendKeys(number);
        Thread.sleep(4000);

        comloc.sendKeys(random_Second_name);
        Thread.sleep(4000);

        address.sendKeys(random_name);
        Thread.sleep(4000);

        pincode.sendKeys("494442");
        Thread.sleep(4000);

        city.click();
        Thread.sleep(4000);

        selec_entityt.click();
        Thread.sleep(4000);

        contect_person.click();
        Thread.sleep(4000);

        save.click();
        Thread.sleep(4000);

serch.isDisplayed();
serch.sendKeys(number);
        Thread.sleep(7000);

/*edit.click();
        Thread.sleep(4000);

address.clear();
        Thread.sleep(4000);

address.sendKeys(random_Second_name);
        Thread.sleep(4000);

modify.click();
        Thread.sleep(4000);

serch.sendKeys(number);
        Thread.sleep(4000);*/

delete.click();
        Thread.sleep(4000);

dlt_2.click();

        Thread.sleep(4000);

        upload.click();

    }

    public void setBusiness_entities_1() throws InterruptedException {
        business_entities.click();
        Thread.sleep(4000);

        radio.click();
        Thread.sleep(4000);

        add.click();
        Thread.sleep(4000);

        select2.click();
        Thread.sleep(4000);

        tata.click();
        Thread.sleep(4000);

        select2.click();
        Thread.sleep(4000);

        sarika.click();
        Thread.sleep(4000);

        name.sendKeys(random_name);
        Thread.sleep(4000);

        code1.sendKeys(number);
        Thread.sleep(4000);

        save.click();
        Thread.sleep(4000);

        serch1.sendKeys(number);
        Thread.sleep(4000);

        edit.click();
        Thread.sleep(4000);

        name.clear();
        Thread.sleep(4000);

        name.sendKeys(random_Second_name);
        Thread.sleep(4000);

        modify.click();
        Thread.sleep(4000);
      //  serch1.clear();
        //serch1.sendKeys(number);
        Thread.sleep(4000);
        upload.click();
        Thread.sleep(8000);
        manage_download.click();
        Thread.sleep(4000);

arrow_.click();
        Thread.sleep(4000);
download.click();
excel.click();
        pdf.click();

        Thread.sleep(4000);
       // upload.click();
       // Thread.sleep(8000);
       /* manage_download.click();
        Thread.sleep(4000);

        arrow_.click();
        download.click();

        pdf.click();
        delete.click();
        Thread.sleep(4000);

        dlt_2.click();

        Thread.sleep(8000);
*/

    }


    public void setFaq() throws InterruptedException {
        Thread.sleep(4000);

        faq.click();
        Thread.sleep(4000);

        add.click();
        Thread.sleep(4000);

        view1.click();
        Thread.sleep(4000);

        add_category.click();
        Thread.sleep(4000);

        name1.sendKeys(random_name);
        Thread.sleep(4000);

        description.sendKeys(random_name+random_Second_name);
        Thread.sleep(4000);

        save1.click();
        Thread.sleep(4000);
        close.click();
        Thread.sleep(4000);

       // add_category.click();
       // Thread.sleep(4000);

        select_category.click();
        Thread.sleep(4000);

        testing.click();
        Thread.sleep(4000);
        question.sendKeys(random_name);
        Thread.sleep(4000);

        answer.sendKeys(random_Second_name);
        Thread.sleep(4000);
save.click();
        Thread.sleep(4000);

edit.click();
        Thread.sleep(4000);

        answer.sendKeys(random_name);
        Thread.sleep(4000);

        modify.click();
        Thread.sleep(4000);
delet.click();
        Thread.sleep(4000);


driver.findElement(By.xpath("(//*[text()=\"Delete\"])[2]")).click();
        Thread.sleep(4000);

//upload.click();
driver.findElement(By.xpath("//*[text()=\"cloud_download\"]")).click();
        Thread.sleep(4000);

checkbox1.click();
        Thread.sleep(4000);

arrow_.click();
        Thread.sleep(4000);
download2.click();
        Thread.sleep(4000);

excel.click();
        Thread.sleep(4000);

pdf.click();
    }


    public void setAccount_recs() throws InterruptedException {
        Thread.sleep(4000);

        Account_Recs.click();
        Thread.sleep(4000);
        System.out.println("Account Recs page");

        account_recs.click();
        Thread.sleep(4000);
        System.out.println("");

        NFS_WORLD.click();
        Thread.sleep(4000);
        System.out.println("select Legal entity");

        managemnet.click();
        Thread.sleep(4000);
        System.out.println("select managment entity");

        Manage.click();
        Thread.sleep(4000);
        System.out.println("");

        send.click();

        Thread.sleep(4000);
        System.out.println("save");

view.click();
        System.out.println("click on view ");

        Thread.sleep(9000);

attachment.click();
        Thread.sleep(4000);
        System.out.println("attachment");

add2.click();
        Thread.sleep(4000);
        System.out.println("click on add button");

        file.sendKeys("/home/lenovo/Pictures/100 user.png");
        Thread.sleep(4000);
        System.out.println("upload a file");

        save.click();
        Thread.sleep(9000);
System.out.println("click on save");
      //  file.sendKeys("/home/lenovo/Downloads/excel.png\n");
        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[text()=\"get_app\"]")).click();
        Thread.sleep(5000);
        System.out.println("download");
driver.findElement(By.xpath("(//*[text()=\"delete\"])[3]")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("(//*[text()=\"close\"])[4]")).click();
        Thread.sleep(8000);

    /*    driver.findElement(By.xpath("(//*[text()=\"keyboard_arrow_downward\"])[2]")).click();
        Thread.sleep(4000);
//driver.findElement(By.xpath("//*[@name=\"remarks\"]")).clear();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[1]/div")).clear();

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[1]/div")).sendKeys(random_name);
        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[text()=\"Approve\"]")).click();
        Thread.sleep(4000);

      /* driver.findElement(By.xpath("")).click();

        driver.findElement(By.xpath("")).click();
        driver.findElement(By.xpath("")).click();

        driver.findElement(By.xpath("")).click();

*/
        Thread.sleep(4000);

        upload1.click();

    }
}
