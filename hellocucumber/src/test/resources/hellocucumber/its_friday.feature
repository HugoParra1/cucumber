Feature: Friday_test
    everybody wants to know if it's friday

    Scenario: Sunday is not friday
        Given it is Sunday
        When I ask if it's friday
        Then I should get told i'ts "No"