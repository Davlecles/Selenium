package com.example.week_0_rehash.pages;

import org.openqa.selenium.By;

public class SimpleFormDemoPage extends BasePage{

    private final By singleInputField = By.id("user-message");
    private final By getValueCheckedButton = By.id("showInput");
    private final By displayText = By.id("message");

    public void typeIntoSingleInputField(String input){
        sendKeys(singleInputField, input);
    }

    public void clickGetCheckedValueButton(){
        click(getValueCheckedButton);
    }

    public String getTextOfDisplayedMessage(){
       return getText(displayText);
    }

}
