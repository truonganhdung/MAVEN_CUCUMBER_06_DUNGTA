@account
Feature: DYNAMIC feature

  @register
  Scenario: Register to application
    Given I get Login page URL
    And I click the here link
    And I put to Email textbox with data "autorandom"
    And I click to Submit button at Register page
    Then I get UserID info
    And I get Passowrd info
    When I open Login page again

  @new_customer
  Scenario Outline: Create new Customer
    Given: I open "New Customer" page
    When: I input to "name" textbox with data "<Name>"
    And: I input to "dob" textbox with data "<DateOfBirth>"
    And: I input to "addr" textbox with data "<Address>"
    And: I input to "city" textbox with data "<City>"
    And: I input to "state" textbox with data "<State>"
    And: I input to "pinno" textbox with data "<Pin>"
    And: I input to "telephoneno" textbox with data "<Phone>"
    And: I open "Edit Customer" page
    And: I open "Delete Customer" page
    And: I open "Manager" page
    And: I open "Deposit" page
    


    Examples: New Customer info
      | Name      | DateOfBirth | Address | City     | State  | Pin    | Phone     | Email    | Password | Message                             |
      | Auto test | 1999-01-01  | 123 VVT | HCM City | BThanh | 123456 | 023940026 | autotest |   123123 | Customer Registered Successfully!!! |
