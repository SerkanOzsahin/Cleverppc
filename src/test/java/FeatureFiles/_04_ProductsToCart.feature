Feature: Adding Products to Cart

  Background:
    Given Navigate to website
    When User click on "SignButton"
    Then Enter E-mail adress And Password
    And Click on Sing in

  Scenario: User adds a product to the cart
    Given navigate to summer dresses
    When user selects a random product
    Then user clicks on the add to cart button
    And product should be successfully added to the cart
