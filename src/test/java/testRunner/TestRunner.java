package testRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features//Tags.feature",
                 glue="stepDefinition",
                 plugin= { "pretty", "html:target/cucumber-reports" },
                 dryRun=false,
                 monochrome=false,
                 tags="@Smoke"
               
                 )
public class TestRunner {
	
}
