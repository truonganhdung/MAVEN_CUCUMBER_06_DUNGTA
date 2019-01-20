Feature: Login to System

  @demo
  Scenario Outline: Login to Bankguru99
    Given I input to Username textbox with data "<User>"
    And I input to Password textbox with data "<Pass>"
    And I click to Login button at Login page
    Then Verify Home page display with message "Welcome to Manager's Page of Guru99 Bank"
    And Verify UserID displayed correct with data "<User>"

    Examples: Login data
      | User       | Pass    |
      | mngr172599 | bYbYbun |
      | mngr173310 | yrYvYve |
      | mngr173311 | AdeqAga |

  Scenario Outline: I create new Customer
    Given: I open New Customer page
    When Input to New Customer form with data
      | Name   | Gender | DateOfBirth   | Address   | City   | State   | Pin   | Phone   | Email   | Password   |
      | <Name> | m      | <DateOfBirth> | <Address> | <City> | <State> | <Pin> | <Phone> | <Email> | <Password> |
    And I sleep some times
    Then I verify Customer created success
      | Name   | Gender | DateOfBirth   | Address   | City   | State   | Pin   | Phone   | Email   |
      | <Name> | m      | <DateOfBirth> | <Address> | <City> | <State> | <Pin> | <Phone> | <Email> |

    Examples: New Customer info
      | Name      | DateOfBirth | Address | City     | State  | Pin    | Phone     | Email    | Password | Message                             |
      | Auto test | 1999-01-01  | 123 VVT | HCM City | BThanh | 123456 | 023940026 | autotest |   123123 | Customer Registered Successfully!!! |
