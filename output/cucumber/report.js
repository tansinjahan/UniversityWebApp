$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/login/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2836011781,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Clerk logging in",
  "description": "",
  "id": "login;clerk-logging-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the clerk visits login page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "enters \"clerk\" and \"password\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "the clerk sees clerk\u0027s home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.the_clerk_visits_login_page()"
});
formatter.result({
  "duration": 1519448692,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "clerk",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 20
    }
  ],
  "location": "StepDefinitions.enter_and(String,String)"
});
formatter.result({
  "duration": 423643232,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.the_clerk_sees_clerk_s_home_page()"
});
formatter.result({
  "duration": 77067214,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 473596632,
  "status": "passed"
});
formatter.before({
  "duration": 1996823995,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Student logging in",
  "description": "",
  "id": "login;student-logging-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@RunThis"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "the student visits login page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "enters wrong username and password",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the student sees login error message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.the_student_visits_login_page()"
});
formatter.result({
  "duration": 1397315196,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.enters_username_and_password()"
});
formatter.result({
  "duration": 478842416,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.the_student_sees_student_s_home_page()"
});
formatter.result({
  "duration": 66741422,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 456105052,
  "status": "passed"
});
});