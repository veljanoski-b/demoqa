package com.demoqa.testproject.pages.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeForm {

    WebDriver driver;
    WebDriverWait wait;

    By firstname = By.id("firstName");
    By lastname = By.id("lastName");
    By email = By.id("userEmail");
    By phonenumber = By.id("userNumber");
    By currentaddress = By.id("currentAddress");
    By dateofbirth = By.id("dateOfBirthInput");
    By state = By.id("react-select-3-input");
    By submit = By.id("submit");
    By city = By.xpath("//*[@id=\"react-select-4-input\"]");
    By clickGenders = By.xpath("//*[contains(@class, 'custom-radio')]");
    By clickHobbies = By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]");

    By forms = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]");
    By clickPractiseForm = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div");
    By clickClose = By.id("closeLargeModal");

    By returnnamesurname = By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[1]");
    By returnemail = By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[2]");
    By returngender = By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[3]");
    By returnmobile = By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[4]");
    By returndateofbirth = By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[5]");
    By returnhobbies = By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[7]");
    By returnaddress = By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[9]");
    By returnstatecity = By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[10]");

    public String returnstatecity() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnstatecity)).getText();
    }

    public String returnaddress() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnaddress)).getText();
    }

    public String returnhobbies() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnhobbies)).getText();
    }

    public String returndateofbirth() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returndateofbirth)).getText();
    }

    public String returnmobile() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnmobile)).getText();
    }

    public String returngender() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returngender)).getText();
    }

    public String returnemail() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnemail)).getText();
    }

    public String returnnamesurname() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnnamesurname)).getText();
    }


    public PracticeForm(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }

    public void click_forms() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(forms)).click();
    }

    public void click_practise_form() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickPractiseForm)).click();
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

    public void type_phone_number(String phone_number) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(phonenumber)).sendKeys(phone_number);
    }

    public void type_current_address(String current_address) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(currentaddress)).sendKeys((current_address));
    }

    public void type_date_of_birth(String date_of_birth) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(dateofbirth)).sendKeys(Keys.CONTROL + "A");
        wait.until(ExpectedConditions.visibilityOfElementLocated(dateofbirth)).sendKeys("13 Jun 1990");
    }

    public void select_state(String state) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.state)).sendKeys(state);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.state)).sendKeys(Keys.ENTER);
    }


    public void select_submit(String submit_button) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(submit)).sendKeys(Keys.ENTER);
    }

    public void select_city(String city) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.city)).sendKeys(city);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.city)).sendKeys(Keys.ENTER);
    }

    public void clickGenders(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(clickGenders)).get(index).click();
    }

    public void click_close() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickClose)).click();

    }

    public void clickHobbies(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(clickHobbies)).get(index).click();
    }

}


