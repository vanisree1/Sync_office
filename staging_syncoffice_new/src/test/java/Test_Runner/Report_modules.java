package Test_Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features ="/home/lenovo/Documents/AUTOMATION/Clock_Modules/Add_Exception_Report",glue = "Step_defination"
        //  ,   tags = {"@smoke1"}
        , monochrome = true /*display the console output in a proper readable format */
        , dryRun = false //to check the mapping is between feature file and step definition
        , plugin = {"html:test-outout","html:target/report-html-report","html:target/cucumber",
        "json:target/ReportModule.json","junit:target/ReportModule-Report.xml","pretty"})
public class Report_modules {

}
