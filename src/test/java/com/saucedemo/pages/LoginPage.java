package com.saucedemo.pages;

import com.saucedemo.utilities.ConfigurationReader;
import com.saucedemo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//input[@id = 'user-name']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//h3[@data-test='error']")
    public WebElement failLoginMassage;




    public boolean titleVerification(){

        String title = "Swag Labs";
        return Driver.getDriver().getTitle().equals(title);

    }

    public void login(){

        this.inputUsername.sendKeys("standard_user");
        this.inputPassword.sendKeys("secret_sauce");
        this.loginButton.click();

    }

    public void login(String login, String password){

        this.inputUsername.sendKeys(login);
        this.inputPassword.sendKeys(password);
        this.loginButton.click();

    }

    public void loginWhitConfig(){

        this.inputUsername.sendKeys(ConfigurationReader.gerProperty("userName"));
        this.inputPassword.sendKeys(ConfigurationReader.gerProperty("password"));
        this.loginButton.click();

    }

    public boolean failLoginMassageIsDisplayed(){

        return this.failLoginMassage.isDisplayed();


    }







    }

