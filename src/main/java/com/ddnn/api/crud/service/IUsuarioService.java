package com.ddnn.api.crud.service;

import java.util.List;

import com.ddnn.api.crud.entity.Usuario;

public interface IUsuarioService {
	
	public void save(Usuario usuario);
	
	public List<Usuario> getAll();

	public Usuario getById(String id);
	
	public void update(Usuario usuario);
	
	public void delete(String id);

}
