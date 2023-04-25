Feature: Adding new skills

  Background:
    Given user navigates to HRMS application
    When  user enter valid admin credentials
    And   user click on login button
    Then  admin user is successfully logged in

  @test1 @skills
  Scenario: Adding new skill in Qualifications
    When admin navigates to Qualifications
    And admin selects skills
    Then admin user can add any skills