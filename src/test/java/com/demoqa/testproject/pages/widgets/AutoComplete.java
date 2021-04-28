package com.demoqa.testproject.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoComplete {

    WebDriver driver;
    WebDriverWait wait;

    public AutoComplete(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }

    public void click_widgets() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(widgetsclick)).click();
    }

    By widgetsclick = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]");
    By autocompleteclick = By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[2]");
    By multiplecolor = By.id("autoCompleteMultipleContainer");
    By singlecolor = By.xpath("//*[@id=\"autoCompleteSingleContainer\"]/div/div[1]/div[1]");
    By clickmultiplecolor = By.xpath("//*[@id=\"autoCompleteMultipleContainer\"]/div/div[1]");


    public void click_auto_complete() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(autocompleteclick)).click();
    }

    public void multiplecolor(String multiple_color) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(multiplecolor)).sendKeys(multiple_color);
    }

    public void clicksingle_color() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickmultiplecolor)).click();
    }

    public void multiplesoxpath() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(multiplecolor)).sendKeys("Blue");
    }


    public void singlecolor(String single_color) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(singlecolor)).sendKeys(single_color);
    }

}
