package com.roomie.Model;

import com.roomie.model.Role;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoleTest {

    Role role = new Role("User");

    @Test
    public void getRoleTest() {
        String expected = "User";
        String actual = role.getName();

        Assertions.assertEquals(expected, actual);
    }
}
