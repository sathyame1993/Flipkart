package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.AddToCart;
import com.pom.AddressAndPayment;
import com.pom.PlaceOrderAndLogin;
import com.pom.ProductSearch;
import com.runner.Runner;

public class PageObjectManager {

	WebDriver driver = Runner.driver;
	
	
	private ProductSearch productSearch;
	private AddToCart addToCart;
	private PlaceOrderAndLogin orderAndLogin;
	private AddressAndPayment addressAndPayment;

	
	
	public ProductSearch getProductSearch() {
		productSearch  = new ProductSearch(driver);
		return productSearch;
	}


	public AddToCart getAddToCart() {
		addToCart = new AddToCart(driver);
		return addToCart;
	}


	public PlaceOrderAndLogin getOrderAndLogin() {
		orderAndLogin = new PlaceOrderAndLogin(driver);
		return orderAndLogin;
	}


	public AddressAndPayment getAddressAndPayment() {
		addressAndPayment = new AddressAndPayment(driver);
		return addressAndPayment;
	}


	
	
	
	
	
	
}
