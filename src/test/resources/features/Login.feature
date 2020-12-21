Feature: Login feature.

  As a user, I want to login because I otherwise how do I use this app?

  Scenario: Basic login
    Given user is on the landing page
    When user enter credentials
    And user click login button
    Then user supposed to see welcome message

