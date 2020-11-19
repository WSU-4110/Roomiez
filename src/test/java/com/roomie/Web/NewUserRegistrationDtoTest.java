package com.roomie.Web;

import com.roomie.web.NewUserRegistrationDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewUserRegistrationDtoTest {

    NewUserRegistrationDto registrationDto = new NewUserRegistrationDto("Kelly", "Maisel", "email", "password");
    NewUserRegistrationDto registrationDto1 = new NewUserRegistrationDto("John", "Smith", "email", "1234");
    @Test
    //This test is to see if the first name will store properly
    public void firstNameDtoTest(){
       String expected = "Kelly";
       String actual = registrationDto.getFirstName();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals("John", registrationDto1.getFirstName());

    }

    @Test
    //This test is to see if the last name will store properly
    public void lastNameDtoTest(){
        String expected = "Maisel";
        String actual = registrationDto.getLastName();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals("Smith", registrationDto1.getLastName());

    }

    @Test
    //This test is to see if the email will store properly
    public void emailDtoTest(){
        String expected = "email";
        String actual = registrationDto.getEmail();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals("email", registrationDto1.getEmail());

    }

    @Test
    //This test is to see if the password will store properly
    public void passwordDtoTest(){
        String expected = "password";
        String actual = registrationDto.getPassword();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals("1234", registrationDto1.getPassword());


    }
}
