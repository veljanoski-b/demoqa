package com.demoqa.testproject.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButton {

    WebDriver driver;
    WebDriverWait wait;

    public RadioButton(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }
    By elements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    By radiobutton = By.xpath("//*[@id=\"item-2\"]");
    By clickRadio = By.xpath("//*[contains(@class, 'custom-control-label')]");

    By returnyes = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/p");
    By returnimpressive = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/p");


    public void click_elements() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elements)).click();
    }

    public void clickRadio(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(clickRadio)).get(index).click();
    }

    public void radio_button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(radiobutton)).click();
    }

    public String returnyes() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnyes)).getText();
    }
    public String returnimpressive() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnimpressive)).getText();
    }

}
