package com.roomie.Model;

import com.roomie.model.UpdateUserProfileInformation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//Tests updating profile information
public class UpdateUserProfileInformationTest {

    UpdateUserProfileInformation update = new UpdateUserProfileInformation
            ("headline", "doctor", "facebook",
                    "20", "Detroit", "English", "I love dogs!");

    UpdateUserProfileInformation update2 = new UpdateUserProfileInformation
            ("ME", "programmer", "insta",
                    "30", "Chicago", "Spanish", "I love WSU");

    @Test
    //This test is to see if the headline will store properly
    public void getHeadlineTest(){
        String expected = "headline";
        String actual = update.getHeadLine();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals("ME", update2.getHeadLine());
    }


    @Test
    //This test is to see if the profession will store properly
    public void getProfessionTest(){
        String expected = "doctor";
        String actual = update.getProfession();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals("programmer", update2.getProfession());
    }

    @Test
    //This test is to see if the Social Media will store properly

    public void getSocialMediaTest(){
        String expected = "facebook";
        String actual = update.getSocialMedia();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals("insta", update2.getSocialMedia());
    }


    @Test
    //This test is to see if the Age will store properly
    public void getAgeTest(){
        String expected = "20";
        String actual = update.getAge();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals("30", update2.getAge());
    }


    @Test
    //This test is to see if the Current city will store properly
    public void getCurrentCityTest(){
        String expected = "Detroit";
        String actual = update.getCurrentCity();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals("Chicago", update2.getCurrentCity());
    }


    @Test
    //This test is to see if the language will store properly
    public void getLanguageTest(){
        String expected = "English";
        String actual = update.getLanguage();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals("Spanish", update2.getLanguage());
    }


    @Test
    //This test is to see if the important thing will store properly
    public void getImportantThingTest(){
        String expected = "I love dogs!";
        String actual = update.getImportantThing();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals("I love WSU", update2.getImportantThing());
    }

}
