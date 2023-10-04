Feature: Register Functionality

  Scenario: Successful Register

    Given Navigate to website
    When User click on "SignButton"
    And Write "Email" and click "CreateAcc"
    Then Select "MrSelect",Enter "Firstname","LastName","Password" and Date of Birth
    And Click Register Button
    Then User should login successfully
