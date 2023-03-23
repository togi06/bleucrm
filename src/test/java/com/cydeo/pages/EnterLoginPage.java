package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterLoginPage {
    public EnterLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(name = "USER_LOGIN")
    public WebElement enterLogin;

    @FindBy(name = "USER_PASSWORD")
    public WebElement enterPassword;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement enterLoginBtn;
}
