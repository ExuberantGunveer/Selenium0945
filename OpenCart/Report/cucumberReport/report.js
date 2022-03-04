$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/GunveerSingh/Desktop/My Work/New folder/OpenCart/src/main/java/FeatureFile/AccountPage.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Editting the Account Details Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on Login Page and enter the Valid Credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "AccountDetails_BDDTest.user_is_on_Login_Page_and_enter_the_Valid_Credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the PIN",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountDetails_BDDTest.enter_the_PIN()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Account Details",
  "keyword": "When "
});
formatter.match({
  "location": "AccountDetails_BDDTest.click_on_Account_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Edit the Account Details",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountDetails_BDDTest.edit_the_Account_Details()"
});
formatter.result({
  "status": "passed"
});
});