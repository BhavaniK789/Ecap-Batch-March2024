package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./Features/Tags.feature",
                 glue="StepDefinition",
                 tags="@Smoke",
                 monochrome=true,
                 dryRun=true
                 )

public class Runner {
	

}
