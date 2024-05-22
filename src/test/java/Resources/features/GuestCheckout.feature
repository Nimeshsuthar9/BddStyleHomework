Feature: Guest Check Out


  @guestCheckOut
  Scenario: As A User I Am Able To Order Product As A Guest

    Given I Am On Homepage
    When  I Click On Add To Cart Button On Product
    And I Click On "Shopping cart" Button
    Then I Should Able To Vew Shopping Cart Page
    When I Click On Check Box To Accept Terms And Condition
    And Click On Check Out Button
    And I Click On Check Out Guest Button
    Then I Am Redirect On Customer Details Form Page
    When I Enter Required Customer Billing Details
    And  Click On Continue Button After Customer Details
    And I Select Shipping Method
    And I Click On Continue Button After Shipping Method
    And I Click on Select Payment Method
    And I Click On Continue Button After Payment Method
    And I Enter Required Payment Card Details
    And I Click On Continue Button After Payment Card Details
    And I Click On Continue Button To Conform Order Details
    Then I Should Able To Verify Check Out Completed Message Page