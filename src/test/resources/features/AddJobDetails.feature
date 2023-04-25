Feature: Add employee job Details

  Background:
    Given user navigates to HRMS application
    When  user enter valid admin credentials
    And   user click on login button
    Then  admin user is successfully logged in
    When admin clicks on PIM option
    And admin clicks one employee name and navigates to personal details page
    And admin  clicks on Job on side list
    And admin clicks on Edit button

    @JobDetails
  Scenario: Job Title dropdown
    Then admin clicks on Job Title dropdown and selects a value
    And admin clicks on Employment Status dropdown and selects a value
    And admin clicks on Job Category dropdown and selects a value
    And admin clicks on Joined Date calendar and picks a value
    And admin clicks on Sub Unit dropdown and selects a value
    And admin clicks on Location dropdown and selects a value
    And admin clicks on Start Date calendar and picks a value
    And admin clicks on End Date calendar and picks a value
    And admin chooses a file and uploads it to employee page
