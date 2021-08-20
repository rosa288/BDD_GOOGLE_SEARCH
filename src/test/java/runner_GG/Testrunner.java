package runner_GG;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features_GG"
		,glue= {"seleniumgluecode_GG"},
		plugin = { "pretty", "html:target/cucumber-reports.html" },
		monochrome = true
		)
		

public class Testrunner {

}
