package com.ddnn.api.crud.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cod_usuario", columnDefinition = "CHAR(2) NOT NULL")
	private String cod_usuario;
	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;
	@Column(name = "user", nullable = false, length = 50)
	private String user;
	@Column(name = "password", nullable = false, length = 50)
	private String password;
	@OneToOne
	@JoinColumn(name = "cod_sucursal")
	private Sucursal sucursal;

	public String getCod_usuario() {
		return cod_usuario;
	}

	public void setCod_usuario(String cod_usuario) {
		this.cod_usuario = cod_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
