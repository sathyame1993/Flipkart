package com.stepDef;

import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.base.Base;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class Hooks extends Base {
	public static Scenario scenario;

	@BeforeStep
	public void beforeStep(Scenario scenario) {
		Hooks.scenario=scenario;
	}
	
	@AfterStep
	public void afterStep(Scenario scenario) {
		Hooks.scenario=scenario;
		if (scenario.isFailed()) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		byte[] source = screenshot.getScreenshotAs(OutputType.BYTES);
		scenario.attach(source, "image/png","ScreenShot");
		
		}
	}
	
	@After
	public void afterHooks(Scenario scenario) throws IOException {
		Hooks.scenario=scenario;
		Status status = scenario.getStatus();
		System.out.println("      Status: " + status+"\n\n");
		
		if (scenario.isFailed()) {
			screenshot(scenario.getName());
			
		}
		
	}
	
}
