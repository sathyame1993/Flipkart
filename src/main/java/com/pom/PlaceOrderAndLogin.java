package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaceOrderAndLogin {
	
	@FindBy(xpath = "//span[@class='_2-ut7f _1WpvJ7']")
	private WebElement addedProductPrice;
	
	String xpath = "//div[@data-id=\"MOBGHBJG8NWDGK6T\"] //div/a/div/following::div/div/div[text()='realme C33 (Sandy Gold, 64 GB)']";

}
