package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearch {
	
	WebDriver driver;
	
	
	
	
	@FindBy(xpath = "//button[@class=\"_2KpZ6l _2doB4z\"]")
	private WebElement closePopup;
	
	@FindBy(linkText = "Mobiles")
	private WebElement mobilesCategory;
	
	@FindBy(xpath = "//span[@class=\"_2I9KP_\"][text()=\"Electronics\"]")
	private WebElement ElectronicsMenu;
	
	@FindBy(xpath = "//a[@title='Realme']")
	private WebElement brand;

	public WebElement getClosePopup() {
		return closePopup;
	}

	public WebElement getMobilesCategory() {
		return mobilesCategory;
	}

	public WebElement getElectronicsMenu() {
		return ElectronicsMenu;
	}

	public WebElement getBrand() {
		return brand;
	}
	
	
	public ProductSearch(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	
	
}
