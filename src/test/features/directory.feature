Feature: As I user I want to be able confirmed the search results

  Scenario: Confirmed search results per region
    Given I'm in the developers community directory page
    When I filter by any region
    Then I should be able to see the directory filtered
