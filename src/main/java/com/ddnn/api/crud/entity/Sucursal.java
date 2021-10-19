package com.ddnn.api.crud.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sucursal implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cod_sucursal", columnDefinition = "CHAR(2) NOT NULL")
	private String cod_sucursal;
	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;

	public String getCod_sucursal() {
		return cod_sucursal;
	}

	public void setCod_sucursal(String cod_sucursal) {
		this.cod_sucursal = cod_sucursal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
