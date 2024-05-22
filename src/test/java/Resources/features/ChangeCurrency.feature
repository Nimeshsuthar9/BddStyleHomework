Feature: ProductPriceSymbolVerification


  @productPrice
  Scenario: As a user, I Change Product Price In Different Currency

    Given I Am On Homepage
    When I Select Currency
    When I Click On "Computers" Button
    And I Click On "Notebooks" Button
    Then I Should Able To See Product Price In That Particular Currency