package com.stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.Base;
import com.sdp.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddressAndPaymentStepDef extends Base{

	PageObjectManager pom = new PageObjectManager();
	
	
	@Given("user selects the address")
	public void user_selects_the_address()  {
		elementIsPresent(By.xpath("//div[@id='px-captcha']"));
		WebElement clickAndHoldElement = driver.findElement(By.xpath("//div[@id='px-captcha']"));
		Actions ac = new Actions(driver);
		ac.clickAndHold(clickAndHoldElement).build().perform();
		System.out.println("The click and hold button is clicked successfully");
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
		elementToBeVisible(pom.getAddressAndPayment().getAcceptPopup());
		click(pom.getAddressAndPayment().getAcceptPopup());
	}

	@Then("selects the card payment option")
	public void selects_the_card_payment_option() throws InterruptedException {
		elementToBeVisible(pom.getAddressAndPayment().getCardPatmnetOption());
		scrollDownToElement(pom.getAddressAndPayment().getCardPatmnetOption());
		click(pom.getAddressAndPayment().getCardPatmnetOption());
	}

	
}
