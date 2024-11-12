package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions

(
	features= {"src\\test\\resources\\login.feature"},
	glue = {"stepDefination"},
	plugin= {"pretty"}
)

public class RunnerClass extends AbstractTestNGCucumberTests{
	
	

}