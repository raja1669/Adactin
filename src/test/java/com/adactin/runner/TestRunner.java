package com.adactin.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/adactin/feature/Adactin.feature", 
glue = "com/adactin/stepdefinition", 
plugin = 
{"pretty", "html:Report/CucumberReport", "json.Report/Cucumber.json",
"com.cucumber.listener.ExtentCucumberFormatter:Report/CucumberExtentReport.html" }, 
monochrome = true, 
dryRun = false, 
strict = true)
public class TestRunner {

}
