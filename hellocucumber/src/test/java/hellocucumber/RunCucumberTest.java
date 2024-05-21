package hellocucumber;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;       

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "hellocucumber" }, features = {"src/test/resources/hellocucumber"}, plugin = { "pretty", "json:src/test/resources/reports/cucumber.json", "html:src/test/resources/reports/cucumber.html" })    
public class RunCucumberTest {

}
