Feature: As user I want to get product rating by id


  Scenario: GET - As user I want to get product rating by specific id
    Given user get api endpoint for product rating
    When user send get http request
    Then user receive valid HTTP response code 200
    And validate rating