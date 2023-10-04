Feature: Checking Products Added Cart

  Background:
    Given Navigate to website
    When User click on "SignButton"
    Then Enter E-mail adress And Password
    And Click on Sing in

  Scenario: User checks the products
    Given navigate to dresses page
    When User chooses random products
    Then User verifies that there are three products in shopping cart
