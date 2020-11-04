package com.roomie.service;

import com.roomie.model.NewUser;
import com.roomie.model.NewUserForm;

import java.util.List;

public interface NewUserService {

    List<NewUser> listAll();

    NewUser getById(Long id);

    NewUser saveOrUpdate(NewUser newUser);

    void delete(Long id);

    NewUser saveOrUpdateNewUserForm(NewUserForm newUserForm);
}
