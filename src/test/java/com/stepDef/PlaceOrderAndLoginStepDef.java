package com.stepDef;

import com.base.Base;
import com.sdp.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PlaceOrderAndLoginStepDef extends Base{
	
	PageObjectManager pom = new PageObjectManager();
	
	
	@Given("user clicks the place order button")
	public void user_clicks_the_place_order_button() {
		click(pom.getOrderAndLogin().getPlaceOrder());
	}

	@Given("user enters the mobile no and clicks the continue button")
	public void user_enters_the_mobile_no_and_clicks_the_continue_button() throws InterruptedException {
		sendKeys(pom.getOrderAndLogin().getMobileNo(), readPropertyFile().getProperty("mobileNo"));
		Thread.sleep(5000);
		click(pom.getOrderAndLogin().getContinueButton());
	}

	@Then("user enters the password and login to application")
	public void user_enters_the_password_and_login_to_application() throws InterruptedException {
		elementToBeVisible(pom.getOrderAndLogin().getPassword());
		sendKeys(pom.getOrderAndLogin().getPassword(), readPropertyFile().getProperty("password"));
		Thread.sleep(5000);
		click(pom.getOrderAndLogin().getLoginButton());
		
		
	}
}
