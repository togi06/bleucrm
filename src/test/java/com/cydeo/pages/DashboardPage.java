package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name = "USER_LOGIN")
    public WebElement DashLogin;

    @FindBy(name = "USER_PASSWORD")
    public WebElement DashPassword;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement DashLoginBtn;

    @FindBy(xpath = "//span[@class='user-name']")
    public WebElement dashboardName;


}
