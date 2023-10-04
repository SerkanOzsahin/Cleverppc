Feature: Adding new address user account

  Background:
    Given  Navigate to Site
    When Click "SingButton"
    Then Enter E-mail adress And Password
    And Click on Sing in

  Scenario: User adds a new address

    When user clicks on the sitemap link and directed to the sitemap page
    Then user clicks on the address link and directed to the address page
    And user clicks on the add a new address button
    Then user fills all required fields
      | nameInput     | Srk         |
      | lastnameInput | Ozs         |
      | addressInput  | Atakoy      |
      | cityInput     | Istanbul    |
      | zipCode       | 00034       |
      | phone         | 1112223334  |
      | addressAlias  | My address2 |

    And address should be successfully added
