$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/demoBlaze.feature");
formatter.feature({
  "name": "feature to test registration, login and laptop purchase functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.scenario({
  "name": "Check sign up is successful",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enters the site",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.SmokeSteps_PF.user_enters_the_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on sign up page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SmokeSteps_PF.user_is_on_sign_up_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.SmokeSteps_PF.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on sign up button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SmokeSteps_PF.clicks_on_sign_up_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is successfully registered",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.SmokeSteps_PF.user_is_successfully_registered()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Check that the login and logout is correct with valid user and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enters the site DemoBlaze",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.SmokeSteps_PF.user_enters_the_site_DemoBlaze()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on log in page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SmokeSteps_PF.user_is_on_log_in_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password valid",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.SmokeSteps_PF.user_enters_username_and_password_valid()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on log in button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SmokeSteps_PF.clicks_on_log_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user successfully logged in",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SmokeSteps_PF.user_successfully_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on log out button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SmokeSteps_PF.clicks_on_log_out_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is successfully log out",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.SmokeSteps_PF.user_is_successfully_log_out()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Add laptop to cart and validate",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enters the site Demo",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.SmokeSteps_PF.user_enters_the_site_Demo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on laptops",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SmokeSteps_PF.user_clicks_on_laptops()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects one laptop",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.SmokeSteps_PF.user_selects_one_laptop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate name and price",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SmokeSteps_PF.validate_name_and_price()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SmokeSteps_PF.click_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate product added",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SmokeSteps_PF.validate_product_added()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SmokeSteps_PF.click_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate product in cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.SmokeSteps_PF.validate_product_in_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});