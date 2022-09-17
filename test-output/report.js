$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Selenium_WorkSpace/CucumberPOM/src/test/java/com/crm/qa/featues/FreeCRM.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Free CRM Home Page",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user logs on",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "home page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate logged in username",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user quit the brwoser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStepDefinitons.user_opens_browser()"
});
formatter.result({
  "duration": 6599271800,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinitons.user_is_on_login_page()"
});
formatter.result({
  "duration": 58803000,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinitons.user_logs_on()"
});
formatter.result({
  "duration": 4566719300,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinitons.home_page_is_displayed()"
});
formatter.result({
  "duration": 15760900,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinitons.validate_logged_in_username()"
});
formatter.result({
  "duration": 285767800,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinitons.user_quit_the_brwoser()"
});
formatter.result({
  "duration": 767810700,
  "status": "passed"
});
});