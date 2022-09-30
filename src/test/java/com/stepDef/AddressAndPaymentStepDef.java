package com.stepDef;

import com.base.Base;
import com.sdp.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddressAndPaymentStepDef extends Base{

	PageObjectManager pom = new PageObjectManager();
	
	
	@Given("user selects the address")
	public void user_selects_the_address()  {
		elementToBeVisible(pom.getAddressAndPayment().getDeliverHere());
		click(pom.getAddressAndPayment().getDeliverHere());
	}

	@Then("clicks the continue to payment button")
	public void clicks_the_continue_to_payment_button() {
		elementToBeVisible(pom.getAddressAndPayment().getContinueToPayment());
		scrollDownToElement(pom.getAddressAndPayment().getContinueToPayment());
		click(pom.getAddressAndPayment().getContinueToPayment());
	}

	@Then("clicks the accept and continue button of popup")
	public void clicks_the_accept_and_continue_button_of_popup() throws InterruptedException {
		Thread.sleep(5000);
		click(pom.getAddressAndPayment().getAcceptPopup());
	}

	@Then("selects the card payment option")
	public void selects_the_card_payment_option() throws InterruptedException {
		Thread.sleep(7000);
		scrollDownToElement(pom.getAddressAndPayment().getCardPatmnetOption());
		click(pom.getAddressAndPayment().getCardPatmnetOption());
		Thread.sleep(5000);
	}

	
}
