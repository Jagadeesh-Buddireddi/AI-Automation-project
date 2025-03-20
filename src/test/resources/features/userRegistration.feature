Feature: Parabank application automation
  As a Automation engineer, I want to automate parabank's application end to end


  Scenario: Register and login into parabank application

    Given User is on the homepage of parabank application
    When the user registers new account
    Then the user logs in with new credentials