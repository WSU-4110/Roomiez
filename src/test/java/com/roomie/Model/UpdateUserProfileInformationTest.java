package com.roomie.Model;

import com.roomie.model.UpdateUserProfileInformation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UpdateUserProfileInformationTest {

    UpdateUserProfileInformation update = new UpdateUserProfileInformation
            ("headline", "doctor", "facebook",
                    "20", "Detroit", "English", "I love dogs!");

    @Test
    public void getHeadlineTest(){
        String expected = "headline";
        String actual = update.getHeadLine();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void getProfessionTest(){
        String expected = "doctor";
        String actual = update.getProfession();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getSocialMediaTest(){
        String expected = "facebook";
        String actual = update.getSocialMedia();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void getAgeTest(){
        String expected = "20";
        String actual = update.getAge();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void getHCurrentCityTest(){
        String expected = "Detroit";
        String actual = update.getCurrentCity();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void getLanguageTest(){
        String expected = "English";
        String actual = update.getLanguage();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void getImportantThingTest(){
        String expected = "I love dogs!";
        String actual = update.getImportantThing();

        Assertions.assertEquals(expected, actual);
    }

}
