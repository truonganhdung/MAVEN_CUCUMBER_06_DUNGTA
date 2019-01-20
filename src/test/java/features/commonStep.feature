@login
Feature: Common step for all features

  Scenario: Common step
    #--------------- ACTION ---------------
    #Textbox
    And I input to "name" textbox with data "Auto test"
    And I input to "city" textbox with data "HCM"
    And I input to "state" textbox with data "Q3"
    And I input to "emailed" textbox with data "autotest"
    # 0 = fix data | 1 = random data
    And I input to "city" textbox with "0" data "HN"
    #HaNoi
    And I input to "city" textbox with "1" data "HN"
    #HaNoi 123
    And I input to "email" textbox with "2" data "autotest"
    #autotest123@gmail.com
    #Text area
    And I input to "addr" textarea with "2" data "123 Pham the"
    #Dropdown
    And I select item in "selaccount" dropdown with data "Current"
    And I select item in "selaccount" dropdown with data "Saving"
    #Radio button
    And I select "m" radio button
    And I select "f" radio button
    #Btton
    And I click to "" button
    #Link
    And I open "New Customer" page
    And I open "Edit Customer" page
    #Regex
    And I input first Account ID
    And I input second Account ID
    And I transfer to "<Amount>" USD
    And I withdraw to "<Amount>" USD
    #--------------- VERIFY ---------------
    And Verify message "Customer Registered Successfully!!!" displayed success
    And Verify message "Customer details updated Successfully!!!" displayed success
    And Verify message "Account Generated Successfully!!!" displayed success
    #--------------- WAIT ---------------
    And I sleep with 30" times
    And I sleep with 5" times
    And I sleep with 10" times
