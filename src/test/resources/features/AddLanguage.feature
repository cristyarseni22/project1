Feature: Add language to qualification menu

  @test2
  Scenario: As an admin user should be able to add different languages in qualifications
  Given user navigates to HRMS application
    When  user enter valid admin credentials
    And   user click on login button
    Then  admin user is successfully logged in

 ##Scenario: As an admin user should be able to add different languages in qualifications


    When Admin navigates to Qualifications
   And selects Language
   Then Admin user can add any Language "Spanish" succesfully