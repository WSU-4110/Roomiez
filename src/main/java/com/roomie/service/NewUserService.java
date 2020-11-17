package com.roomie.service;

import com.roomie.model.NewUser;
import com.roomie.web.NewUserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface NewUserService extends UserDetailsService {

    NewUser findByEmail(String email);

    NewUser save(NewUserRegistrationDto newUserRegistrationDto);
}
