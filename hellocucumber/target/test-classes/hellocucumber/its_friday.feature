Feature: Friday_test
  everybody wants to know if it's friday

  @Friday
  Scenario Outline: Today is or is not Friday
    Given today is "<day>"
    When I ask if it's "<expected>"
    Then I should get told its "<answer>"
    @Friday1
    Examples:
      | day    | expected | answer |
      | Friday | Friday   | Yes    |
      | Sunday | Friday   | No     |
    @Friday2
    Examples:
      | day           | expected | answer |
      | Saturday      | Friday   | No     |
      | Anything else | Friday   | No     |

  @Saturday
  Scenario Outline: Today is or is not Saturday
    Given today is "<day>"
    When I ask if it's "<expected>"
    Then I should get told its "<answer>"
    @Saturday1
    Examples:
      | day    | expected | answer |
      | Friday | Saturday | No     |
      | Sunday | Saturday | No     |
    @Saturday2
    Examples:
      | day           | expected | answer |
      | Saturday      | Saturday | Yes    |
      | Anything else | Saturday | No     |