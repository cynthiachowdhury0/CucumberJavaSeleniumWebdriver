package com.glue;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false,
                 
                 junit = "--step-notifications",
                    strict = true,
                    features = ".",
                    monochrome = true,
                    glue = "com/glue",
                    plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber-report.json"}
                )

public class RunTest {

}
