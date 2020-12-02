package com.roomie.service;

import com.roomie.model.NewUser;
import com.roomie.Repository.NewUserRepository;
import com.roomie.model.Role;
import com.roomie.web.NewUserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NewUserServiceImpl implements NewUserService {


    private NewUserRepository newUserRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public NewUser findByEmail(String email) {
        return newUserRepository.findByEmail(email);
    }

    private NewUserServiceImpl(NewUserRepository newUserRepository) {
        super();
        this.newUserRepository = newUserRepository;
    }

    @Override
    public NewUser save(NewUserRegistrationDto registrationDto) {
        NewUser newUser = new NewUser(registrationDto.getFirstName(),
                registrationDto.getLastName(), registrationDto.getEmail(),
        passwordEncoder.encode(registrationDto.getPassword()), Arrays.asList(new Role("Role_User")));
        return newUserRepository.save(newUser);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        NewUser newUser = newUserRepository.findByEmail(username);
        if (newUser == null) {
            throw new UsernameNotFoundException("Invalid username or password");
        }
        return new org.springframework.security.core.userdetails.User(newUser.getEmail(), newUser.getPassword(), mapRolesToAuthorities(newUser.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }
}
