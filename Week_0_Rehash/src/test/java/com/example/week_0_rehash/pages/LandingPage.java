package com.example.week_0_rehash.pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;

public class LandingPage extends BasePage {

    private final By simpleFormDemoLink = By.linkText("Simple Form Demo");
    private final By keyPressLink = By.linkText("Key Press");
    private final By dataListFilterPage= By.linkText("Data List Filter");

    public SimpleFormDemoPage followLinkToSimpleFormDemoPage(){
        click(simpleFormDemoLink);
        return new SimpleFormDemoPage();
    }

    public KeyPressPage followLinkToKeyPressPage(){
        click(keyPressLink);
        return new KeyPressPage();
    }

    public DataListFilterPage followLinkToDataListFilterPage(){
        click(dataListFilterPage);
        return new DataListFilterPage();
    }
}
