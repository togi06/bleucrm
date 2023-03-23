
@User8
Feature: Login the website
  User Story;
  As a user, I should be able to login with correct credentials to
  different accounts.And dashboard should be displayed.

  Accounts are : Helpdesk, Human Resource, Marketing

  Background: for the scenarios in the feature file, user is expected to be on login page
    Given user is on "bleuCrm" login page



Scenario: Dashboard H_username
When user enters  H_username
And user enters user password
And user should see own name on the dashboard
Then user can see their own usernames in the dashboard, after successful login


  Scenario: Dashboard Hr_username
    When user enters  Hr_username
    And user enters user password
    Then user should see own name on the dashboard
    Then user can see their his usernames in the dashboard, after successful login



  Scenario: Dashboard M_username
    When user enters  M_username
    And user enters user password
    Then user should see own name on the dashboard
    Then user can see their her-usernames in the dashboard, after successful login

