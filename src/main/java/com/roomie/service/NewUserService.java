package com.roomie.service;

import com.roomie.model.NewUser;
import com.roomie.web.NewUserRegistrationDto;

import java.util.List;

public interface NewUserService {

    NewUser save(NewUserRegistrationDto newUserRegistrationDto);
}
