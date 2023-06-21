package com.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class usuarioController{

   UsuarioService usuarioService;
    

    @PostMapping
    public Boolean authenticateUser(){
        return true;
    }

}