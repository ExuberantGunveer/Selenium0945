$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/GunveerSingh/Desktop/My Work/JavaOne/FrameWork/src/main/java/FeatureFile/Login.feature");
formatter.feature({
  "name": "Checking Login Functionality of the Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Checking Login Functionality with Valid Username",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTestBDD.user_is_on_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter the Username in User Text Box",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestBDD.user_Enter_the_Username_in_User_Text_Box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter the Password in Password Text Box",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestBDD.user_Enter_the_Password_in_Password_Text_Box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click on Login buttn",
  "keyword": "When "
});
formatter.match({
  "location": "LoginTestBDD.user_should_click_on_Login_buttn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestBDD.user_is_on_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestBDD.Close_the_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Forgot your Password Link",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTestBDD.user_is_on_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Forgot Password Link",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestBDD.click_on_Forgot_Password_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestBDD.Close_the_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Checking Login Functionality with inValid Username also",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "user Enter the Username in \"\u003cuserName\u003e\" and enter the password \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user should click on Login buttn",
  "keyword": "When "
});
formatter.step({
  "name": "user should get Invalid Credential Message",
  "keyword": "Then "
});
formatter.step({
  "name": "Close the Browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "Admin",
        "Qedge123!@"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Checking Login Functionality with inValid Username also",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTestBDD.user_is_on_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter the Username in \"Admin\" and enter the password \"Qedge123!@\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestBDD.user_Enter_the_Username_in_and_enter_the_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click on Login buttn",
  "keyword": "When "
});
formatter.match({
  "location": "LoginTestBDD.user_should_click_on_Login_buttn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get Invalid Credential Message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestBDD.user_should_get_Invalid_Credential_Message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestBDD.Close_the_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Checking Login  with Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTestBDD.user_is_on_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the valid Credentials and Click Login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestBDD.Enter_the_valid_Credentials_and_Click_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestBDD.Close_the_Browser()"
});
formatter.result({
  "status": "passed"
});
});