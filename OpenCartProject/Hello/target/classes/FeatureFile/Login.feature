Feature: Checking Login Functionality of the Application
  Scenario: Checking Login Functionality with Valid Username
    Given User is on Login Page
    Then user Enter the Username in User Text Box
    And user Enter the Password in Password Text Box
    When user should click on Login buttn
    Then user is on Homepage
    And Close the Browser


  Scenario: Forgot your Password Link
			Given User is on Login Page
			Then Click on Forgot Password Link
			And Close the Browser

  Scenario Outline: Checking Login Functionality with inValid Username also
    Given User is on Login Page
    Then user Enter the Username in "<userName>" and enter the password "<password>"
    When user should click on Login buttn
    Then user should get Invalid Credential Message
    And Close the Browser
    Examples:
      | userName | password |
      |   Admin  |Qedge123!@ |
      
      
 Scenario: Checking Login  with Valid Credentials
			Given User is on Login Page
			Then Enter the valid Credentials and Click Login
			And Close the Browser



