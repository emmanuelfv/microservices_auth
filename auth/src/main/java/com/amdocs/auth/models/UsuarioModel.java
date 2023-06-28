package com.amdocs.auth.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="usuario")
public class UsuarioModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Getter
    @Setter
    long id;

    @Getter
    @Setter
    String userName;

    @Getter
    @Setter
    String password;
}
