package com.demoqa.testproject.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBox {

    WebDriver driver;
    WebDriverWait wait;

    By elements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    By textbox = By.xpath("//*[@id=\"item-0\"]");
    By fullname = By.id("userName");
    By email = By.id("userEmail");
    By currentaddress = By.id("currentAddress");
    By permanentaddress = By.id("permanentAddress");
    By submit = By.id("submit");


    By return_full_name = By.xpath("//*[@id=\"name\"]");
    By return_email = By.xpath("//*[@id=\"email\"]");
    By return_current_address = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/form/div[6]/div/p[3]");
    By return_permanent_address = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/form/div[6]/div/p[4]");


    public TextBox(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }

    public void permanent_address(String permanent_Address) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(permanentaddress)).sendKeys(permanent_Address);
    }

    public void current_address(String currentAddress) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(currentaddress)).sendKeys(currentAddress);
    }

    public void type_full_name(String fullName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(fullname)).sendKeys(fullName);
    }

    public void type_email(String emailAddress) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys(emailAddress);
    }


    public void click_elements() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elements)).click();
    }

    public void text_box() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(textbox)).click();
    }

    public String return_full_name() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(return_full_name)).getText();
    }

    public String return_email() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(return_email)).getText();
    }

    public String return_current_address() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(return_current_address)).getText();
    }

    public String return_permanent_address() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(return_permanent_address)).getText();
    }

    public void select_submit(String submit_button) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(submit)).sendKeys(Keys.ENTER);
    }


}
