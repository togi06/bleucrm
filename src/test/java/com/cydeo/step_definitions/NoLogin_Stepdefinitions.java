package com.cydeo.step_definitions;

import com.cydeo.pages.NoLoginPages;
import com.cydeo.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NoLogin_Stepdefinitions {

    NoLoginPages noLoginPages = new NoLoginPages();

    @When("user enters empty  username")
    public void user_enters_empty_username() {
        noLoginPages.noLogin.clear();
        noLoginPages.noPass.sendKeys(ConfigurationReader.getProperty("pass"));

    }
    @Then("user should see {string} message")
    public void user_should_see_message(String expectedText1) {

        String  actualText= noLoginPages.errorText.getText();
        Assert.assertEquals(expectedText1,actualText);



    }
    @And("user click the login button")
    public void userClickTheLoginButton() {
        noLoginPages.noLoginBtn.click();
    }

    @When("user enters right username")
    public void userEntersRightUsername() {
        noLoginPages.noLogin.sendKeys(ConfigurationReader.getProperty("userhelp1"));
    }

    @And("user enters empty password")
    public void userEntersEmptyPassword() {
        noLoginPages.noPass.clear();

    }


}
