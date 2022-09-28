package com.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	WebDriver driver;
	
	@FindBy(xpath = "//div[@class=\"_4rR01T\"]")
	private List<WebElement> Products;
	
	@FindBy(xpath = "//a[@class='_2rpwqI']")
	private WebElement productDisplayed;
	
	@FindBy(xpath = "//button[text()='ADD TO CART']")
	private WebElement addToCart;
	
	@FindBy(xpath = "//div[@class='_30jeq3 _16Jk6d']")
	private WebElement selectedProductPrice;
	
	@FindBy(xpath = "//span[@class='_2-ut7f _1WpvJ7']")
	private WebElement addedProductPrice;
	
	public WebElement getAddToCart() {
		return addToCart;
	}


	public List<WebElement> getProducts() {
		return Products;
	}


	public WebElement getproductDisplayed() {
		return productDisplayed;
	}



	public WebElement getSelectedProductPrice() {
		return selectedProductPrice;
	}


	public WebElement getAddedProductPrice() {
		return addedProductPrice;
	}


	public AddToCart(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

}
