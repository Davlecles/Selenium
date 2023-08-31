package com.example.week_0_rehash.seleniumtests;

import com.example.week_0_rehash.pages.DataListFilterPage;
import com.example.week_0_rehash.pages.SimpleFormDemoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleFormDemoTest extends BaseTests{

    private SimpleFormDemoPage simpleFormDemoPage;

    @Test
    public void SimpleFormDemo_interInput_ShouldDisplayInput(){
        //Given
        String testMessage = "Hej";

        //When
        simpleFormDemoPage = landingPage.followLinkToSimpleFormDemoPage();
        simpleFormDemoPage.typeIntoSingleInputField(testMessage);
        simpleFormDemoPage.clickGetCheckedValueButton();
        String result = simpleFormDemoPage.getTextOfDisplayedMessage();

        //Then
        Assert.assertEquals(result, testMessage);
    }
}
