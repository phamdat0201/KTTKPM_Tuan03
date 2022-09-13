package com.example.demospringbootjwt.repository;

import com.example.demospringbootjwt.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository
        extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
