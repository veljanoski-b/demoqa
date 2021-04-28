package com.demoqa.testproject.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buttons {

    WebDriver driver;
    WebDriverWait wait;

    public Buttons(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    By clickelements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    By clickbuttons = By.xpath("//*[@id=\"item-4\"]");
    By clickMe = By.xpath("//*[contains(@class, 'btn-primary')]");

    By returnclickbuttons = By.xpath("//*[@id=\"dynamicClickMessage\"]");

    public void click_elements() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickelements)).click();
    }

    public void click_buttons() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickbuttons)).click();
    }

    public void click_me(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(clickMe)).get(index).click();
    }
    public String returnclickbuttons() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnclickbuttons)).getText();
    }


}
