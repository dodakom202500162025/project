@Signup
Feature: F01_Signup user can sign up without errors
  Scenario: Verify that User Can Sign Up Successfully
    Given Click on the Sign up button in the Header
    When Fill in the username
    And password
    And Click on the Sign Up button
    Then A success message should be displayed