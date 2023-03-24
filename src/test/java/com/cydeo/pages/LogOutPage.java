package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
    public LogOutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement logOutUser;

    @FindBy(name = "USER_PASSWORD")
    public WebElement lohOutPass;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement logOutLBtn;

    @FindBy(xpath = "//div[@id='user-block']")
    public WebElement showUserMenü;

    @FindBy(xpath = "//span[.='Log out']")
    public  WebElement logOutBtn;
}
