package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchInGoogleDefinations {
	@Given("navigate to google page")
	public void navigate()
	{
		System.out.println("on google page");
		}
	@When("I click search and enter")
	public void clicksearch()
	{
		System.out.println("searching...");
		}

	@Then("I should redirect to search result page")
	public void redirect()
	{
		System.out.println("redirected to search page");
		}

	
}
