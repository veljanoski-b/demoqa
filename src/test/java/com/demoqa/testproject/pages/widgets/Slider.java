package com.demoqa.testproject.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Slider {

    WebDriver driver;
    WebDriverWait wait;

    public Slider(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }

    public void click_widgets() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(widgetsclick)).click();
    }

    By widgetsclick = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]");
    By clickslider = By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[4]");
    By sliderSlide = By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input");

    public void click_slider() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickslider)).click();
    }


}
