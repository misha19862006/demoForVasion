package com.saucedemo.step_definitions;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.utilities.BrowserUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SortDropdown {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();


    @Given("User is on home page")
    public void user_is_on_home_page() {
        loginPage.login();
    }
    @When("user clicks to sort batten")
    public void user_clicks_to_sort_batten() {
        homePage.sortItemsDropdownButton.click();
    }
    @Then("user should see")
    public void user_should_see(List<String>expectedOptions) {

        List<String> actualOption = BrowserUtil.dropdownOptionAString(homePage.sortItemsDropdownButton);

        Assert.assertEquals(expectedOptions, actualOption);

    }


}
