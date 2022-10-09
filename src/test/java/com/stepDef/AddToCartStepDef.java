package com.stepDef;


import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebElement;
import com.base.Base;
import com.sdp.PageObjectManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddToCartStepDef extends Base{
	
	PageObjectManager pom = new PageObjectManager();
	List<WebElement> products;
	public static String parent;
	String productSelected;
	
	
	
	
	@When("user clicks the any mobile from the list")
	public void user_clicks_the_any_mobile_from_the_list() {
		parent = driver.getWindowHandle();
		products = pom.getAddToCart().getProducts();
			click(products.get(3));
			System.out.println("The selected product is : "+getTextInWebElement(products.get(3)));
			productSelected = getTextInWebElement(products.get(3));
		}

	@Then("user should get the same product to be displayed that he clicked")
	public void user_should_get_the_same_product_to_be_displayed_that_he_clicked() throws InterruptedException {
		
		waitNumberOfWindowsPresent(2);
		
		Set<String> allWindows = driver.getWindowHandles();
		for (String child : allWindows) {
			if(!child.equals(parent)) {
				driver.switchTo().window(child);
			}
		}
		elementToBeVisible(pom.getAddToCart().getproductDisplayed());
		String productDisplayed =pom.getAddToCart().getproductDisplayed().getAttribute("title");
		System.out.println("The Product displayed is : "+productDisplayed);
		assertEquals(productSelected, productDisplayed);
		
	}

	@Then("user add that product to the cart")
	public void user_add_that_product_to_the_cart() {
		elementToBeVisible(pom.getAddToCart().getSelectedProductPrice());
		String selectedProductPrice = pom.getAddToCart().getSelectedProductPrice().getText();
		System.out.println("Selected Product Price is : "+selectedProductPrice);
		click(pom.getAddToCart().getAddToCart());
		String addedProductPrice = pom.getAddToCart().getAddedProductPrice().getText();
		System.out.println("The price of the product added in the cart : "+addedProductPrice);
		assertEquals(selectedProductPrice, addedProductPrice);
		

	}
}
