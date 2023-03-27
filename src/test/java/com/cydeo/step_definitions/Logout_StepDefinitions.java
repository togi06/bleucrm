package com.cydeo.step_definitions;

import com.cydeo.pages.LogOutPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
        BrowserUtils.sleep(1);
        logOutPage.showUserMenü.click();
        BrowserUtils.sleep(1);
        logOutPage.logOutBtn.click();
        //burada ne Assert edebilirim?
        //böyle yapabılırız
       Assert.assertEquals("Authorization",Driver.getDriver().getTitle());




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


    @And("users close the tab")
    public void usersCloseTheTab() {
   /*
   BrowserUtils.sleep(2);
    Driver.getDriver().close();
        BrowserUtils.sleep(2);
        Driver.getDriver().get(ConfigurationReader.getProperty("webpage"));
    */


        BrowserUtils.openNewTab();
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        List<String> allOpenTabs = new ArrayList<>(windowHandles);

        //allOpenTabs.size()-1 --> don't close the empty tab
        for (int i = 0; i < allOpenTabs.size()-1; i++) {
            Driver.getDriver().switchTo().window(allOpenTabs.get(i));
            Driver.getDriver().close();
        }
        BrowserUtils.switchToWindow(0);




    }


    @Then("users open the tab again")
    public void usersOpenTheTabAgain() {
        Driver.getDriver().get(ConfigurationReader.getProperty("webpage"));
        Assert.assertEquals("Authorization",Driver.getDriver().getTitle());

    }


}
