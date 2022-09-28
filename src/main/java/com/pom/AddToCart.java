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
	
	@FindBy(xpath = "//h1[@class=\"yhB1nd\"]")
	private WebElement selectedProduct;
	
	@FindBy(xpath = "//div[@class='_2rp71H']")
	private WebElement productDescription;
	
	


	public List<WebElement> getProducts() {
		return Products;
	}


	public WebElement getSelectedProduct() {
		return selectedProduct;
	}


	public WebElement getProductDescription() {
		return productDescription;
	}


	public AddToCart(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

}
