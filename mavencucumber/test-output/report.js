$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HP/eclipse-workspace/mavencucumber/data-table.feature");
formatter.feature({
  "line": 1,
  "name": "facebooklogin",
  "description": "",
  "id": "facebooklogin",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "facebook login",
  "description": "",
  "id": "facebooklogin;facebook-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "i am on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "i enter username",
  "rows": [
    {
      "cells": [
        "abhijeet"
      ],
      "line": 5
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "i enter \"p012bk1\" and click login",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "i can enter user account",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_defination.facebookpage()"
});
formatter.result({
  "duration": 13583809500,
  "status": "passed"
});
formatter.match({
  "location": "Step_defination.enterusername(DataTable)"
});
formatter.result({
  "duration": 331514000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "p012bk1",
      "offset": 9
    }
  ],
  "location": "Step_defination.enterpassword(String)"
});
formatter.result({
  "duration": 146080100,
  "status": "passed"
});
formatter.match({
  "location": "Step_defination.enteraccount()"
});
formatter.result({
  "duration": 3521737800,
  "status": "passed"
});
});