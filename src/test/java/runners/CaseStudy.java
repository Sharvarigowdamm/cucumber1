package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src//test//resources//features//CaseStudy.feature",
		glue="Casestudydef",
		monochrome=true,
		plugin= {"pretty","html:target\\HTmlReport.html"})
public class CaseStudy extends AbstractTestNGCucumberTests{

}
