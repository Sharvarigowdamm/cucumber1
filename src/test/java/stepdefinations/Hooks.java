package stepdefinations;

import BasePage.Base;
import io.cucumber.java.Scenario;

public class Hooks {

	
	public static void setupDriver()
	{
		Base.initDriver();
	}
	
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			TakesScreen
		}
	}
}
