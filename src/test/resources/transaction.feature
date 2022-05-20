Feature: As user I want to see all transactions with no auth

  Scenario: GET - As user I want to see all transactions with no auth
    Given user GET api endpoint for see all transaction
    When user Send GET http request
    Then user receive response 401