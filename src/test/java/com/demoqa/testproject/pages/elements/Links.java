package com.demoqa.testproject.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Links {

    WebDriver driver;
    WebDriverWait wait;

    public Links(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    By clickelements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    By links = By.xpath("//*[@id=\"item-5\"]");
    By linksopen = By.id("simpleLink");
    By linkscreated = By.id("created");
    By linksnocontent = By.id("no-content");
    By linksmoved = By.id("moved");
    By badrequest = By.id("bad-request");
    By linksunauthorized = By.id("unauthorized");
    By linksforbidden = By.id("forbidden");
    By linksnotfound = By.id("invalid-url");

    By returncreated = By.xpath("//*[@id=\"linkResponse\"]");
    By returnnocontent = By.xpath("//*[@id=\"linkResponse\"]");
    By returnmoved = By.xpath("//*[@id=\"linkResponse\"]");
    By returnbadrequest = By.xpath("//*[@id=\"linkResponse\"]");
    By returnunauthorized = By.xpath("//*[@id=\"linkResponse\"]");
    By returnforbidden = By.xpath("//*[@id=\"linkResponse\"]");
    By returnnotfound = By.xpath("//*[@id=\"linkResponse\"]");

    public String returnnotfound() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnnotfound)).getText();
    }

    public String returnforbidden() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnforbidden)).getText();
    }

    public String returnunauthorized() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnunauthorized)).getText();
    }

    public String returnbadrequest() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnbadrequest)).getText();
    }

    public String returnmoved() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnmoved)).getText();
    }

    public String returnnocontent() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnnocontent)).getText();
    }


    public String returncreated() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returncreated)).getText();
    }


    public void click_links() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(links)).click();
    }

    public void click_elements() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickelements)).click();
    }

    public void links_not_found() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(linksnotfound)).click();
    }

    public void links_forbidden() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(linksforbidden)).click();
    }


    public void links_unauthorized() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(linksunauthorized)).click();
    }

    public void links_bad_request() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(badrequest)).click();
    }


    public void links_no_content() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(linksnocontent)).click();
    }

    public void links_moved() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(linksmoved)).click();
    }

    public void links_created() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(linkscreated)).click();
    }

    public void links_open() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(linksopen)).click();
    }


}
