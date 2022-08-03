package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class HomePage {

    public HomePage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    public WebElement topLeftPopupMenu;

    @FindBy(xpath = "//button[@id='react-burger-cross-btn']")
    public WebElement closeLeftPopupMenuButton;

    @FindBy(xpath = "//a[.='All Items']")
    public WebElement allItemsButton;

    @FindBy(xpath = "//a[.='About']")
    public WebElement aboutButton;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "//a[.='Reset App State']")
    public WebElement resetAppStateButton;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement cartLinkButton;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement sortItemsDropdownButton;

    @FindBy(xpath = "//a[@href='https://twitter.com/saucelabs']")
    public WebElement twitterLinkButton;

    @FindBy(xpath = "//a[@href='https://www.facebook.com/saucelabs']")
    public WebElement facebookLinkButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/company/sauce-labs/']")
    public WebElement linkedinLinkButton;

    @FindBy(xpath = "//div[@class='inventory_list']")
    public WebElement inventoryList;











}
