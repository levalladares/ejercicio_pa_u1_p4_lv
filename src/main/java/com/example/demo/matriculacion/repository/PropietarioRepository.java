package com.example.demo.matriculacion.repository;

import java.util.List;

import com.example.demo.matriculacion.repository.modelo.Propietario;


public interface PropietarioRepository {
	public void insertar(Propietario propietario);
	public void actualizar(String nombre);
	public void eliminar(String nombre );
	public Propietario seleccionarPorId(String id);
	
	public List <Propietario> seleccionaTodos();

}
