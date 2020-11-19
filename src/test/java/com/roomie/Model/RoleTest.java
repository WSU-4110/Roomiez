package com.roomie.Model;

import com.roomie.model.Role;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoleTest {

    Role role = new Role("User");
    Role role1 = new Role("Admin");

    @Test
    //This test is to see if the role will store properly
    public void getRoleTest() {
        String expected = "User";
        String actual = role.getName();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals("Admin", role1.getName());
    }
}
