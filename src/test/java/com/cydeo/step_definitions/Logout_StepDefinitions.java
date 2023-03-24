package com.cydeo.step_definitions;

import com.cydeo.pages.LogOutPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout_StepDefinitions {
   LogOutPage logOutPage = new LogOutPage();


    @Given("users firstly go to on the {string} login page")
    public void users_firstly_go_to_on_the_login_page(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("webpage"));
    }
    @When("users enters {string} username")
    public void users_enters_username(String validusername) {
        logOutPage.logOutUser.sendKeys(validusername);

    }

    @And("users enters {string} password")
    public void usersEntersPassword(String validpassword) {
        logOutPage.lohOutPass.sendKeys(validpassword);
    }
    @When("users should see the dashboard")
    public void users_should_see_the_dashboard() {
        logOutPage.logOutLBtn.click();

    }
    @Then("users should log out")
    public void users_should_log_out() {
        BrowserUtils.sleep(2);
        logOutPage.showUserMenü.click();
        BrowserUtils.sleep(1);
        logOutPage.logOutBtn.click();
      //  logOutPage.logOutUser.clear();

    }



    /*
     @When("users enters Human Resource {string} username")
    public void usersEntersHumanResourceUsername(String validusername1) {
       BrowserUtils.sleep(2);
       logOutPage.logOutUser.sendKeys(validusername1);
    }
     @And("users enters Human Resource {string} password")
    public void usersEntersHumanResourcePassword(String validpassword1) {
        logOutPage.lohOutPass.sendKeys(validpassword1);
    }
    @When("users enters Marketing {string} username")
    public void usersEntersMarketingUsername(String validusername2) {
        logOutPage.logOutUser.sendKeys(validusername2);
    }

    @And("users enters Marketing {string} password")
    public void usersEntersMarketingPassword(String validpassword2) {
        logOutPage.lohOutPass.sendKeys(validpassword2);
    }
     */


    @And("users click back")
    public void usersClickBack() {
       BrowserUtils.sleep(1);
        Driver.getDriver().navigate().back();
    }
}
