package com.yaypay.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage extends Page{

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Collection Workflows')]")
    public WebElement collectionWorkflowsMenuItem;

    MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public CollectionWorkflowsPage clickOnCollectionWorkflowsMenuItem(){
        collectionWorkflowsMenuItem.click();
        return new CollectionWorkflowsPage(driver);
    }
}
