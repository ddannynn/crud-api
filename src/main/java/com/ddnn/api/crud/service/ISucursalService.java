package com.ddnn.api.crud.service;

import java.util.List;

import com.ddnn.api.crud.entity.Sucursal;

public interface ISucursalService {

	public void save(Sucursal sucursal);
	
	public List<Sucursal> getAll();

	public Sucursal getById(String id);
	
	public void update(Sucursal sucursal);
	
	public void delete(String id);

}
