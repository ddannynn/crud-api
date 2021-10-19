package com.ddnn.api.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddnn.api.crud.entity.Sucursal;
import com.ddnn.api.crud.repository.ISucursalRepository;

@Service
public class SucursalServiceImpl implements ISucursalService {

	@Autowired
	private ISucursalRepository sucursalRepository;

	@Override
	public void save(Sucursal sucursal) {
		sucursalRepository.save(sucursal);
	}

	@Override
	public List<Sucursal> getAll() {
		return sucursalRepository.findAll();
	}

	@Override
	public Sucursal getById(String id) {
		return sucursalRepository.findById(id).orElse(null);
	}

	@Override
	public void update(Sucursal sucursal) {
		sucursalRepository.save(sucursal);
	}

	@Override
	public void delete(String id) {
		sucursalRepository.deleteById(id);
	}

}
