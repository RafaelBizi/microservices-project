@FunctionalTest
Feature: ECommerce Application

  @SmokeTest @RegressionTest
  Scenario: Successful Login
    Given Testing 1

  @RegressionTest
  Scenario: UnSuccessful Login
    Given Testing 2

  @SmokeTest
  Scenario: Add a product to bag
    Given Testing 3

  Scenario: Add multiple product to bag
    Given Testing 4

  @SmokeTest @RegressionTest
  Scenario: Remove a product from bag
    Given Testing 5

  @RegressionTest
  Scenario: Remove all products from bag
    Given Testing 6

  @SmokeTest
  Scenario: Increase product quantity from bag page
    Given Testing 7

  Scenario: Decrease product quantity from bag page
    Given Testing 8

  @SmokeTest @End2End
  Scenario: Buy a product with cash payment
    Given Testing 9

  @SmokeTest @End2End
  Scenario: Buy a product with CC payment
    Given Testing 10

  @End2End
  Scenario Outline: Payment declined
    Given Testing 11
    Examples:
      |PaymentMethod|
      |CC Card|
      |DD Card|
      |Bank Transfer|
      |PayPal|
      |Cash|