package com.yaypay.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

abstract class Page {
  WebDriver driver;

  Page(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  void waitAndClick(WebElement element){
    new WebDriverWait(driver, 30).until(ExpectedConditions.
            elementToBeClickable(element)).click();
  }
}
