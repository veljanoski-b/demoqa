package com.demoqa.testproject.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTables {

    WebDriver driver;
    WebDriverWait wait;

    public WebTables(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }

    By elements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    By webtables = By.xpath("//*[@id=\"item-3\"]");
    By webtablessearch = By.id("searchBox");
    By webtablesadd = By.id("addNewRecordButton");
    By webtablesage = By.id("age");
    By tablessalary = By.id("salary");
    By tablesdepartment = By.id("department");

    By deleteuserwebtable = By.id("delete-record-4");


    By returnsearch = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[1]");


    By firstname = By.id("firstName");
    By lastname = By.id("lastName");
    By email = By.id("userEmail");
    By submit = By.id("submit");

    By returnadd = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div/div[1]");

    public String returnadd() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnadd)).getText();
    }


    public void select_submit(String submit_button) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(submit)).sendKeys(Keys.ENTER);
    }

    public void type_first_name(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstname)).sendKeys(name);

    }


    public void type_last_name(String lname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastname)).sendKeys(lname);
    }


    public void type_e_mail(String e_mail) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys(e_mail);
    }


    public String returnsearch() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnsearch)).getText();
    }



    public void click_elements() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elements)).click();
    }

    public void delete_user() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(deleteuserwebtable)).click();
    }

    public void web_tables_age(String tablesage) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(webtablesage)).sendKeys(tablesage);
    }

    public void web_tables_search(String tablessearch) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(webtablessearch)).sendKeys(tablessearch);
    }

    public void web_tables_add() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(webtablesadd)).click();
    }

    public void web_tables() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(webtables)).click();
    }

    public void tables_department(String department) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(tablesdepartment)).sendKeys(department);
    }

    public void tables_salary(String salary) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(tablessalary)).sendKeys(salary);
    }

}
