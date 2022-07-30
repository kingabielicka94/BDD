Feature: Google search feature

  Scenario: Search in Google
    Given Google page is opened
    When I click Accept all button
    And I search for phrase "Cucumber"
    Then I can see search results page