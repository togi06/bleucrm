package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BleuCrmLoginPage {

    public BleuCrmLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
