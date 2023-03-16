@BLEU10-256
Feature: Login the website
  User Story;
  As a user, I should be able to login with correct credentials to
  different accounts.And dashboard should be displayed.

  Accounts are : Helpdesk, Human Resource, Marketing

  Background: for the scenarios in the feature file, user is expected to be on login page
    Given user is on the "bleuCrm" login page


    @BLEU10-255
    Scenario: Login as Helpdesk
      When user enters helpdesk username
      And user enters helpdesk password
      Then user should see the dashboard

    @BLEU10-253
    Scenario: Login as Human Resource
     When user enters Human Resource username
     And user enters Human Resource password
     Then user should see the dashboard

     @BLEU10-254
     Scenario: Login as Marketing
     When user enters Marketing username
     And user enters Marketing password
     Then user should see the dashboard
