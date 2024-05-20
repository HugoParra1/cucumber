package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
// import io.cucumber.java.en_old.Thathe;
// import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    private String today;
    private String answer;

    @Given("it is Sunday")
    public void it_is_sunday() {
        today = "Sunday";
        // throw new io.cucumber.java.PendingException();
    }

    @When("I ask if it's friday")
    public void i_ask_if_it_s_friday() {
        if (today.equals("friday")) {
            answer = "Yes";
        } else {
            answer = "No";
        }
        // throw new io.cucumber.java.PendingException();
    }

    @Then("I should get told i'ts {string}")
    public void i_should_get_told_i_ts(String string) {
        assertEquals(string, answer);
        // throw new io.cucumber.java.PendingException();
    }
}
