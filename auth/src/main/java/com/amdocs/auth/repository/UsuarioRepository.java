package com.amdocs.auth.repository;

import com.amdocs.auth.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long>  {

    public UsuarioModel findByUserName(String userName);

    public boolean findByPassword(String password);
}
