package Test_Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(




        features ="/home/lenovo/Documents/AUTOMATION/Master_Guest_user.feature/Master_modules",glue = "Step_defination"
        //  ,   tags = {"@smoke1"}

        , monochrome = true /*display the console output in a proper readable format */
        , dryRun = false //to check the mapping is between feature file and step definition
        , plugin = {"html:test-outout","html:target/cucumber-html-report","html:target/cucumber",
        "json:target/cucumber.json","junit:target/cucumber.xml","json:target/cucumber/syn.json","pretty"}
)
public class Ac_testrunner {
}
