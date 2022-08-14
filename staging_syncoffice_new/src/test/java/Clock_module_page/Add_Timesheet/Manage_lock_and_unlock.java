package Clock_module_page.Add_Timesheet;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Manage_lock_and_unlock {


    public WebDriver driver;
    public String random_num= Utilities_class.randomnemeric(5);
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(9);
    public Manage_lock_and_unlock(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath="//*[text()=\"lock_open\"]")
    WebElement lock;
    @FindBy(xpath="//*[text()=\"add\"]")
    WebElement Add_Manage;
    @FindBy(xpath="//*[text()=\"None selected\"]")
    WebElement none_selected;
    @FindBy(xpath="(//*[@type=\"checkbox\"])[3]")
    WebElement nisha_kar;
    @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[5]")
    WebElement Start_date;
    @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[6]")
    WebElement End_date;
    @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[7]")
    WebElement start_date_subtask;
    @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[8]")
    WebElement Endd_date_subtask;
    @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[5]")
    WebElement End_date_subtask;
    @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[7]")
    WebElement Auto_date;
    @FindBy(xpath="(//*[text()=\"4\"])")
    WebElement date;
    @FindBy(xpath="(//*[text()=\"30\"])[3]")
    WebElement date1;
    @FindBy(xpath="(//*[text()=\"26\"])[2]")
    WebElement date2;
    @FindBy(xpath="(//*[text()=\"Add\"])")
    WebElement add;
    @FindBy(xpath="(//*[text()=\"Add\"])[3]")
    WebElement save;
    @FindBy(xpath="(//*[text()=\"Add\"])")
    WebElement adaad;
    @FindBy(xpath="//body/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/form[1]/div[1]/label[1]")
    WebElement description;
    @FindBy(xpath="(//*[text()=\"filter_list\"])[1]")
    WebElement filter_list;
    @FindBy(xpath="(//*[@type=\"checkbox\"])[4]")
    WebElement Ey;
    @FindBy(xpath="(//*[text()=\"My Task Filter\"])[1]")
    WebElement my_task;
    @FindBy(xpath="(//*[text()=\"None selected\"])[1]")
    WebElement none_select;
    @FindBy(xpath="//*[text()=\"mani mishra\"]")
    WebElement mani_emp;
    @FindBy(xpath="(//*[text()=\"Go\"])[1]")
    WebElement Go;
    @FindBy(xpath="//*[text()=\"refresh\"]")
    WebElement refresh;

    @FindBy(xpath="(//*[text()=\"list_alt\"])[2]")
    WebElement list;

    @FindBy(xpath="(//*[text()=\"add\"])")
    WebElement add_task;
    @FindBy(xpath="/html/body/div[9]/div[3]/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div[1]/div/div/div/div/input")
    WebElement primary_task;
    @FindBy(xpath="/html/body/div[9]/div[3]/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/input")
    WebElement description_summary;
    @FindBy(xpath="/html/body/div[9]/div[3]/div/div[2]/div/div[1]/div[2]/div/div/div[1]/span/span/label/div[2]/span/span[1]/span[1]/input")
    WebElement radio_button;
    @FindBy(xpath="/html/body/div[9]/div[3]/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/input")
    WebElement subtask;
    @FindBy(xpath="/html/body/div[9]/div[3]/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[3]/div/div/div/div/input")
    WebElement description_sub_task;
    @FindBy(xpath="/html/body/div[9]/div[3]/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[4]/div/div/div/div/input")
    WebElement milestone;
    @FindBy(xpath="/html/body/div[9]/div[3]/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[5]/div/div[1]/img")
    WebElement add_icon;
    @FindBy(xpath="/html/body/div[9]/div[3]/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div/div/input")
    WebElement subtask2;
    @FindBy(xpath="//*[text()=\"Add Manage\"]")
    WebElement add_manage;
    @FindBy(xpath="/html/body/div[9]/div[3]/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div[4]/div/div/div/div/input")
    WebElement milstone;



    @FindBy(xpath="//*[text()=\"add_circle_outline\"]")
    WebElement add_circle;


    @FindBy(xpath="(//*[text()=\"--Select--\"])")
    WebElement selct;
    @FindBy(xpath="(//*[text()=\"Fixing  ( Single Task )\"])")
    WebElement dev_linked;
    @FindBy(xpath="//li[contains(text(),'EY')]")
    WebElement EY;
    @FindBy(xpath="(//*[text()=\"Sarika Mishra\"])[2]")
    WebElement Assign_To;
    @FindBy(xpath="(//*[text()=\"subject\"])")
    WebElement subject;
    @FindBy(xpath="(//*[@ name=\"gender1\"])[1]")
    WebElement radio_tab;
    @FindBy(xpath="//body/div[4]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[5]/div[1]/span[1]/div[1]/div[1]/div[1]/span[1]/button[1]/span[1]/span[1]")
    WebElement edit;
    @FindBy(xpath="(//*[text()=\"Primary Task\"])[3]")
    WebElement primary_task1;
    @FindBy(xpath="(//*[text()=\"Modify\"])")
    WebElement modify;
    @FindBy(xpath="//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/form[1]/div[1]/div[1]/textarea[1]")
    WebElement decription;
    @FindBy(xpath="(//*[text()=\"Sarika Mishra\"])[2]")
    WebElement sarka;
    @FindBy(xpath="//*[@id=\"scrollable-force-tabpanel-0\"]/div/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/div/input")
    WebElement text_star;
    @FindBy(xpath="/html/body/div[5]/div[3]/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div/div/div/div/input")
    WebElement star;
    @FindBy(xpath="//*[text()=\"Create\"]")
    WebElement create;
    @FindBy(xpath="(//*[text()=\"edit\"])")
    WebElement edit_task;
    @FindBy(xpath="(//*[text()=\"Delete\"])\n")
    WebElement delete;
    @FindBy(xpath="(//*[text()=\"Delete\"])[2]")
    WebElement dlt;
    @FindBy(xpath="(//*[text()=\"Sarika Mishra\"])[2]")
    WebElement sarik_1;
    @FindBy(xpath="//body/div[8]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement Editdecription;
    @FindBy(xpath="(//*[text()=\"Sarika Mishra\"])[4]")
    WebElement sarika_lead;
    @FindBy(xpath=" //*[text()=\"Assign Sub task\"]")
    WebElement subtask1;
    @FindBy(xpath="(//*[@type=\"text\"])[5]")
    WebElement search;
    @FindBy(xpath="(//*[text()=\"delete\"])[2]")
    WebElement dlt_task;
    @FindBy(xpath="(//*[text()=\"Delete\"])[3]")
    WebElement dlt_;
    @FindBy(xpath="(//*[text()=\"mani mishra\"])[1]")
    WebElement assing_task;
    //*[text()="Add Sub task"]
    public void setClock() throws InterruptedException {
        lock.click();
        Thread.sleep(4000);
        Add_Manage.click();
        Thread.sleep(4000);

        none_selected.click();
        Thread.sleep(4000);

        nisha_kar.click();
        Thread.sleep(6000);

        add_manage.click();
        Thread.sleep(4000);

        Start_date.click();
        Thread.sleep(4000);

        date.click();
        Thread.sleep(4000);

        End_date.click();
        Thread.sleep(4000);

        date2.click();
        Thread.sleep(4000);

        Auto_date.click();
        Thread.sleep(4000);

        date1.click();
        Thread.sleep(4000);
        add.click();

    }


    public void setFilter_list() throws InterruptedException {
        filter_list.click();
        Thread.sleep(4000);

        none_select.click();
        Thread.sleep(4000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        executor.executeScript("arguments[0].click();", Ey);
       // Ey.click();
        Thread.sleep(4000);

        my_task.click();
        Thread.sleep(4000);

        none_select.click();
        Thread.sleep(4000);

        mani_emp.click();
        Thread.sleep(4000);

        my_task.click();
        Thread.sleep(4000);

        Go.click();
        Thread.sleep(4000);


refresh.click();
    }





    // task


    public void setList() throws InterruptedException {
        list.click();
        Thread.sleep(9000);

        add_task.click();
        Thread.sleep(4000);

        primary_task.sendKeys(random_name);
        Thread.sleep(6000);


        radio_button.click();
        Thread.sleep(4000);

        description_summary.sendKeys(random_Second_name+random_num);
        Thread.sleep(4000);

        subtask.sendKeys(random_Second_name);
        Thread.sleep(4000);

        description_sub_task.sendKeys(random_name+random_Second_name);
        Thread.sleep(4000);

        milestone.sendKeys("5");
        Thread.sleep(4000);

        add_icon.click();
        Thread.sleep(9000);

        subtask2.sendKeys(random_name);
        Thread.sleep(4000);

        milstone.sendKeys("4");
        Thread.sleep(4000);

        save.click();
        Thread.sleep(9000);

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", search);

        search.sendKeys(random_num);
        Thread.sleep(4000);
edit.click();
        Thread.sleep(4000);

        Editdecription.sendKeys(random_name);
        Thread.sleep(4000);

        modify.click();
        Thread.sleep(4000);
        //search.clear();
     //   Thread.sleep(4000);

       // search.sendKeys(random_num);
        Thread.sleep(4000);


        dlt_task.click();
        Thread.sleep(4000);
        dlt_.click();
        Thread.sleep(4000);




    }

    public void setAdd_circle() throws InterruptedException {
        add_circle.click();
        Thread.sleep(4000);

        selct.click();
        Thread.sleep(4000);

        EY.click();
        Thread.sleep(4000);

        selct.click();
        Thread.sleep(4000);

        dev_linked.click();
        Thread.sleep(4000);

        selct.click();
        Thread.sleep(4000);

Assign_To.click();
        Thread.sleep(4000);



        End_date_subtask.click();

       // End_date.click();
        Thread.sleep(4000);
        date.click();
        Thread.sleep(4000);


        End_date.click();
        Thread.sleep(4000);
        date2.click();



        Thread.sleep(7000);
        star.sendKeys("23");
        Thread.sleep(4000);

       subject.click();
        Thread.sleep(4000);

        radio_tab.click();
       Thread.sleep(4000);
        add.click();
        Thread.sleep(4000);

        none_selected.click();
        Thread.sleep(4000);

        sarik_1.click();
        Thread.sleep(4000);

       // decription.sendKeys(random_Second_name);
        Thread.sleep(4000);

        subtask1.click();
        Thread.sleep(4000);

//sub_task_name.sendKeys(random_name);
        Thread.sleep(4000);
selct.click();
        Thread.sleep(4000);

assing_task.click();
        Thread.sleep(4000);

       //

        Thread.sleep(4000);
        start_date_subtask.click();
        Thread.sleep(4000);
        date.click();
        Thread.sleep(4000);

        Endd_date_subtask.click();
        Thread.sleep(4000);
        date2.click();
        Thread.sleep(4000);

        none_selected.click();
        Thread.sleep(4000);

        sarika_lead.click();
        Thread.sleep(4000);

       // description_sub_task.sendKeys(random_Second_name);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", text_star);
        System.out.println("sarika");
        text_star.sendKeys("4");
        Thread.sleep(4000);



        add.click();
        Thread.sleep(8000);
create.click();
        Thread.sleep(10000);

edit_task.click();
        Thread.sleep(12000);

delete.click();
        Thread.sleep(4000);

dlt.click();
        Thread.sleep(4000);

    }
}
