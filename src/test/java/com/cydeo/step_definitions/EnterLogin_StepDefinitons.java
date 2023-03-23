package com.cydeo.step_definitions;

import com.cydeo.pages.BleuCrmLoginPage;
import com.cydeo.pages.EnterLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import java.util.Collections;

public class EnterLogin_StepDefinitons {

        EnterLoginPage enterLoginPage = new EnterLoginPage();

    @When("user enter the valid username")
    public void user_enter_the_valid_username() {
       enterLoginPage.enterLogin.sendKeys(ConfigurationReader.getProperty("userhelp101"));
    }
    @When("user enter the valid password")
    public void user_enter_the_valid_password() {
        enterLoginPage.enterPassword.sendKeys(ConfigurationReader.getProperty("pass"));

    }
    @Then("user enter the login button")
    public void user_enter_the_login_button() {
        enterLoginPage.enterLoginBtn.sendKeys(Keys.ENTER);

    }



}
