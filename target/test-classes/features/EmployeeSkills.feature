Feature: Add skills to employee

  Background:
    Given user navigates to HRMS application
    When  user enter valid admin credentials
    And   user click on login button
    Then  admin user is successfully logged in

  @addSkills
  Scenario Outline:Adding new skill to employee's page
    When admin navigates to employee list
    And admin user searches for and employee by id "<id>"
    When admin user selects the employee and clicks on qualifications
    Then admin user should be able to select and add skills
    Examples:
      | id      |
      | 9999905 |