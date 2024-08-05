package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
			(
			features = "src/test/java/Features/HomePage.feature", 
			glue = "Steps"
			)

public class HomePageRunnerTest extends AbstractTestNGCucumberTests {

}
