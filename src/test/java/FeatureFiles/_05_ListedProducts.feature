Feature: Controlling Number Listed Products

  Background:
    Given Navigate to website
    When User click on "SignButton"
    Then Enter E-mail adress And Password
    And Click on Sing in

  Scenario: Verify the product list on the dresses category
    Given navigate to dresses
    When user is at the dresses page
    Then user should see there are five products
    And user counts the number of products listed on the page
    Then user verifies that the count matches the numbers in step three and step four
