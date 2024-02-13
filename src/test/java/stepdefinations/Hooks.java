package stepdefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BasePage.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	/*
	 * private Base testbase; public Hooks(Base testbase) {
	 * 
	 * this.testbase=testbase; }
	 */
	@Before
	public static void setupDriver()
	{
		Base.initDriver();
	}
	@After
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			TakesScreenshot screen=(TakesScreenshot)Base.getDriver();
			byte[] imgBytes=screen.getScreenshotAs(OutputType.BYTES);
			scenario.attach(imgBytes, "image/png", "ScreenImage");
		}
	}
}
