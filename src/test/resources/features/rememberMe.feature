Feature:Login the website
  User can see "Remember Me" link exists
  and is clickable on the login page

  Background: for the scenarios in the feature file, user is expected to be on login page
    Given user is on the "bleuCrm" login page

    @User5
    Scenario: Remember Me
      When user login the page
      And user can see "Remember me on this computer"
      Then user cn click on checkbox

