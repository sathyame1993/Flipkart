package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.Base;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/com/features/",
		glue = "com.stepDef",
		monochrome = true,
		plugin = { "pretty","html:target/flipkart.html"},
		dryRun = false
		
		
		)


public class ChromeRunner extends Base {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		driver = browser_launch(readPropertyFile().getProperty("browser"));
	}

}
