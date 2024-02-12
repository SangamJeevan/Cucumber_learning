Feature: Login Functionality for a E-Commerce Website
  Background:
    Given I am on login page
  Scenario: Logged in successfully with valid credentials
    Given I have entered valid username and password
    When I clicked on the login button
    Then I have logged in successfully

  Scenario: Navigate to forgot password page
    When I clicked on the Forgotten password link
    Then I should be redirected to the password reset page