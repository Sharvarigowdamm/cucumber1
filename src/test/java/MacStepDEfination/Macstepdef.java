package MacStepDEfination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import BasePage.Base;
import Page.HomePage;
import Page.SearchResultPage;
import Page.ShoppingCartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Macstepdef {
	
	WebDriver driver=Base.getDriver();
	HomePage homepage;
	SearchResultPage resultPage;
	ShoppingCartPage cartPage;
	
	public Macstepdef() {
		System.out.println(driver);
		homepage= new HomePage(driver);
		resultPage=new SearchResultPage(driver);
		cartPage=new ShoppingCartPage(driver);
		
	}
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		Base.openUrl("https://danube-webshop.herokuapp.com/");
	}
	@When("user search an item {string}")
	public void user_search_an_item(String item) {
	    // Write code here that turns the phrase above into concrete actions
	    homepage.searchItem(item);
	}
	@Then("item must be listed")
	public void item_must_be_listed() {
	   Assert.assertTrue(resultPage.isItemListed());
	}
	
	@Given("User should be on search result page")
	public void user_should_be_on_search_result_page() {
	  resultPage.viewItemdetail();
	}
	@When("iuser add item to cart")
	public void iuser_add_item_to_cart() {
	   resultPage.addToCart();
	}
	@Then("item must be added")
	public void item_must_be_added() {
     Assert.assertTrue(cartPage.isItemAdded());

	}@When("user do checkout")
	public void user_do_checkout() {

    cartPage.doCheckout();
	}
	@Then("should navigate to checkout page")
	public void should_navigate_to_checkout_page() {

      System.out.println("navigated to checkout page");
	}

}
