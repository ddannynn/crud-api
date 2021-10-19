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

import com.ddnn.api.crud.entity.Sucursal;
import com.ddnn.api.crud.service.ISucursalService;

@CrossOrigin
@RequestMapping("/api/v1")
@RestController
public class SucursalController {

	@Autowired
	private ISucursalService sucursalService;

	@PostMapping("/sucursal")
	public ResponseEntity<Sucursal> save(@RequestBody Sucursal sucursal) {
		sucursalService.save(sucursal);
		return new ResponseEntity<Sucursal>(HttpStatus.CREATED);
	}

	@GetMapping("/sucursal")
	public List<Sucursal> getAll() {
		return sucursalService.getAll();
	}

	@GetMapping("/sucursal/{id}")
	public Sucursal getById(@PathVariable("id") String id) {
		return sucursalService.getById(id);
	}

	@PutMapping("/sucursal")
	public ResponseEntity<Sucursal> update(@RequestBody Sucursal sucursal) {
		sucursalService.update(sucursal);
		return new ResponseEntity<Sucursal>(HttpStatus.OK);
	}
	
	@DeleteMapping("/sucursal/{id}")
	public ResponseEntity<Sucursal> delete(@PathVariable("id") String id) {
		sucursalService.delete(id);
		return new ResponseEntity<Sucursal>(HttpStatus.NO_CONTENT);
	}

}
