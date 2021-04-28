package com.demoqa.testproject.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectMenu {

    WebDriver driver;
    WebDriverWait wait;

    public SelectMenu(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }

    public void click_widgets() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(widgetsclick)).click();
    }

    By widgetsclick = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]");
    By clickselectmenu = By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[9]/svg");
    By multiSelect = By.xpath("//*[@id=\"cars\"]");
    By oldSelectMenu = By.xpath("//*[@id=\"oldSelectMenu\"]");

    public void click_selectmenu() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickselectmenu)).click();
    }

    public void clickDropdown(int index) {
        Select dropdown1 = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(multiSelect)));
        dropdown1.selectByIndex(index);
        //dropdown1.selectByValue("5");
        //dropdown1.selectByVisibleText("10 rows");
    }

    public void oldSelectMenu(int index) {
        Select dropdown1 = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(oldSelectMenu)));
        dropdown1.selectByIndex(index);
    }

}
