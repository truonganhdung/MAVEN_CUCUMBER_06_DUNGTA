@login
Feature: Login to System

  Scenario: Register to application
    Given I get Login page URL
    And I click the here link
    And I put to Email textbox with data "autorandom"
    And I click to Submit button at Register page
    Then I get UserID info
    And I get Passowrd info
    When I open Login page again

  Scenario: Login to application
    Given I input to Username textbox
    And I input to Password textbox
    And I click to Login button at Login page
    Then Verify Home page display with message "Welcome to Manager's Page of Guru99 Bank"
