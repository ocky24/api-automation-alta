Feature: As user I want to login so I can see my home


  Scenario: POST - As user I want to login with valid email and valid password
    Given user Post API endpoint
    When user send POST HTTP request
    Then user receive valid HTTP response code 200

  Scenario: POST - As user I Want to login with valid email and invalid password
    Given user Post API endpoint
    When user send POST HTTP request Invalid Password
    Then user receive HTTP response code 400