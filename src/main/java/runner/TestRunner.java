package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = {"/Users/sandeepdhaliwal/Desktop/QA/SeleniumWorkSpace/FreeCrmBDDFramework/src/main/java/features/TaggedHooks.feature"}, //the path of the feature files
			glue = {"stepDefinations"}, //the path of the step definition files
			format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},//to generate different types of reporting
			monochrome = true, //display the console output in a proper readable format
			strict = true, //it will check if any step is not defined in step definition file
			dryRun = false,
			tags = {"~@SmokeTest" , "~@RegressionTest"}			
	)
					public class TestRunner {
	
	
	
}
