package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void  setupScenario(){
        System.out.println("====Setting up browser using cucumber @Before");
    }

    @Before
    public void  setupScenarioForLogins(){
        System.out.println("====this will only apply to scenarios with @login tag");
    }

    @Before
    public void  setupForDatabaseScenarios(){
        System.out.println("====this will only apply to scenarios with @tb tag");
    }

    @After
    public void teardownScenario(Scenario scenario){



        if (scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());

        }

      BrowserUtils.sleep(2);
      Driver.closeDriver();

    }

    @BeforeStep
    public void setupStep(){
        System.out.println("--------> applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("--------> applying teardown using @AfterStep");

    }


}
