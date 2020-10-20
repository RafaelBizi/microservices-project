@Hook
Feature: Test Hooks

  Scenario Outline: This scenario is to test hooks functionality
    Given this is the first step
    When this is the second step
    Then this is the third step

    Examples:
    | Scenario |
    | First    |
    | Second   |
    | Third    |

  Scenario: This scenario is to test second hooks functionality
    Given this is the first step - test second
    When this is the second step - test second
    Then this is the third step - test second