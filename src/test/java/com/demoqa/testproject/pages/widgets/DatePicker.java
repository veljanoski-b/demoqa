package com.demoqa.testproject.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker {

    WebDriver driver;
    WebDriverWait wait;

    public DatePicker(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }

    public void click_widgets() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(widgetsclick)).click();
    }

    By widgetsclick = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]");
    By datepicker = By.id("datePickerMonthYearInput");
    By click_datepicker = By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[3]");
    By datetime = By.id("dateAndTimePickerInput");


    public void date_picker(String datePicker) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(datepicker)).sendKeys(Keys.CONTROL + "A");
        wait.until(ExpectedConditions.visibilityOfElementLocated(datepicker)).sendKeys("04/19/2000");
    }

    public void date_datetime(String dateTime) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(datetime)).sendKeys(Keys.CONTROL + "A");
        wait.until(ExpectedConditions.visibilityOfElementLocated(datetime)).sendKeys("June 13, 2020 5:00 PM");
    }


    public void click_datePicker() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(click_datepicker)).click();
    }

}
