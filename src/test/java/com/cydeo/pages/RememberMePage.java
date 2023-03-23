package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RememberMePage {
    public RememberMePage(){PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//label[@class='login-item-checkbox-label']")
    public WebElement rememberMeText;

    @FindBy (xpath = "//input[@id='USER_REMEMBER']")
    public  WebElement checkBox;



}
