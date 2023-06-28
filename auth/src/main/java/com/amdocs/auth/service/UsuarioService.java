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
        UsuarioModel user = usuarioRepository.findByUserName(usuarioModel.getUserName());
        if(user != null && user.getPassword() == usuarioModel.getPassword()) {
            return "TOKEN";
        } else {
            return "-1";
        }
    }

    public UsuarioModel registerUsuario(UsuarioModel usuarioModel) {
        UsuarioModel user = usuarioRepository.findByUserName(usuarioModel.getUserName());
        if(user != null) {
            return usuarioModel;
        } else {
            usuarioRepository.save(usuarioModel);
            return usuarioModel;
        }
    }
}
