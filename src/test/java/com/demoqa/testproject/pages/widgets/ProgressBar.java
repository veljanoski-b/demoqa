package com.demoqa.testproject.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressBar {

    WebDriver driver;
    WebDriverWait wait;

    public ProgressBar(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }

    public void click_widgets() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(widgetsclick)).click();
    }

    By widgetsclick = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]");
    By clickprogressbar = By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[5]");
    By clickstart = By.xpath("//*[@id=\"progressBarContainer\"]");

    public void click_progress_bar() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickprogressbar)).click();
    }
    public void click_Start() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickstart)).click();
    }


}
