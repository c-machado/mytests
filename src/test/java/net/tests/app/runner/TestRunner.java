package net.tests.app.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
            format = {"pretty","html:target/cucumber"},
            features = "src/test/features",
            glue = "net.tests.app.steps"
)

public class TestRunner {


}
