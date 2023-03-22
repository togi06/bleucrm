package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoLoginPages {

    public NoLoginPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "USER_LOGIN")
    public WebElement noLogin;

    @FindBy(name = "USER_PASSWORD")
    public WebElement noPass;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement noLoginBtn;

    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement errorText;




}
