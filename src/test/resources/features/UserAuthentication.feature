Feature: User AuthenticationAs a registered user
I want to log in to the system
so that i can access my account

Scenario: valid User Login
Given I am on the login page
When I enter valid credentials 
And I click the login button
Then I should be redirected to the dashboard
And I should see a welcome message
