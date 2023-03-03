package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features",
		glue = "StepDef",
		//dryRun = true,
	//	monochrome = true,
		plugin = {"pretty"}
		)


public class Run {

	//This will be empty
}
