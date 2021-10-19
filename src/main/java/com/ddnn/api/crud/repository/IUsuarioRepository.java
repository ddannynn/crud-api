package com.ddnn.api.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ddnn.api.crud.entity.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, String> {

}
