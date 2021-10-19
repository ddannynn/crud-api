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

import com.ddnn.api.crud.entity.Producto;
import com.ddnn.api.crud.service.IProductoService;

@CrossOrigin
@RequestMapping("/api/v1")
@RestController
public class ProductoController {
	
	@Autowired
	private IProductoService productoService;
	
	@PostMapping("/producto")
	public ResponseEntity<Producto> save(@RequestBody Producto producto) {
		productoService.save(producto);
		return new ResponseEntity<Producto>(HttpStatus.CREATED);
	}

	@GetMapping("/producto")
	public List<Producto> getAll() {
		return productoService.getAll();
	}

	@GetMapping("/producto/{id}")
	public Producto getById(@PathVariable("id") String id) {
		return productoService.getById(id);
	}

	@PutMapping("/producto")
	public ResponseEntity<Producto> update(@RequestBody Producto producto) {
		productoService.update(producto);
		return new ResponseEntity<Producto>(HttpStatus.OK);
	}
	
	@DeleteMapping("/producto/{id}")
	public ResponseEntity<Producto> delete(@PathVariable("id") String id) {
		productoService.delete(id);
		return new ResponseEntity<Producto>(HttpStatus.NO_CONTENT);
	}

}
