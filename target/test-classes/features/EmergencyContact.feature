Feature: As an admin I should be able to add employee's Emergency Contacts

  Background:
    Given user navigates to HRMS application
    When user enter valid admin credentials
    And user click on login button
    Then admin user is successfully logged in


    @regression
    Scenario: Adding Employee Emergency contact
      Given user clicks on PIM
      And user searches for an employee by name
      And user clicks on search
      When user selects employee
      And user clicks on Emergency contacts
      And user clicks on Add button
      And user enters Emergency contact information
      Then user saves the information successfully


