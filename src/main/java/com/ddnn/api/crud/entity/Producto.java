package com.ddnn.api.crud.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cod_producto", columnDefinition = "CHAR(2) NOT NULL")
	private String cod_producto;
	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;
	@Column(name = "precio", columnDefinition = "DECIMAL(10, 2) NOT NULL CHECK(precio > 0)")
	private Double precio;

	public String getCod_producto() {
		return cod_producto;
	}

	public void setCod_producto(String cod_producto) {
		this.cod_producto = cod_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
