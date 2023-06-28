package com.amdocs.auth.service;

import com.amdocs.auth.models.TokenModel;
import com.amdocs.auth.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

    @Autowired
    TokenRepository tokenRepository;

    public String getStatus(String tokenStr) {
        TokenModel tokenRec = tokenRepository.findTokenByTokenId(tokenStr);
        if(tokenRec != null) {
            if(true){ // to change this
                return "ACTIVE";
            }
            else{
                return "EXPIRED";
            }
        } else {
            return "NOT_FOUND";
        }
    }
}
