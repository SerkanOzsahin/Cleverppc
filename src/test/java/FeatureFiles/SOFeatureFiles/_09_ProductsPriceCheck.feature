Feature: Products price check in cart

  Scenario: Products price check
    Given navigate to dresses
    When user selects three random products
    And user navigate to checkout from cart
    Then total price of the products should match with total products price
