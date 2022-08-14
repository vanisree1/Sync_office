package Admin_Panel_Test_Runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="C:\\Users\\vanis\\Projects\\candyautomationscripts\\staging_syncoffice_new\\Admin_Panel_Feature_Files\\validates_licencee_page_Trail.feature",
        glue = "Admin_Panel_stepdef" 
        , monochrome = false 
       , dryRun = false , plugin = {"html:test-outout","html:target/cucumber-html-report","html:target/cucumber",
        "json:target/cucumber.json","junit:target/cucumber.xml","json:target/cucumber/syn.json","pretty"}
)
public class Validates_licencee_page_Trail_Runner {

}
