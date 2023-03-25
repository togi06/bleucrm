package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Dashboard_StepDefinitions {
    DashboardPage dashboardPage = new DashboardPage();

    @Given("user is on {string} login page")
    public void user_is_on_login_page(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("webpage"));

    }

    @When("user enters  H_username")
    public void user_enters_h_username() {
        dashboardPage.DashLogin.sendKeys(ConfigurationReader.getProperty("userhelp101"));

    }
    @When("user enters user password")
    public void user_enters_user_password() {
        dashboardPage.DashPassword.sendKeys(ConfigurationReader.getProperty("pass"));

    }

    @And("user should see own name on the dashboard")
    public void userShouldSeeOwnNameOnTheDashboard() {
        dashboardPage.DashLoginBtn.click();
    }

    @When("user enters  Hr_username")
    public void userEntersHr_username() {
        dashboardPage.DashLogin.sendKeys(ConfigurationReader.getProperty("userhr1"));

    }

    @When("user enters  M_username")
    public void userEntersM_username() {
        dashboardPage.DashLogin.sendKeys(ConfigurationReader.getProperty("usermarket1"));

    }

    //Then kısımları  daha kolay ve verimli nasıl yapılabilinir?
    //büyük bir ihtimalle Scenario Outline ve hook' da sleep ve driver.close u kullanarak!!!
    @Then("user can see their own usernames in the dashboard, after successful login")
   public void userCanSeeTheirOwnUsernamesInTheDashboardAfterSuccessfulLogin() {
      // BrowserUtils.sleep(2);
        String expectedName= ConfigurationReader.getProperty("userhelp101");
        String actualName=  dashboardPage.dashboardName.getText();
        Assert.assertEquals( expectedName,actualName);

    }

    @Then("user can see their his usernames in the dashboard, after successful login")
    public void userCanSeeTheirHisUsernamesInTheDashboardAfterSuccessfulLogin() {
        //BrowserUtils.sleep(2);
        String expectedName= ConfigurationReader.getProperty("userhr1");
        String actualName=  dashboardPage.dashboardName.getText();
        Assert.assertEquals( expectedName,actualName);
    }

    @Then("user can see their her-usernames in the dashboard, after successful login")
    public void userCanSeeTheirHerUsernamesInTheDashboardAfterSuccessfulLogin() {
      //  BrowserUtils.sleep(2);
        String expectedName= ConfigurationReader.getProperty("usermarket1");
        String actualName=  dashboardPage.dashboardName.getText();
        Assert.assertEquals( expectedName,actualName);
    }

    // @Then("user can see their own {string} in the dashboard, after successful login")
    // public void userCanSeeTheirOwnInTheDashboardAfterSuccessfulLogin(String userName) {
    //     BrowserUtils.sleep(2);
    //     String actualName=  dashboardPage.dashboardName.getText();
    //     Assert.assertEquals( userName,actualName);

    // }





}
