package cucumberOption;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features"
		, glue = "stepDefinitions"
		, monochrome = true
		, plugin = { "pretty", "html:target/cucumber", "junit:target/cucumber/cucumber.xml" }
		, snippets = SnippetType.CAMELCASE
		, tags = { "@demo" })

public class CucumberTestRunner {
}
