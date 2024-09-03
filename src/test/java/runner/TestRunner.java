package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to feature files
        glue = {"utility","step_definition"}, // Package where step definitions are located
        plugin = {
                "pretty",
                "html:target/cucumber-html-report", // Correct syntax for HTML report
                "json:target/cucumber.json" // Correct syntax for JSON report
        }
)
public class TestRunner {
}
