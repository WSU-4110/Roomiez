package com.roomie.service;

import com.roomie.model.NewUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public interface NewUserRepository extends CrudRepository <NewUser, Long> {

}


