Feature: Parabank application automation
  As a Automation engineer, I want to automate parabank's application end to end

@RegisterTest
  Scenario: Register and login into parabank application

    Given The user is on the homepage of parabank application
    When The user registers new account
    Then the user logs in with new credentials