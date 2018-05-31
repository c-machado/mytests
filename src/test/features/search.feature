Feature: Search
  As a user I want to be able to perform a custom search, so I can find what I'm looking for

  Scenario: Perform a Search based on custom keywords
    Given I am in the WestMarine homepage
    When I type "boat shoes" in the search field
    And I click on the search button
    Then I should see results for the item searched
