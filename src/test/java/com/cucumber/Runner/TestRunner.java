package com.cucumber.Runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.BaseClass.BaseClass;
import com.cucumber.helper.FileReaderManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src/test/java/com/cucumber/FeatureFile", 
             glue = "com/cucumber/StepDefinition",
             plugin = {//"pretty", 
            		 "html:Report/Cucumber.html",
            		 "json:Report/Cucumber.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
             dryRun = false,
             monochrome = true
             )

public class TestRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws IOException {
		String browserName = FileReaderManager.getInstance().getCrInstance().getBrowserName();
		driver = BaseClass.getBrowser(browserName);

	}

	@AfterClass
	public static void teardown() {
		driver.close();

	}
}
