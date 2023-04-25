Feature: Add employee work experience

  Background:
    Given user navigates to HRMS application
    When  user enter valid admin credentials
    And   user click on login button
    Then  admin user is successfully logged in
    Then admin navigates to employee list


  @workExperience
  Scenario Outline: Adding work experience for employee
    And admin user searches for and employee by id "<id>"
    Then admin user selects the employee and clicks on qualifications
    And clicks on Work Experience add button
    And enters work experience
    Then clicks on save button
    Examples:
      | id      |
      | 9999905 |