package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveProductFromCart {

	WebDriver driver ;
	
	
	@FindBy(xpath = "(//div[text()='Order Summary']//following::div//following::button[@class='_32l7f0']")
	private WebElement changeOrder;
	
	@FindBy(xpath = "//span[text()='Remove']")
	private WebElement removeButton;
	
	
	
	public WebElement getChangeOrder() {
		return changeOrder;
	}



	public WebElement getRemoveButton() {
		return removeButton;
	}



	public RemoveProductFromCart(WebDriver driver4) {
		this.driver = driver4;
	}

}
