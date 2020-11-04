package com.roomie.converters;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.roomie.model.NewUser;
import com.roomie.model.NewUserForm;
import org.springframework.stereotype.Component;

@Component
public class NewUserToNewUserForm implements Converter<NewUser, NewUserForm> {


    @Override
    public NewUserForm convert(NewUser newUser) {
        NewUserForm newUserForm = new NewUserForm();
        newUserForm.setId(newUser.getId());
        newUserForm.setUsername(newUser.getUsername());
        newUserForm.setPassword(newUser.getPassword());
        newUserForm.setEmail(newUser.getEmail());
        return newUserForm;
    }

    @Override
    public JavaType getInputType(TypeFactory typeFactory) {
        return null;
    }

    @Override
    public JavaType getOutputType(TypeFactory typeFactory) {
        return null;
    }
}
