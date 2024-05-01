
Feature: To test the login functionality

  Scenario: To test the login functionality with valid data
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user should navigate to homepage
    
    Scenario Outline:To test the login functionality with valid data
    Given user is on login page
    When user enters username as "<un>" and password as "<pass>"
    And click on login button
    Then user should navigate to homepage


Examples:
|un|pass|
|Admin|admin123|
|abc@gmail.com|abc@123|
|def@gmail.com|def123|
  