Feature: Google search feature

  Scenario: Search in Google
    Given Google page is opened
    When I click Accept all button
    And I search for phrase "Cucumber"
    Then I can see search results page


  Scenario Outline: Search in Google with Scenrio Outline
    Given Google page is opened
    When I click Accept all button
    And I search for phrase "<searchPhrase>"
    Then I can see search results page
    Examples:
      | searchPhrase|
      | Cucumber    |
      | Selenium    |
      | SDA Academy |

  Scenario: No search phrase
    Given Google page is opened
    When I click Accept all button
    And I click Enter button
    Then Search results page is not presented
