package com.stepDef;

import com.base.Base;
import com.sdp.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSearchStepDef extends Base{
	
	PageObjectManager pom = new PageObjectManager();
	

	@Given("user enter into the flipkart Homepage")
	public void user_enter_into_the_flipkart_homepage() {
	getUrl(readPropertyFile().getProperty("url"));
	pageLoadWait("2");
	click(pom.getProductSearch().getClosePopup());
	}

	@When("user clicks the mobile category")
	public void user_clicks_the_mobile_category() {
		click(pom.getProductSearch().getMobilesCategory());
		
	}

	@When("clicks the realme mobile from electronics menu")
	public void clicks_the_realme_mobile_from_electronics_menu() {
		implicityWaitTime(10);
		mouseHover(pom.getProductSearch().getElectronicsMenu());
	}

	@Then("user is navigated to list of realme mobile page")
	public void user_is_navigated_to_list_of_realme_mobile_page() {
		click(pom.getProductSearch().getRealme());
			
		
	}
	
}
