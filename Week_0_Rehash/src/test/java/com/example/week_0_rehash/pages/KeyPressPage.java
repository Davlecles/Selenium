package com.example.week_0_rehash.pages;

import org.openqa.selenium.By;

public class KeyPressPage extends BasePage{

    private final By keyPressInputField = By.id("my_field");
    private final By keyPressResult = By.id("result");

    public void typeIntoInputField(String input){
        sendKeys(keyPressInputField, input);
    }

    public String getResultOfKeyPress(){
        return getText(keyPressResult);
    }
}
