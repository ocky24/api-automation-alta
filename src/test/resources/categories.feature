Feature: As user I want to see all categories

  Scenario: GET - As user I want to see all categories
    Given User Get API EndPoint for categories
    When User send Get HTTP Request
    Then user receive valid HTTP response code 200
    And validate ID and name
