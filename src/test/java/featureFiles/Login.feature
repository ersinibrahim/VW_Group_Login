

  Feature: Login Functionality


    @SmokeTest
    Scenario: Login with valid username and password
      Given Navigate to VW Group Website
      When Enter username and password and click login button
      Then User should login successfully