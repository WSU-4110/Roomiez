package com.roomie.service;

import com.roomie.converters.NewUserFormToNewUser;
import com.roomie.model.NewUser;
import com.roomie.model.NewUserForm;
import com.roomie.service.NewUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewUserServiceImpl implements NewUserService {

    private NewUserRepository newUserRepository;
    private NewUserFormToNewUser newUserFormToNewUser;


    @Autowired
    public NewUserServiceImpl(NewUserRepository newUserRepository, NewUserFormToNewUser newUserFormToNewUser){
        this.newUserRepository = newUserRepository;
        this.newUserFormToNewUser = newUserFormToNewUser;
    }

    @Override
    public List<NewUser> listAll() {
        List<NewUser> newUsers = new ArrayList<>();
        newUserRepository.findAll().forEach(newUsers::add);
        return newUsers;
    }

    @Override
    public NewUser getById(Long id) {
        return newUserRepository.findById(id).orElse(null);
    }

    @Override
    public NewUser saveOrUpdate(NewUser newUser) {
        newUserRepository.save(newUser);
        return newUser;
    }

    @Override
    public void delete(Long id) {
        newUserRepository.deleteById(id);
    }

    @Override
    public NewUser saveOrUpdateNewUserForm(NewUserForm newUserForm) {
        NewUser savedNewUser = saveOrUpdate(newUserFormToNewUser.convert(newUserForm));

        System.out.println("Saved User Id: " + savedNewUser.getId());
        return savedNewUser;
    }
}
