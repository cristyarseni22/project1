Feature: As an admin I should be able to change employee's contact details

  Background:
    Given user navigates to HRMS application
    When user enter valid admin credentials
    And user click on login button
    Then admin user is successfully logged in

  @details
  Scenario: Changing Employee Details
    Given user clicks on PIM
    And user clicks on employee list
    And user searches for an employee by name
    And user clicks on search
    When user selects employee
    And user clicks on contact details
    And user clicks on edit button
    And user enters new employee contact details
    Then user saves new changes made to employee contact details




