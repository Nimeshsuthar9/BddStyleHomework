Feature: ReferAProductToFriend


  @referAProduct
  Scenario: As A Register User Can Able To Refer A Product To Friend

    Given I Am On Homepage
    And  I Click On "Register" Button
    When I Enter Required Registration Details
    Then I Should Able To Register Successfully
    When I Click On "Electronics" Button
    And I Click On "Camera & photo" Button
    Then I Should Able To See Products
    When I Click On Any Product
    Then User Able To Redirect On That Product Page
    When I Click On Product To Refer Friend
    And I Enter Required Details To Send A Product To Friend
    And I Click On Send Button
    Then I Should Able To Refer A Product To Friend