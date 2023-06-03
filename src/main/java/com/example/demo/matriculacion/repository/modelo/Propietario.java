package com.example.demo.matriculacion.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Propietario {
	private String nombre;
	private String apellido;
	private String identificacion;
	private LocalDate fNacimiento;
	
	private String marca;
	private String placa;
	private String modelo;
	private String tipo;
	private BigDecimal precio;
	
	
	
	
	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", apellido=" + apellido + ", identificacion=" + identificacion
				+ ", fNacimiento=" + fNacimiento + ", marca=" + marca + ", placa=" + placa + ", modelo=" + modelo
				+ ", tipo=" + tipo + ", precio=" + precio + "]";
	}
	//get y set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public LocalDate getfNacimiento() {
		return fNacimiento;
	}
	public void setfNacimiento(LocalDate fNacimiento) {
		this.fNacimiento = fNacimiento;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	
	
	

}
