package com.saucedemo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtil {

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static List<String> dropdownOptionAString(WebElement dropdownElement){

        Select select = new Select(dropdownElement);

        List<WebElement> actualOptionWebElement = select.getOptions();

        List<String>actualOptionAsString = new ArrayList<>();

        for (WebElement each : actualOptionWebElement) {
            actualOptionAsString.add(each.getText());
        }
        return actualOptionAsString;
    }

    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl){

        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowsHandles) {

            Driver.getDriver().switchTo().window(each);

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

    }

}
