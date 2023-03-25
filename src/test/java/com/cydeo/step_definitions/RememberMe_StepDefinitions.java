package com.cydeo.step_definitions;

import com.cydeo.pages.RememberMePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class RememberMe_StepDefinitions {

    RememberMePage rememberMePage = new RememberMePage();

    @When("user login the page")
    public void user_login_the_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("webpage"));

    }

    @And("user can see {string}")
    public void userCanSee(String string) {
        String actualText = rememberMePage.rememberMeText.getText();
        Assert.assertEquals(string,actualText);
    }


    @Then("user cn click on checkbox")
    public void userCnClickOnCheckbox() {
        rememberMePage.checkBox.click();
        Assert.assertTrue(rememberMePage.checkBox.isSelected());

    }
}
