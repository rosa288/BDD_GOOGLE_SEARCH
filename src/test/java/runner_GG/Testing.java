package runner_GG;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/features_GG"
		,glue= {"seleniumgluecode_GG"},
		plugin = { "pretty", "html:target/cucumber-reports.html" }
		
		)
public class Testing extends AbstractTestNGCucumberTests{
	

}
