Feature:Sending E-mail

  Background:
    Given Navigate to website
    When User click on "SignButton"
    Then Enter E-mail adress And Password
    And Click on Sing in

  Scenario: Sending E-Mail
    And Click Contact Us button
    Then Select SubjectHeading,Order Reference
    And  Select Product and Send Massage
    Then Click Attach File
    And Upload File with RobotClass
    Then Click Send Product
    And Successfully sending
