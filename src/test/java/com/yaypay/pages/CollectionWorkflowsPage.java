package com.yaypay.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CollectionWorkflowsPage extends Page {

/*  bad way checking by visible text because we can use Google Translator,
    good way - binding to unique attribute like ID*/
    @FindBy(how = How.XPATH, using = "//a/span[contains(text(), 'New Workflow')]")
    public WebElement addNewWorkflowButton;

    CollectionWorkflowsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public NewWorkFlowResultPage clickOnNewWorkflowButton() {
        addNewWorkflowButton.click();
        return new NewWorkFlowResultPage(driver);
    }

}
