Feature: Add multiple dependents for employee

  Background:
   Given user navigates to HRMS application
    When  user enter valid admin credentials
    And   user click on login button
    Then  admin user is successfully logged in

 @child
 Scenario Outline: Adding child dependents

  Given user clicks on PIM
  And user searches for an employee by id
  And user clicks on search button
  When user selects employee
  And user clicks on Dependents tab
  And user click on add button to add dependents
  And user adds "<firstName>" and "<lastName>"
  Then user clicks on save button

  Examples:
   |firstName |lastName  |
   |Luke      |Skywalker |
   |Leia      |Skywalker |