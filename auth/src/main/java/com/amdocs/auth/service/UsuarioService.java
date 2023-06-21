package com.amdocs.auth.service;

import com.amdocs.auth.model.UsuarioModel;

import com.amdocs.auth.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repository;

    public String login(UsuarioModel usuario) {
        if(repository.findById(ususario.getId())) {
            return "TOKEN";
        } else {
            return "NOT_FOUND";
        }
    }

}
