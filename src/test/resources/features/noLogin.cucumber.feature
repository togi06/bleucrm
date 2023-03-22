Feature: Login the website

  User Story;
  As a user, I try to login with  correct username but empty password,
  or empty username correct password. And "Please fill out this field" message should be displayed

  Background: for the scenarios in the feature file, user is expected to be on login page
    Given user is on the "bleuCrm" login page
    And user click the login button
    Then user should see "Please fill out this field" message

  @User3
  Scenario: Login as empty username
    When user enters empty  username
    And user enters correct password


  @User4
  Scenario: Login as correct username
    When user enters right username
    And user enters empty password
