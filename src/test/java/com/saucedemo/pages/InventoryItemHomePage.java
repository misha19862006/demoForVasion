package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryItemHomePage {

    public InventoryItemHomePage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//button[.='Add to cart']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//button[@id='back-to-products']")
    public WebElement backToProductsButton;



}
