//package com.roomie.converters;
//
//import com.fasterxml.jackson.databind.JavaType;
//import com.fasterxml.jackson.databind.type.TypeFactory;
//import com.fasterxml.jackson.databind.util.Converter;
//import com.roomie.model.NewUser;
//import com.roomie.model.NewUserForm;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//
//@Component
//public class NewUserFormToNewUser implements Converter<NewUserForm, NewUser> {
//
//
//    @Override
//    public NewUser convert(NewUserForm newUserForm) {
//        NewUser newUser = new NewUser();
//        if(newUserForm.getId() != null && !StringUtils.isEmpty(newUserForm.getId())){
//            newUser.setId(new Long(newUserForm.getId()));
//        }
//        newUser.setUsername(newUserForm.getUsername());
//        newUser.setPassword(newUserForm.getPassword());
//        newUser.setEmail(newUserForm.getEmail());
//        return newUser;
//    }
//
//    @Override
//    public JavaType getInputType(TypeFactory typeFactory) {
//        return null;
//    }
//
//    @Override
//    public JavaType getOutputType(TypeFactory typeFactory) {
//        return null;
//    }
//
//}
