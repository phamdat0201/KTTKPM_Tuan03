package com.example.demospringbootjwt.repository;

import com.example.demospringbootjwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
