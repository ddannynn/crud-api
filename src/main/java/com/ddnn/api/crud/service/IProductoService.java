package com.ddnn.api.crud.service;

import java.util.List;

import com.ddnn.api.crud.entity.Producto;

public interface IProductoService {

	public void save(Producto producto);

	public List<Producto> getAll();

	public Producto getById(String id);

	public void update(Producto producto);

	public void delete(String id);

}
