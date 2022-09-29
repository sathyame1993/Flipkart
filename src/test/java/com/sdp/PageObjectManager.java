package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.AddToCart;
import com.pom.AddressAndPayment;
import com.pom.PlaceOrderAndLogin;
import com.pom.ProductSearch;
import com.pom.RemoveProductFromCart;
import com.runner.ChromeRunner;

public class PageObjectManager {

	WebDriver driver = ChromeRunner.driver;
	
	
	private ProductSearch productSearch;
	private AddToCart addToCart;
	private PlaceOrderAndLogin orderAndLogin;
	private AddressAndPayment addressAndPayment;
	private RemoveProductFromCart removeProductFromCart;
	
	
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


	public RemoveProductFromCart getRemoveProductFromCart() {
		removeProductFromCart = new RemoveProductFromCart(driver);
		return removeProductFromCart;
	}


	
	
	
	
	
	
}
