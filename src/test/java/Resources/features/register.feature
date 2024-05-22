Feature: Registration

  @register
  Scenario: As a User, I Should Able To Register Successfully, So That I Can Use All User Functionalities

    Given I Am On Homepage
    And I Click On "Register" Button
    When I Enter Required Registration Details
    Then I Should Able To Register Successfully