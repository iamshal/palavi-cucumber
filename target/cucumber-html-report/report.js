$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F01_LoginLogout.feature");
formatter.feature({
  "line": 1,
  "name": "Test the LoginLogout Feature of the application",
  "description": "",
  "id": "test-the-loginlogout-feature-of-the-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Valid login logout scenario",
  "description": "",
  "id": "test-the-loginlogout-feature-of-the-application;valid-login-logout-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I click on the \"My Account\" link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I am logged in using username \u003cuser\u003e and password \u003cpasswd\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on the Sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see \"Log Off\" link on page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I will click on the \"Log Off\" link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I will click on the \"Continue\" button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should see \"Welcome to 5ElementsLearning\" text on page.",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 13,
      "value": "#Then I should close the browser"
    }
  ],
  "line": 14,
  "name": "",
  "description": "",
  "id": "test-the-loginlogout-feature-of-the-application;valid-login-logout-scenario;",
  "rows": [
    {
      "cells": [
        "user",
        "passwd"
      ],
      "line": 15,
      "id": "test-the-loginlogout-feature-of-the-application;valid-login-logout-scenario;;1"
    },
    {
      "cells": [
        "\"def@xyz.com\"",
        "\"USER123\""
      ],
      "line": 16,
      "id": "test-the-loginlogout-feature-of-the-application;valid-login-logout-scenario;;2"
    },
    {
      "cells": [
        "\"abc@def.com\"",
        "\"USER123\""
      ],
      "line": 17,
      "id": "test-the-loginlogout-feature-of-the-application;valid-login-logout-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 746381,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I am on the osCommerce homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "browserFunctions.i_am_on_the_osCommerce_homepage()"
});
formatter.result({
  "duration": 12283859913,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Valid login logout scenario",
  "description": "",
  "id": "test-the-loginlogout-feature-of-the-application;valid-login-logout-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I click on the \"My Account\" link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I am logged in using username \"def@xyz.com\" and password \"USER123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on the Sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see \"Log Off\" link on page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I will click on the \"Log Off\" link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I will click on the \"Continue\" button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should see \"Welcome to 5ElementsLearning\" text on page.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "My Account",
      "offset": 16
    }
  ],
  "location": "loginLogout.i_click_on_the_link(String)"
});
formatter.result({
  "duration": 1399203319,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "def@xyz.com",
      "offset": 31
    },
    {
      "val": "USER123",
      "offset": 58
    }
  ],
  "location": "loginLogout.i_am_logged_in_using_username_and_password(String,String)"
});
formatter.result({
  "duration": 482632000,
  "status": "passed"
});
formatter.match({
  "location": "loginLogout.i_click_on_the_Sign_in_button()"
});
formatter.result({
  "duration": 1406497319,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Log Off",
      "offset": 14
    }
  ],
  "location": "loginLogout.i_should_see_link_on_page(String)"
});
formatter.result({
  "duration": 118340904,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Log Off",
      "offset": 21
    }
  ],
  "location": "loginLogout.i_will_click_on_the_link(String)"
});
formatter.result({
  "duration": 720372001,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Continue",
      "offset": 21
    }
  ],
  "location": "loginLogout.i_will_click_on_the_button(String)"
});
formatter.result({
  "duration": 898506341,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome to 5ElementsLearning",
      "offset": 14
    }
  ],
  "location": "loginLogout.i_should_see_text_on_page(String)"
});
formatter.result({
  "duration": 41627085,
  "status": "passed"
});
formatter.write("Current Page URL is http://5elementslearning.com/demosite/index.php");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1413567190,
  "status": "passed"
});
formatter.before({
  "duration": 355868,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I am on the osCommerce homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "browserFunctions.i_am_on_the_osCommerce_homepage()"
});
formatter.result({
  "duration": 8863762640,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Valid login logout scenario",
  "description": "",
  "id": "test-the-loginlogout-feature-of-the-application;valid-login-logout-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I click on the \"My Account\" link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I am logged in using username \"abc@def.com\" and password \"USER123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on the Sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see \"Log Off\" link on page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I will click on the \"Log Off\" link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I will click on the \"Continue\" button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should see \"Welcome to 5ElementsLearning\" text on page.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "My Account",
      "offset": 16
    }
  ],
  "location": "loginLogout.i_click_on_the_link(String)"
});
formatter.result({
  "duration": 1431411463,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc@def.com",
      "offset": 31
    },
    {
      "val": "USER123",
      "offset": 58
    }
  ],
  "location": "loginLogout.i_am_logged_in_using_username_and_password(String,String)"
});
formatter.result({
  "duration": 485601269,
  "status": "passed"
});
formatter.match({
  "location": "loginLogout.i_click_on_the_Sign_in_button()"
});
formatter.result({
  "duration": 1019540632,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Log Off",
      "offset": 14
    }
  ],
  "location": "loginLogout.i_should_see_link_on_page(String)"
});
