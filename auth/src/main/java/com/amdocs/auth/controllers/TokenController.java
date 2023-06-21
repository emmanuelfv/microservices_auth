package com.amdocs.auth.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.auth.service.TokenService;


@RestController
@RequestMapping("/validateToken")
public class TokenController {

    @Autowired
    TokenService tokenService;

    @GetMapping()
    public String getUsuarios(){
        return new String("ok"); 
    }

}
