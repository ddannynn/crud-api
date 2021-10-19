package com.ddnn.api.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ddnn.api.crud.entity.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, String> {

}
