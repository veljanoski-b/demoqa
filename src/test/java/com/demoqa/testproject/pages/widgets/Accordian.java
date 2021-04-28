package com.demoqa.testproject.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Accordian {


    WebDriver driver;
    WebDriverWait wait;

    public Accordian(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }

    public void click_widgets() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(widgetsclick)).click();
    }

    By widgetsclick = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]");
    By accordianclick = By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[1]");
    By comefromclick = By.xpath("//*[@id=\"section2Heading\"]");
    By whydoweuseclick = By.xpath("//*[@id=\"section3Heading\"]");


    public void click_accordian() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(accordianclick)).click();
    }

    public void click_comefrom() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(comefromclick)).click();
    }

    public void click_whydoweuse() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(whydoweuseclick)).click();
    }

}
