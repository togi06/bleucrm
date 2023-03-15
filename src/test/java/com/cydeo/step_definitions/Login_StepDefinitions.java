package com.cydeo.step_definitions;

import com.cydeo.pages.BleuCrmLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {
    BleuCrmLoginPage bleuCrmLoginPage = new BleuCrmLoginPage();

    @Given("user is on the {string} login page")
    public void user_is_on_the_login_page(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("webpage"));

    }
    @When("user enters helpdesk username")
    public void user_enters_helpdesk_username() {
        bleuCrmLoginPage.login.sendKeys(ConfigurationReader.getProperty("userhelp101"));

    }
    @When("user enters helpdesk password")
    public void user_enters_helpdesk_password() {
        bleuCrmLoginPage.password.sendKeys(ConfigurationReader.getProperty("userhelp101pass"));

    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        bleuCrmLoginPage.loginBtn.click();

    }






}
