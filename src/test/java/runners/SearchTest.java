package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src//test//resources//features//UserAuthentication.feature",
		glue="stepdefinations",
		monochrome=true,
		dryRun=false,
		plugin= {"pretty","html:target\\HTmlReport.html"})
public class SearchTest extends AbstractTestNGCucumberTests{

}