package com.amdocs.auth.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.auth.service.TokenService;


@RestController
@RequestMapping("/validateToken")
public class TokenController {

    @Autowired
    TokenService tokenService;


    public ResponseEntity<String> getTokenStatus(@RequestParam String tokenStr){
        String token = tokenService.getStatus(tokenStr);
        if(token.equals("ACTIVE")){
            return ResponseEntity.ok(token);
        }
        else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(token);
        }
    }

}
