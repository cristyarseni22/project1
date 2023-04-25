Feature: Validation of Login

  @test1
  Scenario: Login as an Admin
    Given user navigates to HRMS application
    When  user enter valid admin credentials
    And   user click on login button
    Then  admin user is successfully logged in