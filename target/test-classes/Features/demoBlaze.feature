@SmokeTest
Feature: feature to test registration, login and laptop purchase functionality

  Scenario: Check sign up is successful
    Given user enters the site
    And user is on sign up page
    When user enters username and password
    And clicks on sign up button
    Then user is successfully registered

  Scenario: Check that the login and logout is correct with valid user and password
    Given user enters the site DemoBlaze
    And user is on log in page
    When user enters username and password valid
    And clicks on log in button
    And user successfully logged in
    And clicks on log out button
    Then user is successfully log out

  Scenario: Add laptop to cart and validate
    Given user enters the site Demo
    And user clicks on laptops
    When user selects one laptop
    And validate name and price
    And click add to cart
    And validate product added
    And click cart
    Then validate product in cart
