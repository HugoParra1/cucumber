package hellocucumber;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;       

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "hellocucumber" }, features = {"src/test/resources/hellocucumber"}, plugin = { "pretty", "json:target/surefire-reports/cucumber.json", "html:target/surefire-reports/cucumber.html" })    
public class RunCucumberTest {

}
// import org.junit.platform.suite.api.ConfigurationParameter;
// import org.junit.platform.suite.api.IncludeEngines;
// import org.junit.platform.suite.api.SelectClasspathResource;
// import org.junit.platform.suite.api.Suite;

// import static
// io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

// @Suite
// @IncludeEngines("cucumber")
// @SelectClasspathResource("hellocucumber")
// @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
// public class RunCucumberTest {
// }
