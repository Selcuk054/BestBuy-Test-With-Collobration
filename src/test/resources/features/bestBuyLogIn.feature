Feature: US001 Login Screen App

  @gp1

  Scenario: 1- User should new register.

    Given Naviate to the URL
    Then  Verify that home page is visible successfully
    And   Click on 'Account' button
    And   Verify 'Create Account!' is visible and click
    And   Enter First Name, LastNAme, Email, Password, Confirm Password, Click Crate an Account
    And   Verify 'New User Signup!' is visible


