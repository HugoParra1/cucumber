package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
// import io.cucumber.java.en_old.Thathe;
// import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * InnerStepDefinitions
 */
class IsItFriday {
    static String isFriday(String day) {
        return day.equals("Friday") ? "Yes" : "No";

    };
};
class IsItDay {
    static String isDay(String day, String expected) {
        return day.equals(expected) ? "Yes" : "No";
    };
};

public class StepDefinitions {
    private String today;
    private String answer;

    @Given("it is Sunday")
    public void it_is_sunday() {
        today = "Sunday";
        // throw new io.cucumber.java.PendingException();
    }

    @Given("it is Friday")
    public void it_is_friday() {
        today = "Friday";
        // throw new io.cucumber.java.PendingException();
    }

    @Given("today is {string}")
    public void today_is(String string) {
        today = string;
        // throw new io.cucumber.java.PendingException();
    };

    @When("I ask if it's {string}")
    public void i_ask_if_it_s(String string) {
        answer = IsItDay.isDay(today, string);
        // throw new io.cucumber.java.PendingException();
    }   
    @When("I ask if it's friday")
    public void i_ask_if_it_s_friday() {
        answer = IsItFriday.isFriday(today);
        // throw new io.cucumber.java.PendingException();
    }

    @Then("I should get told its {string}")
    public void i_should_get_told_i_ts(String string) {
        assertEquals(string, answer);
        // throw new io.cucumber.java.PendingException();
    }

}

