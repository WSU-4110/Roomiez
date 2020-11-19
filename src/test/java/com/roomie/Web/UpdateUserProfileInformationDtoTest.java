package com.roomie.Web;

import com.roomie.model.UpdateUserProfileInformation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UpdateUserProfileInformationDtoTest {

    UpdateUserProfileInformation userProfileInformation = new UpdateUserProfileInformation("headline", "doctor", "facebook",
            "20", "Detroit", "English", "I love dogs!");


    @Test
    public void getHeadlineTest(){
        String expected = "headline";
        String actual = userProfileInformation.getHeadLine();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void getProfessionTest(){
        String expected = "doctor";
        String actual = userProfileInformation.getProfession();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getSocialMediaTest(){
        String expected = "facebook";
        String actual = userProfileInformation.getSocialMedia();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void getAgeTest(){
        String expected = "20";
        String actual = userProfileInformation.getAge();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void getHCurrentCityTest(){
        String expected = "Detroit";
        String actual = userProfileInformation.getCurrentCity();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void getLanguageTest(){
        String expected = "English";
        String actual = userProfileInformation.getLanguage();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void getImportantThingTest(){
        String expected = "I love dogs!";
        String actual = userProfileInformation.getImportantThing();

        Assertions.assertEquals(expected, actual);
    }
}
