package com.demoqa.testproject.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinksImages {

    WebDriver driver;
    WebDriverWait wait;

    public BrokenLinksImages(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    By clickelements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    By brokenlinks = By.xpath("//*[@id=\"item-6\"]");
    By validlinks = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/a[1]");
    By clickforbrokenlink = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/a[2]");


    public void broken_links() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(brokenlinks)).click();
    }

    public void click_elements() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickelements)).click();
    }

    public void click_for_broken_link() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickforbrokenlink)).click();
    }

    public void valid_links() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(validlinks)).click();
    }


}
