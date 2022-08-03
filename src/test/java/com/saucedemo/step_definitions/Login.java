package com.saucedemo.step_definitions;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.utilities.BrowserUtil;
import com.saucedemo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Login {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @When("user enter username {string}")
    public void user_enter_username(String username) {
       loginPage.inputUsername.sendKeys(username);
    }
    @When("user enter password {string}")
    public void user_enter_password(String password) {
        loginPage.inputPassword.sendKeys(password);
    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        loginPage.loginButton.click();
    }
    @Then("user should see url contains {string}")
    public void user_should_see_url_contains(String word) {
        boolean contains = Driver.getDriver().getCurrentUrl().contains(word);
        Assert.assertTrue(contains);
    }

    @Then("user should see Epic sadface massage")
    public void user_should_see_epic_sadface_massage() {
        boolean isDisplayed = loginPage.failLoginMassageIsDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @When("user enter username")
    public void user_enter_username(List<String>usernames) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        for (String each : usernames) {

            loginPage.inputUsername.sendKeys(each);
            loginPage.inputPassword.sendKeys("secret_sauce");
            wait.until(ExpectedConditions.elementToBeClickable(loginPage.loginButton));
            loginPage.loginButton.click();
            wait.until(ExpectedConditions.elementToBeClickable(homePage.topLeftPopupMenu));
            homePage.topLeftPopupMenu.click();
            homePage.logoutButton.click();
        }
        for (String each : usernames) {
            System.out.println("each = " + each);
        }

    }



}
