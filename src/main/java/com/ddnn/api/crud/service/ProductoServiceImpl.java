package com.ddnn.api.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddnn.api.crud.entity.Producto;
import com.ddnn.api.crud.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	IProductoRepository productoRepository;

	@Override
	public void save(Producto producto) {
		productoRepository.save(producto);
	}

	@Override
	public List<Producto> getAll() {
		return productoRepository.findAll();
	}

	@Override
	public Producto getById(String id) {
		return productoRepository.findById(id).orElse(null);
	}

	@Override
	public void update(Producto producto) {
		productoRepository.save(producto);
	}

	@Override
	public void delete(String id) {
		productoRepository.deleteById(id);
	}

}
