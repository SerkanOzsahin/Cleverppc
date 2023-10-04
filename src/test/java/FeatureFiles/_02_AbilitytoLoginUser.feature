Feature:Ability to Login User

  Background:
    Given  Navigate to Site
    When Click "SingButton"

  Scenario: Login Functionality
    Then Enter E-mail adress And Password
    And Click on Sing in
