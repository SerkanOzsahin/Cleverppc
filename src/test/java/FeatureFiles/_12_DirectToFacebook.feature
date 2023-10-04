Feature: Direct to Facebook

  Background:
    Given Navigate to website
    When User click on "SignButton"
    Then Enter E-mail adress And Password
    And Click on Sing in

  Scenario: Direct to Facebook
    When user clicks on the facebook link
    Then user should be directed to facebook website
