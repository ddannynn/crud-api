package com.ddnn.api.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddnn.api.crud.entity.Usuario;
import com.ddnn.api.crud.service.IUsuarioService;

@CrossOrigin
@RequestMapping("/api/v1")
@RestController
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@PostMapping("/usuario")
	public ResponseEntity<Usuario> save(@RequestBody Usuario usuario) {
		usuarioService.save(usuario);
		return new ResponseEntity<Usuario>(HttpStatus.CREATED);
	}

	@GetMapping("/usuario")
	public List<Usuario> getAll() {
		return usuarioService.getAll();
	}

	@GetMapping("/usuario/{id}")
	public Usuario getById(@PathVariable("id") String id) {
		return usuarioService.getById(id);
	}

	@PutMapping("/usuario")
	public ResponseEntity<Usuario> update(@RequestBody Usuario usuario) {
		usuarioService.update(usuario);
		return new ResponseEntity<Usuario>(HttpStatus.OK);
	}
	
	@DeleteMapping("/usuario/{id}")
	public ResponseEntity<Usuario> delete(@PathVariable("id") String id) {
		usuarioService.delete(id);
		return new ResponseEntity<Usuario>(HttpStatus.NO_CONTENT);
	}

}
