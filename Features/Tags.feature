Feature: Tag example demo
@Smoke
Scenario: Example 1
Given user is on login page
When user enters valid data
And click on login page
Then user login successfully

@Sanity
Scenario: Example 2
Given user is on login page
When user enters valid data
And click on login page
Then user login successfully

@Smoke
Scenario: Example 3
Given user is on login page
When user enters valid data
And click on login page
Then user login successfully