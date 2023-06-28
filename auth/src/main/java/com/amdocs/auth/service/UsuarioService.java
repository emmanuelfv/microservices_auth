package com.amdocs.auth.service;

import com.amdocs.auth.models.UsuarioModel;
import com.amdocs.auth.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public String login(UsuarioModel usuarioModel) {
        if(usuarioRepository.findByUserName(usuarioModel.getUserName())) {
            return "TOKEN";
        } else {
            return "NOT_FOUND";
        }
    }

    public UsuarioModel registerUsuario(UsuarioModel usuarioModel) {
        if(usuarioRepository.findByUserName(usuarioModel.getUserName())) {
            return usuarioModel;
        } else {
            usuarioRepository.save(usuarioModel);
            return usuarioModel;
        }
    }
}
