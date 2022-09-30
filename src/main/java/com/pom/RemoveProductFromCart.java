package com.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveProductFromCart {

	WebDriver driver ;
	
	
	@FindBy(xpath = "((//button[@class='_32l7f0'])[3]")
	private WebElement changeOrder;
	
	@FindBy(xpath = "//button[@class='_32l7f0']")
	private List<WebElement> changeOptions;
	
	@FindBy(xpath = "//*[@title='Flipkart']")
	private WebElement homePage;
	
	@FindBy(xpath = "//*[text()='Cart']")
	private WebElement goToCart;
	
	@FindBy(xpath = "//*[text()='Remove']")
	private WebElement removeButton;
	
	public WebElement getChangeOrder() {
		return changeOrder;
	}



	public WebElement getRemoveButton() {
		return removeButton;
	}



	public List<WebElement> getChangeOptions() {
		return changeOptions;
	}



	public WebElement getHomePage() {
		return homePage;
	}



	public WebElement getGoToCart() {
		return goToCart;
	}



	public RemoveProductFromCart(WebDriver driver5) {
		this.driver = driver5;
		PageFactory.initElements(driver, this);
	}

}
