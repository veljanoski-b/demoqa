package com.demoqa.testproject.pages.alertsframewindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {

    WebDriver driver;
    WebDriverWait wait;

    public Frames(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }

    public void click_alertframewindows() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickalertframewindows)).click();
    }

    By clickalertframewindows = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]");
    By clickonframes = By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[3]");

    By return_frame = By.id("frame1");




    public void click_onframes() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickonframes)).click();
    }

    public void switchToFrame() {
        driver.switchTo().frame(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-header\"]/div/div/div[2]/div/a[1]"))));
    }

    public String return_Frame() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(return_frame)).getText();
    }


}
