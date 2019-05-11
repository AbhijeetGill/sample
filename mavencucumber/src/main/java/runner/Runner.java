package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="C:\\Users\\HP\\eclipse-workspace\\mavencucumber\\data-table.feature"
	,glue=("stepdefination"),format= {"pretty","html:test-output"},monochrome=true
)

public class Runner {

}
