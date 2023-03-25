package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {

    public static void sleep (int second){
        second *=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }

    public static void verifyTitle(WebDriver driver, String expectedTitle ){

        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

    }


    public static void verifyURLContains(String expectedURL){

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedURL));

    }

    public static void waitForInvisibilityOf(WebElement webElement){
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void verifyElementDisplayed(By by) {
        try {
            Assert.assertTrue("Element not visible: " + by, Driver.getDriver().findElement(by).isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            Assert.fail("Element not found: " + by);

        }
    }

    public static void verifyElementDisplayed(WebElement element) {
        try {
            Assert.assertTrue("Element not visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            Assert.fail("Element not found: " + element);

        }
    }

    public static void openNewTab() {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open();");
    }
    public static void waitForNewWindow() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 4);
            wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void switchToWindow(int index) {
        try {
            waitForNewWindow();
            Set<String> windowHandles = Driver.getDriver().getWindowHandles();
            ArrayList<String> allTabs = new ArrayList<>(windowHandles);
            Driver.getDriver().switchTo().window(allTabs.get(index));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getURL(){
        return Driver.getDriver().getCurrentUrl();
    }

    //wait for an element to be clickable (with web element)
    public static void waitClickability(WebElement element, int timeOut) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeOut);
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //wait for an element to be clickable (with By locator)
    public static void waitClickability(By locator, int timeOut) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeOut);
            wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(locator)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //wait for clickability of an element then click
    public static void clickWithWait(WebElement element, int timeOut){
        waitForVisibility(element,timeOut);
        waitClickability(element,timeOut);
        element.click();
    }

    //wait for clickability of an element then click
    public static void clickWithWait(By by, int timeOut){
        waitClickability(by,timeOut);
        Driver.getDriver().findElement(by).click();
    }
    public static void clickWithMouseHoverAction(WebElement element){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).pause(500).click(element).build().perform();
    }

    public static void waitUntilNumberOfWindows(int number){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.numberOfWindowsToBe(number));
    }

    public static void sendKeysWithWait(WebElement field, String text, int timeOut){
        waitClickability(field,timeOut);
        field.sendKeys(text);
    }

    //wait till URL contains a specific text
    public static void waitForURLContains(String urlPart, int timeOut) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeOut);
            wait.until(ExpectedConditions.urlContains(urlPart));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //wait till URL contains a specific text
    public static void waitForTitleContains(String titlePart, int timeOut) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeOut);
            wait.until(ExpectedConditions.titleContains(titlePart));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //wait for visibility of a web element
    public static void waitForVisibility(WebElement element, int timeOut) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeOut);
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //wait for visibility of a web element
    public static void waitForVisibility(By by, int timeOut) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeOut);
            wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().findElement(by)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //wait for a web element till has a specific text
    public static void waitForText(WebElement element, String text) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 6);
            wait.until(ExpectedConditions.textToBePresentInElement(element, text));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //switch to iframe
    public static void switchToFrame(WebElement frame) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 4);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
    }

    //click on a web element using JSexecutor
    public static void clickWithJSExe(WebElement element) {
        waitClickability(element, 3);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }

    //attempt to click on a web element a couple of times
    public static void clickManyTimes(WebElement element) {
        waitClickability(element, 3);
        for (int i = 0; i < 3; i++) {
            try {
                element.click();
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    Thread.sleep(1000);
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
            }
        }
    }




    //scroll into an element
    public static void scrollToElement(WebElement element) {
        try {
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //scroll into an element
    public static void scrollToElement(By by) {
        try {
            WebElement element = Driver.getDriver().findElement(by);
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * return a list of string from a list of elements
     *
     * @param list of webelements
     * @return list of string
     */
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }

    public static List<String> getElementsTextLowerCase(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText().toLowerCase());
        }
        return elemTexts;
    }


}
