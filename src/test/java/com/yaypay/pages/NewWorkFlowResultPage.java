package com.yaypay.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class NewWorkFlowResultPage extends CollectionWorkflowsPage{

    private static final String BASE_XPATH = "//*[@id='tab1']";

    @FindBy(how = How.XPATH, using = BASE_XPATH + "/div[1]/div/div[1]/div/ul/li/span/i")
    public WebElement addCurrentWorkFlowIcon;

    @FindBy(how = How.XPATH, using = BASE_XPATH +"/div[1]/div/div[1]/div/ul/li/div/ul/li[1]/span/i")
    public WebElement addPhoneIcon;

    @FindBy(how = How.XPATH, using = BASE_XPATH + "/div[1]/div/div[1]/div/ul/li/div/ul/li[2]")
    public WebElement addEmailIcon;

    @FindBy(how = How.XPATH, using = BASE_XPATH + "/div[2]/div[1]/a[1]")
    public WebElement saveButton;

    @FindBy(how = How.XPATH, using = BASE_XPATH + "/div[1]/div/div[1]/div[2]/div")
    public WebElement createdCallBlock;

    @FindBy(how = How.XPATH, using = BASE_XPATH + "/div[1]/div/div[1]/div[2]/div")
    public WebElement createdEmailBlock;

    NewWorkFlowResultPage(WebDriver webDriver) {
        super(webDriver);
    }

    public NewWorkFlowResultPage waitAndClickOnAddCurrentWorkFlowIcon(){
        waitAndClick(addCurrentWorkFlowIcon);
        return this;
    }

    public NewWorkFlowResultPage waitAndClickOnAddPhoneIcon(){
        waitAndClick(addPhoneIcon);
        return this;
    }

    public NewWorkFlowResultPage clickOnSaveButton(){
        saveButton.click();
        return this;
    }

    public NewWorkFlowResultPage waitAndClickOnAddEmailIcon(){
        waitAndClick(addEmailIcon);
        return this;
    }

    public boolean isCreatedCallBlockDisplayed(){
        return createdCallBlock.isDisplayed() && !createdCallBlock.getAttribute("data-id").isEmpty();
    }

    public boolean isCreatedEmailBlockDisplayed(){
        return createdEmailBlock.isDisplayed() && !createdEmailBlock.getAttribute("data-id").isEmpty();
    }

}
