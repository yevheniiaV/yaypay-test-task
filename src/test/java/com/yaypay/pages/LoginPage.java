package com.yaypay.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends Page {

  @FindBy(how = How.NAME, using = "username")
  public WebElement userNameField;

  @FindBy(how = How.NAME, using = "password")
  public WebElement passwordField;

  @FindBy(how = How.XPATH, using = "//button")
  public WebElement submitButton;

  public LoginPage(WebDriver webDriver) {
    super(webDriver);
  }

  public LoginPage fillUsernameAndPasswordField(String name, String password) {
    userNameField.sendKeys(name);
    passwordField.sendKeys(password);
    return this;
  }

  public MainPage submitLogin() {
    submitButton.submit();
    return new MainPage(driver);
  }
}
