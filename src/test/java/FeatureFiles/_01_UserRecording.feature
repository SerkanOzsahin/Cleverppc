Feature: Login Functionality

  Scenario: Login to Site

    Given  Navigate to Site
    When Click "SingButton"
    And Write "Email" and Click "CreateAcc"
    Then Select "MrSelect",Enter "Firstname","LastName","Password" and Date of Birth
    And Click Register Button
    Then User should login successfully
