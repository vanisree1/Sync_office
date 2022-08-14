package Badge_code_Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(




		features ="C:\\Users\\vanis\\Projects\\candyautomationscripts\\staging_syncoffice_new\\Badge_code.feature\\Unregistrated_company.feature"
		,glue = "Badge_code_stepdef"

		, monochrome = false /*display the console output in a proper readable format */
		, dryRun = false //to check the mapping is between feature file and step definition
		, plugin = {"html:test-outout","html:target/cucumber-html-report","html:target/cucumber",
				"json:target/cucumber.json","junit:target/cucumber.xml","json:target/cucumber/syn.json","pretty"}
		)

public class Unregistrated_company_Runner {

}
