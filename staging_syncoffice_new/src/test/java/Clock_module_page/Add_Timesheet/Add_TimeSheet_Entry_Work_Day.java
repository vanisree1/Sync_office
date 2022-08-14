package Clock_module_page.Add_Timesheet;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_TimeSheet_Entry_Work_Day {

    public WebDriver driver;
    public String random_num = Utilities_class.randomnemeric(6);
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(9);

    public Add_TimeSheet_Entry_Work_Day(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "(//*[text()=\"EY\"])[3]")
    WebElement Ey;
    @FindBy(xpath = "(//*[text()=\"EY\"])[5]")
    WebElement Ey_leave;
    @FindBy(xpath = "(//*[text()=\"SAP\"])[3]")
    WebElement sap;
    @FindBy(xpath = "//*[text()=\"nisha1 (mani mishra)\"]")
    WebElement bug;
    @FindBy(xpath = "     //*[text()=\"Partial Work Day\"]\n")
    WebElement partial_work_day;
    @FindBy(xpath = "//*[text()=\"Work Day\"]")
    WebElement workday;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/span[1]/span[1]")
    WebElement done;
    @FindBy(xpath = "(//*[text()=\"bug\"])[3]")
    WebElement bug_leave;
    @FindBy(xpath = "(//*[text()=\"bug\"])[2]")
    WebElement bug_;
    @FindBy(xpath = "//div[contains(text(),'Assigned')]")
    WebElement assigned_drop_down;
    @FindBy(xpath = "(//*[text()=\"Select...\"])")
    WebElement select;
    @FindBy(xpath = " //body/div[4]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/*[1]")
    WebElement task_type_drop_down;
    @FindBy(xpath = "//body/div[4]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]")
    WebElement Client_drop_down;
    @FindBy(xpath = "//body/div[4]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/*[1]")
    WebElement TASK_NAME_DROP_DOWN;
    @FindBy(xpath = "(//*[@type=\"text\"])[9]")
    WebElement FROM_CLOCK;
    @FindBy(xpath = "(//*[@type=\"text\"])[10]")
    WebElement TO_CLOCK;
    @FindBy(xpath = "//div[contains(text(),'Sundry')]")
    WebElement sundry_drop_down;
    @FindBy(xpath = "//div[contains(text(),'Unassigned')]")
    WebElement unassigned_drop_down;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[8]/div[1]/form[1]/div[1]/div[1]/textarea[1]")
    WebElement remark2;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement submit;
    @FindBy(xpath = "//*[text()=\"Leave\"]\n")
    WebElement leave;
    @FindBy(xpath = "(//*[text()=\"Sick Leave\"])")
    WebElement sick_leave;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[1]/div/div[2]/div/div[2]/div/svg")
    WebElement  Task_type;
    @FindBy(xpath = "//body/div[4]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement hrs;
    @FindBy(xpath="//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/*[1]")
    WebElement client_bulk;
    @FindBy(xpath = "(//*[text()=\"None selected\"])[2]")
    WebElement none;
    @FindBy(xpath = "//*[text()=\"aaaa (mani mishra)\"]")
    WebElement Task_name_unassined;
    @FindBy(xpath = "//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/*[1]")
    WebElement Task_type1;
    @FindBy(xpath = "//*[text()=\"Leave\"]")
    WebElement leave1;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[3]")
    WebElement duration_popup;
    @FindBy(xpath = "(//*[@type=\"radio\"])\n")
    WebElement first_radio;
    @FindBy(xpath = "//*[text()=\"Holiday\"]")
    WebElement holiday;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement holiday_name;
    @FindBy(xpath = "//*[text()=\"My Team\"]")
    WebElement myteam;
    @FindBy(xpath = "(//*[text()=\"filter_list\"])[2]")
    WebElement filter;
    @FindBy(xpath = "//body/div[4]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement ey1;
    @FindBy(xpath = "//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/*[1]")
    WebElement Day_type;
    @FindBy(xpath = "(//*[text()=\"Go\"])")
    WebElement Go;
    @FindBy(xpath = "(//*[text()=\"My Team Filter\"])")
    WebElement my_filter;
    @FindBy(xpath = "(//*[text()=\"refresh\"])[2]")
    WebElement refresh;
    @FindBy(xpath = "//*[@name=\"2\"]")
    WebElement unassign;
    @FindBy(xpath = "//*[text()=\"schedule\"]")
    WebElement bulk_entry_1;
    @FindBy(xpath = "(//*[text()=\"Assigned\"])[3]")
    WebElement Assigned_bulk;
    @FindBy(xpath = "(//*[text()=\"EY\"])")
    WebElement Ey_bulk;
    @FindBy(xpath = "   //div[contains(text(),'@# - #@')]")
    WebElement bug1;
    @FindBy(xpath = " //*[text()=\"schedule\"]")
    WebElement bulk_entry;
    @FindBy(xpath = "(//*[text()=\"Assigned\"])[2]")
    WebElement Assigned;
    @FindBy(xpath = "//body/div[4]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]")
    WebElement select_dropdown;
    @FindBy(xpath = " //*[text()=\"schedule\"]")
    WebElement bulk_entryl;
    @FindBy(xpath = "//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/*[1]")
    WebElement task_name_bulk;

//*[text()="Leave"]
public void setWorkday_dropdown() throws InterruptedException {
    bulk_entry_1.click();
    Thread.sleep(8000);

    select_dropdown.click();
    Thread.sleep(4000);
}
    public void setWorkday() throws InterruptedException {
        Thread.sleep(4000);

        workday.click();
        Thread.sleep(4000);

        done.click();
        Thread.sleep(4000);
        task_type_drop_down.click();
        assigned_drop_down.click();
        Client_drop_down.click();
        Thread.sleep(4000);

        ey1.click();
        Thread.sleep(4000);

        TASK_NAME_DROP_DOWN.click();
        Thread.sleep(4000);

        bug1.click();
        Thread.sleep(4000);

      //  FROM_CLOCK.click();
      //  Thread.sleep(4000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
    //    executor.executeScript("arguments[0].click();", clock_1);
      //  clock_1.click();
     //   Thread.sleep(4000);
        hrs.clear();

        hrs.sendKeys("0220");
       // OK.click();
      //  Thread.sleep(4000);

       // TO_CLOCK.click();
      //  Thread.sleep(4000);

        //To_clock_1.click();
       // Thread.sleep(4000);

//OK.click();
     //   Thread.sleep(4000);

//LOCATION.click();
      //  Thread.sleep(4000);

//remark.sendKeys("aaaa");
        Thread.sleep(4000);
submit.click();
        Thread.sleep(9000);
        bulk_entry_1.click();
        Thread.sleep(8000);

        select_dropdown.click();
        Thread.sleep(4000);

        leave.click();
        Thread.sleep(4000);

        done.click();
        Thread.sleep(4000);
        task_type_drop_down.click();
        Thread.sleep(4000);

        unassigned_drop_down.click();
        Thread.sleep(4000);
        Client_drop_down.click();
        Thread.sleep(4000);

        ey1.click();
        Thread.sleep(4000);
        TASK_NAME_DROP_DOWN.click();
        Thread.sleep(4000);

        Task_name_unassined.click();
        Thread.sleep(4000);
        hrs.clear();
        hrs.sendKeys("0200");
        submit.click();
        Thread.sleep(9000);
        bulk_entry_1.click();
        Thread.sleep(8000);

        select_dropdown.click();
        Thread.sleep(4000);
        holiday.click();
        Thread.sleep(4000);

        done.click();
        Thread.sleep(4000);
        task_type_drop_down.click();
        Thread.sleep(4000);

        sundry_drop_down.click();
        Thread.sleep(4000);

driver.findElement(By.xpath("(//*[@type=\"text\" ])[11]")).sendKeys("aaa");

        Thread.sleep(4000);

//driver.findElement(By.xpath("//*[@value=\"Launch\"]")).click();
        Thread.sleep(4000);
        hrs.clear();
        hrs.sendKeys("0200");
        Thread.sleep(9000);

        submit.click();
        Thread.sleep(9000);

    }

    public void setLeave( ) throws InterruptedException {

leave.click();
        Thread.sleep(4000);
        Task_type.click();
      //  unassign.click();
        Thread.sleep(4000);
Assigned.click();
     /*   select.click();
        Thread.sleep(4000);

sick_leave.click();
        Thread.sleep(4000);
unassign.click();
        Thread.sleep(4000);

//Task_type.click();
        Thread.sleep(4000);
*/
        select.click();
        Thread.sleep(4000);

        ey1.click();
        Thread.sleep(4000);

        select.click();
        Thread.sleep(4000);

        bug_leave.click();
        Thread.sleep(4000);
        duration_popup.click();
        Thread.sleep(4000);
FROM_CLOCK.sendKeys("0200");
        Thread.sleep(4000);

TO_CLOCK.sendKeys("0400");
        Thread.sleep(4000);

      //  hrs.sendKeys("1130");

     //   work_from.click();
        //Thread.sleep(4000);

      //  ahemdabad.click();
      //  Thread.sleep(4000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
      //      executor.executeScript("arguments[0].click();", remark2);
        Thread.sleep(4000);

    //    remark.sendKeys("aaaa");
        Thread.sleep(4000);
        submit.click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("(//*[text()=\"edit\"])[5]")).click();
        Thread.sleep(8000);

        duration_popup.click();
        Thread.sleep(6000);

        hrs.sendKeys("0220");
        //  discription_.clear();
        Thread.sleep(6000);

        //  discription_.sendKeys(random_name + number);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
        Thread.sleep(8000);
      //  bulk_entry.click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//*[text()=\"delete\"])")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("(//*[text()=\"Delete\"])[2]")).click();

       // Day_type.click();
        Thread.sleep(4000);

       // leave1.click();
        Thread.sleep(4000);
     //   Task_type1.click();

    }

    public void setPartial_work_day() throws InterruptedException {
        partial_work_day.click();
        Thread.sleep(4000);
unassign.click();
        first_radio.click();
        Thread.sleep(4000);


        Task_type.click();
        Thread.sleep(4000);

        select.click();
        Thread.sleep(4000);

        sap.click();
        Thread.sleep(4000);

        select.click();
        Thread.sleep(4000);

        bug.click();
        Thread.sleep(4000);
        duration_popup.click();
        Thread.sleep(4000);

        hrs.sendKeys("1130");

        //   work_from.click();
        //Thread.sleep(4000);

        //  ahemdabad.click();
        //  Thread.sleep(4000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", remark2);
        remark2.sendKeys("aaaa");
        Thread.sleep(4000);
        submit.click();
    }

    public void setHoliday() throws InterruptedException {
    holiday.click();
      //  first_radio.click();
        Thread.sleep(4000);

//holiday_name.sendKeys("holi");
        Thread.sleep(4000);

        Task_type.click();
        Thread.sleep(4000);
Assigned.click();
        Thread.sleep(4000);

        select.click();
        Thread.sleep(4000);

        Ey.click();
        Thread.sleep(4000);

        select.click();
        Thread.sleep(4000);

        bug_.click();
        Thread.sleep(4000);
        duration_popup.click();
        Thread.sleep(4000);

     //   hrs.sendKeys("1130");
        FROM_CLOCK.sendKeys("0200");
        Thread.sleep(4000);

        TO_CLOCK.sendKeys("0400");
        Thread.sleep(4000);

        //   work_from.click();
        //Thread.sleep(4000);

        //  ahemdabad.click();
        //  Thread.sleep(4000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
     //   executor.executeScript("arguments[0].click();", remark2);
      //  remark2.sendKeys("aaaa");
        Thread.sleep(4000);
        submit.click();
        Thread.sleep(6000);

       // driver.findElement(By.xpath("//*[text()=\"Done\"]")).click();
        Thread.sleep(6000);

        driver.findElement(By.xpath("(//*[text()=\"edit\"])[5]")).click();
        Thread.sleep(8000);

duration_popup.click();
        Thread.sleep(6000);

hrs.sendKeys("0220");
      //  discription_.clear();
        Thread.sleep(6000);

      //  discription_.sendKeys(random_name + number);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[text()=\"Modify\"]")).click();
        Thread.sleep(8000);
    }


    public void setMyteam() throws InterruptedException {
        Thread.sleep(4000);

        myteam.click();
        Thread.sleep(4000);

        filter.click();
        Thread.sleep(4000);

        none.click();
        Thread.sleep(4000);

        ey1.click();
        Thread.sleep(4000);
my_filter.click();
        Thread.sleep(4000);

        Go.click();
        Thread.sleep(4000);

        refresh.click();
    }
}