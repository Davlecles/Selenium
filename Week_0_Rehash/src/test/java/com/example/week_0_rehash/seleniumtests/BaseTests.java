package com.example.week_0_rehash.seleniumtests;

import com.example.week_0_rehash.pages.DataListFilterPage;
import com.example.week_0_rehash.pages.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTests {

    private WebDriver driver;
    private final String baseUrl = "https://lambdatest.com/selenium-playground";
    protected LandingPage landingPage;

    @BeforeClass
    public void init(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.get(baseUrl);
        landingPage = new LandingPage();
        landingPage.setDriver(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
