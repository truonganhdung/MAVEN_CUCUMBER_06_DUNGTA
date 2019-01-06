@login
Feature: Login to System

  @login_valid
  Scenario: Login with data valid
    Given I open to application
    When I input to username textbox with data ""
    And I input to password textbox with data ""
    And I click to LOGIN button
    Then Verify homepage displayed
