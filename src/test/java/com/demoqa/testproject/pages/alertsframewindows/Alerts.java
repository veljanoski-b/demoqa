package com.demoqa.testproject.pages.alertsframewindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

    WebDriver driver;
    WebDriverWait wait;

    public Alerts(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }

    public void click_alertframewindows() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickalertframewindows)).click();
    }

    By clickalertframewindows = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]");
    By clickalerts = By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]");
    By clickonalertbutton = By.id("alertButton");

    public void click_alerts() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickalerts)).click();
    }

    public void click_onalertbutton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickonalertbutton)).click();
    }

}
