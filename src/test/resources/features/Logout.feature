@logOut
Feature: Log out the website
  Uer Story;
  As a user, I should be able to log out , after successful login

  Accounts are : Helpdesk, Human Resource, Marketing
  Background: for the scenarios in the feature file, user is expected to be on logout page

@User1LO
  Scenario Outline: Logout as Helpdesk
    Given users firstly go to on the "bleuCrm" login page
    When users enters "<valid username>" username
    And users enters "<valid password>" password
    And users should see the dashboard
    Then users should log out
    Examples:
      | valid username                  |  | valid password |
      | helpdesk1@cybertekschool.com    |  | UserUser       |
      | helpdesk2@cybertekschool.com    |  | UserUser       |
      | helpdesk99@cybertekschool.com   |  | UserUser       |
      | helpdesk100@cybertekschool.com  |  | UserUser       |
      | helpdesk101@cybertekschool.com  |  | UserUser       |
      | hr1@cybertekschool.com          |  | UserUser       |
      | hr2@cybertekschool.com          |  | UserUser       |
      | hr99@cybertekschool.com         |  | UserUser       |
      | hr100@cybertekschool.com        |  | UserUser       |
      | hr101@cybertekschool.com        |  | UserUser       |
      | marketing1@cybertekschool.com   |  | UserUser       |
      | marketing2@cybertekschool.com   |  | UserUser       |
      | marketing99@cybertekschool.com  |  | UserUser       |
      | marketing100@cybertekschool.com |  | UserUser       |
      | marketing101@cybertekschool.com |  | UserUser       |


#@User1.2LO
  #Scenario Outline: Logout as Human Resource
  #  Given users firstly go to on the "bleuCrm" login page
  #  When users enters Human Resource "<valid username1>" username
  #  And users enters Human Resource "<valid password1>" password
   # And users should see the dashboard
  #  Then users should log out
  #  Examples:
   #   | valid username1          |  | valid password1 |
   #   | hr1@cybertekschool.com   |  | UserUser        |
   #   | hr2@cybertekschool.com   |  | UserUser        |
   #   | hr99@cybertekschool.com  |  | UserUser        |
   #   | hr100@cybertekschool.com |  | UserUser        |
    #  | hr101@cybertekschool.com |  | UserUser        |

 # @User1.3LO
  #Scenario Outline: Logout as Marketing
  #  Given users firstly go to on the "bleuCrm" login page
  # When users enters Marketing "<valid username2>" username
   # And users enters Marketing "<valid password2>" password
   # And users should see the dashboard
   # Then users should log out
   # Examples:
  #    | valid username2                 |  | valid password2 |
   #   | marketing1@cybertekschool.com   |  | UserUser        |
    #  | marketing2@cybertekschool.com   |  | UserUser        |
    #  | marketing99@cybertekschool.com  |  | UserUser        |
   #   | marketing100@cybertekschool.com |  | UserUser        |
   #   | marketing101@cybertekschool.com |  | UserUser        |

  @User2.1LO
  Scenario Outline: Logout as Helpdesk and back
    Given users firstly go to on the "bleuCrm" login page
    When users enters "<valid username>" username
    And users enters "<valid password>" password
    And users should see the dashboard
    And users should log out
    And users click back
    Examples:
      | valid username                  |  | valid password |
      | helpdesk1@cybertekschool.com    |  | UserUser       |
      | helpdesk2@cybertekschool.com    |  | UserUser       |
      | helpdesk99@cybertekschool.com   |  | UserUser       |
      | helpdesk100@cybertekschool.com  |  | UserUser       |
      | helpdesk101@cybertekschool.com  |  | UserUser       |
      | hr1@cybertekschool.com          |  | UserUser       |
      | hr2@cybertekschool.com          |  | UserUser       |
      | hr99@cybertekschool.com         |  | UserUser       |
      | hr100@cybertekschool.com        |  | UserUser       |
      | hr101@cybertekschool.com        |  | UserUser       |
      | marketing1@cybertekschool.com   |  | UserUser       |
      | marketing2@cybertekschool.com   |  | UserUser       |
      | marketing99@cybertekschool.com  |  | UserUser       |
      | marketing100@cybertekschool.com |  | UserUser       |
      | marketing101@cybertekschool.com |  | UserUser       |

 # @User2.2LO
  #Scenario Outline: Logout as Human Resource and back
   # Given users firstly go to on the "bleuCrm" login page
   # When users enters "<valid username1>" username
   # And users enters "<valid password1>" password
   # And users should see the dashboard
   # And users should log out
   # And users click back
   # Examples:
  #    | valid username1        |  | valid password1 |
   #   | hr1@cybertekschool.com |  | UserUser        |

  #@User2.3LO
 # Scenario Outline: Logout as Marketing and back
 #   Given users firstly go to on the "bleuCrm" login page
 #   When users enters "<valid username2>" username
  #  And users enters "<valid password2>" password
 #   And users should see the dashboard
  #  And users should log out
  #  And users click back
  #  Examples:
  #    | valid username2               |  | valid password2 |
  #    | marketing1@cybertekschool.com |  | UserUser        |
