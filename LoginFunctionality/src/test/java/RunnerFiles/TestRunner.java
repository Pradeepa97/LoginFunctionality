package RunnerFiles;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Features",
		glue= {"StepDefinitions","Hooks"},
		plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		tags="@Login"
		)
public class TestRunner {	
	
}
