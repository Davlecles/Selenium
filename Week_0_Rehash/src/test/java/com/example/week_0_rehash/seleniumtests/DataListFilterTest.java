package com.example.week_0_rehash.seleniumtests;

import com.example.week_0_rehash.pages.DataListFilterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataListFilterTest extends BaseTests{

    private DataListFilterPage dataListFilterPage;

    @Test
    public void DataFilter_FilterByName_ShouldFilterList(){
        //Given
        String textToShow = "Company Name: Kingfisher Publishing Ltd\n" +
                "Name: Tia Kingfisher\n" +
                "Title: Manager";
        String textToHide = "Company Name: Pearce Workwear Ltd\n" +
                "Name: Catherine Pearce\n" +
                "Title: Manager";

        //When
        dataListFilterPage = landingPage.followLinkToDataListFilterPage();
        dataListFilterPage.typeIntoInputField("tia");

        //Then
        Assert.assertTrue(dataListFilterPage.isItemVisible(textToShow));
        Assert.assertFalse(dataListFilterPage.isItemVisible(textToHide));
    }

    @Test
    public void DataFilter_VerifyListAmount_ShouldShowCorrectAmount(){
        //Given
        int expectedItemCount = 3;

        //When
        dataListFilterPage = landingPage.followLinkToDataListFilterPage();
        dataListFilterPage.typeIntoInputField("mana");
        int actualItemCount = dataListFilterPage.getVisibleItemCount();

        //Then
        Assert.assertEquals(actualItemCount, expectedItemCount);

    }

}
