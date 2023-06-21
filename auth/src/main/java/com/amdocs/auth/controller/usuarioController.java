package com.amdocs.auth.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class usuarioController{


    @PostMapping
    public Boolean authenticateUser(String token, String status){
        if(status.equals("hola"))
            return true;
        else 
            return false;
    }

}