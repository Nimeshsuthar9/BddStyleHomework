Feature: News Release Comment


  @verifyComment
  Scenario: As a user, I Should Able To Comment And Verify That My Comment Is Last

    Given I Am On Homepage
    And  I Click On News Release Detail Button
    When I Enter Required Comment Details
    And Click On Comment Button
    Then I Should Able To See My Comment Is Last