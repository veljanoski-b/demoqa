package com.demoqa.testproject.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicProperties {

    WebDriver driver;
    WebDriverWait wait;

    public DynamicProperties(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    By clickelements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    By dynamicproperties = By.xpath("//*[contains(@class, 'btn btn-light active')]");



    public void click_elements() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickelements)).click();
    }

    public void dynamic_properties() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(dynamicproperties)).click();
    }

}
