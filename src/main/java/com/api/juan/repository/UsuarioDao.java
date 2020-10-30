package com.api.juan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.juan.entity.Usuario;

@Repository
public interface UsuarioDao extends JpaRepository<Usuario, Long>{

}
