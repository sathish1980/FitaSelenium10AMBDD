package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/Features/MAkeMyTripDD.feature","src/test/java/Features/MAkeMyTrip.feature"},
glue="Stepdefenitions",monochrome=true,publish=true,tags="not @Sanity")
public class TestRunner {

}
