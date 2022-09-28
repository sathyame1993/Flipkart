package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.Base;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\sathiya\\eclipse-workspace\\scrum\\Flipkart\\src\\test\\resources\\com\\features",
		glue = "com.stepDef",
		monochrome = true,
		plugin = "pretty",
		dryRun = false
		
		
		)


public class Runner extends Base {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		driver = browser_launch(readPropertyFile().getProperty("browser1"));
	}

}
