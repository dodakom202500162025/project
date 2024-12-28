@Smoke
Feature: The user should be logged in
  Scenario: Verify that the user can log in successfully
    Given Click on the Log in button in the Header
    When Fill in the username  in the login form
    And password  in the login form
    And Click on the Log In button
    Then The account should open successfully, and the user should be logged in