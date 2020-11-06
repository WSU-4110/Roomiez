package com.roomie.service;

import com.roomie.model.NewUser;
import com.roomie.Repository.NewUserRepository;
import com.roomie.web.NewUserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewUserServiceImpl implements NewUserService {

  @Autowired
  private NewUserRepository newUserRepository;

  private NewUserServiceImpl(NewUserRepository newUserRepository){
      super();
      this.newUserRepository = newUserRepository;
  }

    @Override
    public NewUser save(NewUserRegistrationDto registrationDto) {
        NewUser newUser = new NewUser(registrationDto.getUsername(),
                registrationDto.getEmail(), registrationDto.getPassword(),
                registrationDto.getBirthday());
            return newUserRepository.save(newUser);
    }
}
