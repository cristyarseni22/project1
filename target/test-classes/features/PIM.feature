Feature:As an admin user should be able to add memberships to any employee

  Background:
    Given user navigates to HRMS application
    When  user enter valid admin credentials
    And   user click on login button
    Then  admin user is successfully logged in
    Then admin navigates to employee list

  @Ainura
  Scenario Outline: Adding Membership to Employee
    And admin user searches for and employee by id "<id>"
    When admin user selects the employee and clicks on memberships
    Then admin user should be able to add new Membership "<membership>" "<subscriptions>" "<subscAmount>" "<currency>" "<subsCommenceMonth>" "<subsCommenceYear>" "<subsCommenceDay>" "<subsRenewalMonth>" "<subsRenewalYear>" and "<subsRenewalDay>"
    Examples:
      | id      | membership | subscriptions | subscAmount | currency | subsCommenceMonth | subsCommenceYear | subsCommenceDay | subsRenewalMonth | subsRenewalYear | subsRenewalDay |
      | 9999905 | English    | Individual    | 100000      | Euro     | Sep               | 2021             | 21              | Aug              | 2025            | 03             |