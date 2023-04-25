Feature: As an admin I should be able to add employee's licenses in qualifications

  Background:
    Given user navigates to HRMS application
    When  user enter valid admin credentials
    And   user click on login button
    Then  admin user is successfully logged in
    Then admin navigates to employee list


  @addLicense
    Scenario Outline: Admin should be able to add employee's license in qualifications
    And admin user searches for and employee by id "<id>"
    Then admin user selects the employee and clicks on qualifications
      Then admin user should be able to add new license "<type>""<number>""<IssueMonth>" "<IssueYear>" "<IssueDay>" "<ExpiryMonth>" "<ExpiryYear>" and "<ExpiryDay>"
      Examples:
        | id      | type| number | IssueMonth |IssueYear|IssueDay|ExpiryMonth|ExpiryYear|ExpiryDay|
        | 9999905 |Tester|589641|Aug       |1996        |14      |Jul        |1997      |13       |