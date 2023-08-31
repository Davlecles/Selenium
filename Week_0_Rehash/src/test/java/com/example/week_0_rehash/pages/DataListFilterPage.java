package com.example.week_0_rehash.pages;

import org.apache.commons.io.input.WindowsLineEndingInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DataListFilterPage extends BasePage{

    private final By dataListInputField = By.id("input-search");
    private final By dataListResult_Text = By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div");
    private final By visibleItemLocator = By.cssSelector(".smtablet\\:w-full.items.mb-10.smtablet\\:border-r-0");


    public void typeIntoInputField(String input){
        sendKeys(dataListInputField, input);
    }

    public int getVisibleItemCount(){
        WebElement divList = driver.findElement(dataListResult_Text);
        List<WebElement> visibleItems = divList.findElements(visibleItemLocator);

        int count = 0;
        for (WebElement childItem : visibleItems) {
            if (childItem.isDisplayed()) {
                count++;
            }
        }
        return count;
    }

    public boolean isItemVisible(String itemText) {
        List<WebElement> itemList = driver.findElements(dataListResult_Text);
        for (WebElement item : itemList) {
            if (item.getText().equals(itemText)){
                return item.isDisplayed();
            }
        }
        return false;
    }
}
