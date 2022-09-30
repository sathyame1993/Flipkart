package com.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveProductFromCart {

	WebDriver driver ;
	
	
	@FindBy(xpath = "//button[@class='_32l7f0']")
	private List<WebElement> changeOptions;
		
	@FindBy(xpath = "//*[text()='Remove']")
	private WebElement removeButton;
	


	public WebElement getRemoveButton() {
		return removeButton;
	}

	public List<WebElement> getChangeOptions() {
		return changeOptions;
	}

	
	
	

	public RemoveProductFromCart(WebDriver driver5) {
		this.driver = driver5;
		PageFactory.initElements(driver, this);
	}

}
