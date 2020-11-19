package com.roomie.Web;

import com.roomie.web.NewUserRegistrationDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewUserRegistrationDtoTest {

    NewUserRegistrationDto registrationDto = new NewUserRegistrationDto("Kelly", "Maisel", "email", "password");

    @Test
    public void firstNameDtoTest(){
       String expected = "Kelly";
       String actual = registrationDto.getFirstName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lastNameDtoTest(){
        String expected = "Maisel";
        String actual = registrationDto.getLastName();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void emailDtoTest(){
        String expected = "email";
        String actual = registrationDto.getEmail();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void passwordDtoTest(){
        String expected = "password";
        String actual = registrationDto.getPassword();

        Assertions.assertEquals(expected, actual);

    }
}
