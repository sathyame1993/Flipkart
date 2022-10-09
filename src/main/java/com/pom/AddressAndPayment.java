package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressAndPayment {
	
	WebDriver driver;
	
	
	
	@FindBy(xpath = "(//input[@name=\"address\"])[2]")
	private WebElement selectAddress;
	
	@FindBy(xpath = "//button[text()='Deliver Here']")
	private WebElement deliverHere;
	
	@FindBy(id = "to-payment")
	private WebElement continueToPayment;
	
	@FindBy(xpath = "//button[text()='Accept & Continue']")
	private WebElement acceptPopup;
	
	@FindBy(xpath = "//label[@for=\"CREDIT\"]")
	private WebElement cardPaymnetOption;


	public WebElement getSelectAddress() {
		return selectAddress;
	}

	public WebElement getDeliverHere() {
		return deliverHere;
	}

	public WebElement getContinueToPayment() {
		return continueToPayment;
	}

	public WebElement getAcceptPopup() {
		return acceptPopup;
	}

	public WebElement getCardPaymnetOption() {
		return cardPaymnetOption;
	}
	
	public AddressAndPayment(WebDriver driver4) {
		this.driver=driver4;
		PageFactory.initElements(driver, this);
	}
	
	
	
}
