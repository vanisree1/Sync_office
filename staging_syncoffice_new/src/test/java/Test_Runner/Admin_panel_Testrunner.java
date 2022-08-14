package Test_Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(




        features ="/home/lenovo/Documents/AUTOMATION/Clock_Modules/Add_Automated_mail",glue = "Step_defination"
        //  ,   tags = {"@smoke1"}
        , monochrome = true /*display the console output in a proper readable format */
        , dryRun = false //to check the mapping is between feature file and step definition
        , plugin = {"html:test-outout","html:target/Admin-Panel-html-report","html:target/cucumber",
        "json:target/AdminPanel.json","junit:target/Admin-Panel.xml","pretty"}
)
public class Admin_panel_Testrunner {
}
