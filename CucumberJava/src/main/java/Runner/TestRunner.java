package Runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/omkara/git/Assignment/CucumberJava/src/main/java/Feature", // the path of the
																									// feature files
		glue = { "stepDefinations" }, // the path of the step definition files
		tags = { "@MyAssignments" }
)

public class TestRunner {

}
