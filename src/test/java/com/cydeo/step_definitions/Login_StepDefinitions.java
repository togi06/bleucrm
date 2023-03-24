package com.cydeo.step_definitions;

import com.cydeo.pages.BleuCrmLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
        bleuCrmLoginPage.password.sendKeys(ConfigurationReader.getProperty("pass"));

    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        bleuCrmLoginPage.loginBtn.click();




    }


    @When("user enters Human Resource username")
    public void userEntersHumanResourceUsername() {
        bleuCrmLoginPage.login.sendKeys(ConfigurationReader.getProperty("userhr1"));
    }

    @And("user enters Human Resource password")
    public void userEntersHumanResourcePassword() {
        bleuCrmLoginPage.password.sendKeys(ConfigurationReader.getProperty("pass"));
    }

    @When("user enters Marketing username")
    public void userEntersMarketingUsername() {
        bleuCrmLoginPage.login.sendKeys(ConfigurationReader.getProperty("usermarket1"));
    }

    @And("user enters Marketing password")
    public void userEntersMarketingPassword() {
        bleuCrmLoginPage.password.sendKeys(ConfigurationReader.getProperty("pass"));
    }

    @When("user enters incorrect  username")
    public void userEntersIncorrectUsername() {
        bleuCrmLoginPage.login.sendKeys(ConfigurationReader.getProperty("incorrectusername"));
    }

    @And("user enters correct password")
    public void userEntersCorrectPassword() {
        bleuCrmLoginPage.password.sendKeys(ConfigurationReader.getProperty("pass"));
    }

    @When("user enters correct  username")
    public void userEntersCorrectUsername() {
        bleuCrmLoginPage.login.sendKeys(ConfigurationReader.getProperty("usermarket1"));
    }

    @And("user enters incorrect password")
    public void userEntersIncorrectPassword() {
        bleuCrmLoginPage.password.sendKeys(ConfigurationReader.getProperty("incorrectpass"));
    }


    @Then("user click the button")
    public void userClickTheButton() {
        bleuCrmLoginPage.loginBtn.click();
    }






}
