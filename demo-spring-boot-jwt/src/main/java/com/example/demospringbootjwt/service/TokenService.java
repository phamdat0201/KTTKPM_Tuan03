package com.example.demospringbootjwt.service;

import com.example.demospringbootjwt.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
