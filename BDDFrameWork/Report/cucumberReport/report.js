$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/FeatureFile/Login.feature");
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
  "location": "login.User_is_on_Login_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user Enter the Username in User Text Box",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_Enter_the_Username_in_User_Text_Box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user Enter the Password in Password Text Box",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_Enter_the_Password_in_Password_Text_Box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should click on Login Button",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_should_click_on_Login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is on Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_is_on_Homepage()"
});
formatter.result({
  "status": "skipped"
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
  "name": "user should click on Login Button",
  "keyword": "When "
});
formatter.step({
  "name": "user is on Homepage",
  "keyword": "Then "
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
        "Qedge123!#@"
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
  "location": "login.User_is_on_Login_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user Enter the Username in \"Admin\" and enter the password \"Qedge123!#@\"",
  "keyword": "Then "
});
formatter.match({
  "location": "login.userEneterValue(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should click on Login Button",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_should_click_on_Login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is on Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_is_on_Homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("src/main/java/FeatureFile/LoginNew.feature");
formatter.feature({
  "name": "Checking Login Functionality of New Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Checking Login Functionality with Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User must be on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginNew.User_must_be_on_Login_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the Valid Username and Valid Password",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "Admin",
        "Qedge123!@#"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginNew.Enter_the_Valid_Username_and_Valid_Password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginNew.Click_on_Login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("src/main/java/FeatureFile/LoginOne.feature");
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
  "name": "User on Login Page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user must Enter the Username in User Text Box",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user must Enter the Password in Password Text Box",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user must click on Login Button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should be on Homepage",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});