Feature: Checking Login Functionality of the Application
  Scenario: Checking Login Functionality with Valid Username
    Given User is on Login Page
    Then user Enter the Username in User Text Box
    Then user Enter the Password in Password Text Box
    When user should click on Login Button
    Then user is on Homepage



  Scenario : Checking Login Functionality with inValid Username also
    Given User is on Login Page
    Then user Enter the Username in <userName> and enter the password <password>
    When user should click on Login Button
    Then user is on Homepage
#    Examples:
#      |userName  |password|
#      |Admin     |Qedge123!#@|



