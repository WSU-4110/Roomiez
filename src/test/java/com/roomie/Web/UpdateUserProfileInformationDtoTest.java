package com.roomie.Web;

import com.roomie.model.UpdateUserProfileInformation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UpdateUserProfileInformationDtoTest {

    UpdateUserProfileInformation userProfileInformation = new UpdateUserProfileInformation("headline", "doctor", "facebook",
            "20", "Detroit", "English", "I love dogs!");


    @Test
    //This test is to see if the headline will store properly
    public void getHeadlineTest(){
        String expected = "headline";
        String actual = userProfileInformation.getHeadLine();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    //This test is to see if the profession will store properly
    public void getProfessionTest(){
        String expected = "doctor";
        String actual = userProfileInformation.getProfession();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //This test is to see if the Social Media will store properly
    public void getSocialMediaTest(){
        String expected = "facebook";
        String actual = userProfileInformation.getSocialMedia();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    //This test is to see if the age will store properly
    public void getAgeTest(){
        String expected = "20";
        String actual = userProfileInformation.getAge();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    //This test is to see if the current city will store properly
    public void getHCurrentCityTest(){
        String expected = "Detroit";
        String actual = userProfileInformation.getCurrentCity();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    //This test is to see if the language will store properly
    public void getLanguageTest(){
        String expected = "English";
        String actual = userProfileInformation.getLanguage();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    //This test is to see if the important thing will store properly
    public void getImportantThingTest(){
        String expected = "I love dogs!";
        String actual = userProfileInformation.getImportantThing();

        Assertions.assertEquals(expected, actual);
    }
}
