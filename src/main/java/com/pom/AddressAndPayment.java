package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressAndPayment {
	
	WebDriver driver;
	
	
	@FindBy(id = "id=\"bgPDGqUECBJIdeA\"")
	private WebElement clicklAndHold;
		
	@FindBy(xpath = "(//button[@class='_32l7f0'])[2]")
	private WebElement changeAddress;
	
	@FindBy(xpath = "(//input[@name=\"address\"])[2]")
	private WebElement selectAddress;
	
	@FindBy(xpath = "//button[text()='Deliver Here']")
	private WebElement deliverHere;
	
	@FindBy(id = "to-payment")
	private WebElement continueToPayment;
	
	@FindBy(xpath = "//button[text()='Accept & Continue']")
	private WebElement acceptPopup;
	
	@FindBy(id = "id='CREDIT'")
	private WebElement cardPatmnetOption;

	public WebElement getClicklAndHold() {
		return clicklAndHold;
	}

	public WebElement getChangeAddress() {
		return changeAddress;
	}

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

	public WebElement getCardPatmnetOption() {
		return cardPatmnetOption;
	}
	
	public AddressAndPayment(WebDriver driver4) {
		this.driver=driver4;
		PageFactory.initElements(driver, this);
	}
	
	
	
}
