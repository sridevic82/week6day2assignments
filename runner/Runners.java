package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/java/features/mergelead.feature"},
glue="Step", monochrome=true,publish=true )
public class Runners extends AbstractTestNGCucumberTests {

}
