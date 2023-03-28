@BLEU10-295
Feature: Login the website
  User Story;
  As a user, I should be able to login with correct credentials to
  different accounts.And dashboard should be displayed.

  Accounts are : Helpdesk, Human Resource, Marketing

  Background: for the scenarios in the feature file, user is expected to be on login page
    Given user is on "bleuCrm" login page

 # Scenario Outline: Users can see their own usernames in the profile menu, after successful login
 #    When user enters username "<userName>"
 #    And user enters password "<password>"
 #    And user clicks to login button
 #    Then user should see their own "<profileName>"
 #    Examples:
 #      | userName                      | password | profileName |
 #      | marketing1@cybertekschool.com | UserUser | marketing   |
 #      | hr1@cybertekschool.com        | UserUser | hr          |
 #      | helpdesk1@cybertekschool.com  | UserUser | helpdesk    |
# @When("user enters username {string}")
#    public void userEntersUsername(String userName) {
#        dashboardPage.dashboardName.sendKeys(userName);
#    }
#
#    @And("user clicks to login button")
#    public void userClicksToLoginButton() {
#        dashboardPage.DashLoginBtn.click();
#    }
#
#    @Then("user should see their own {string}")
#    public void userShouldSeeTheirOwn(String profiName) {
#
#    Assert.assertTrue(dashboardPage.dashboardName.getText().contains(profiName));
#    }

  @User8.1 @BLEU10-279
Scenario: Dashboard H_username
When user enters  H_username
And user enters user password
And user should see own name on the dashboard
Then user can see their own usernames in the dashboard, after successful login

  @User8.2 @BLEU10-280
  Scenario: Dashboard Hr_username
    When user enters  Hr_username
    And user enters user password
    Then user should see own name on the dashboard
    Then user can see their his usernames in the dashboard, after successful login


  @User8.3 @BLEU10-281
  Scenario: Dashboard M_username
    When user enters  M_username
    And user enters user password
    Then user should see own name on the dashboard
    Then user can see their her-usernames in the dashboard, after successful login

