package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryItems {


    public InventoryItems(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//div[@class='inventory_item'][1]//div[@class='inventory_item_name']")
    public WebElement inventoryItemLink1;

    @FindBy(xpath = "//div[@class='inventory_item'][2]//div[@class='inventory_item_name']")
    public WebElement inventoryItemLink2;

    @FindBy(xpath = "//div[@class='inventory_item'][3]//div[@class='inventory_item_name']")
    public WebElement inventoryItemLink3;

    @FindBy(xpath = "//div[@class='inventory_item'][4]//div[@class='inventory_item_name']")
    public WebElement inventoryItemLink4;

    @FindBy(xpath = "//div[@class='inventory_item'][5]//div[@class='inventory_item_name']")
    public WebElement inventoryItemLink5;

    @FindBy(xpath = "//div[@class='inventory_item'][6]//div[@class='inventory_item_name']")
    public WebElement inventoryItemLink6;

    @FindBy(xpath = "//div[@class='inventory_item'][1]//button[@id]")
    public WebElement inventoryItem1addToCartButton;

    @FindBy(xpath = "//div[@class='inventory_item'][2]//button[@id]")
    public WebElement inventoryItem2addToCartButton;

    @FindBy(xpath = "//div[@class='inventory_item'][3]//button[@id]")
    public WebElement inventoryItem3addToCartButton;

    @FindBy(xpath = "//div[@class='inventory_item'][4]//button[@id]")
    public WebElement inventoryItem4addToCartButton;

    @FindBy(xpath = "//div[@class='inventory_item'][5]//button[@id]")
    public WebElement inventoryItem5addToCartButton;

    @FindBy(xpath = "//div[@class='inventory_item'][6]//button[@id]")
    public WebElement inventoryItem6addToCartButton;




}
