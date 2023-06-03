package com.example.demo.matriculacion.service;

import java.util.List;

import com.example.demo.matriculacion.repository.modelo.Propietario;

public interface PropietarioService {
	
	public void crear(Propietario propietario);
	public void actualizar(Propietario propietario);
	public void eliminar(String nombre );
	public Propietario buscar(String id);
	
	public List <Propietario> seleccionarTodos();
	

}
