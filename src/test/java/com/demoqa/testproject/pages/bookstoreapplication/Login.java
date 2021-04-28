package com.demoqa.testproject.pages.bookstoreapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

    WebDriver driver;
    WebDriverWait wait;

    public Login(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }

    By bookStore = By.xpath("/html/body/div/div/div/div[2]/div/div[6]]");
    By userName = By.xpath("//*[@id=\"userName\"]");
    By passWord = By.xpath("//*[@id=\"password\"]");

    public void userName(String user_name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(userName)).sendKeys(user_name);
    }

    public void click_bookStore() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(bookStore)).click();
    }


}