package com.stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.base.Base;
import com.sdp.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddressAndPaymentStepDef extends Base{

	PageObjectManager pom = new PageObjectManager();
	WebElement clickAndHoldElement ;

	@Given("user selects the address")
	public void user_selects_the_address()  {
		implicityWaitTime(60);
		clickAndHoldElement = driver.findElement(By.xpath("//div[@id='px-captcha']"));
		//			Actions ac = new Actions(driver);
		//			ac.clickAndHold(clickAndHoldElement).build().perform();
		//			System.out.println("The click and hold button is clicked successfully");
		if(clickAndHoldElement.isEnabled()==true) {
			Hooks.scenario.attach(attachScreenshot(), "image/png", "Failed-Due to Human Verification");
			Hooks.scenario.log("The human verification is showing.This cannot be automated");
		}
		else {
			elementToBeVisible(pom.getAddressAndPayment().getDeliverHere());
			click(pom.getAddressAndPayment().getDeliverHere());
		}

	}

	@Then("clicks the continue to payment button")
	public void clicks_the_continue_to_payment_button() {
		if(clickAndHoldElement.isEnabled()==true) {
			Hooks.scenario.log("The selenium is detected by flipkart and the automation is blocked by the applicaiton ");
		}
		
		else
		{
			elementToBeVisible(pom.getAddressAndPayment().getContinueToPayment());
			scrollDownToElement(pom.getAddressAndPayment().getContinueToPayment());
			click(pom.getAddressAndPayment().getContinueToPayment());
		}

	}

	@Then("clicks the accept and continue button of popup")
	public void clicks_the_accept_and_continue_button_of_popup()  {
		
		if(clickAndHoldElement.isEnabled()==true) {
			Hooks.scenario.log("This step cannot be performed as the previous step is failed");
		}else {
			elementToBeVisible(pom.getAddressAndPayment().getAcceptPopup());
			click(pom.getAddressAndPayment().getAcceptPopup());
		}

	}

	@Then("selects the card payment option")
	public void selects_the_card_payment_option()  {
		
		if(clickAndHoldElement.isEnabled()==true) {
			Hooks.scenario.log("This step cannot be performed as the previous step is failed");
		}else {
			elementToBeVisible(pom.getAddressAndPayment().getCardPaymnetOption());
			scrollDownToElement(pom.getAddressAndPayment().getCardPaymnetOption());
			click(pom.getAddressAndPayment().getCardPaymnetOption());
		}

	}


}
