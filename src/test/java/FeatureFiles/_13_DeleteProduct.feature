Feature: _12_DeleteProduct

  Background:
    Given  Navigate to Site
    When Click "SingButton"
    Then Enter E-mail adress And Password
    And Click on Sing in

  Scenario: Delete Product
    Then Enter Product Searchbox
    And  i able to pick one of them
    Then Click Add to Cart and i should click Checkout
    And i able to Click Deletebutton
