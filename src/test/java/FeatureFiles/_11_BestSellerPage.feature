Feature: Best Seller Page

  Background:
    Given Navigate to website
    When User click on "SignButton"
    Then Enter E-mail adress And Password
    And Click on Sing in

  Scenario: Best Seller Page
    When user clicks on best sellers
    Then best sellers page should be displayed
