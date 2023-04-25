Feature: As an admin user should be able to add any available languages to any employee

  Background:
    Given user navigates to HRMS application
    When  user enter valid admin credentials
    And   user click on login button
    Then  admin user is successfully logged in
    Then admin navigates to employee list



  @addLanguage
    Scenario: admin user should be able to add any available language to any employee
    And admin user searches for and employee by id "<id>"
    Then admin user selects the employee and clicks on qualifications
    Then Admin user can add any languages "<Language>""<Fluency>""<Competency>"
    Examples:
      | id      | Language | Fluency | Competency |
      | 9999905 |English   |Writing |Good        |