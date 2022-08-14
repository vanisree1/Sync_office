package Account_Reconciliation_page;

import Utilities.Utilities_class;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sub_GL_account {
    public WebDriver driver;
    public String random_num = Utilities_class.randomnemeric(6);
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String number = Utilities_class.randomnemeric(4);

    public sub_GL_account(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[text()=\"GL Sub Account\"]")
    WebElement sub_gl_act;
    @FindBy(xpath = "//*[text()=\"account_balance\"]")
    WebElement account_balance;
    @FindBy(xpath = "//*[@name=\"gl_code\"]")
    WebElement gl_ode;
    @FindBy(xpath = "(//*[@name=\"description\"])[3]")
    WebElement discription;
    @FindBy(xpath = "//*[text()=\"Select...\"]")
    WebElement select;
    @FindBy(xpath = "//div[contains(text(),'12345')]")
    WebElement text;
    @FindBy(xpath = "//*[@name=\"sub_gl_code\"]")
    WebElement name;
    @FindBy(xpath = "//*[@name=\"code\"]")
    WebElement code;
    @FindBy(xpath = "(//*[@name=\"description\"])[3]")
    WebElement description;
    @FindBy(xpath = "//*[text()=\"add\"]")
    WebElement add;
    @FindBy(xpath = "(//*[text()=\"add_circle\"])[2]")
    WebElement add_circle;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement cost;
    @FindBy(xpath = "//*[text()='45081']")
    WebElement importer;
    @FindBy(xpath = "//*[@placeholder=\"DD/MM/YYYY\"]")
    WebElement date;//(//*[@type="button"])[22]
    @FindBy(xpath = "//*[@name=\"name\"]")
    WebElement name1;
    @FindBy(xpath = "//*[@name=\"comp_code\"]")
    WebElement code_comp;
    @FindBy(xpath = "//*[@name=\"cmpLocName\"]")
    WebElement loc;
    @FindBy(xpath = "//*[@ name=\"address1\"]")
    WebElement address;
    @FindBy(xpath = "//*[@ name=\"pincode\"]")
    WebElement pincode;
    @FindBy(xpath = "//*[@name=\"email\"]")
    WebElement mail;
    @FindBy(xpath = "(//*[@type=\"button\"]//*[@focusable=\"false\"])[6]")
    WebElement date_f;
    @FindBy(xpath = "(//*[text()=\"5\"])[1]")
    WebElement lc_5;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[5]")
    WebElement Select_entity;
    @FindBy(xpath = "(//*[text()=Sarika Mishra")
    WebElement sl;
    @FindBy(xpath = "(//*[text()=\"add_circle\"])[1]")
    WebElement add_category;
    @FindBy(xpath = "//*[@name=\"name\"]")
    WebElement name_category;
    @FindBy(xpath = "(//*[text()=\"Save\"])[2]")
    WebElement save_category;
    @FindBy(xpath = "//*[@name='landline_num'])]")
    WebElement anumber;
    @FindBy(xpath = "(//*[@type=\"text\"])[8]")
    WebElement description_edit;
    @FindBy(xpath = "//*[@name=\"code\"]")
    WebElement Code1;
    @FindBy(xpath = "(//*[@name=\"description\"])[4]")
    WebElement decription;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[5]")
    WebElement risk_category;

    @FindBy(xpath = "//*[@name=\"sub_gl_account_purpose\"]")
    WebElement purpose;

    @FindBy(xpath = "//*[@name=\"jv_flow\"] ")
    WebElement jv_flow;
    @FindBy(xpath = "//*[@name=\"from_range\"]")
    WebElement from_range;

    @FindBy(xpath = "//*[@name=\"to_range\"]")
    WebElement To_range;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[4]")
    WebElement checkbox;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[2]")
    WebElement debit_card;//(//*[@focusable="false"])[27]

    @FindBy(xpath = "(//*[@focusable=\"false\"])[27]")
    WebElement box;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[3]")
    WebElement yes_no;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement Rconciler;
    @FindBy(xpath = "//*[text()=\"Select All\"]")
    WebElement select_managment;

    @FindBy(xpath = "(//*[text()=\"Select All\"])[2]")
    WebElement select_mnt;
    @FindBy(xpath = "//div[contains(text(),'manisha')]")
    WebElement reviewer_name;
    @FindBy(xpath = "//div[contains(text(),'Sarika')]")
    WebElement Reconcilar_two;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement Reviewer;
    @FindBy(xpath = "(//*[text()=\"GL Sub Account\"])[2]")
    WebElement sub_gl_page;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement inter;
    @FindBy(xpath = "//*[text()=\"Monthly\"]")
    WebElement monthly;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement external;
    @FindBy(xpath = "//*[text()=\"Quarterly\"]")
    WebElement month;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement slect_entity;
    @FindBy(xpath = "//*[text()=\"Select All\"]")
    WebElement project;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement risk;
    @FindBy(xpath = "(//*[text()=\"add_circle\"])[2]")
    WebElement add_Globelcircle;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement mangement;
    @FindBy(xpath = "(//*[text()=\"Critical\"])[1]")
    WebElement risk1;
    @FindBy(xpath = "//*[text()=\"Save\"]")
    WebElement save;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement save1;
    @FindBy(xpath = "//*[@type=\"file\"]")
    WebElement file1;
    @FindBy(xpath = "(//*[text()=\"add\"])[3]")
    WebElement add_attachment;
    @FindBy(xpath = "     //*[text()=\"get_app\"]\n")
    WebElement download1;
    @FindBy(xpath = " (//*[text()=\"attachment\"])[2]")
    WebElement attachment2;
    @FindBy(xpath = "(//*[@type=\"text\"])[3]")
    WebElement search;
    @FindBy(xpath = "//div[contains(text(),'8831')]")
    WebElement globel_name;
    @FindBy(xpath="(//*[text()=\"delete\"])[3]")
    WebElement delete;
    @FindBy(xpath="(//span[contains(text(),'Delete')])[2]")
    WebElement dlt_2;
    @FindBy(xpath = "(//*[text()=\"Cancel\"])[4]")
    WebElement close;
    @FindBy(xpath = "(//*[text()=\"close\"])[3]")
    WebElement cancel;
    @FindBy(xpath = "(//*[text()=\"Save\"])[1]")
    WebElement save_upload;
    @FindBy(xpath = "  (//*[text()=\"attachment\"])")
    WebElement attachment1;
    @FindBy(xpath = "(//*[text()=\"add_circle\"])[1]")
    WebElement add_cir;
    @FindBy(xpath = "//*[@name=\"code\" ]")
    WebElement clse;
    @FindBy(xpath = "(//*[@name=\"description\"  ])[4]")
    WebElement dec;
    @FindBy(xpath = "(//*[text()=\"save\"])[2]")
    WebElement save2;
    @FindBy(xpath = "//*[@name=\"remarks\"  ]")
    WebElement remark;


    public void setAccount_balance() throws InterruptedException {
        Actions ac = new Actions(driver);
        ac.moveToElement(account_balance).perform();
        account_balance.isDisplayed();
        Thread.sleep(4000);

        sub_gl_act.click();
        Thread.sleep(3000);
        add.click();
        Thread.sleep(3000);
        Assert.assertEquals("GL Sub Account" ,sub_gl_page.getText());
        Thread.sleep(4000);

        select.click();
        Thread.sleep(3000);

        text.click();
        Thread.sleep(2000);

        name.sendKeys(number);
        Thread.sleep(2000);

        description.sendKeys(random_Second_name);
        Thread.sleep(2000);

    }

    public void setAdd() throws InterruptedException {
        add.click();
        Thread.sleep(4000);
    }

    public void setSelect() throws InterruptedException {
        select.click();
        Thread.sleep(2000);
        text.click();
    }
    public void setGl_ode() {
        gl_ode.sendKeys(Utilities_class.randomnemeric(7));
    }

    public void setDiscription() {
        discription.sendKeys(Utilities_class.randomalphabet(9));
    }


    public void setName() {
        name.sendKeys(random_name);
        description.sendKeys(random_Second_name);
        ///add_circle.click();


    }


    public void mendtory_fields() throws InterruptedException {
        Thread.sleep(3000);
        mail.sendKeys(random_name + "@gmail.com");
        Thread.sleep(3000);
        System.out.println("Enter email address");
        name1.sendKeys(Utilities_class.randomalphabet(9));
        Thread.sleep(3000);
        date_f.click();
        Thread.sleep(3000);
        lc_5.click();
        code_comp.sendKeys(Utilities_class.randomnemeric(5));
        Thread.sleep(6000);
        Actions ac=new Actions(driver);
        ac.moveToElement(loc).perform();
        Thread.sleep(3000);
        loc.sendKeys(Utilities_class.randomalphabet(9));
        Thread.sleep(3000);
        address.sendKeys(Utilities_class.randomalphabet(5));
        Thread.sleep(3000);
        pincode.sendKeys("560066");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()=save")).click();
    }


    public void setPurpose() throws InterruptedException {
        purpose.sendKeys(random_name);
        Thread.sleep(3000);

        jv_flow.sendKeys(random_Second_name);
        Thread.sleep(3000);

        from_range.sendKeys(Utilities_class.randomnemeric(3));
        Thread.sleep(3000);

        To_range.sendKeys(Utilities_class.randomnemeric(5));
        Thread.sleep(3000);
        add_cir.click();
        Thread.sleep(2000);

        code.sendKeys(number);
        Thread.sleep(3000);

        dec.sendKeys(random_Second_name);
        Thread.sleep(3000);

        remark.sendKeys(random_name);
        Thread.sleep(2000);
save2.click();
        Thread.sleep(2000);

        cost.click();
        Thread.sleep(2000);
        importer.click();
        Thread.sleep(2000);




        add_Globelcircle.click();
        Thread.sleep(2000);

        Code1.sendKeys(number);
        Thread.sleep(2000);


        Thread.sleep(2000);

        decription.sendKeys(random_Second_name+random_Second_name);
        Thread.sleep(2000);
        save2.click();
        Thread.sleep(4000);

 slect_entity.click();
        Thread.sleep(3000);
        globel_name.click();
        Thread.sleep(3000);
        slect_entity.click();
        Thread.sleep(3000);

        project.click();
        Thread.sleep(2000);
      //  smo.click();
mangement.click();
        Thread.sleep(2000);
        select_mnt.click();
        Thread.sleep(3000);
        risk.click();
        Thread.sleep(3000);
risk1.click();
        Thread.sleep(2000);

   /*     yes_no.click();
        Thread.sleep(2000);
        debit_card.click();

       // Thread.sleep(6000);
Rconciler.click();
        Thread.sleep(3000);

Reconcilar_two.click();
        Thread.sleep(3000);
Reviewer.click();
        Thread.sleep(3000);

reviewer_name.click();
        Thread.sleep(3000);
//.click();

      //  checkbox.click();

inter.click();
        Thread.sleep(3000);

monthly.click();
        Thread.sleep(3000);
checkbox.click();
        Thread.sleep(3000);

external.click();
        Thread.sleep(3000);
month.click();
        Thread.sleep(6000);

        file1.sendKeys("/home/lenovo/Downloads/Add_more_add.png");
        //  Thread.sleep(5000);
        Thread.sleep(9000);*/
        Actions ac=new Actions(driver);
        ac.doubleClick(save1).build().perform();

        Thread.sleep(6000);
       // cencel.click();
        //yes_no.click();
       // checkbox.click();
//save.click();


        if (search.isDisplayed()) {
            Thread.sleep(8000);
           // search.sendKeys(number);
          //  search.click();
            Thread.sleep(6000);
            driver.findElement(By.xpath("//*[text()=\"edit\"]")).click();
            Thread.sleep(4000);


            description_edit.clear();
            Thread.sleep(6000);

            description_edit.sendKeys(random_name + number);
            Thread.sleep(6000);
            driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
            Thread.sleep(8000);
            search.clear();

            search.sendKeys(number);

           // attachment1.click();
            // Thread.sleep(6000);
            //  download1.click();
            //Thread.sleep(6000);

         //   add_attachment.click();
           // Thread.sleep(6000);

            //file1.sendKeys("/home/lenovo/Pictures/Screenshot from 2021-03-05 16-39-08.png");
          //  save_upload.click();


         //   attachment2.click();

            // attachment1.click();
            System.out.println(" New User successfully added in Gl account");

         //   file1.sendKeys("/home/lenovo/Pictures/Screenshot from 2021-03-03 13-44-12.png");
           // Thread.sleep(9000);

          //  download1.click();
            System.out.println(" New User successfully added in sub gl Account");
            delete.click();
            Thread.sleep(8000);
            dlt_2.click();
            Thread.sleep(4000);
//driver.close();
        System.out.println(" New User successfully Deleted in sub gl Account");
        } else {
            System.out.println(" New User not added in sub gl Account");
        }

    }



    }
