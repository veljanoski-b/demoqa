package com.demoqa.testproject.pages.alertsframewindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserWindows {

    WebDriver driver;
    WebDriverWait wait;

    public BrowserWindows(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }

    public void click_alertframewindows() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickalertframewindows)).click();
    }

    By clickalertframewindows = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]");
    By clickbrowserwindows = By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[1]");
    By clicknewtab = By.id("tabButton");
    By clicknewwindow = By.id("windowButton");
    By newwindowmessage = By.id("messageWindowButton");

    public void click_newwindowmessage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(newwindowmessage)).click();
    }


    public void click_newwindow() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clicknewwindow)).click();
    }


    public void click_newtab() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clicknewtab)).click();
    }


    public void click_broswerwindows() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickbrowserwindows)).click();
    }


    public void closeTab() {
        driver.close();
    }

    public void switchToWindow(String window) {
        driver.switchTo().window(window);
    }


}
