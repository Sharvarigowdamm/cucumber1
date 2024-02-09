package definations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepdefination {
@Given("I am on the login page")
public void I_am_on_the_login_page()
{
	System.out.println("on login page");
	}
@When("I click the login button ")
public void clickLogin()
{
	System.out.println("click login");
	}

@Then("I should be redirected to the dashboard")
public void redirect()
{
	System.out.println("redirect to dashboard page");
	}

@Then("I should see a welcome message")
public void enterValidCreds()
{
	System.out.println("welcome page should be displayed");
	}




}







