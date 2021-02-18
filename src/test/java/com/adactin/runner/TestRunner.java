package com.adactin.runner;

import java.io.IOException;
import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.adactin.baseclass.Baseclass;
import com.adactin.utils.ConfigurationReader;
import com.adactin.utils.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/adactin/feature/Adactin.feature", 
				glue = "com/adactin/stepdefinition"
				,plugin ={/*"pretty", "html:Report/CucumberReport", "json:Report/Cucumber.json",*/
							"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:Report/CucumberExtentReport.html",
							"rerun:Report/FailedScenario.txt",
				}
				,monochrome = true
				,dryRun = false
				,strict = true
				)
                //tags = {"RegressionTest"}


public class TestRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void sample() throws IOException {
		//String browserName  =  FileReaderManager.getinstance().getcrinstance().getBrowserName();
		//driver = Baseclass.getbrowser(browserName);
	FileReaderManager getinstance = FileReaderManager.getinstance();
	ConfigurationReader getcrinstance = getinstance.getcrinstance();
	String browserName = getcrinstance.getBrowserName();
	driver = Baseclass.getbrowser(browserName);
	}
	@AfterClass
	public static void tearDown() {
		driver.close();
	}

}
