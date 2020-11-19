package com.roomie.Model;

import com.roomie.model.NewUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewUserTest {

        NewUser newUser = new NewUser("Kelly", "Maisel", "maiselkelly@gmail.com", "password");

        @Test
        public void getFirstNameTest(){
            String expected = "Kelly";
            String actual = newUser.getFirstName();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void getLastNameTest(){
            String expected = "Maisel";
            String actual = newUser.getLastName();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void getEmailTest(){
            String expected = "maiselkelly@gmail.com";
            String actual = newUser.getEmail();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void getPasswordTest(){
            String expected = "password";
            String actual = newUser.getPassword();

            Assertions.assertEquals(expected, actual);
        }


    }
