package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.AddToCart;
import com.pom.ProductSearch;
import com.runner.Runner;

public class PageObjectManager {

	WebDriver driver = Runner.driver;
	
	
	private ProductSearch productSearch;
	private AddToCart addToCart;
	
	
	public ProductSearch getProductSearch() {
		productSearch  = new ProductSearch(driver);
		return productSearch;
	}


	public AddToCart getAddToCart() {
		addToCart = new AddToCart(driver);
		return addToCart;
	}


	
	
	
	
	
	
}
