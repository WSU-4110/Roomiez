package com.roomie.Model;

import com.roomie.model.NewUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewUserTest {

        NewUser newUser = new NewUser("Kelly", "Maisel", "maiselkelly@gmail.com", "password");
        NewUser newUser1 = new NewUser("John", "Smith", "email@gmail.com", "1234");


    @Test
        //This test is to see if the first name will store properly
        public void getFirstNameTest(){
            String expected = "Kelly";
            String actual = newUser.getFirstName();

            Assertions.assertEquals(expected, actual);
            Assertions.assertEquals("John", newUser1.getFirstName());
        }

        @Test
        //This test is to see if the last name will store properly
        public void getLastNameTest(){
            String expected = "Maisel";
            String actual = newUser.getLastName();

            Assertions.assertEquals(expected, actual);
            Assertions.assertEquals("Smith", newUser1.getLastName());
        }

        @Test
        //This test is to see if the email will store properly
        public void getEmailTest(){
            String expected = "maiselkelly@gmail.com";
            String actual = newUser.getEmail();

            Assertions.assertEquals(expected, actual);
            Assertions.assertEquals("email@gmail.com", newUser1.getEmail());

        }

        @Test
        //This test is to see if the password will store properly
        public void getPasswordTest(){
            String expected = "password";
            String actual = newUser.getPassword();

            Assertions.assertEquals(expected, actual);
            Assertions.assertEquals("1234", newUser1.getPassword());

        }


    }
