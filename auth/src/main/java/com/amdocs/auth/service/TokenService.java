package com.amdocs.auth.service;

import com.amdocs.auth.model.TokenModel;
import com.amdocs.auth.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

    @Autowired
    TokenRepository repository;

    public String login(TokenModel token) {
        if(repository.findById(token.getId())) {
            return "ACTIVE";
        } else {
            return "NOT_FOUND";
        }
    }

}
