package com.yaypay;

import org.junit.Before;
import org.junit.Test;
import com.yaypay.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;


public class CollectionWorkflowJUnitTest extends JUnitTestBase {

    private LoginPage loginPage;

    @Before
    public void init() {
        driver.get(baseUrl);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @Test
    public void testAddingPhoneWorkflow() {
        assertTrue(
                loginPage.fillUsernameAndPasswordField(userModel.getUserName(), userModel.getPassword())
                        .submitLogin()
                        .clickOnCollectionWorkflowsMenuItem()
                        .clickOnNewWorkflowButton()
                        .waitAndClickOnAddCurrentWorkFlowIcon()
                        .waitAndClickOnAddPhoneIcon()
                        .clickOnSaveButton()
                        .isCreatedCallBlockDisplayed());
    }

    @Test
    public void testAddingEmailWorkflow() {
        assertTrue(
                loginPage.fillUsernameAndPasswordField(userModel.getUserName(), userModel.getPassword())
                        .submitLogin()
                        .clickOnCollectionWorkflowsMenuItem()
                        .clickOnNewWorkflowButton()
                        .waitAndClickOnAddCurrentWorkFlowIcon()
                        .waitAndClickOnAddEmailIcon()
                        .clickOnSaveButton()
                        .isCreatedEmailBlockDisplayed());
    }
}
