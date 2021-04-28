package com.demoqa.testproject.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {

    WebDriver driver;
    WebDriverWait wait;

    public CheckBox(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }

    By clickelements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    By checkbox = By.xpath("//*[@id=\"item-1\"]");
    By checkboxhome = By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]");
    By checkboxclickhome = By.xpath("//*[@id=\"tree-node\"]/div/button[1]");
    By checkboxselectall = By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]");
    By checkboxcolapseall = By.xpath("//*[@id=\"tree-node\"]/div/button[2]");

    By returnclickhome = By.xpath("//*[@id=\"result\"]");


    public void click_elements() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickelements)).click();
    }

    public void check_box() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkbox)).click();
    }

    public void check_box_colapse_all() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkboxcolapseall)).click();
    }

    public void check_box_select_all() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkboxselectall)).click();
    }

    public void check_box_click_home() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkboxclickhome)).click();
    }

    public void check_box_home() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkboxhome)).click();
    }

    public String returnclickhome() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnclickhome)).getText();
    }

}
