package Casestudystepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import CaseStudypractice1.CheckoutPage;
import CaseStudypractice1.HomePage;
import CaseStudypractice1.ProductListingPage;
import CaseStudypractice1.cart;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Casestudydef {
	WebDriver driver;
	HomePage home;
	ProductListingPage productListingPage;
	cart cartPage;
	CheckoutPage checkoutPage;
	
	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page(){
		System.setProperty("webdriver.chrome.driver","C:\\ToolsQA\\Libs\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.shop.demoqa.com");
	}
	
	@When("^he search for \"([^\"]*)\"$")
	public void he_search_for(String product)  {
		HomePage home = new HomePage(driver);
		home.perform_Search(product);
	}
	
	@When("^choose to buy the first item$")
	public void choose_to_buy_the_first_item() {
		ProductListingPage productListingPage = new ProductListingPage(driver);
		productListingPage.select_Product(0);
		productListingPage.clickOn_AddToCart();		
	}
	
	@When("^moves to checkout from mini cart$")
	public void moves_to_checkout_from_mini_cart(){
		cart cartPage = new cart(driver);
		cartPage.clickOn_Cart();
		cartPage.clickOn_ContinueToCheckout();	
	}
	@When("^enter personal details on checkout page$")
	public void enter_personal_details_on_checkout_page() throws InterruptedException {
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.fill_PersonalDetails();	
	}
	@When("^select same delivery address$")
	public void select_same_delivery_address() throws InterruptedException{
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.check_ShipToDifferentAddress(false);
	}
	@When("^select payment method as \"([^\"]*)\" payment$")
	public void select_payment_method_as_payment(String arg1){
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.select_PaymentMethod("CheckPayment");
	}
	@When("^place the order$")
	public void place_the_order() throws InterruptedException {
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.check_TermsAndCondition(true);
		checkoutPage.clickOn_PlaceOrder();
		
		driver.quit();
	}
	
	
	
	
	

}
