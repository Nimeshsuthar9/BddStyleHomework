Feature: category

  @category
  Scenario Outline: As a user, I should able to nvigate to each category page successfully
    Given I Am On Homepage
    When I Click On "<category_name>" Button
    Then I should able to verify that user navigated to "<url>" page
    Examples:
      | category_name     | url                |
      | Computers         | /computers         |
      | Electronics       | /electronics       |
      | Apparel           | /apparel           |
      | Digital downloads | /digital-downloads |
      | Books             | /books             |
      | Jewelry           | /jewelry           |
      | Gift Cards        | /gift-cards        |

