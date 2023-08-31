package com.example.week_0_rehash.seleniumtests;

import com.example.week_0_rehash.pages.KeyPressPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyPressTest extends BaseTests{

    private KeyPressPage keyPressPage;

    @Test
    public void KeyPress_inputKey_ShouldDisplayKeyPress(){
        //Given
        String testKeyInput = " ";
        String testKeyOutput = "You entered: SPACE";

        //When
        keyPressPage = landingPage.followLinkToKeyPressPage();
        keyPressPage.typeIntoInputField(testKeyInput);
        String result = keyPressPage.getResultOfKeyPress();

        //Then
        Assert.assertEquals(result, testKeyOutput);
    }

}
