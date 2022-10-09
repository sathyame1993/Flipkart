package com.stepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.base.Base;
import com.sdp.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class RemoveProductFromCartStepDef extends Base {
	
	PageObjectManager pom = new PageObjectManager();
	WebElement clickAndHoldElement= driver.findElement(By.xpath("//div[@id='px-captcha']")) ;
	
	@Given("user clicks the change button from order summary")
	public void user_clicks_the_change_button_from_order_summary() throws InterruptedException  {
		if(clickAndHoldElement.isEnabled()==true) {
			Hooks.scenario.log("This step cannot be performed as the previous step is failed");
		}
		else {
			List<WebElement> changeOptions = pom.getRemoveProductFromCart().getChangeOptions();
			click(changeOptions.get(2));	
		}
		
	}


	@Then("clicks the remove option")
	public void clicks_the_remove_option() {
		
		
		if(clickAndHoldElement.isEnabled()==true) {
			Hooks.scenario.log("This step cannot be performed as the previous step is failed");
		}
		else {
			elementToBeVisible(pom.getRemoveProductFromCart().getRemoveButton());
			click(pom.getRemoveProductFromCart().getRemoveButton());
		}
		
	}
	
	
}
