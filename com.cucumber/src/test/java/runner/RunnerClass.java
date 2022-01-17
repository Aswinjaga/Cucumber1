package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featureFiles/DatatableUsingHeader.feature", glue="stepDefinitions")
public class RunnerClass {
	
    //it shpuld combine feature file and step definition
	//runner define
	
	
}
