package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src//test//resourses//features//usewrAuthTest.feature",glue="definations")
public class UsewrAuthTest extends AbstractTestNGCucumberTests{

}
