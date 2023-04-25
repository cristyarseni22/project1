Feature: As an admin user should be able to add different licenses in qualifications

  Background: Background:
    Given user navigates to HRMS application
    When  user enter valid admin credentials
    And   user click on login button
    Then  admin user is successfully logged in
    When admin navigates to Qualifications

    @licencesTest
  Scenario: Add different licences in qualification
    And admin selects licenses
    Then admin user can add any licenses