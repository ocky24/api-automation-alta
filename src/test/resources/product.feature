Feature: As user I want to create product


  Scenario: POST - As user I want to create product
    Given user Post Api Endpoint to Create Product
    When user Send Post HTTP Request
    Then user receive valid HTTP response code 200
