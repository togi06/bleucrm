@BLEU10-295
Feature: Login the website
  User Story;
  As a user, I should be able to login with correct credentials to
  different accounts.And dashboard should be displayed.

  Accounts are : Helpdesk, Human Resource, Marketing

  Background: for the scenarios in the feature file, user is expected to be on login page
    Given user is on the "bleuCrm" login page



    @BLEU10-255 @BLEU10-252 @User1
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

 @User2.1 @BLEU10-274
  Scenario: Login as incorrect username
    When user enters incorrect  username
    And user enters correct password
   Then user click the button


  @User2.2 @BLEU10-275
  Scenario: Login as incorrect  pass
    When user enters correct  username
    And user enters incorrect password
    Then user click the button

    @User4 @BLEU10-285
    Scenario: Get the "Get Password" page
      When user click "FORGOT YOUR PASSWORD?" link
      Then user land on the "Get Password" page

  @User6 @BLEU10-277
  Scenario Outline: enter the password with bullet signs
    When user enters  username "<valid username>"
    And user enters password "<valid password>"
    Then user should see the password bullet signs
    Examples:
      | valid username                  |  | valid password |
      | helpdesk1@cybertekschool.com    |  | UserUser       |
      | hr1@cybertekschool.com          |  | UserUser       |
      | marketing1@cybertekschool.com   |  | UserUser       |



  @User7 @BLEU10-278
  Scenario: Enter login
    When user enter the valid username
    And user enter the valid password
    Then user enter the login button



