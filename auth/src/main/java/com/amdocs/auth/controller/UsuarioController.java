package com.amdocs.auth.controller;

import com.amdocs.auth.models.UsuarioModel;
import com.amdocs.auth.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;


    @PostMapping("/login")
    public String authenticateUser(@RequestBody UsuarioModel usuarioModel) {
        return usuarioService.login(usuarioModel);
    }

    @PostMapping("/signup")
    public UsuarioModel registertUser(@RequestBody UsuarioModel usuarioModel) {
        return usuarioService.registerUsuario(usuarioModel);
    }

}