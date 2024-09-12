package com.ContactsApp.ContactApp.services;

import java.util.List;

//ye btata hai user hai ya nhi
//agar hoga to uspe kaam hoga warna nhi 
import java.util.Optional;

import com.ContactsApp.ContactApp.entities.User;

public interface UserService {

    User saveUser(User user);

    Optional<User> getUserById(String id);

    Optional<User> updateUser(User user);

    void deleteUser(String id);

    boolean isUserExist(String userId);

    boolean isUserExistByEmail(String email);

    List<User> getAllUsers();

    User getUserByEmail(String email);

    // add more methods here related user service[logic]

}
