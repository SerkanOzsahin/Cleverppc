Feature: Search Null

  Background:
    Given Navigate to website
    When User click on "SignButton"
    Then Enter E-mail adress And Password
    And Click on Sing in

  Scenario: Search Null
    When user search with null
    Then warning message should be displayed
