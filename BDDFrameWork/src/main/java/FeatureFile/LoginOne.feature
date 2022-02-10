Feature: Checking Login Functionality of the Application
  Scenario: Checking Login Functionality with Valid Username
    Given User on Login Page
    Then user must Enter the Username in User Text Box
    Then user must Enter the Password in Password Text Box
    When user must click on Login Button
    Then user should be on Homepage
