package com.stepDef;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.base.Base;
import com.sdp.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartStepDef extends Base{
	
	PageObjectManager pom = new PageObjectManager();
	List<WebElement> products;
	
	@When("user clicks the first mobile from the list")
	public void user_clicks_the_first_mobile_from_the_list() {
		products = pom.getAddToCart().getProducts();
			click(products.get(0));
			System.out.println(getTextInWebElement(products.get(0)));
		}

	@Then("user should get the same product to be displayed that he clicked")
	public void user_should_get_the_same_product_to_be_displayed_that_he_clicked() {
		pageLoadWait("10");
		System.out.println(getTextInWebElement(pom.getAddToCart().getSelectedProduct()));
	}

	@Then("user add that product to the cart")
	public void user_add_that_product_to_the_cart() {

	}
}
