package Test_Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        features ="/home/lenovo/Documents/AUTOMATION/Cloud.features/To Create a folder using Header option Icon",glue = "Step_defination"
        //  ,   tags = {"@smoke1"}

        , monochrome = true /*display the console output in a proper readable format */
        , dryRun = false //to check the mapping is between feature file and step definition
        , plugin = {"html:test-outout","html:target/cucumber-html-report","html:target/cucumber",
        "json:target/password.json","junit:target/password-Report.xml","pretty"}
)
public class password_Testrunner {
}
