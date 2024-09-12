package com.ContactsApp.ContactApp.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ContactsApp.ContactApp.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {

    // Object findByEmail(String username);
    // extra methods db related operations
    // custom query methods
    // custom finder methods

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);

    Optional<User> findByEmailToken(String id);

}
