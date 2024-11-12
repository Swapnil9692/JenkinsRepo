package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions

(
	features= {"src\\test\\resources\\login.feature"},
	glue = {"stepDefination"},
	plugin= {"pretty","html:target/cucumber-reports/exectuion.html"},
	publish = true
)

public class RunnerClass extends AbstractTestNGCucumberTests{
	
	

}
