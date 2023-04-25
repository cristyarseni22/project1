Feature: Add New membership


 Background:
    Given user navigates to HRMS application
    When  user enter valid admin credentials
    And   user click on login button
    Then  admin user is successfully logged in

  Scenario: Adding New membership in qualification
    When admin navigates to Qualifications
    And admin selects Memberships
    Then admin user can add any Memberships
