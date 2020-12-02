package com.roomie.Web;

import com.roomie.model.UpdateUserProfileInformation;
import com.roomie.web.UpdateUserProfileInformationDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


//Tests adding profile information to the DTO
public class UpdateUserProfileInformationDtoTest {

    UpdateUserProfileInformationDto userProfileInformation = new UpdateUserProfileInformationDto("headline", "doctor", "facebook",
            "20", "Detroit", "English", "I love dogs!");

    UpdateUserProfileInformationDto update2 = new UpdateUserProfileInformationDto
            ("ME", "programmer", "insta",
                    "30", "Chicago", "Spanish", "I love WSU");

    @Test
    //This test is to see if the headline will store properly
    public void getHeadlineTest(){
        String expected = "headline";
        String actual = userProfileInformation.getHeadLine();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals("ME", update2.getHeadLine());
    }


    @Test
    //This test is to see if the profession will store properly
    public void getProfessionTest(){
        String expected = "doctor";
        String actual = userProfileInformation.getProfession();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals("programmer", update2.getProfession());
    }

    @Test
    //This test is to see if the Social Media will store properly
    public void getSocialMediaTest(){
        String expected = "facebook";
        String actual = userProfileInformation.getSocialMedia();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals("insta", update2.getSocialMedia());
    }


    @Test
    //This test is to see if the age will store properly
    public void getAgeTest(){
        String expected = "20";
        String actual = userProfileInformation.getAge();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals("30", update2.getAge());
    }


    @Test
    //This test is to see if the current city will store properly
    public void getCurrentCityTest(){
        String expected = "Detroit";
        String actual = userProfileInformation.getCurrentCity();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals("Chicago", update2.getCurrentCity());
    }


    @Test
    //This test is to see if the language will store properly
    public void getLanguageTest(){
        String expected = "English";
        String actual = userProfileInformation.getLanguage();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals("Spanish", update2.getLanguage());
    }


    @Test
    //This test is to see if the important thing will store properly
    public void getImportantThingTest(){
        String expected = "I love dogs!";
        String actual = userProfileInformation.getImportantThing();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals("I love WSU", update2.getImportantThing());
    }
}
