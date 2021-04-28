package com.demoqa.testproject.tests;

import com.demoqa.testproject.pages.HomePage;
import com.demoqa.testproject.pages.alertsframewindows.Alerts;
import com.demoqa.testproject.pages.alertsframewindows.BrowserWindows;
import com.demoqa.testproject.pages.alertsframewindows.Frames;
import com.demoqa.testproject.pages.bookstoreapplication.Login;
import com.demoqa.testproject.pages.elements.*;
import com.demoqa.testproject.pages.forms.PracticeForm;
import com.demoqa.testproject.pages.widgets.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.awt.*;

public class BaseTest {


    public WebDriver driver;
    public WebDriverWait wait;
    String browser = "Chrome";

    public HomePage homePage;
    public PracticeForm practiceForm;
    public TextBox textBox;
    public CheckBox checkBox;
    public RadioButton radioButton;
    public WebTables webTables;
    public Buttons buttons;
    public Links links;
    public BrokenLinksImages brokenLinksImages;
    public UploadAndDownload uploadAndDownload;
    public DynamicProperties dynamicProperties;
    public Login loginPage;
    public Accordian accordianPage;
    public AutoComplete autoComplete;
    public DatePicker datePicker;
    public Slider sliderPage;
    public ProgressBar progressBar;
    public BrowserWindows browserWindows;
    public Alerts alertsPage;
    public Frames framesPage;
    public SelectMenu selectMenu;


    public static final String URL = "https://demoqa.com";


    @BeforeMethod
    public void set_up() {
        Browsers browsers = Browsers.valueOf(browser.toUpperCase());
        switch (browsers) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
        }

        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);

        homePage = new HomePage(driver, wait);
        practiceForm = new PracticeForm(driver, wait);
        textBox = new TextBox(driver, wait);
        checkBox = new CheckBox(driver, wait);
        radioButton = new RadioButton(driver, wait);
        webTables = new WebTables(driver, wait);
        buttons = new Buttons(driver, wait);
        links = new Links(driver, wait);
        brokenLinksImages = new BrokenLinksImages(driver, wait);
        uploadAndDownload = new UploadAndDownload(driver, wait);
        dynamicProperties = new DynamicProperties(driver, wait);
        loginPage = new Login(driver, wait);
        accordianPage = new Accordian(driver, wait);
        autoComplete = new AutoComplete(driver, wait);
        datePicker = new DatePicker(driver, wait);
        sliderPage = new Slider(driver, wait);
        progressBar = new ProgressBar(driver, wait);
        browserWindows = new BrowserWindows(driver, wait);
        alertsPage = new Alerts(driver, wait);
        framesPage = new Frames(driver, wait);
        selectMenu = new SelectMenu(driver, wait);


        driver.navigate().to(URL);


    }

    @AfterMethod
    public void tear_down() {
        driver.quit();
    }

    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
