package com.demoqa.testproject.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadAndDownload {
    WebDriver driver;
    WebDriverWait wait;

    public UploadAndDownload(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    By clickelements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    By uploaddownload = By.xpath("//*[@id=\"item-7\"]");
    By downloadbutton = By.id("downloadButton");

    public void download_button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(downloadbutton)).click();
    }

    public void click_elements() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickelements)).click();
    }

    public void upload_download() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(uploaddownload)).click();
    }


}
