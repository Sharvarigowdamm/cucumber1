package MacbookRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src//test//resources//Macbook//MacbookPractice.feature",
		glue="MacbookRunner",
		monochrome=true,
		plugin= {"pretty","html:target\\HTmlReport.html"})
public class MacbookRunner extends AbstractTestNGCucumberTests{

}
