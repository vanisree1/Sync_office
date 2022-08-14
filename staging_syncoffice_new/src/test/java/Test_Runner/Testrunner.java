package Test_Runner;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import io.cucumber.core.backend.ObjectFactory;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
 

 


@RunWith(Cucumber.class)
@CucumberOptions(




        features ="C:\\Users\\vanis\\Projects\\candyautomationscripts\\staging_syncoffice_new\\ClientcloudFeatures\\Add_Employee_in_cloud_module.feature",glue = "Step_defination"
   //  ,   tags = {"@smoke1"}
        , monochrome = false /*display the console output in a proper readable format */
       , dryRun = false //to check the mapping is between feature file and step definition
     , plugin = {"html:test-outout","html:target/cucumber-html-report","html:target/cucumber",
        "json:target/cucumber.json","junit:target/cucumber.xml","json:target/cucumber/syn.json","pretty"}
)

public class Testrunner { 

   // @AfterClass
  //  public static void writeExtentReport() {
        //Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
  //  }
} 