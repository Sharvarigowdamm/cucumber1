package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src//test//resources//features//googlesearch.feature",
		glue="stepdefinations",
		monochrome=true,
		plugin= {"pretty","html:target\\HTmlReport.html"})
public class Googlehandson extends AbstractTestNGCucumberTests{

}
