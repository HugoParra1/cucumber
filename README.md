# Proyecto de Pruebas con Cucumber

Este proyecto utiliza Cucumber para realizar pruebas basadas en escenarios escritos en Gherkin. A continuación, se presenta una descripción de los escenarios de prueba, el código de las pruebas y cómo ejecutar los tests. Los reportes de los tests se generan en el directorio `surefire-reports`.

## Escenarios de Prueba

### Feature: Friday_test

Todos quieren saber si hoy es viernes.

#### @Friday

##### Scenario Outline: Today is or is not Friday

```gherkin
Given today is "<day>"
When I ask if it's "<expected>"
Then I should get told it's "<answer>"
```

###### @Friday1

```gherkin
Examples:
  | day    | expected | answer |
  | Friday | Friday   | Yes    |
  | Sunday | Friday   | No     |
```

###### @Friday2

```gherkin
Examples:
  | day           | expected | answer |
  | Saturday      | Friday   | No     |
  | Anything else | Friday   | No     |
```

#### @Saturday

##### Scenario Outline: Today is or is not Saturday

```gherkin
Given today is "<day>"
When I ask if it's "<expected>"
Then I should get told it's "<answer>"
```

###### @Saturday1

```gherkin
Examples:
  | day    | expected | answer |
  | Friday | Saturday | No     |
  | Sunday | Saturday | No     |
```

###### @Saturday2

```gherkin
Examples:
  | day           | expected | answer |
  | Saturday      | Saturday | Yes    |
  | Anything else | Saturday | No     |
```

## Step Definitions

```java
package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IsItFriday {
    static String isFriday(String day) {
        return day.equals("Friday") ? "Yes" : "No";
    }
}

class IsItDay {
    static String isDay(String day, String expected) {
        return day.equals(expected) ? "Yes" : "No";
    }
}

public class StepDefinitions {
    private String today;
    private String answer;

    @Given("it is Sunday")
    public void it_is_sunday() {
        today = "Sunday";
    }

    @Given("it is Friday")
    public void it_is_friday() {
        today = "Friday";
    }

    @Given("today is {string}")
    public void today_is(String day) {
        today = day;
    }

    @When("I ask if it's {string}")
    public void i_ask_if_it_s(String expected) {
        answer = IsItDay.isDay(today, expected);
    }

    @When("I ask if it's friday")
    public void i_ask_if_it_s_friday() {
        answer = IsItFriday.isFriday(today);
    }

    @Then("I should get told its {string}")
    public void i_should_get_told_its(String expected) {
        assertEquals(expected, answer);
    }
}
```

## Ejecutar las Pruebas

Para ejecutar las pruebas, puedes usar el siguiente comando en la terminal:

```sh
mvn test
```

Para ejecutar tests específicos basados en tags, utiliza:

```sh
mvn test -Dcucumber.filter.tags="@Friday"
```

Los reportes de las pruebas se generan en el directorio `Resources`. Aquí puedes encontrar detalles sobre las pruebas ejecutadas, incluyendo cuáles pasaron y cuáles fallaron.
