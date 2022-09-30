package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderAndLogin {
	
	WebDriver driver;
	
	@FindBy(xpath = "//span[text()='Place Order']")
	private WebElement placeOrder;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement mobileNo;
	
	@FindBy(xpath = "//span[text()='CONTINUE']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginButton;
	
	
	public WebElement getPlaceOrder() {
		return placeOrder;
	}


	public WebElement getMobileNo() {
		return mobileNo;
	}


	public WebElement getContinueButton() {
		return continueButton;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public PlaceOrderAndLogin(WebDriver driver3) {
		this.driver=driver3;
		PageFactory.initElements(driver, this);
	}
	
}
