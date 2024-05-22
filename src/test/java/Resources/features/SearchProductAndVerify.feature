Feature: SearchProductAndVerify


  @searchProductAndVerify
  Scenario: Search Product And Verify Product Name Contain That Word

    Given I Am On Homepage
    When I Type Product Name In Search Bar
    And I Click On Search Button
    Then I Should Able To Redirect On That Product Page
    And I Should Verify Product Name And Url Contains That Searched Product Word